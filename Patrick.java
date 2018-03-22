
/**
 * Write a description of class Patrick here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Patrick extends MemeMonster
{
    // instance variables - replace the example below with your own
    private int pinkness;
    private int trigger;

    /**
     * Constructor for objects of class Patrick
     */
    public Patrick(String name, String description, int memeLevel, int pinkness, int trigger)
    {
       super(name, description, memeLevel);
       this.pinkness = pinkness;
       this.trigger = trigger;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String memeGod()
    {
        if(trigger * pinkness > 10)
        {
            return "your meme crusty";
        }
        else{
        for(int i = 0; i < trigger * pinkness; i ++)
        {   
            return "hohohohohoh";
        }
    }
    return "doh";
    } 
    
    @Override
    public String eat()
    {
        return "OMNOMNOMNOMOM";
    }
    @Override
    public String play()
    {
        return "Nani? Omae Wa Shinderu!!!!";
          
    }
}
