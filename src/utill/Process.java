package utill;

import informations.Student;

import java.util.ArrayList;
import java.util.List;

public class Process {
    public static Student getCustomer(int i, List<Student> students) {
        for (Student student : students) {
            if (student.getId() == i) {
                return student;
            }
        }
        return null;
    }

    public static List<Student> getBelow80Points(List<Student> students) {
        List<Student> below80PointsStudents = new ArrayList<>();
        for (Student student : students) {
            int average = (student.getGradeEnd() + student.getGradeStart()) / 2;
            if(average <= 80) {
                below80PointsStudents.add(student);
            }
        }

        return below80PointsStudents;
    }

    public static List<Student> getAbove80Points(List<Student> students) {
        List<Student> above80PointsStudents = new ArrayList<>();
        for (Student student : students) {
            int average = (student.getGradeEnd() + student.getGradeStart()) / 2;
            if(average > 80) {
                above80PointsStudents.add(student);
            }
        }

        return above80PointsStudents;
    }


    public static List<Student> getStudentsStartsWithA(List<Student> students) {
        List<Student> studentsStartsWithA = new ArrayList<>();
        for (Student student : students) {
            if(student.getName().startsWith("A")) {
                studentsStartsWithA.add(student);
            }
        }

        return studentsStartsWithA;
    }
}