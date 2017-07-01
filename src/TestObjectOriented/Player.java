/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestObjectOriented;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mitch W
 */
public class Player {
    
    private  ArrayList<String> answers = new ArrayList();
    private  Map testMap = new HashMap();
    
   public void giveTest(Map testMap, InputStrategy input){
     setTestMap(testMap);  
     
     getTestMap().forEach((key , value ) ->{ //for each loop with a map. 
      Question question = (Question)value;
      
     System.out.println(key + ")" + question.getQuestionText()  );
     
     answers.add(input.askUserForInput());
     System.out.print("\n");
     
     
         }); //end for each loop
     
       System.out.println("\n");
       
   }
   
   public void getAnswers(){
     
   
   
    getTestMap().forEach((key , value ) ->{ //for each loop with a map. 
        
      Question question = (Question)value;
      
             System.out.println(
                     padLeft(question.getAppreviatedQuestionText()  , 18 )
                             + " " + answers.get((int)key-1) );
     
   
     
         }); //end for each loop

   }
   
    public static String padRight(String s, int n) {
     return String.format("%1$-" + n + "s", s);  
    }

    public static String padLeft(String s, int n) {
    return String.format("%1$" + n + "s", s);  
    }
   
     public Map getTestMap() {
        return testMap;
    }

    public void setTestMap(Map testMap) {
        this.testMap = testMap;
    }
    
   
}
