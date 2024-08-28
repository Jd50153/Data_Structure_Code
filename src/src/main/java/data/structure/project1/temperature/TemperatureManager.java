package data.structure.project1.temperature;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TemperatureManager {
    private final List<Double> temperatures;

    public TemperatureManager() {
        this.temperatures = new ArrayList<>();
    }

    // Add temperature to the list
    public void addTemperature(double temperature) {
        temperatures.add(temperature);
    }

    // Find maximum temperature
    public double getMaxTemperature() {
        if (temperatures.isEmpty()) {
            throw new IllegalStateException("No temperatures recorded.");
        }
        double max = temperatures.get(0);
        for (double temp : temperatures) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    // Find minimum temperature
    public double getMinTemperature() {
        if (temperatures.isEmpty()) {
            throw new IllegalStateException("No temperatures recorded.");
        }
        double min = temperatures.get(0);
        for (double temp : temperatures) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    // Calculate average temperature
    public double calculateAverage() {
        if (temperatures.isEmpty()) {
            throw new IllegalStateException("No temperatures recorded.");
        }
        double sum = 0.0;
        for (double temp : temperatures) {
            sum += temp;
        }
        return sum / temperatures.size();
    }

    // Get temperatures above average
    public List<Double> getTemperaturesAboveAverage() {
        double average = calculateAverage();
        List<Double> aboveAverageTemps = new ArrayList<>();
        for (double temp : temperatures) {
            if (temp > average) {
                aboveAverageTemps.add(temp);
            }
        }
        return aboveAverageTemps;
    }

    // Get temperatures list
    public List<Double> getTemperatures() {
        return temperatures;
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
