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
    
        System.out.println("Non-Object Oriented Way."+"\n");
      Scanner sc = new Scanner(System.in);
      
        System.out.println("What Would You Like To Say?");
      String userInput = sc.nextLine();
        System.out.println("Output: " + userInput);
    }
  
}
