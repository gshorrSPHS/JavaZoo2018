
/**
 * Write a description of class UrGrue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class UrGrue extends Grue
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class UrGrue
     */
    public UrGrue(int anger)
    {
        // initialise instance variables
       super("Ur-Grue", "An exceptionally stealthy grue wielding dark magic", anger*2);
        
    }

    public String magic(){
        return "The grue waves its claws, and teleports in shadow";
    }
    
    public String hide(){
        return "The grue smiles menacingly, and vanishes into thin air.";
    }
    
    public String play(){
        return "The grue nonchalantly makes its toy levitate, and\n"
        +"lazily moves it about in the air.";
    }
}
