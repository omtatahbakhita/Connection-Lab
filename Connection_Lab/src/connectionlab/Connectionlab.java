/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectionlab;

import java.util.Scanner;

/**
 *
 * @author Bakhita
 */
public class Connectionlab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("reply with");
        System.out.println("A: To add new record");
        System.out.println("D: To delete/remove a record");
        System.out.println("U: To update record");
        String reply;
        Scanner scanner = new Scanner(System.in);
        reply = scanner.nextLine();
        switch(reply){
            case "A":
                int student_no;
                String first_name, last_name, gender, programme;
                System.out.println("Your student number");
                student_no = scanner.nextInt();
                System.out.println("Your first name");
                first_name = scanner.next();
                System.out.println("Your last name");
                last_name = scanner.next();
                System.out.println("Your gender");
                gender = scanner.next();
                System.out.println("Your Programme");
                programme = scanner.next();
                CrudOperations crudOperations = new CrudOperations();
                crudOperations.setStudent_no(student_no);
                crudOperations.setFirst_name(first_name);
                crudOperations.setLast_name(last_name);
                crudOperations.setGender(gender);
                crudOperations.setProgramme(programme);
                crudOperations.save();
                break;
            case "D":
                break;
            case "U":
                break;
            default:
                System.out.println("Invalid entry");
        }
    }
    
}
