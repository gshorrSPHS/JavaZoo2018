public class MagicBear extends BillyBear
{
    public MagicBear()
    {
        super(10, "BillyBear", "This bear is from Arctic jungle");
    }

    @Override public String makeNoise()
    {
        return "RRRRRRRRRRRRRRT " +super.makeNoise();   
    }
}