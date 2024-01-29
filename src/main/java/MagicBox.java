public class MagicBox {



      //GETTERS AND SETTERS

//    private int secretNumber = 777;
//
//
//    public int getSecretNumber(){
//        return secretNumber;
//    }
//
//    public void setSecretNumber(int newNumber){
//        this.secretNumber = newNumber;
//    }

//    private int secretNumber = 777;
//
//    private String name = "sani";
//
//    private boolean isTrue = false;
//
//    public int getSecretNumber() {
//        return secretNumber;
//    }
//
//    public void setSecretNumber(int secretNumber) {
//        this.secretNumber = secretNumber;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public boolean isTrue() {
//        return isTrue;
//    }
//
//    public void setTrue(boolean aTrue) {
//        isTrue = aTrue;
//    }

//    private int id = 1;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    private String name = "SANI";
//
//void display(){
//    System.out.println(id + " " + name);
//}
//
//    public static void main(String[] args) {
//    MagicBox object = new MagicBox();
//    object.setId(20);
//    object.setName("Dogo");
//    object.display();
//
//    }



    private int id;
    private String name;

    public MagicBox(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id+ " "+ name);
    }

    public static void main(String[] args) {
        MagicBox object1 = new MagicBox(1,"captain");
        MagicBox object2 = new MagicBox(2,"sani");
        MagicBox object3 = new MagicBox(3,"dogo");
        object1.display();
        object2.display();
        object3.display();
    }
}


