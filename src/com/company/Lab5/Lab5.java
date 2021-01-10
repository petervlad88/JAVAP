package com.company.Lab5;

public class Lab5 {

    public static void main(String[] args) {

        Math myMath = new Math();
        System.out.println(myMath.sum(6,2));
        System.out.println(myMath.sum(4,5,7));
        System.out.println(myMath.sum(2.5,4.5));
        System.out.println(myMath.sum(7, 2.5));
        System.out.println(myMath.sum(2.5,5.6,7.33));

        System.out.println(myMath.minus(8,2));
        System.out.println(myMath.minus(22,3,8));
        System.out.println(myMath.minus(22.5,6.3,2.1));
        System.out.println(myMath.minus(22.0,6));
        System.out.println(myMath.minus(20,6.3));

        System.out.println(myMath.divide(10,5));
        System.out.println(myMath.divide(150,3,5,2));
        System.out.println(myMath.divide(15,3.5));
        System.out.println(myMath.divide(1005.5,15.5,2.2));

        System.out.println(myMath.multi(3,5));
        System.out.println(myMath.multi(5,4,8));
        System.out.println(myMath.multi(25.3,55.3));
        System.out.println(myMath.multi(22.2,55.3,44.2));
        System.out.println(myMath.multi(15,5.3));


        Logic myLogic = new Logic();

        //Problema 2
        myLogic.createArray(100); //initializare vector 1 .. 100
        myLogic.printArray(100); //afisarea elementelor

        //Problema 3
        int n=50; //nr. de elemente din vector
        int array[] = new int[51]; // creez un vector 51 elemente
        myLogic.populateArray(array, n);
        for(int i=1; i<= n; i++) {
            System.out.println(array[i] + ""); //parcurgem verctorul si afisam valorile
        }

        //Problema 4
        int no = 50; //nr. de elemente din vector
        int array1[] = new int[51]; // creez un vector 51 elemente
        myLogic.populateArray(array1, no);
        System.out.println(myLogic.average(array1, no)); //Afisam media elementelor din vector


        //Problema 5
        String array2[] = {"", "Abc", "Afdfd", "Adc"};
        String str = "Adc";
        System.out.println(myLogic.contains(array2,str));

        //Problema 6
        int nr = 343;
        int array3[] = {1, 35, 10, 343};
        System.out.println(myLogic.containsValue(array3,nr));









    }
}
