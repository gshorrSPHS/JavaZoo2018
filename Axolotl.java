public class Axolotl extends Animal implements Swimming
{
    private String color;
    private int sizeInches;
    
    public Axolotl(String name, String description, String color, int size)
    {
        super(name,description);
        this.color = color;
        this.sizeInches = size;
    }
    @Override
    public String makeNoise()
    {
        return "EEEUUUU";
    }
    @Override
    public String eat()
    {
        return this.getName()+  "chomps down on some earthworms,";
    }
    @Override
    public String play()
    {
        return "Axolotl races to one side of its tank as fast as it can.";
    }
    @Override
    public String swim()
    {
        return "Axolotl doggy paddles and slivers through the water.";
    }
    
}