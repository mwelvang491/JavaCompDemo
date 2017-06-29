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
    Test test = new Test();
    test.prepareTest();
    test.addQuestionToTest("What Is Your Name?");
    
    }
    
}
