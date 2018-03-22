public class LightningCentaur extends Centaur
{
    public LightningCentaur()
    {
        super(20, 20, 30,  "Lido", "This centaur can eject lightning bolts");
    }
    
    @Override
    public String makeNoise()
    {
        return "Ch-Kaboom!";
    }
    
    @Override
    public String play()
    {
        return "The centaur uses its lightning bolts to power a whole amusement park";
    }
}
