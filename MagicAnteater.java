public final class MagicAnteater extends Anteater
{
    public MagicAnteater()
    {
       super(10, "Magic Anteater",
           "This is a werewolf disguised as an anteater."); 
    }
    
    @Override
    public String makeNoise()
    {
       return "racuaeaea: " + super.makeNoise();   
    }
}

