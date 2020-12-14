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

        int home=minus(18,4);
        System.out.println(home);

        home=multi(4,5);
        System.out.println(home);

        float home3=averageNo(4,5,10,5);
        System.out.println(home3);



    }
    static int sum(int firstNumber, int secondNumber){
        return (firstNumber + secondNumber);

    }
    static int divide(int firstNumber,int secondNumber){
        return (firstNumber/secondNumber);


    }
    static float divide(float firstNumber,float secondNumber){
        return(firstNumber/secondNumber);
    }
    static int minus(int firstNumber,int secondNumber){
        return(firstNumber-secondNumber);

    }
    static int multi(int firstNumber,int secondNumber){
        return(firstNumber * secondNumber);
    }

    public void modelJava (String[] args) {
        System.out.println("       J    a   v     v  a ");
        System.out.println("       J   a a   v   v  a a");
        System.out.println("    J  J  aaaaa   V V  aaaaa");
        System.out.println("     JJ  a     a   V  a     a");



    }
    static float averageNo (float nr1,float nr2,float nr3 ,float nr4){
        return(nr1+nr2+nr3)/nr4;
    }
    public void cupFace (String[] args) {



    }
    static int modulo(int firstNumber,int secondNumber){
        return (firstNumber%secondNumber);
    }







}
