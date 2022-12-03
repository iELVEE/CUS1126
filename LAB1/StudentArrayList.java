//importations
import java.util.ArrayList;

public class StudentArrayList{
    public static void main(String[] args){
        ArrayList<Students> SAL = new ArrayList<Students>();
        studentArrayList(SAL);
        System.out.println(printableStudents(SAL));
        System.out.println("Lab Average: " + avg(SAL));
    }

//    lab program 4
    public static void studentArrayList(ArrayList<Students> ary){
//        create 5 students into a list
        for (int i = 0; i < 5; i++) {
            ary.add(new Students("Stu"+(i+1),"dent"+(i+1), i));
        }
    }

//    organize the students array into a friendly format
    public static String printableStudents(ArrayList<Students> ary){
        String model = "";
//        add the students name with the score at the bottom, each student separated by a line
        for (int i = 0; i < ary.size(); i++) {
            model += "Student: " + ary.get(i).fname + " " + ary.get(i).lname;
            model += "\nlab1_score: " + ary.get(i).lab1_score;
            model += "\n\n";
        }
        return model;
    }

//    lab program 5
    public static int avg(ArrayList<Students> ary){
        int sum = 0;
        for (int i = 0; i < ary.size(); i++) {
            sum += ary.get(i).lab1_score;
        }
        return sum/ary.size();
    }
}
class Students{

    String fname; //first name of student

    String lname; //last name of student

    int lab1_score; //score in first lab

//    constructor
    public Students(String fname, String lname, int lab1_score){
        this.fname = fname;
        this.lname = lname;
        this.lab1_score = lab1_score;
    }
}