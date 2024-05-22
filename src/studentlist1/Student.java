/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist1;

/**
 * This class represents a student with a name and address.
 * 
 * @author ekenenwume
 */
public class Student {
    
    private String name;
    private String address;

    /**
     * Constructor to initialize both name and address.
     * 
     * @param name the name of the student
     * @param address the address of the student
     */
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Gets the name of the student.
     * 
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     * 
     * @param name the new name of the student
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets the address of the student.
     * 
     * @return the address of the student
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the student.
     * 
     * @param address the new address of the student
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
