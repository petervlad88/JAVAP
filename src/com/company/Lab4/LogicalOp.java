package com.company.Lab4;

public class LogicalOp {


    public void givenNumber(int start, int stop) {
        for (int i = start; i >= stop; i--) {

            System.out.println(i);

        }
    }

    public void fromNtoN(int startValue) {
        for (int i = startValue; i <= 100; i++) {

            System.out.println(i);


        }
    }

    public void fromNtoNdecrease(int startValue) {
        for (int i = startValue; i >= -100; i--) {


            System.out.println(i);
        }
    }

    public void biggerNumber(int x, int y) {
        for (int i = x; i >= y; i--) {

            System.out.println(i);
        }
    }

}