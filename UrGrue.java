
/**
 * Write a description of class UrGrue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class UrGrue extends Grue
{
    

    /**
     * Constructor for objects of class UrGrue
     */
    public UrGrue(int anger)
    {
       
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
