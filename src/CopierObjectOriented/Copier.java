/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CopierObjectOriented;

/**
 *
 * @author Mitch W
 */
public class Copier {
    private  InputStrategy input;
    private  OutputStrategy output;
    
    public void copy(InputStrategy input, OutputStrategy output ){
        
         output.outputUserInput(    input.askUserForInput() );
         
    }
    
    
}
