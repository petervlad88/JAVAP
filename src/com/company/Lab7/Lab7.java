package com.company.Lab7;

public class Lab7 {

    public static void main(String[] args) {

        Logic logic = new Logic();

        int[] array = new int[]{400, 18, 17, 13};

        logic.printValue(array,4);



        float [] myArray ={10.5f,20.5f,30.5f,40.5f};


        ReadFrom read = new ReadFrom();

        int myInt = read.readInt();
        System.out.println(myArray[myInt]);


        float myFloat = read.readFloat();
        System.out.println(myArray[(int) myFloat]);


        double myDouble = read.readDouble();
        System.out.println(myArray[(int) myDouble]);

//        Logic logic = new Logic();
//
//        int[] array = new int[]{400, 18, 17, 13};
//
//        logic.printValue(array,500);














        }



}

