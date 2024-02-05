package Week1_Curric.InheritanceExcercise;

public class Main {
    public static void main(String[] args) {


        Animal obj1 = new Dog("Arya");
        Dog obj2 = new Dog("Spark");
        Cat obj3 = new Cat("Bingo");


        obj1.makeSound();
        obj2.fetch();
        obj3.makeSound();


    }
}
