

public class Sploded_Blobfish extends Blobfish implements Swimming
{
    private int radius;

    public Sploded_Blobfish(int radius)
    {
        super(10, "Bill", "The blobfish has been brought to the surface and is exploding");
        this.radius = radius;
    }
    public String getSize(){
        return "The blob Fish has expanded to a size of " + radius + "feet!";
    }
    @Override
    public String swim(){
        return "But nothing happens...";
    }
   @Override
    public String eat(){
        return "The blob fish can no longer eat, as it is now incabable of motion";
    }
}
