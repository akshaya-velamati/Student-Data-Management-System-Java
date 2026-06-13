package model;

public class Student {
    private int studentId;
    private String name;
    private String branch;
    private String phoneNumber;

    public Student(int studentId, String name, String branch, String phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.branch = branch;
        this.phoneNumber = phoneNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return studentId + "," + name + "," + branch + "," + phoneNumber;
    }
}
