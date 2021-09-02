/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author avance
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String firstName;
     
       Scanner myScanner = new Scanner(System.in);
      
       System.out.println("Hello! What is your name?");
       firstName = myScanner.nextLine();
      
       System.out.println("Hi there "  + firstName + ", How are you today?");     
   
     
    }
    
}
