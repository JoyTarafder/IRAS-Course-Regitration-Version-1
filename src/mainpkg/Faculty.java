/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Asus
 */
public class Faculty extends User implements Serializable {
    private String designation , dept;
    private float salary;

    public Faculty(int id, String name, LocalDate dob, LocalDate doj, String designation, String dept, float salary) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.doj = doj;
        this.designation = designation;
        this.dept = dept;
        this.salary = salary;
    }

    
    
}
