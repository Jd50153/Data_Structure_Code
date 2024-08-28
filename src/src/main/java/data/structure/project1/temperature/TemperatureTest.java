package data.structure.project1.temperature;

public class TemperatureTest {
    public static void main(String[] args) {
        System.out.println("Using List for Temperature Management:");
        TemperatureManager tempManagerList = new TemperatureManager();
        tempManagerList.inputTemperatures();
        displayResults(tempManagerList);

        System.out.println("\nUsing Array for Temperature Management:");
        TemperatureManagerArray tempManagerArray = new TemperatureManagerArray(100); // Arbitrary limit
        tempManagerArray.inputTemperatures();
        displayResults(tempManagerArray);
    }

    // Display results for TemperatureManager (list)
    public static void displayResults(TemperatureManager manager) {
        try {
            System.out.println("Max temperature: " + manager.getMaxTemperature());
            System.out.println("Min temperature: " + manager.getMinTemperature());
            System.out.println("Average temperature: " + manager.calculateAverage());
            System.out.println("Temperatures above average: " + manager.getTemperaturesAboveAverage());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    // Display results for TemperatureManagerArray (array)
    public static void displayResults(TemperatureManagerArray manager) {
        try {
            System.out.println("Max temperature: " + manager.getMaxTemperature());
            System.out.println("Min temperature: " + manager.getMinTemperature());
            System.out.println("Average temperature: " + manager.calculateAverage());
            double[] aboveAverage = manager.getTemperaturesAboveAverage();
            System.out.println("Temperatures above average: ");
            for (double temp : aboveAverage) {
                System.out.print(temp + " ");
            }
            System.out.println();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
