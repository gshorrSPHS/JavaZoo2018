public class Doge extends Animal implements Running
{
    public Doge()
    {
        super("Doge", "Shiba inu");
    } 
    public Doge(String name, String desc)
    {
        super(name, desc);
    }
    @Override
    public String play()
    {
        return "eats a toy";
    }
    public String run()
    {
        return "nyoom";
    }
    public String makeNoise()
    {
        return "much wow";
    }
        public String eat()
    {
        return "eats";
    }
    
}

