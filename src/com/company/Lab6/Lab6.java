package com.company.Lab6;

import java.util.ArrayList;
import java.util.List;

public class Lab6 {
    public static void main(String[] args) {


        List <Integer> myList = new ArrayList<>();

        myList.add(44);
        myList.add(11);
        myList.add(13);
        myList.add(66);


        List<String> myList2 = new ArrayList<>();

        myList2.add(0,"No");
        myList2.add(1,"yes");
        myList2.add(2,"maybe");

//        myList.add(1, 13);

//        myList.set(2,8);

 //       myList.remove(Integer.valueOf(1));

//        System.out.println(myList);


        Logic myLogic= new Logic();
//
////Scrieti o metoda Java, care sa primeasca doi parametrii:
//// un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
//// Metoda sa adauge numarul primit ca si parametru la final de lista.
//
        System.out.println(myLogic.addFinalNumber(myList,49));
//
// //Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.
//
        myLogic.printListValues(myList);
//
////Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg.
//// Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.
//
//
        myLogic.startFromNumber(myList,3);
//
////Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).
//
       myLogic.reverseNumber(myList);
//
// //Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String
//        // Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
//
        System.out.println(myLogic.addToPosition (myList2 , 1, "Vlad"));
//
//
//        //Scrieti o metoda Java, care sa primeasca doi parametrii.
//        // Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.
//
        System.out.println(myLogic.addFirstOnTheList(myList, 23));
//
//        //Scrieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si ce pe ce pozitie.
//        // (Ex: “Pe pozitia 1 valoare este 4”).
//
        myLogic.valueAndPosition(myList);

        //Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista,


        System.out.println(myLogic.editPosition(myList, 44));





















    }



}
