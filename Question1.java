/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author bioni
 */
import java.util.Scanner;
public class Question1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int number =sc.nextInt();
        if (number %2==0){
            System.out.println(number+""+":is Even");
            
        }
        else if (number%2!=0){
            System.out.println(number + ""+":is Odd");
        }
    }
    
}
