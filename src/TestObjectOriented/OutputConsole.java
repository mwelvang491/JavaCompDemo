/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestObjectOriented;

/**
 *
 * @author Mitch W
 */
public class OutputConsole implements OutputStrategy {

    private String preOutputMessage; 
    
    public OutputConsole(String preOutputMessage) {
        setPreOutputMessage(preOutputMessage);
    }

    @Override
    public void outputUserInput(String userInput) {
            System.out.println(getPreOutputMessage() + userInput);
      
        
        
    }

    @Override
    public String getPreOutputMessage() {
        return preOutputMessage;
    }

    @Override
    public void setPreOutputMessage(String preOutputMessage) {
        this.preOutputMessage = preOutputMessage;
    }
    
    
    
}
