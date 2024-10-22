/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bioni
 */
public class array {
  
    public static void main(String[] args) {
     
        int[] numbers = {10, 12, 34, 23, 56, 78};

       
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;

        System.out.println("The average is: " + average);
    }
}

    

