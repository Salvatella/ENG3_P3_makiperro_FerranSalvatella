package com.codurance.lsp;

public class ElectricCar extends LiskovVehicle{

    private static final int BATTERY_FULL = 100;
    private int batteryLevel;

   
    @Override
    public void re_up() {
        batteryLevel = BATTERY_FULL;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
