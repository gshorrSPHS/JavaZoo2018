
public class CornyUnicorn extends Animal implements Running,Swimming,Flying
{
    private int cuteness;
    
    public CornyUnicorn(int cuteness)
    {
        //super comes first in the constructor
        super("Corny Unicorn", 
              "A unicorn with a corn as a horn.");
        this.cuteness = cuteness;    
    }
    
    public CornyUnicorn(int cuteness, String name, String desc)
    {
        super(name, desc);
        this.cuteness = cuteness;
    }
    
    @Override
    public String play()
    {
        return "The Corny Unicorn plays in an field of corns. Really, field of corns";
    }
      
    @Override
    public String eat()
    {
        return "It eats corns. A lot of corns";
    }
 
    @Override
    public String makeNoise()
    {
        return "It says Cooooooooorn " + cuteness + " times.";
    }
    
    @Override
    public String swim()
    {
        return "It bathes in an ocean of corns. ";
    }
    
    @Override
    public String run()
    {
        return "It runs as quickly as its little legs can\n" +
               "carry it, trailing soy sauce puddles behind.";
    }
     
    @Override
    public String fly()
    {
        return "It flies in an sky of corns with its corny horn. ";
    }
}