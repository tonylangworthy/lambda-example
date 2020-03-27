package com.langworthytech;

@FunctionalInterface
public interface DisplayFriendlyName {

    String display(Vehicle vehicle);

    default String displayUpper(Vehicle vehicle) {
        String name = vehicle.getYear() + " "
                + vehicle.getMake() + " "
                + vehicle.getModel() + " "
                + vehicle.getTrim();
        return name.toUpperCase();

    }
}
