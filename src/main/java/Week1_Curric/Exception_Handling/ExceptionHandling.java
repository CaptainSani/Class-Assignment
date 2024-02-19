package Week1_Curric.Exception_Handling;

public class ExceptionHandling {
    public static void main(String[] args) {
//        int num = 500/0;
//        System.out.println("run other code");



        try{
            int num = 500/0;
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("run other code");
    }
}
