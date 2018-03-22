public class MagicPig extends Pig
{
    public MagicPig()
    {
        super(10, "Peppa the Pig", "This is a native of the American dinner table");
    }

    @Override public String makeNoise()
    {
        return "Oink" +super.makeNoise();   
    }
}