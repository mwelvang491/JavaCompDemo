/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CopierNonObjectOriented;

import java.util.Scanner;

/**
 *
 * @author Mitch W
 */
public class Startup {
    
    public static void main(String[] args) {
    //Non-Object Oriented Way.
        
      //scanners get user input from the console. sc the variable name for the scanner object. 
      Scanner sc = new Scanner(System.in);
      
        System.out.println("What Would You Like To Say?"); 
        
        //get the input from the user
        String userInput = sc.nextLine();
        //output the input to the console. 
        System.out.println("Output: " + userInput);
    }
  
}
