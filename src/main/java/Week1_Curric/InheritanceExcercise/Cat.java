package Week1_Curric.InheritanceExcercise;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void makeSound(){
        System.out.println("meow meow");
    }
}
