package data.structure.project1.car;

public class Car {
    private String brand;
    private int year;
    private String color;
    private int fuel_level = 10;
    private boolean engine_on = false;

    public Car(String brand, int year, String color){
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public int getFuel_level(){
        return fuel_level;
    }
    public int getYear(){
        return year;
    }

    public boolean engineOff(){
        if (engine_on) {
            System.out.println("Engine off");
            engine_on = false;
        } else {
            System.out.println("Engine is already off");
        }
        return engine_on;
    }


    public boolean engineOn(){
        if (!engine_on) {
            System.out.println("Engine on");
            engine_on = true;
        } else {
            System.out.println("Engine is already on");
        }
        return engine_on;
    }

    public int accelerateCar() {
        if (engine_on && fuel_level > 0) {
            for (int i = 0; i < 11; i++) {

                fuel_level -= 1;


                if (fuel_level <= 0) {
                    fuel_level = 0;
                    System.out.println("Fuel empty. Car stopped.");
                    engine_on = false;
                    break;
                }


                System.out.println("Fuel level: " + fuel_level);
            }
        } else {

            if (!engine_on) {
                System.out.println("Engine is off. Cannot accelerate.");
            } else {
                System.out.println("No fuel left. Cannot accelerate.");
            }
        }
        return fuel_level;
    }

    public int supplyFuel(int gallons) {
        int totalGallons = fuel_level + gallons;


        if (engine_on) {
            System.out.println("Engine is on. You can't fuel your car.");
            return fuel_level;
        }


        if (totalGallons <= 12) {
            fuel_level = totalGallons;
            System.out.println("The car has " + fuel_level + " gallons");
        } else {

            fuel_level = 12;
            System.out.println("Your car's tank is full. Some fuel couldn't be added.");
        }

        return fuel_level;
    }

    public void getInfoCar(){
        System.out.println("Your car is a " + brand + " colred" + color + " of the year " + year);
    }







}
