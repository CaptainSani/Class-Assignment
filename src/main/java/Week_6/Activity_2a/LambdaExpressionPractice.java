package Week_6.Activity_2a;

public class LambdaExpressionPractice {
    public static void main(String[] args) {

        SayNamePractice s1 = (name,age) ->{
            return "Hello!"+" "+ name+", "+"Age: "+age;
        };

        System.out.println(s1.myName("SANI", 18));
    }


}
