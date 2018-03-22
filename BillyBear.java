public class BillyBear extends Animal implements Running
{
    private int chubby; 
    public BillyBear(int chubby)
    {
        super("BillyBear","Brown Bear");
        this.chubby=chubby;
    }
    public BillyBear(int chubby, String name, String description)
    {
        super(name,description);
        this.chubby= chubby;
    }
    @Override public String play()
    {
        return "The bear plays with its tail ";
    }

    @Override public String eat()
    {
        return "The bear eats a bowl full of chicken nuggets";   
    }

    @Override public String makeNoise()
    {
        return "It says BRRRRRGURRRRRR" + chubby +" times";
    }

    @Override public String run()
    {
        return "It runs very slow with a bowl of chicken nuggets" ;
        
    }
}
