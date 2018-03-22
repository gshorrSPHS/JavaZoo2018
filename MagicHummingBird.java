public final class MagicHummingBird extends HummingBird
{
    public MagicHummingBird()
    {
       super(10, "Magic Humming Bird",
           "This is a wizard disguised as an humming bird."); 
    }
    
    @Override
    public String makeNoise()
    {
       return "Sghhh " + super.makeNoise();   
    }
}