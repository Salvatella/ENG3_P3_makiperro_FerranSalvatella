package com.codurance.lsp;

public class PetrolCar extends LiskovVehicle {
  private static final int FUEL_TANK_FULL = 100;
  private int fuelTankLevel = 0;

  @Override
  public void re_up() {
    this.fuelTankLevel = FUEL_TANK_FULL;
  }

  public int getFuelTankLevel() {
    return fuelTankLevel;
  }
}
