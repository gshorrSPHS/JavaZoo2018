public class babyCorgi extends Corgi {
    private int fluffiness;
    public babyCorgi (String name, String description, int fluffiness)
    {
        super(name, description, fluffiness);
    }
    
    
    @Override
    public String makeNoise()
    {
        return "woof" + " " + super.makeNoise();
    }
}