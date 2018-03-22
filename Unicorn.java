public class Unicorn extends Animal implements Running, Swimming, Flying
{
    private int hornLength = 5;
    private String name;
    public Unicorn(int hornLength, String name, String desc)
    {
        super(name, desc);
        this.name = name;
    }
    
    @Override
    public String play()
    {
        return name + " goes and fidlles with his toys";
    }
    
    @Override
    public String eat()
    {
        return name + " goes and munches on some sprinkles";
    }
    
    @Override
    public String run()
    {
        return name + " rams you with his " + hornLength + " foot horn";
    }
    
    @Override
    public String swim()
    {
        return name +" drowns because he cannot swim";
    }
    
    @Override
    public String fly()
    {
        return name + " farts and it propels him away";
    }
    
    @Override
    public String makeNoise()
    {
        return "neigh neigh";
    }
}