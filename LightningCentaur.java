public class LightningCentaur extends Centaur
{
    int bolt;
    public LightningCentaur(int bolt)
    {
        super(20, 20, "Lido", "This centaur can eject lightning bolts");
        this.bolt = bolt;
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
