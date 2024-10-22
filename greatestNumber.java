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
public class greatestNumber {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
         System.out.println("enter first number");
         int num2=sc.nextInt();
          System.out.println("enter first number");
          int num3=sc.nextInt();
          if (num1>num2 && num1>num3){
               System.out.println(num1+" : is largest");
          }
          else if (num2>num1 && num2>num3){
               System.out.println(num2+" : is largest");
    }
          else  if (num3>num1 && num3>num2){
               System.out.println(num3+" : is largest");
          }
}
}