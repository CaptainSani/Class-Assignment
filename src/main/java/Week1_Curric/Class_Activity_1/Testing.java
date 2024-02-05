package Week1_Curric.Class_Activity_1;

import java.util.*;

public class Testing {
    public static void main(String[] args) {
       // String userName;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Welcome to your math test"+ " " + name);
        System.out.println("Lets begin!");

        Random random = new Random();
       int score = 0;
       for(int i = 1; i<=5; i++){
           int num1 = random.nextInt(11);
           int num2 = random.nextInt(11);
           int calc = random.nextInt(4);

           int solution = 0;
           String question = "Solve this  : ";
           switch (calc){
               case 0:
                   solution = num1 * num2;
                   question += num1 + " * " + num2;

                   //if(answer == solution){
                   //System.out.println("Correct");
               //}else{
                 //      System.out.println("Wrong, the correct answer is"+ solution);
                   //}
                   break;
               case 1:
                   solution = num1 - num2;
                   question += num1 + " - " + num2;
                   break;
               case 2:
                   solution = num1 + num2;
                   question += num1 + " + " + num2;
                   break;
               case 3:

                   if(num2 == 0){
                       num2 = 1;
                   }
                   solution += num1 / num2;
                   question += num1 + " / " + num2;
                   break;
           }
           System.out.println(question);
           System.out.println("answer: ");
           int answer = scanner.nextInt();

           if (answer == solution){
               score++;
           }
       }

       if(score >= 4){
           System.out.println("You are Awesome!!!");
       } else if (score <4 && score >= 3) {
           System.out.println("Nice try!!");
       }
       else{
           System.out.println("Better luck next time!");
       }
        System.out.println(name + " your final score is: " + score + " out of 5");

    }

}
