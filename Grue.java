
/**
 * Write a description of class Grue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grue extends Animal implements Running
{
    // instance variables - replace the example below with your own
    private int angerLevel;

    /**
     * Constructor for objects of class Grue
     */
    public Grue(int angerLevel)
    {
        // initialise instance variables
        super("Grue", "A carnivorous beast dwelling in darkness");
        this.angerLevel = angerLevel;
        
    }
    
    public Grue(String name, String description, int angerLevel)
    {
        // initialise instance variables
        super(name, description);
        this.angerLevel = angerLevel;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String play()
    {
        // put your code here
        return "The grue half-heartedly handles its chew toy, \nbut it seems more "+
        "focused on food nearby";
    }
    public String makeNoise()
    {
        // put your code here
        return "SKRAAAAAAW!!!";
    }
    public String eat()
    {
        // put your code here
        return "The grue lurks in the shadows, pouncing upon rodents\n"
        +"unfortunate enough to enter its den.";
    }
    public String eat(String noun)
    {
        // put your code here
        return "The grew tenatively approaches the " + noun + ", and then\n"
        +"devours it in a flash";
    }
    public String run()
    {
        // put your code here
        return "The grue becomes a black blur, swiftly sprinting from one\n"
        +"corner of its den to another.";
    }
    public String hide()
    {
        return "The grue closes its yellow eyes, and in an instant, \n"
        +"it fades into the darkness of its enclosure.";
    }
    public String taunt()
    {
        if(Math.random() * angerLevel < 2){
            return "The grue pays no notice to you.\n"
            +"It has better things to do.";
        }
        else if(Math.random() * angerLevel < 4){
            return "The grue looks irrated, but more as if it is\n"
            +"dissapointed in your juvenility than angry.";
        }
        else if(Math.random() * angerLevel < 6){
            return "The grue bars its teeth and hisses at you.";
        }
        else{
            return "The grue lunges at you, blocked only by the\n"
            +"iron bars of its container.";
        }
    }
}
