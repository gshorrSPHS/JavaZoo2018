
/**
 * Write a description of class Sploded_Blobfish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sploded_Blobfish extends Blobfish implements Swimming
{
    // instance variables - replace the example below with your own
    private int radius;

    /**
     * Constructor for objects of class Sploded_Blobfish
     */
    public Sploded_Blobfish(int radius)
    {
        super(10, "Bill", "The blobfish has been brought to the surface and is exploding");
        this.radius = radius;
    }
    public String getSize(){
        return "The blob Fish has expanded to a size of " + radius + "feet!";
    }
   @Override
    public String eat(){
        return "The blob fish can no longer eat, as it is now incabable of motion";
    }
}
