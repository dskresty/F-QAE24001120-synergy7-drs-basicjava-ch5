package org.example;

import lombok.*;

@Getter
@Setter
public class Vehicle {
    private int roda;

    public void majuKedepan() {
        System.out.println("Kendaraan Maju kedepan");
    }

    public void belok(String arah) {
        System.out.println("Kendaraan Belok " + arah);
    }

}
