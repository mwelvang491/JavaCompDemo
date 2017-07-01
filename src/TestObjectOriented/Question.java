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
class Question {
    private int questionNum;
    private String questionText;
    private String appreviatedQuestionText;
    private String userSubmittedAnswer;
    
    public Question(int questionNum, String questionText, String appreviatedQuestionText) {
      setQuestionNum(questionNum);
      setQuestionText(questionText);
      setAppreviatedQuestionText(appreviatedQuestionText);
    }

    public String getAppreviatedQuestionText() {
        return appreviatedQuestionText;
    }

    public void setAppreviatedQuestionText(String appreviatedQuestionText) {
        this.appreviatedQuestionText = appreviatedQuestionText;
    }

    
    
    public String getUserSubmittedAnswer() {
        return userSubmittedAnswer;
    }

    public void setUserSubmittedAnswer(String userSubmittedAnswer) {
        this.userSubmittedAnswer = userSubmittedAnswer;
    }
    
    public int getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(int questionNum) {
        this.questionNum = questionNum;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

//    @Override
//    public String toString() {
//        return questionText;
//    }
    
    
    
    
}
