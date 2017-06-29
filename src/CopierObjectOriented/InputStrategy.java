
package CopierObjectOriented;

/**
 *
 * @author Mitch W
 */
public interface InputStrategy {

  public abstract String askUserForInput();

  public abstract  String getPrompt();

  public abstract  String getUserInput();

  public abstract  void setPrompt(String prompt);

  public abstract void setUserInput(String userInput);
    
}
