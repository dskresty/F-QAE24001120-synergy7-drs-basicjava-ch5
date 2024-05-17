package org.example.Cars;
import org.example.Car;
import lombok.*;

@Getter
@Setter
public class ToyotaFortuner extends Car{

    private String model;

    public ToyotaFortuner(int kapasitasTangki, String modeTransmisi, String model) {
        super(kapasitasTangki, modeTransmisi);
        this.model = model;
    }
    public ToyotaFortuner(String model) {
        this.model = model;
    }

    @Override
    public void majuKedepan() {
        System.out.println("Toyota Fortuner maju kedepan");
    }
    public void pindahTransmisi(String gigi) {
        super.setModeTransmisi(gigi);
        System.out.println("Persneling Toyota Fortuner telah berpindah ke " + gigi);
    }

    public static void main(String[] args) {
        ToyotaFortuner toyotaFortuner = new ToyotaFortuner(55, "P", "TF3");
        System.out.println("Telah dibuat Mobil Toyota Fortuner " + toyotaFortuner.getModel() + " dengan Kapasitas Tangki " + toyotaFortuner.getKapasitasTangki() + " di Mode Transmisi " + toyotaFortuner.getModeTransmisi());
        toyotaFortuner.pindahTransmisi("D");
        toyotaFortuner.majuKedepan();
    }

}
