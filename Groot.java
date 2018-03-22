public class Groot extends Animal implements Running
{
    private int height;
    
    public Groot(int height)
    {
        //super comes first in consructor
        super("Groot", "A mysterious walking tree with simple intelligence");
        this.height = height;
    }
    
    public Groot(String name, String desc, int height)
    {
        super(name, desc);
        this.height = height;
    }
    
    @Override
    public String play()
    {
        return "Groot picks a flower off his shoulder";
    }
    
    @Override
    public String eat()
    {
        return "Groot chews on a loose twig hanging off his arm";
    }
    
    @Override
    public String run()
    {
        return "Groot thunders his way in an uncontrollable rampage";
    }
    
    @Override
    public String makeNoise()
    {
        return "I am Groot";
    }
}
