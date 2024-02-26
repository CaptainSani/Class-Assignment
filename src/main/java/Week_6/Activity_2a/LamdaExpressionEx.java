package Week_6.Activity_2a;

public class LamdaExpressionEx {
    public static void main(String[] args) {

        SayName n1 = (name) ->{
            return "Hello " + name;
        };


        System.out.println(n1.say("Sani"));
    }
}
