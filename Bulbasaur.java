public class Bulbasaur extends Animal implements Running
{
    private int type;
   
    
    
    public Bulbasaur(int type)
    {
        super("Bulbasaur",
              "A frog that is a grass and poison type.");
        this.type = type;  
        
    }
        public Bulbasaur(int type, String name, String desc)
    {
        super(name, desc);
        this.type = type;
    }
    @Override public String play()
    {
     return "The Bulbasaur play by whipping each other with their tentecles";   
    }
    
    @Override public String makeNoise()
    {
     return "Bulbasaur! Bulbasaur!";
    }
    
    @Override public String eat()
    {
     return "Bulbasaur's eat seeds and grass";
    }
    
    @Override public String run()
    {
     return "A Bulbasaur runs on four legs";   
    }
}