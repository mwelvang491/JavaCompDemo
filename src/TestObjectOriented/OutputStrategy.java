
package TestObjectOriented;

/**
 *
 * @author Mitch W
 */
public interface OutputStrategy {
   
    public abstract void outputUserInput(String userInput);
    
    public abstract String getPreOutputMessage();
    
    public abstract void setPreOutputMessage(String preOutputMessage);
    
}
