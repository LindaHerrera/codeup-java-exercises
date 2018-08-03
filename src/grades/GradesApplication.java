package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String , Student> student = new HashMap();
        Student s1 = new Student("Steven");
        s1.addGrade(60);
        s1.addGrade(80);
        s1.addGrade(70);

        Student s2 = new Student("Garnet");
        s2.addGrade(90);
        s2.addGrade(30);
        s2.addGrade(40);

        Student s3 = new Student("Connie");
        s3.addGrade(100);
        s3.addGrade(100);
        s3.addGrade(100);

        student.put("a123", s1);
        student.put("b123", s2);
        student.put("c123", s3);

        System.out.println(student.get("a123").getGradeAverage());


    }

    public static void initApp(){

    }
}
