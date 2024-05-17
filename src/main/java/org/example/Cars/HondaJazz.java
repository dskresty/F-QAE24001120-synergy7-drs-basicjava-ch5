package org.example.Cars;
import org.example.Car;
import lombok.*;

@Getter
@Setter
public class HondaJazz extends Car {
    private String model;

    public HondaJazz(int kapasitasTangki, String modeTransmisi, String model) {
        super(kapasitasTangki, modeTransmisi);
        this.model = model;
    }
    public HondaJazz(String model) {
        this.model = model;
    }

    @Override
    public void majuKedepan() {
        System.out.println("Honda Jazz maju kedepan");
    }

    public void pindahTransmisi(String gigi) {
        super.setModeTransmisi(gigi);
        System.out.println("Persneling Honda Jazz telah berpindah ke " + gigi);
    }

    public static void main(String[] args) {
        HondaJazz hondaJazz = new HondaJazz(40, "P", "J1");
        System.out.println("Telah dibuat Mobil Honda Jazz " + hondaJazz.getModel() + " dengan Kapasitas Tangki " + hondaJazz.getKapasitasTangki() + " di Mode Transmisi " + hondaJazz.getModeTransmisi());
        hondaJazz.pindahTransmisi("D");
        hondaJazz.majuKedepan();
    }

}
