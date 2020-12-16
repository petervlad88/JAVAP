package com.company.Lab3;

public class LogicalOp {


    public int compareNumbers(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public String compareStrings(String value) {

        if (value.equals("FastTrack")) {
            return ("Learning text comparison");
        } else {
            return "Got to try some more";
        }
    }

    public int verifyInInterval(int aNumber) {
        if (aNumber >= 2 && aNumber <= 8) {
            return aNumber;
        } else {
            return -1;
        }

    }

    public String verifyTextAndNumberInterval(int number, String text) {
        if (text.equals("FastTrack") && number <= 3) {
            return (text + number);
        } else if (!text.equals("FastTrack") && number >= 4) {
            return (number + text);
        } else {
            return "";
        }
    }


    public String winter(int x) {
        if ((x > 8) || (x == 6)) {
            return "The amount of snow this winter was(cm):" + x;
        } else {
            return "The forcast snow is (cm)" + x;
        }

    }

    public String compareNo(int number) {
        if (number > 3 && !(number==4)) {
            return "The number is greater than 3 and not equal to 4";

        } else if (number == 4) {
            return "The number is equal to 4";

        } else if (number > 3) {
            return "The number is lower than 3";

        }else{
            return "";
        }
    }

    public boolean isNumberEven(int number){
        if (number %2==0){
            return true;
        }else {
            return false;

        }

    }
    public boolean isEligibleToVote(int number){
        if (number >18){
            return true;
        }else{
            return false;
        }
    }
    public int bigNumber (int no1,int no2,int no3){
        if (no1 > no2 && no1 > no3 ){
            return no1;
        }else if(no2>no1 && no2 > no3){
            return no2;
        }else {
            return no3;
        }
    }

}




