package Week_6.Activity_4a;

public class MethodReference {

    static void saySomething() {
        System.out.println("Hello, this is a static method");
    }

    public static void main(String[] args) {

        Sayable sayable = MethodReference::saySomething;
        sayable.say();

    }
}
