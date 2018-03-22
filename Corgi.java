public class Corgi extends Animal implements Running, Swimming
{
    private int fluffiness;
    public Corgi(int fluffiness)
    {
        super("Ollie", "A very fluffy puppy");
        this.fluffiness = fluffiness;
    }
    
    public Corgi(String name, String description, int fluffiness)
    {
        super(name, description);
        this.fluffiness = fluffiness;
    }
    
    @Override
    public String eat()
    {
        return "Corgis nibble on bananas";
    }

    @Override
    public String play()
    {
        return "Corgis sploot" + fluffiness + "times";
    }

    @Override
    public String makeNoise()
    {
        return "wooOOOF";
    }

    @Override
    public String run()
    {
        return "Corgis run around in circles";
    }
    
    @Override
    public String swim()
    {
        return "Corgis flopflopflop";
    }
}