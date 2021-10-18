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
public class UsHesaplama {

    /**
     * @param args the command line arguments
     */
    
    static int takePower(int base,int power){
         
        if (power == 0){
             return 1;
         }
        
        return base*takePower(base, power-1);
        
    }
    
    public static void main(String[] args) {
        
        int base,power;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter your base value:");
        base = scanner.nextInt();
        System.out.println("Please enter your power value:");
        power = scanner.nextInt();
        
        System.out.println(takePower(base, power));
        
    }
    
    
}
