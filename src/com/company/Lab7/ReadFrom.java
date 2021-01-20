package com.company.Lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFrom {

    public int readInt() {
        int x = 0;
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introdu o valorea: ");
            try {
                x = scanner.nextInt();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect.");
            }
        }
        return x;
    }

    public float readFloat() {

        float x = 2.5f;
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare");
            try {
                x = scanner.nextInt();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");

            }
        }
        return x;

    }

    public String readString() {

        String x = "Valoare";
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare");
            try {
                x = scanner.next();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");

            }
        }
        return x;

    }
    public double readDouble() {

        double x = 2.5d;
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare");
            try {
                x = scanner.nextInt();
                read = false;
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");

            }
        }
        return x;
    }
    public int[] numberListFromKeyboard(int numberPosition) {

        int[] array = new int[numberPosition];

        for (int i = 0; i < numberPosition; i++) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introdu o valoare");

            try {
                array[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return array;
    }



    }



