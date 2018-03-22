public class HummingBird extends Animal implements Flying, Running 
{
    private int size;
    
    public HummingBird(int size)
    {
        super("Humming Bird",
              "A small, colorful bird with iridescent feathers.");
              this.size = size;
    }
    
    public HummingBird(int size, String name, String description)
    {
        super(name,description);
        this.size = size;
    }
    @Override 
    public String eat()
    {
        return "It eats flower nectar, tree sap, insects and pollen.";
    }
    public String flap()
    {
        return "They flap their wings about 80 times per second.";
    }
    @Override
    public String makeNoise()
    {
        return "They make a humming noise when they flap their wings.";
    }
    @Override
    public String run()
    {
        return "They are not used to run or hop.";
    }
    @Override
    public String play()
    {
        return "They have been observed chasing each other and even larger birds such as hawks.";
    }
    @Override
    public String fly()
    {
        return "Hummingbirds can fly right, left, up, down, backwards, and even upsidedown.";
    }
}