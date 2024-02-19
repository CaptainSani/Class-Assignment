package Week1_Curric.Exception_Handling.Class_Excercise;

public class Except {
    public static void main(String[] args) {
        int num1 =100;
        int num2 =0;
        int num3;


        try{
             num3 = num1 / num2;
        }catch(Exception e){
            System.out.println(num1/(num2 +2));
        }


    }
}
