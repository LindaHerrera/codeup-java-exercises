package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades =  new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (int d : grades) sum += d;
        double average = sum / grades.size();
        return average;
    }

    public static void main(String[] args) {

        Student stu1 = new Student("Sarah");
        Student stu2 = new Student("Rick");
        stu1.addGrade(80);
        stu1.addGrade(50);
        System.out.println(stu1.getGradeAverage());
        stu2.addGrade(77);
        stu2.addGrade(75);
        System.out.println(stu2.getGradeAverage());
    }

}

