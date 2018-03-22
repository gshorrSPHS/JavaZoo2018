
/**
 * Write a description of class BlueJay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlueJay extends Animal implements Flying
{
    private int cuteness;
    
    public BlueJay(int cuteness)
    {
        //super comes first in constructor
        super("BlueJay", "A small blue bird.");
        this.cuteness = cuteness;
    }
    
    public BlueJay(int cuteness, String name, String description)
    {
        super(name, description);
        this.cuteness = cuteness;
    }
    
    @Override
    public String play()
    {
        return "The blue jay hobbles around on a tree branch.";
    }
    
    @Override
    public String eat()
    {
        return "The blue jay eats worms.";
    }
    
    @Override
    public String makeNoise()
    {
        return "chirp chirp" + cuteness + "times";
    }
    
    @Override
    public String fly()
    {
        return "The blue jay spreads its little wings and takes flight.";
    }
}
