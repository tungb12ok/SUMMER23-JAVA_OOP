/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaarraylist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tungl
 */
public class JAVAArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("hexxx", "tng", "SExxx");
        Student s4 = new Student("hexxx", "tng", "SExxx");
        Student s2 = new Student("he2xx", "tng", "SExxx");
        Student s3 = new Student("he3xx", "tng", "SExxx");
        // addd
        list.add(s1);
        list.add(s2);
        list.add(s3);
        // size  
        list.size();
        // list 1 record add index pos:2
        for (Student i : list) {
            System.out.println(i);
        }
        System.out.println("=======After Remove========");
        list.remove(s3);
        for (Student i : list) {
            System.out.println(i);
        }

    }
}
