public class Centaur extends Animal implements Running
{
    private int strength, speed, bolts;
    
    public Centaur(int strength, int speed)
    {
        super("Bodi", "This animal is both a human and a horse. \n" + 
               "It has the upper body as a human and its lower body is the body of a horse. ");
        this.strength = strength;
        this.speed = speed;
    }
    
    public Centaur(int strength, int speed, int bolts, String name, String description)
    {
        super(name, description);
        this.strength = strength;
        this.speed = speed;
        this.bolts = bolts;
    }

    public String run()
    {
        return "The centaur gallops around the enclosure.";
    }
    
    @Override
    public String makeNoise()
    {
        return "Yahooooooooo!";
    }
    
    @Override
    public String eat()
    {
        return "The centaur eats any food that a human eats.";
    }
       
    @Override
    public String play()
    {
        return "The centaur runs around and rolls around in its enclosure.";
    }
}
