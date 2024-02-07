package Week1_Curric.Excercise_4;

public class Teacher extends Person{

    public  Teacher (String name, int age){
        super(name, age);
    }
    @Override
    public void display(){
        System.out.println("Teachers name is:"+ " "+ getName()+" "+getAge());
    }


}
