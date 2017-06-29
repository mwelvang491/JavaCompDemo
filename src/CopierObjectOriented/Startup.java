
package CopierObjectOriented;
/**
 *
 * @author Mitch W
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // Input From Input Class.
   // Use Copier Class to Pass Input To Output Class.
   // Output with Output Class.
   
   // InputStrategy input = new InputConsole("Input: ");
      InputStrategy input = new InputGui("Input: ");
      
  //OutputGui output = new OutputGui("Output: ");
      OutputStrategy output = new OutputConsole("Output: ");
      Copier copier = new Copier();
      
      copier.copy(input, output);

    }
    
}
