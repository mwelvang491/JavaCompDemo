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
        
        ArrayList<String> questions = new ArrayList();
            questions.add("What Is Your Favorite Color?");
            questions.add("What Is Your Favorite Food?");
        //    questions.add("What Is Your Favorite Movie?");
        //    questions.add("What Is Your Favorite Tv Show?");
        //    questions.add("What Is Your Favorite Video Game?");
        
        ArrayList<String> answers = new ArrayList();
        
        System.out.println(questions.get(0));
        String input = sc.nextLine();
        answers.add(input);
        
        System.out.println(questions.get(1));
        input = sc.nextLine();
        answers.add(input);
//        
//        System.out.println(questions.get(2));
//        input = sc.nextLine();
//        answers.add(input);
//        
//        System.out.println(questions.get(3));
//        input = sc.nextLine();
//        answers.add(input);
//        
//        System.out.println(questions.get(4));
//        input = sc.nextLine();
//        answers.add(input);
        
        int questionNumber = 1;  
        System.out.println("");
        for(String answer : answers ){
            System.out.println("Question " + questionNumber + ": " + answer );
            questionNumber++;
        }
        
    }
    
}
