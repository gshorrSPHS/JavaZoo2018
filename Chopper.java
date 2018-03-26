
public class Chopper extends Animal implements Speaking
{
    private int cuteness;
    
    public Chopper(int cuteness)
    {
        //super comes first in the constructor
        super("Chopper", 
              "manlike tiny creature");
        this.cuteness = cuteness;    
    }
    
    public Chopper(int cuteness, String name, String desc)
    {
        super(name, desc);
        this.cuteness = cuteness;
    }
    
    @Override
    public String speak()
    {
        return "I will find the cure to any illness";
    }
    @Override
    public String play()
    {
        return "Playing";
    }
      
    @Override
    public String eat()
    {
        return "It eats candy.";
    }
 
    @Override
    public String makeNoise()
    {
        return "It says haaaaaaaa " + cuteness + " times.";
    }
}