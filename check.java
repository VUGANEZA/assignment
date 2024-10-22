/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bioni
 */
import java.util.Scanner;
public class check {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int number= sc.nextInt();
        if (number>0){
            System.out.println(number+""+":is POSITIVE");
            
        }
       else if (number<0){
            System.out.println(number+""+":is NEGATIVE");
    }
        else {
         
            System.out.println(number+""+":is Zero");
        }
}}
