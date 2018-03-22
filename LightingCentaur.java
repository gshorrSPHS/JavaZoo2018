public class LightingCentaur extends Centaur
{
    public LightingCentaur()
    {
        super(20, 20, 30,  "Lido", "This centaur can eject lighting bolts");
    }
    
    @Override
    public String makeNoise()
    {
        return "Ch-Kaboom!";
    }
    
    @Override
    public String play()
    {
        return "The centaur uses its lighting bolts to power a whole amusement park";
    }
}
