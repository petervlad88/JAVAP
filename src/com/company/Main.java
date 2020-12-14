package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int ecMain=main1(5,4);
        System.out.println(ecMain);

        int ecMain2=main2(9,3);
        System.out.println(ecMain2);

        int ecMain3=main3(-5,8,6);
        System.out.println(ecMain3);

        int ecMain4=main4(55,9,9);
        System.out.println(ecMain4);

        float ecMain5=main5(20,-3,5,8);
        System.out.println(ecMain5);




        System.out.println("Hello");
        System.out.println("Vlad");

        int myByte=5+4;
        System.out.println(myByte);

        int myByte2=9/3;
        System.out.println(myByte2);

        int ec1=-5 + 8 * 6;
        System.out.println(ec1);

        int ec2=(55+9) % 9;
        System.out.println(ec2);

        float ec3=20 +(float) -3*5 / 8;
        System.out.println(ec3);

        float ec4=5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(ec4);

    }
    static int main1 (int number1,int number2 ){
        return(number1+number2);
    }
    static int main2 (int number1,int number2){
        return (number1/number2);
    }
    static int main3 (int number1,int number2,int number3 ){
        return(number1 + number2 * number3);
    }
    static int main4 (int number1,int number2,int number3 ) {
        return (number1 + number2 % number3);
    }
    static float main5 (float number1,float number2,float number3,float number4 ) {
        return (number1 + number2 * number3 / number4);
    }



}