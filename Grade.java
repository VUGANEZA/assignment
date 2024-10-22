/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Grade {
public static void main(String[]args){
Scanner obj=new Scanner(System.in);
  System.out.print("Enter your grade (A, B, C, D, F): ");
  String grade = obj.next().toUpperCase(); 

        switch (grade) {
            case "A":
                System.out.println("Excellent work!");
                break;
            case "B":
                System.out.println("Good job!");
                break;
            case "C":
                System.out.println("You passed!");
                break;
            case "D":
                System.out.println("You need to improve.");
                break;
            case "F":
                System.out.println("You failed. Try harder next time.");
                break;
            default:
                System.out.println("Invalid grade entered. Please enter A, B, C, D, or F.");
                break;
        }

       obj.close();
    }
}
