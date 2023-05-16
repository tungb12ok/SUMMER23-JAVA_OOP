/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package first;

public class Student {
    String msv;
    String name;
    String DOB;
    String gender;
    String address;

    public Student() {
    }

    public Student(String msv, String name, String DOB, String gender, String address) {
        this.msv = msv;
        this.name = name;
        this.DOB = DOB;
        this.gender = gender;
        this.address = address;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
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
        return "Student{" + "msv=" + msv + ", name=" + name + ", DOB=" + DOB + ", gender=" + gender + ", address=" + address + '}';
    }
    
    
    
}
