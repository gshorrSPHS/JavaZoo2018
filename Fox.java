public class Fox extends Animal implements Running, Swimming
{
    private int tamenessFactor;
    private String furColor;
    private String eyeColor;
    private String species;
    
    public Fox(String name, String description, int tamenessFactor, String furColor, String eyeColor, String species)
    {
        super(name, description);
        this.tamenessFactor = tamenessFactor;
        this.furColor = furColor;
        this.eyeColor = eyeColor;
        this.species = species;
    }
    
    @Override
    public String makeNoise()
    {
        return "bark";
    }
    
    @Override
    public String eat()
    {
        if (tamenessFactor > 5)
        {
            return "Fox eats out of your hand and licks you.";
        }
        else
        {
            return "Fox eats out of your hand and then bites your finger.";
        }
    }
    
    @Override
    public String play()
    {
        return "The fox lets you pet it and playfully bites at your fingers.";
    }
    
    @Override
    public String running()
    {
        return "The fox runs.";
    }
    
    @Override
    public String swimming()
    {
        return "The fox swims.";
    }
}