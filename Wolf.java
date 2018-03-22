
/**
 * Write a description of class Wolf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wolf extends Animal implements Running, Swimming
{
    private int speed;
    public Wolf(int speed)
    {
        super("SpeedyBoi", "A fast, fluffy boi. Vewy Kyute");
        this.speed = speed;
    }

    public Wolf(int speed, String name, String description)
    {
        super(name, description);
        this.speed = speed;
    }

    @Override
    public String play()
    {
        return "The wolf rolls around in its fluffy coat";
    }

    @Override
    public String eat()
    {
        return "The wolf snacks all on da yummy meat";

    }

    @Override
    public String makeNoise()
    {
        return "ARHWOOOOOOO";

    }

    public String running()
    {
        return "The wolf dashes along with his supa speed";

    }

    public String swimming()
    {
        return "The wolf casually swims through the warm water. His fluffy coat gets all puffed out";

    }
}

