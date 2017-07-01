/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestNonObjectOriented;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mitch W
 */
public class Startup {
    
    public static void main(String[] args) {
        //Give Users A Test Then Output Their Answers.
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> test = new ArrayList();
        //add questions to the test ArrayList. 
           test.add("What Is Your Favorite Color?");
           test.add("What Is Your Favorite Food?");
           test.add("What Is Your Favorite Movie?");
           test.add("What Is Your Favorite Tv Show?");
           test.add("What Is Your Favorite Video Game?");
        
        ArrayList<String> answers = new ArrayList();
        
        System.out.println(test.get(0));
        String input = sc.nextLine();
        answers.add(input);
        
        System.out.println(test.get(1));
        input = sc.nextLine();
        answers.add(input);
        
        System.out.println(test.get(2));
        input = sc.nextLine();
        answers.add(input);
        
        System.out.println(test.get(3));
        input = sc.nextLine();
        answers.add(input);
        
        System.out.println(test.get(4));
        input = sc.nextLine();
        answers.add(input);
        
        System.out.println(test.get(5));
        input = sc.nextLine();
        answers.add(input);
        
        int questionNumber = 1;  
        System.out.println("");
        //loop through and output all the Answers. 
        for(String answer : answers ){
            System.out.println("Question " + questionNumber + ": " + answer );
            questionNumber++;
        }
        
    }
    
}
