/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist1;

/**
 *
 * @author ekenenwume
 */
public class StudentList1 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Ekenedilichukwu Nwume");
        students[1] = new Student("Tobi Abiade");
        students[2] = new Student("Joseph Whensu");
        students[3] = new Student("Emeka Mbachu");
        students[4] = new Student("Evans Samuel");

        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}
