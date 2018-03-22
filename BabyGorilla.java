public final class BabyGorilla extends Gorilla
{
    public BabyGorilla()
    {
        super(5, "Baby Gorilla", "Gorilla that is small and cute.");   
    }
    @Override
    public String makeNoise()
    {
        return "waa" + super.makeNoise();
    }
}