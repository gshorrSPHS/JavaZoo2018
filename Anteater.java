public class Anteater extends Animal implements Swimming
{
    private int cuteness;
    
    public Anteater(int cuteness)
    {
        //super comes first in the constructor
        super("Anteater", 
              "A narrow mouth to eat ant.");
        this.cuteness = cuteness;    
    }
    
    public Anteater (int cuteness, String name, String desc)
    {
        super(name, desc);
        this.cuteness = cuteness;
    }
    
    @Override
    public String play()
    {
        return "The anteater is rolling around";
    }
      
    @Override
    public String eat()
    {
        return "It eats all kinds of ant.";
    }
 
    @Override
    public String makeNoise()
    {
        return "It says rahrhrahrah " + cuteness + " times.";
    }
    
    @Override
    public String swim()
    {
        return "It is rolling inside water.";
    }
    
     
}
