import java.util.ArrayList;

public class School
{
    // instance variables - replace the example below with your own
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    /**
     * Constructor for objects of class School
     */
    public School(ArrayList<Student> s, ArrayList<Teacher> t)
    {
        students = s;
        teachers = t;
    }

    public String getGradeLevel(int level){
        String output = "";
        for (Student s: students){
            int sLevel = s.getLevel();
            if (sLevel == level){
                output += s;
                output += "\n";
            }
        }
        return output;
    }

    public String toString(){
        String output = "";
        output += "Faculty:\n\n";
        for (Teacher t: teachers){
            output += t;
            output += "\n";
        }
        output += "\nStudent Body: \n";
        for (Student s: students){
            output += s;
            output += "\n";
        }
        return output;
    }
}

public class HighSchoolStudent extends Student
{
    // instance variables - replace the example below with your own
    private double gpa;

    public HighSchoolStudent(String fName, String lName, int gLevel, double g)
    {
        super (fName, lName, gLevel);
        gpa = g;
        if (g >= 5 || g <= 0)
            gpa = 0;
    }

    public String toString(){
        return super.toString() + "\n   GPA: " + gpa;
    }
    
}

public class Teacher extends Person
{
    // instance variables - replace the example below with your own
    private String subject;

    public Teacher(String fName, String lName, String s)
    {
        super(fName, lName);
        subject = s;
    }

    public String toString(){
        return super.toString() + "\n   Subject: " + subject;
    }
    
}