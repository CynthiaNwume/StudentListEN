/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist1;

/**
 *
 * @author ekenenwume
 */public class PartTimeStudent {
    private String name;
    private String studentId;
    private int numberOfCourses;
    private int hoursPerWeek;

    public PartTimeStudent(String name, String studentId, int numberOfCourses, int hoursPerWeek) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCourses = numberOfCourses;
        this.hoursPerWeek = hoursPerWeek;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    // Method to display student information
    public void displayStudentInfo() {
        System.out.println("Part-Time Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Number of Courses: " + numberOfCourses);
        System.out.println("Hours per Week: " + hoursPerWeek);
    }

    public static void main(String[] args) {
        // Creating an instance of PartTimeStudent
        PartTimeStudent student = new PartTimeStudent("John Doe", "PT12345", 3, 15);
        
        // Displaying the student information
        student.displayStudentInfo();
    }
}

