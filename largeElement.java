/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bioni
 */
public class largeElement {
    
    public static void main(String[] args) {
  
        int[] numbers = {34, 23, 12, 45, 67, 89, 234, 26, 10, 30, 43};

      
        int largest = numbers[0];

    
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

      
        System.out.println("The largest element in the array is: " + largest);
    }
} 


