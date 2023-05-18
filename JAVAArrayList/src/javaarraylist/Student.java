/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaarraylist;

/**
 *
 * @author tungl
 */
public class Student {
    private String code;
    private String fullname;
    private String classes;

    public Student(String code, String fullname, String classes) {
        this.code = code;
        this.fullname = fullname;
        this.classes = classes;
    }

    public Student() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", fullname=" + fullname + ", classes=" + classes + '}';
    }
    
}
