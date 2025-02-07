package com.oca.java.classes.data;

public class BooleanExample {
    public static void main(String[] args) {
        boolean voucherPurchased = false;
        boolean examPrepStarted = false;

        if (voucherPurchased) {
            System.out.println("You can register for the exam");
        } else {
            System.out.println("Please purchase a voucher to register");
        }

        if (examPrepStarted) {
            System.out.println("Keep up the preparation");
        } else {
            System.out.println("You should start preparing for the exam");
        }
    }
}
