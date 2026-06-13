import java.util.Scanner;
import model.Student;
import service.StudentService;
import model.Student;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentService service = new StudentService();
        // System.out.print("Enter Student ID: ");
        // int id = sc.nextInt();
        // sc.nextLine();

        // System.out.print("Enter Name: ");
        // String name = sc.nextLine();

        // System.out.print("Enter Branch: ");
        // String branch = sc.nextLine();

        // System.out.print("Enter Phone Number: ");
        // String phone = sc.nextLine();

        // Student student = new Student(id, name, branch, phone);

        // service.addStudent(student);

        // System.out.println("Student Added Successfully!");
        // System.out.println("DISPLAY TEST");

        // service.displayAllStudents();
        // service.searchStudent(101);

        // StudentService service = new StudentService();

        // Student updatedStudent = new Student(101, "Akshaya", "AIML", "9999999999");

        // service.updateStudent(101, updatedStudent);
        // service.deleteStudent(101);
        while (true) {

            System.out.println("\n===== STUDENT DATA MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    Student student = new Student(id, name, branch, phone);

                    service.addStudent(student);

                    break;

                case 2:

                    service.displayAllStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();

                    service.searchStudent(searchId);

                    break;

                case 4:

                    System.out.print("Enter Student ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Branch: ");
                    String newBranch = sc.nextLine();

                    System.out.print("Enter New Phone Number: ");
                    String newPhone = sc.nextLine();

                    Student updatedStudent = new Student(updateId, newName, newBranch, newPhone);

                    service.updateStudent(updateId, updatedStudent);

                    break;

                case 5:

                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    service.deleteStudent(deleteId);

                    break;

                case 6:

                    System.out.println("Thank You!");

                    sc.close();

                    return;

                default:

                    System.out.println("Invalid Choice");

            }
        }

        // sc.close();

    }

}