/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validation;

import java.util.Scanner;

/**
 *
 * @author tungl
 */
public class Validation {

    // khong su dung static
    // Not empty->String, Must be integer!,check int LIMIT, No Spec character, check sdt, check email, check date, .......
    Scanner sc = new Scanner(System.in);

    public String checkEmpty(String mess) {
        System.out.println(mess);
        while (true) {
            String input = sc.nextLine();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.err.println("Not empty");
            }
        }
    }

    public int checkInt(String mess) {
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine());
                return input;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int checkIntLimit(String mess, int min, int max) {
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine());
                if(input>=min  && input<=max){
                    return input;
                }else{
                    System.out.println("Input must be in range "+ min + "-> "+max);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public Double checkDouble(String mess) {
        while (true) {
            try {
                Double input = Double.parseDouble(sc.nextLine());
                return input;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public boolean checkGender(String mess) {
        while (true) {
            String gender = checkEmpty(mess);
            if (gender.equalsIgnoreCase("male")) {
                return true;
            }
            if (gender.equalsIgnoreCase("female")) {
                return false;
            } else {
                System.err.println("Input must be only male or female!");
            }
        }
    }
}
