import java.util.ArrayList;
import java.util.List;

public class StudentService {
    ArrayList<Student> students;

    public StudentService(ArrayList<Student> students) {
        this.students = students;
    }

    public void start() {
        Student student1 = new Student("Receb", 19, 78, 90);
        Student student2 = new Student("Tural", 30, 98, 83);
        Student student3 = new Student("Fuad", 22, 72, 63);
        Student student4 = new Student("Vusal", 26, 67, 52);
        Student student5 = new Student("Ruslan", 17, 77, 82);
        ArrayList<Student> studentsNew = new ArrayList<>();
        studentsNew.add(student1);
        studentsNew.add(student2);
        studentsNew.add(student3);
        studentsNew.add(student4);
        studentsNew.add(student5);

        System.out.println(studentsNew);

        System.out.println(getCustomer(1));

        List<Student> allStudents = getStudents();
        System.out.println(allStudents);

        List<Student> aGrades = getAGrades();
        System.out.println(aGrades);

        // getCustomer(int id)
        // getList()
        // 2 grade olsun
        // ortalama 80+ olanlari gostersin
        // 80- olanlari gostersin
        // A ile baslayan telebeleri goster
    }


    public Student getCustomer(int i) {
        for (Student student : students) {
            if(student.getId() == i) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> getAGrades() {
        for (Student student : students) {
            int avarage = (student.getGradeEnd() + student.getGradeStart()) / 2;
            if(avarage > 80) {
                students.add(student);
            }
        }

        return students;
    }

    public List<Student> getOtherGrades(List<Student> students) {
        for (Student student : students) {
            int avarage = (student.getGradeEnd() + student.getGradeStart()) / 2;
            if(avarage <= 80) {
                students.add(student);
            }
        }

        return students;
    }


    public List<Student> getA_students(List<Student> students) {
        for (Student student : students) {
            if(student.getName().startsWith("A")) {
                students.add(student);
            }
        }

        return students;
    }
}
