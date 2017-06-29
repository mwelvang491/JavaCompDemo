/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestObjectOriented;

import javax.swing.JOptionPane;

/**
 *
 * @author Mitch W
 */
public class OutputGui implements OutputStrategy {
    
    private String preOutputMessage; 
    
    public OutputGui(String preOutputMessage) {
        setPreOutputMessage(preOutputMessage);
    }

    @Override
    public void outputUserInput(String userInput) {
        
      JOptionPane.showMessageDialog(null, (getPreOutputMessage() + userInput));
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
