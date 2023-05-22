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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validation in = new Validation();
        Management manager = new Management();
//        String a = in.checkEmpty("Enter a:");
        int choice;
        while (true) {  
            System.out.println("==========================Student Management System ===============================");
            System.out.println("1. Add Student.\n"
                    + "2. Display Student.\n"
                    + "3. Search Student.\n"
                    + "4. Update student.\n"
                    + "5. Delete student.\n"
                    + "4. Exit.");
            choice = in.checkIntLimit("Enter choice:",1,6);
            switch (choice) {
                case 1:
                    manager.addStudent();
                    break;
                case 2:
                    manager.display();
                    break;
                case 3:
                    manager.search();
                    break;
                case 4:
                    manager.update();
                    break;
                case 5:
                    manager.deleteStudent();
                    break;
                case 6:
                    return;
            }
        }

    }

}
