package data.structure.project1.temperature;
import java.util.Scanner;

public class TemperatureManagerArray {
    private double[] temperatures;
    private int count;

    public TemperatureManagerArray(int maxSize) {
        this.temperatures = new double[maxSize];
        this.count = 0;
    }

    // Add temperature to the array
    public void addTemperature(double temperature) {
        if (count < temperatures.length) {
            temperatures[count] = temperature;
            count++;
        } else {
            System.out.println("Maximum size reached, cannot add more temperatures.");
        }
    }

    // Find maximum temperature
    public double getMaxTemperature() {
        if (count == 0) {
            throw new IllegalStateException("No temperatures recorded.");
        }
        double max = temperatures[0];
        for (int i = 1; i < count; i++) {
            if (temperatures[i] > max) {
                max = temperatures[i];
            }
        }
        return max;
    }

    // Find minimum temperature
    public double getMinTemperature() {
        if (count == 0) {
            throw new IllegalStateException("No temperatures recorded.");
        }
        double min = temperatures[0];
        for (int i = 1; i < count; i++) {
            if (temperatures[i] < min) {
                min = temperatures[i];
            }
        }
        return min;
    }

    // Calculate average temperature
    public double calculateAverage() {
        if (count == 0) {
            throw new IllegalStateException("No temperatures recorded.");
        }
        double sum = 0.0;
        for (int i = 0; i < count; i++) {
            sum += temperatures[i];
        }
        return sum / count;
    }

    // Get temperatures above average
    public double[] getTemperaturesAboveAverage() {
        double average = calculateAverage();
        double[] aboveAverageTemps = new double[count];
        int index = 0;

        for (int i = 0; i < count; i++) {
            if (temperatures[i] > average) {
                aboveAverageTemps[index++] = temperatures[i];
            }
        }

        double[] result = new double[index];
        System.arraycopy(aboveAverageTemps, 0, result, 0, index);
        return result;
    }

    // Input temperatures from user
    public void inputTemperatures() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperatures (type 'fin' to finish):");

        while (true) {
            System.out.print("Enter a temperature: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                double temp = Double.parseDouble(input);
                addTemperature(temp);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
    }
}
