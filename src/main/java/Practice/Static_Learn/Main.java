package Practice.Static_Learn;

public class Main {
    public static void main(String[] args) {
        Developer d1 = new Developer(1,"Sani");
        Developer d2 = new Developer(2,"shifu");
        Developer d3 = new Developer(3,"praise");
        Developer d4 = new Developer(4,"Isioma");
        Developer d5 = new Developer(5,"Eric");

        Developer.institute = "NMS";

        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d5.display();

    }

}
