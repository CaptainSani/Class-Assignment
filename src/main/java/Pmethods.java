import java.util.Scanner;

public class Pmethods {

    //STATIC METHOD
//    public static void evenOdd(int num){
//        if(num % 2 == 0){
//            System.out.println("The number is even");
//        }else{
//            System.out.println("The number is Odd");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter any positive number:");
//        int  number = input.nextInt();
//        evenOdd(number);
//        }


//    public static int add(int a, int b) {
//        return a + b;
//    }

//    public static void main(String[] args) {
//        int c = add(2,3);
//        System.out.println("the sum is:"+ c);
//    }

//    public static int maxNum(int max, int min) {
//       int result = Math.max(max,min);
//
//       return result;
//
//    }


        //TAKING USER INPUT FOR SAME PROBLEM
//    public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter a max number:");
//            int max = input.nextInt();
//
//        Scanner input2 = new Scanner(System.in);
//        System.out.println("Enter a min number:");
//        int min = input2.nextInt();
//
//        int userAnswer = maxNum(max,min);
//
//        System.out.println("maximum number is:"+ userAnswer);
//
//    }

    //USING INSTANCE METHOD
    public int HighLow(int max, int min){
        return Math.max(max, min);
        }

    public static void main(String[] args) {
       Pmethods object = new Pmethods();
       int result = object.HighLow(5,2);
        System.out.println("maximum number is:"+ result);

    }


}