/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestObjectOriented;


import java.util.Scanner;

/**
 *
 * @author Mitch W
 */
public class InputScanner implements InputStrategy{

    private String userInput;
    private String prompt;

    public InputScanner(String prompt) {
       setPrompt(prompt);          
    }
    
    @Override
    public String askUserForInput() {
        System.out.println( getPrompt() );
        
        Scanner sc = new Scanner(System.in);
        setUserInput(sc.nextLine());
   
        return getUserInput() ;
    }

    @Override
    public String getPrompt() {
        return prompt;
    }

    @Override
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    @Override
    public String getUserInput() {
        return userInput;
    }

    @Override
    public void setUserInput(String userInput)  {
         this.userInput = userInput;
    }


    
    
    
}
