public class Piglet extends Pig
{
    public Piglet()
    {
        super(10, "Piglet", "");
    }

    @Override public String makeNoise()
    {
        return "Oink" +super.makeNoise();   
    }
}