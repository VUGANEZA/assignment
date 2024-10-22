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
public class leapYear {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the year");
        int year= sc.nextInt();
        if((year % 4==0 && year %100!=0)||(year %400==0)){
        System.out.println(year +""+"is leap year");
        }
        else{
            System.out.println(year +""+"is not leap year.");
        }
    }
}
