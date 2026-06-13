package service;

import model.Student;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.PrintWriter;

public class StudentService {
    private final String FILE_NAME = "../data/students.txt";

    public void addStudent(Student student) {

        try {

            FileWriter fw = new FileWriter(FILE_NAME, true);

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(student.toString());
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void displayAllStudents() {

        try {

            FileReader fr = new FileReader(FILE_NAME);

            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void searchStudent(int searchId) {

        try {

            FileReader fr = new FileReader(FILE_NAME);

            BufferedReader br = new BufferedReader(fr);

            String line;

            boolean found = false;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                if (Integer.parseInt(data[0]) == searchId) {
                    found = true;

                    System.out.println("Student Found");
                    System.out.println(line);

                }
            }
            if (!found) {
                System.out.println("Student Not Found");
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int updateId, Student updatedStudent) {

        File oldFile = new File(FILE_NAME);

        File tempFile = new File("../data/temp.txt");

        try {

            BufferedReader br = new BufferedReader(new FileReader(oldFile));

            PrintWriter pw = new PrintWriter(tempFile);

            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (Integer.parseInt(data[0]) == updateId) {

                    pw.println(updatedStudent.toString());

                } else {

                    pw.println(line);

                }

            }
            br.close();
            pw.close();

            oldFile.delete();

            tempFile.renameTo(oldFile);

            System.out.println("Student Updated Successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int deleteId) {

        File oldFile = new File(FILE_NAME);

        File tempFile = new File("../data/temp.txt");

        try {

            BufferedReader br = new BufferedReader(new FileReader(oldFile));

            PrintWriter pw = new PrintWriter(tempFile);

            String line;

            while ((line = br.readLine()) != null) {
                while ((line = br.readLine()) != null) {

                    String[] data = line.split(",");

                    if (Integer.parseInt(data[0]) != deleteId) {

                        pw.println(line);

                    }
                }

            }

            br.close();
            pw.close();

            oldFile.delete();

            tempFile.renameTo(oldFile);

            System.out.println("Student Deleted Successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
