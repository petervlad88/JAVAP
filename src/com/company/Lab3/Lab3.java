package com.company.Lab3;

public class Lab3 {

    public static void main(String[] args) {


        LogicalOp logic = new LogicalOp();
        int x = 2;
        int y = 2;

        //        System.out.println(logic.compareNumbers(x, y));


//        Given a text input, if it is “FastTrack”, then
//        print “Learning text comparison”. If not,
//        print “Got to try some more”


        String text = "FastTrack";

//        System.out.println(logic.compareStrings(text));
//        System.out.println(logic.compareStrings("asd"));

// Given a number, if it’s equal to or higher than 2
// and equal to or lower than 8, print the number

        int aNumber = 9;

//        System.out.println(logic.verifyInInterval(aNumber));



// Creati o metoda de tip String, care sa primeasca un parametru de tip int.
// Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul.
// Daca nu, sa printeze “The forecast snow is(cm):” si numarul.
// Apelati metoda in main() pentru a verifica daca functioneaza.



        System.out.println(logic.winter(8));

        // Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
        // Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
        // Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
        // Apelati metoda in main() pentru a verifica daca functioneaza.

        System.out.println(logic.compareNo(5));
        System.out.println(logic.compareNo(4));


//Creati o metoda care sa se numeasca isNumberEven.
// Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals.
// Daca numarul e par sa returneze true iar daca e impar sa returnese false.
// Apelati metoda in main() pentru a verifica daca functioneaza.

        System.out.println(logic.isNumberEven(0));
        System.out.println(logic.isNumberEven(1));


//Creati o metoda care sa se numeasca isEligibleToVote.
// Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot.
// Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
// Apelati metoda in main() pentru a verifica daca functioneaza.

        System.out.println(logic.isEligibleToVote(19));
        System.out.println(logic.isEligibleToVote(17));


// Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
// Apelati metoda in main() pentru a verifica daca functioneaza.

        System.out.println(logic.bigNumber(3,9,15));

        Math myMath = new Math();

        System.out.println(myMath.minus(6,2));













    }
}
