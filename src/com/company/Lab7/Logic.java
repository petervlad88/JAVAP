package com.company.Lab7;

public class Logic {


    public void printValue(int[] array, int x) {

        array = new int[]{400, 18, 17, 13};
        try {
            System.out.println(array[x]);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside catch, number too large");
        }
    }

    public void wait(int aSecond) {
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}



