
/**
 * Write a description of class MagicPinkFairyArmadillo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class MagicPinkFairyArmadillo extends PinkFairyArmadillo
{
    public MagicPinkFairyArmadillo()
    {
       super(10, "Magic Pink Fairy Armadillo",
           "This is a wizard disguised as an armadillo."); 
    }
    
    @Override
    public String makeNoise()
    {
       return "Abracadabra: " + super.makeNoise();   
    }
}






