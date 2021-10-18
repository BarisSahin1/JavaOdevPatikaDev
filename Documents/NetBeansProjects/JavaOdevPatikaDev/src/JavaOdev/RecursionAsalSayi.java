/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOdev;

import java.util.Scanner;

/**
 *
 * @author bsahi
 */


public class RecursionAsalSayi {
    
    static int primeNumber(int x, int i) {
        
        if (x < 2)
            return 0;
        if (i == 1)
            return 1;
        if (x % i == 0)
            return 0;
        
        return primeNumber(x, i - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number ;
        System.out.println("Plase enter your number.");
        number = scanner.nextInt();
        int result = primeNumber(number, number / 2);

        if (result == 0)
                System.out.println(number + " is not a prime number." );
        else
                System.out.println(number + " is a prime number.");
        }
    
    
}
    
    

