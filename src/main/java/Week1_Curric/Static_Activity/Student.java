package Week1_Curric.Static_Activity;

public class Student {
    int matricNo;
    String studentName;
    static String university = "ABU";


    public Student(int matricNo, String studentName) {
        this.matricNo = matricNo;
        this.studentName = studentName;
    }

    public int getMatricNo() {
        return matricNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public static String getUniversity() {
        return university;
    }

    static void changeUniversity(){
        university ="American University of Nigeria";
    }
    void display(){
        System.out.println(getMatricNo()+" "+getStudentName()+" "+getUniversity());
    }
}
