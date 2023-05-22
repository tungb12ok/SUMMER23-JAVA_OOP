/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagementstystem;

/**
 *
 * @author tungl
 */
public class Student {

    private String code;
    private String name;
    private String classes;
    private boolean gender;
    private String address;

    public Student() {
    }

    public Student(String code, String name, String classes, boolean gender, String address) {
        this.code = code;
        this.name = name;
        this.classes = classes;
        this.gender = gender;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String rls = gender ?  "Male" : "Female" ;
        return String.format("%-15s%-15s%-15s%-15s%-15s", code, name, classes, rls, address);
    }

}
