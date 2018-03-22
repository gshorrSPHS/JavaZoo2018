/**
 * IDK it is minion?
 *
 * @author Josh Ng
 * @version March 2018
 */
public final class DaveTheMinion extends Minion
{
    public DaveTheMinion()
    {
       super("Dave the Minion", "Dave loves playing video games with Stuart. He also loves ice cream and rocket launchers.", 5, 3, 7, 2, 3.5, 120);
    }
    
    @Override
    public String makeNoise()
    {
       return "Bello: " + super.makeNoise();   
    }
    @Override
    public String eat()
    {
        return "Tank Yue!" + super.eat();
    }
}