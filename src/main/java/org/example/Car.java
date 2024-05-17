package org.example;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car extends Vehicle{
    private int kapasitasTangki;
    private String modeTransmisi;

    public void pindahTransmisi(String gigi) {
        this.modeTransmisi = gigi;
        System.out.println("Persneling mobil telah berpindah ke " + gigi);
    }

}

