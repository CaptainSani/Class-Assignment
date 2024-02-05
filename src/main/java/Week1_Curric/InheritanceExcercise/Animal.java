package Week1_Curric.InheritanceExcercise;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound(){

        System.out.println("some generic sounds");
    }
}
