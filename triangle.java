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
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();

        // Loop to print the right-angled triangle
        for (int i = 1; i <= num; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("\n"); // Move to the next line
        }

        sc.close();
    }
}
