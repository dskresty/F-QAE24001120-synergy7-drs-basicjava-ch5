package org.example;
import java.util.Scanner;
public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount(int accountNumber, int balance, String customerName, String customerEmail, String customerPhone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void deposit(int uangYangAkanDimasukin) {
        this.balance += uangYangAkanDimasukin;
    }

    public void withdraw(int uangYangAkanDikeluarkan) {
        if (uangYangAkanDikeluarkan > this.balance) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            this.balance -= uangYangAkanDikeluarkan;
        }
    }

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

        System.out.print("Jumlah uang yang akan di withdraw untuk " + ba1.getCustomerName() + ": ");
        int tarikBA1 = scanner.nextInt();
        ba1.withdraw(tarikBA1);
        System.out.println("Telah berhasil withdraw sebanyak " + tarikBA1 + " untuk" + ba1.getCustomerName());
        System.out.println("Saldo untuk " + ba1.getCustomerName() + " sekarang adalah " + ba1.getBalance());
        System.out.println("Program selesai!");

    }

}
