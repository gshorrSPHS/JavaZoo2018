public class Giraffe extends Animal implements Running
{
    private int numOfSpots;
    
    public Giraffe(int numOfSpots)
    {
        //super comes first in the constructor
        super("Giraffe", "The tallest living animal.");
        this.numOfSpots=numOfSpots;
    }
    
    public Giraffe(int numOfSpots, String name, String description)
    {
        super(name,description);
        this.numOfSpots=numOfSpots;
    }
    
    @Override
    public String play()
    {
        return "The giraffe is chasing after a butterfly.";
    }
    
    @Override
    public String eat()
    {
        return "Yummy leaves.";
    }
    
    @Override
    public String makeNoise()
    {
        return "Hummmmmmhjoo! Look at my " + numOfSpots + "spots.";
    }

    @Override
    public String run()
    {
        return "Just watch me sprint.";
    }
}