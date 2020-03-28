package com.langworthytech;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	
    public static void main(String[] args) {

        Vehicle mazda = new Vehicle("2008", "Mazda", "6", "i Sport");
        Vehicle equinox = new Vehicle("2013", "Chevrolet", "Equinox", "LT");

        List<Vehicle> vehicleList = new ArrayList<>();
//        year, make, model, trim

        vehicleList.add(new Vehicle("2002", "Chevrolet", "Impala", "LS"));
        vehicleList.add(new Vehicle("2012", "Ford", "Focus", "SE"));
        vehicleList.add(new Vehicle("2002", "Ford", "Fusion", "SE"));
        vehicleList.add(new Vehicle("2002", "Ford", "Explorer", "SE"));
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

        DisplayFriendlyName newVarName = (bugger) -> {return "Tony says string";};
        System.out.println(newVarName.display(equinox));

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
        
        String filterYear = "2002";
        List<Vehicle> newVar = vehicleList.stream().filter(vehicle -> {return vehicle.getYear().equals(filterYear);}).collect(Collectors.toList());
        
        System.out.println("printing year:  " + newVar.toString());
        
        
        String filterMake = "Ford";
        List<Vehicle> varMakeFilter = vehicleList.stream().filter(vehicle -> {
        	return vehicle.getMake().equals(filterMake);
        	}).collect(Collectors.toList());
        
        System.out.println("printing make:  " + varMakeFilter.toString());
        
        //now let's method chain to filter by make and year
        List<Vehicle> varMakeYearFilter = vehicleList.stream().filter(vehicle ->{
        	return vehicle.getYear().equals(filterYear);
        	
        	
        }).filter(vehicle -> {return vehicle.getMake().equals(filterMake);}).collect(Collectors.toList());
        		
        
        System.out.println("printing make and year" + varMakeYearFilter);
        
        //Alex is awesome
        
        String filterModel = "Impala";
        List<Vehicle> varModel = vehicleList.stream().filter(vehicle -> {return vehicle.getModel().equals(filterModel);}).collect(Collectors.toList());
        System.out.println("printing just Model  " + varModel);
        
        
        
        
        
        
        

    }
}
