package Week1_Curric.Excercise3;

public class Main {
    public static void main(String[] args) {
        CBN uba = new UBA();
        CBN zenith = new Zenith();
        CBN gtb = new GTB();

        System.out.println("UBA'S interest:"+ uba.getRateInterest()+"%");
        System.out.println("GTB'S interest:"+ gtb.getRateInterest()+"%");
        System.out.println("ZENITH'S interest:"+ zenith.getRateInterest()+"%");
    }
}
