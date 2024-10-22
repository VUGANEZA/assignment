/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bioni
 */
public class reverse {
   
    public static void main(String[] args) {
        // Define the input array
        int[] numbers = {3, 4, 6, 1, 9, 7, 5, 8};

        System.out.println("Original Array:");
        printArray(numbers);

        // Reverse the array
        reverseArray(numbers);

        System.out.println("Reversed Array:");
        printArray(numbers);
    }

    // Method to reverse the elements of the array
    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            // Swap elements
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the center
            left++;
            right--;
        }
    }

    // Method to print the elements of the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

    

