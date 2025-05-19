package com.codurance.lsp;

public class FillingStation {

    public void re_up(LiskovVehicle vehicle) {
        if (vehicle instanceof PetrolCar) {
            vehicle.re_up();
        }
    }

}
