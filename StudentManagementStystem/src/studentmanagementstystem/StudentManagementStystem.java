/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagementstystem;
import validation.*;
/**
 *
 * @author tungl
 */
public class StudentManagementStystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validation in = new Validation();
//        String a = in.checkEmpty("Enter a:");
        int a = in.checkInt("Enter integer: ");
        Double x = in.checkDouble("enter x: ");
        
    }

}
