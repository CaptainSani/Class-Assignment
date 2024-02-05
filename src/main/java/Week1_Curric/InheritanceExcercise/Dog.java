package Week1_Curric.InheritanceExcercise;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void makeSound(){
        System.out.println("woof woof");
    }
    public void fetch(){
        System.out.println(getName()+" is fetching the ball");
    }
}
