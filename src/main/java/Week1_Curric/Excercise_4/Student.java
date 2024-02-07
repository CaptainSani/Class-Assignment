package Week1_Curric.Excercise_4;


    public class Student extends Person{

        public  Student (String name, int age){
            super(name, age);
        }
        @Override
        public void display(){
            System.out.println("Student name is:"+ " "+ getName()+" "+"AGE:"+" "+getAge());
        }

    }
