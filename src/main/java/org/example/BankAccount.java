package org.example;
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
}
