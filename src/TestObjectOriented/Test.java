/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestObjectOriented;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mitch W
 */
class Test {
    private final  Map testMap = new HashMap();
    private static int questionNum;
    
    public void prepareTest(){
    addQuestionToTest("What Is Your Favorite Movie?");
    addQuestionToTest("What Is Your Favorite Tv Show?");
    addQuestionToTest("What Is Your Favorite Video Game?");
    }

    public void addQuestionToTest(String questionText){
        questionNum++;
        Question question = new Question(questionNum, questionText);
        testMap.put(questionNum, questionText);
    }
    
    public String outputQuestion(int key){
        
       
    return (String)testMap.get(key); }
    
}
