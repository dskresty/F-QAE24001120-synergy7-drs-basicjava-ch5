package org.example;

import java.util.Scanner;

public class BiayaParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan waktu parkir: ");
        double waktu = scanner.nextDouble();
        hitungHargaParkir(waktu);
    }

    static double hargaparkir = 0;

    public static void hitungHargaParkir(double waktu) {
        if (waktu <=5) {
            hargaparkir = 1 ;
        } else if (waktu <24) {
            hargaparkir = 1+(0.5*(waktu-5));
        } else if (waktu >24) {
            hargaparkir = 15+((waktu-24)*0.5);
        }

        System.out.println("Total Harga Parkir: $" + hargaparkir);
    }
}
