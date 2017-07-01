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
    private Map testMap = new HashMap();
    private static int questionNum;
    private Player player = new Player();
    
    public void prepareTest(){
    addQuestionToTest("What Is Your Favorite Movie?",      "Favorite Movie: ");
    addQuestionToTest("What Is Your Favorite Tv Show?",    "Favorite Tv Show: " );
  //  addQuestionToTest("What Is Your Favorite Video Game?", "Favorite Video Game: ");
    }

    public void addQuestionToTest(String questionText, String abbreivatedQuestionText){
        questionNum++;
        Question question = new Question(questionNum, questionText, abbreivatedQuestionText );
        testMap.put(questionNum, question);
    }
    
    public Question getQuestion(int questionNumber){
        
       
        return (Question)testMap.get(questionNumber); 
    }

    public void takeTest(InputStrategy input) {      
     player.giveTest( getTestMap()  , input );
    }

    public void getAnswers(  ){
        
         player.getAnswers();
     }
    
    
    
    
    public Map getTestMap() {
        return testMap;
    }

    public void setTestMap(Map testMap) {
        this.testMap = testMap;
    }
    
    public static int getQuestionNum() {
        return questionNum;
    }

    public static void setQuestionNum(int questionNum) {
        Test.questionNum = questionNum;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    
    
    
}
