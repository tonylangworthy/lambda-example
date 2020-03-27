package com.langworthytech;

import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {

        Vehicle mazda = new Vehicle("2008", "Mazda", "6", "i Sport");
        Vehicle equinox = new Vehicle("2013", "Chevrolet", "Equinox", "LT");

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("2002", "Chevrolet", "Impala", "LS"));
        vehicleList.add(new Vehicle("2012", "Ford", "Focus", "SE"));
        vehicleList.add(new Vehicle("2010", "Ford", "Fusion", "SE"));
        vehicleList.add(new Vehicle("2007", "Chevrolet", "Malibu", "LT"));
        vehicleList.add(new Vehicle("2002", "Chevrolet", "Malibu", "Classic"));
        vehicleList.add(mazda);
        vehicleList.add(equinox);

        // Implementation using an anonymous class
        DisplayFriendlyName displayFriendlyName = new DisplayFriendlyName() {
            @Override
            public String display(Vehicle vehicle) {
                return vehicle.getYear() + " "
                        + vehicle.getMake() + " "
                        + vehicle.getModel() + " "
                        + vehicle.getTrim();
            }

//            @Override
//            public String displayUpper(Vehicle vehicle) {
//                String name = vehicle.getYear() + " "
//                        + vehicle.getMake() + " "
//                        + vehicle.getModel() + " "
//                        + vehicle.getTrim();
//                return name.toUpperCase();
//            }
        };


        String vehicleName = displayFriendlyName.display(mazda);
        System.out.println(vehicleName);
        System.out.println("\n----------------------------------------------\n");

        // ------------------------------------------------------------------------------------

        // Implementation using a lambda expression
        DisplayFriendlyName displayFriendlyName1 = (vehicle) -> {
            return vehicle.getYear() + " "
                    + vehicle.getMake() + " "
                    + vehicle.getModel() + " "
                    + vehicle.getTrim();
        };

        // Implementation using a lambda expression
//        DisplayUppercaseName displayUppercaseName = (vehicle) -> {
//            String name = vehicle.getYear() + " "
//                    + vehicle.getMake() + " "
//                    + vehicle.getModel() + " "
//                    + vehicle.getTrim();
//            return name.toUpperCase();
//        };

        System.out.println(displayFriendlyName.display(equinox));
        System.out.println(displayFriendlyName.displayUpper(equinox));
        System.out.println("Displaying abstranct and default methods.");
        System.out.println(displayFriendlyName1.display(mazda));
        System.out.println(displayFriendlyName1.displayUpper(mazda));
        System.out.println("\n----------------------------------------------\n");

        // ----------------------------------------------------------------------------------

        // lambda to iterate and display all vehicles
        vehicleList.forEach((vehicle -> System.out.println(displayFriendlyName.display(vehicle))));

    }
}
