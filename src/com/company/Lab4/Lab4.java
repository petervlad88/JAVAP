package com.company.Lab4;

public class Lab4 {

    public static void main(String[] args) {

        LogicalOp logic = new LogicalOp();


        //Write a java program to count backwards from a given number to a lower given number

        logic.givenNumber(15, 10);

        // Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
        // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
        // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.


        logic.fromNtoN(95);

        //Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
        // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.


        logic.fromNtoNdecrease(-98);

        //Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
        // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
        // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

        logic.biggerNumber(15,10);

        //Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.






















    }
}
