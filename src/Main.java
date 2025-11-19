import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Receb", 19, 78, 90);
        Student student2 = new Student("Tural", 30, 98, 83);
        Student student3 = new Student("Fuad", 22, 72, 63);
        Student student4 = new Student("Vusal", 26, 67, 52);
        Student student5 = new Student("Ruslan", 17, 77, 82);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudentService studentService = new StudentService(students);

        studentService.start();
    }

}
