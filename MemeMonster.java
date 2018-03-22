
/**
 * Write a description of class memeMonster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MemeMonster extends Animal implements Screech
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class memeMonster
     */
    int memeLevel;
    public MemeMonster(String name, String description, int memeLevel)
    {
        super(name, description);
        this.memeLevel = memeLevel;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public String play()
    {
        return "Nani? Omae Wa Shinderu!!!!";
          
    }
    
    @Override
    public String eat()
    {
        return "Do You Know Da WAE?";
    }
    
    @Override
    public String makeNoise()
    {
        return "RHEEEEEE";
        
    }
    
    @Override
    public String Screech()
    {
        return "BOONK GANG" ; 
        
    }
}
