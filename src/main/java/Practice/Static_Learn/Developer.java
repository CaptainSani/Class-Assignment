package Practice.Static_Learn;

public class Developer {
    int id;
    String name;
   static String institute = "Decagon";

    public Developer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInstitute() {
        return institute;
    }

    void display(){
        System.out.println(getId()+" "+getName()+" "+getInstitute());
    }
}
