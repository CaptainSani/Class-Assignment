package Week1_Curric.Class_Activity2;

public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent("RED");
        Child child = new Child("BLUE");

        System.out.println(parent.getColor());
        System.out.println(child.getColor());
    }
}
