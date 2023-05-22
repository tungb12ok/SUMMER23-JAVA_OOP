/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementstystem;

import java.util.ArrayList;
import java.util.List;
import validation.Validation;

/**
 *
 * @author tungl
 */
public class Management {

    Validation in = new Validation();
    List<Student> list = new ArrayList<>();

    private String code;
    private String name;
    private String classes;
    private boolean gender;
    private String address;

    public void addStudent() {
        // input user
        code = in.checkEmpty("Enter code:");
        if(searchStudent(code)!=null){
            System.out.println("Studen does exist DB!");
            return;
        }
        name = in.checkEmpty("Enter name:");
        classes = in.checkEmpty("Enter classes:");
        gender = in.checkGender("Enter gender:");
        address = in.checkEmpty("Enter address:");
        // add in list
        list.add(new Student(code, name, classes, gender, address));
        System.out.println("Add student succesfully!");
    }

    public void display() {
        System.out.format("%-15s%-15s%-15s%-15s%-15s\n", "Code", "Name", "Class", "Gender", "Address");
        for (Student i : list) {
            System.out.println(i);
        }
    }

    public Student searchStudent(String code) {
        for (Student i : list) {
            if (i.getCode().equalsIgnoreCase(code)) {
                return i;
            }
        }
        return null;
    }

    public void update() {
        String code = in.checkEmpty("Enter code: ");
        Student a = searchStudent(code);
        if (a == null) {
            System.out.println("Student does not exits!");
        } else {
            // input to update
            name = in.checkEmpty("Enter name:");
            classes = in.checkEmpty("Enter classes:");
            gender = in.checkGender("Enter gender:");
            address = in.checkEmpty("Enter address:");
            // set data student
            a.setName(name);
            a.setGender(gender);
            a.setClasses(classes);
            a.setAddress(address);
        }
    }

    public void deleteStudent() {
        String code = in.checkEmpty("Enter code: ");
        Student a = searchStudent(code);
        if (a == null) {
            System.out.println("Student does not exits!");
        } else {
            // input to update
           list.remove(a);
            System.out.println("Delete succesfully!");
        }

    }

    public void search() {
        String code = in.checkEmpty("Enter code: ");
        Student a = searchStudent(code);
        if (a != null) {
            System.out.format("%-15s%-15s%-15s%-15s%-15s\n", "Code", "Name", "Class", "Gender", "Address");
            System.out.println(a);
        } else {
            System.out.println("Not found!");
        }
    }
}
