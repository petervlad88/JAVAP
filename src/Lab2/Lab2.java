package Lab2;

public class Lab2 {

    public static void main(String[] args) {
        int result= sum(5,4);
        System.out.println(result);

        result=divide(9,3);
        System.out.println(result);

        result=modulo(8,3);
        System.out.println(result);

        float result1=divide(15f,8f);
        System.out.println(result1);

    }
    static int sum(int firstNumber, int secondNumber){
        return (firstNumber + secondNumber);

    }
    static int divide(int firstNumber,int secondNumber){
        return (firstNumber/secondNumber);

    }
    static int modulo(int firstNumber,int secondNumber){
        return (firstNumber%secondNumber);

    }
    static float divide(float firstNumber,float secondNumber){
        return(firstNumber/secondNumber);
    }


}
