import java.util.*;

public class Testing {
    public static void main(String[] args) {
        String userName;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.next();
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
                   solution = num1 + num2;
                   question += num1 + " + " + num2;
                   break;
               case 1:
                   solution = num1 - num2;
                   question += num1 + " - " + num2;
                   break;
               case 2:
                   solution = num1 * num2;
                   question += num1 + " * " + num2;
                   break;
               case 3:
                   num2 = (num2 == 0) ? 1 : num2;
                   solution += num1 / num2;
                   question += num1 + " / " + num2;
                   break;
           }
           System.out.println(question);
           System.out.println("answer: ");
           int userAnswer = scanner.nextInt();

           if (userAnswer == solution){
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
