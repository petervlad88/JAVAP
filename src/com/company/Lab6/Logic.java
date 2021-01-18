package com.company.Lab6;

import java.util.List;

public class Logic {

    public List<Integer> addFinalNumber(List<Integer> mylist, int number) {
        mylist.add(number);
        return mylist;
    }

    public void printListValues(List<Integer> mylist) {
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
    }

    public void startFromNumber(List<Integer> myList, int x) {
        for (int i = x; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    public void reverseNumber(List<Integer> myList) {
        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }
    }

    public List<String> addToPosition(List<String> myListVlad, int x, String y) {
        myListVlad.add(1, y);
        return myListVlad;

    }


    public List<Integer> addFirstOnTheList(List<Integer> myList, int x) {

        myList.add(0, x);
        return myList;


    }

    public void valueAndPosition (List<Integer>myList ){
        for (int i=0 ; i<myList.size();i++){

            System.out.println("pe pozitia" + i + "valoarea este" + myList.get(i));
        }
    }

    public List<Integer> editPosition (List<Integer> myList , int x ){

        myList.set(2,x );

        return myList;
    }








}
