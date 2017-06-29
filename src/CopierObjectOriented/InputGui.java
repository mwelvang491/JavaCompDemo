/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CopierObjectOriented;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Mitch W
 */
public class InputGui implements InputStrategy {   
    private String userInput;
    private String prompt;

    public InputGui(String prompt) {
       setPrompt(prompt);          
    }
    
    @Override
    public String askUserForInput() {
        setUserInput( JOptionPane.showInputDialog(null, getPrompt() ) );
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
