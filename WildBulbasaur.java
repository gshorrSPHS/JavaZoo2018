public final class WildBulbasaur extends Bulbasaur implements Running
{  
    public WildBulbasaur()
    {
        super(100,"The Wild Bulbasaur",
                "is a Bulbasaur in the wild.");
    }
    
    @Override public String play()
    {
     return "The Wild Bulbasaur play by running around the forest, looking for friends";   
    }
    
    @Override public String makeNoise()
    {
     return "Wild Bulbasaur!! Wild Bulbasaur!!";
    }
    
    @Override public String eat()
    {
     return "Wild Bulbasaur's eat bugs and other pokemon";
    }
    
    @Override public String run()
    {
     return "A Wild Bulbasaur runs on";   
    }
}