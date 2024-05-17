package org.example.Cars;
import org.example.Car;
import lombok.*;

@Getter
@Setter
public class SuzukiKatana extends Car{
    private String model;

    public SuzukiKatana(int kapasitasTangki, String modeTransmisi, String model) {
        super(kapasitasTangki, modeTransmisi);
        this.model = model;
    }
    public SuzukiKatana(String model) {
        this.model = model;
    }

    @Override
    public void majuKedepan() {
        System.out.println("Suzuki Katana maju kedepan");
    }

    public void pindahTransmisi(String gigi) {
        super.setModeTransmisi(gigi);
        System.out.println("Persneling Suzuki Katana telah berpindah ke " + gigi);
    }

    public static void main(String[] args) {
        SuzukiKatana suzukiKatana = new SuzukiKatana(50, "P", "SK2");
        System.out.println("Telah dibuat Mobil Suzuki Katana " + suzukiKatana.getModel() + " dengan Kapasitas Tangki " + suzukiKatana.getKapasitasTangki() + " di Mode Transmisi " + suzukiKatana.getModeTransmisi());
        suzukiKatana.pindahTransmisi("D");
        suzukiKatana.majuKedepan();
    }

}
