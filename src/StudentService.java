import enums.Process;
import informations.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    List<Student> students;
    List<Process> processes;
    Scanner scanner;

    public StudentService(ArrayList<Student> students, ArrayList<Process> processes, Scanner scanner) {
        this.students = students;
        this.processes = processes;
        this.scanner = scanner;

        processes.add(Process.PRINT_BY_ID);
        processes.add(Process.LIST_BELOW_80_POINTS);
        processes.add(Process.LIST_ABOVE_80_POINTS);
        processes.add(Process.LIST_STARTS_WITH_A);
    }

    public void start() {
        while (true) {
            System.out.println("Select Process:");
            printAllProcesses();
            System.out.print("Select: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    Student student = utill.Process.getCustomer(id, students);
                    System.out.println(student);
                    break;
                case 2:
                    List<Student> below80Points = utill.Process.getBelow80Points(students);
                    below80Points.forEach(System.out::println);
                    break;
                case 3:
                    List<Student> above80Points = utill.Process.getAbove80Points(students);
                    above80Points.forEach(System.out::println);
                    break;
                case 4:
                    List<Student> startsWithAStudents = utill.Process.getStudentsStartsWithA(students);
                    startsWithAStudents.forEach(System.out::println);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }


        // getCustomer(int id)
        // getList()
        // 2 grade olsun
        // ortalama 80+ olanlari gostersin
        // 80- olanlari gostersin
        // A ile baslayan telebeleri goster
    }

    private void printAllProcesses() {
        for (int i = 0; i < processes.size(); i++) {
            System.out.println((i + 1) + ". " + processes.get(i).toString());
        }
    }
}
