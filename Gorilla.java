public class Gorilla extends Animal implements Running
{
    private int strength;
    
    public Gorilla(int strength)
    {
        super("Gorilla",
              "A powerfully built great ape with a large head and short neck.");
        this.strength = strength;
    }
    public Gorilla(int strength, String description, String name)
    {
        super(name, description);
        this.strength = strength;
    }
    @Override
    public String play()
    {
        return "Gorillas have fun wrestling and climbing";
    }
    @Override
    public String eat()
    {
        return "They munch on fruit and bamboo shoots.";
    }
    @Override
    public String makeNoise()
    {
        return "RAUGHH";
    }
    @Override
    public String run()
    {
        return "Gorillas run fast on all fours.";
    }
}