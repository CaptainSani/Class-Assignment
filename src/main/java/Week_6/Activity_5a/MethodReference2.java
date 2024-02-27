package Week_6.Activity_5a;

import Week_6.Activity_4a.Sayable;

public class MethodReference2 {

    public void saySomething(){
        System.out.println("this is a method");
    }

    public static void main(String[] args) {

        MethodReference2 methodReference2 = new MethodReference2();

        Sayable sayable = methodReference2::saySomething;
        sayable.say();


    }
}
