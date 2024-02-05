package Week1_Curric.ClassExcercise_2;

public class Main {
    public static void main(String[] args) {
        OverloadingExample overloadingExample = new OverloadingExample();
        System.out.println(OverloadingExample.add(2,3));
        System.out.println(OverloadingExample.add(2,3,4));
        System.out.println(OverloadingExample.add(2.4,1.5));
    }
}
