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
public class JavaOdevDeseneGoreMetot {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int number,temp;
        
        System.out.println("Input N:");
        number = scanner.nextInt();
        
        pattern(number, number,true);
    }
    
    static void pattern (int number,int temp,boolean check){
        System.out.println(temp + " ");
        
        if(!check && number == temp){
            return ;
        }
            
        if (check) {
            pattern(number, temp - 5, temp - 5 > 0);
        } else {
            pattern(number, temp + 5, false);
        }
        
       
    }
}
