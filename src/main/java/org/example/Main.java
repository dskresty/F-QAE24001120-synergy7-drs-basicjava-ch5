package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount ba1 = new BankAccount(123, 100000, "Desak", "desak@gmail.com", "0812838472344");
        BankAccount ba2 = new BankAccount(456, 500000, "Savitri", "savitri@gmail.com", "081212341234");

        System.out.println(ba1.getCustomerName() + " sekarang memiliki balance sebanyak Rp" + ba1.getBalance());
        System.out.print("Jumlah uang yang akan didepositkan untuk " + ba1.getCustomerName() + ": ");
        int depoBA1 = scanner.nextInt();
        ba1.deposit(depoBA1);
        System.out.println("Telah berhasil deposit sebanyak " + depoBA1 + " untuk " + ba1.getCustomerName());
        System.out.println("Saldo untuk " + ba1.getCustomerName() + " sekarang adalah " + ba1.getBalance());

        System.out.println("Program selesai!");
//        System.out.println(ba2.getCustomerName() + "memiliki balance sebanyak RP" + ba2.getBalance());
//        System.out.print("Jumlah uang yang akan didepositkan untuk BA2");
//        int depoBA2 = scanner.nextInt();
//        ba2.deposit(depoBA2);
//        System.out.println("Telah berhasil deposit sebanyak" + depoBA2 + " untuk " + ba2.getCustomerName());
//        System.out.println("Saldo untuk " + ba2.getCustomerName() + " sekarang adalah " + ba2.getBalance());

    }

}