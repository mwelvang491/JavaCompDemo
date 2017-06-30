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
public class Startup {
    
    public static void main(String[] args) {
    //this is not finished. 
    InputStrategy input = new InputScanner("Enter: "); 
        
    Test test = new Test();
    
    test.addQuestionToTest("What Is Your Name?", "Name: ");
    
    test.prepareTest();
    
    test.takeTest( input );
    
    test.getAnswers();
    }
    
}
