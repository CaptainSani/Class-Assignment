package Week1_Curric.Inheritance;

public class Main {
    public static void main(String[] args) {
        Programmer obj = new Programmer(1000000,500000);

        System.out.println("Programmer salary is: "+ " "+obj.getSalary());
        System.out.println("Programmer Bonus is: "+ " "+obj.getBonus());
    }
}
