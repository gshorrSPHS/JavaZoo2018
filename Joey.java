public class Joey extends Kangaroo
{
    public Joey()
    {
        super(0);
    }
    
    @Override
    public String makeNoise()
    {
        return "Squeeeak!";
    }
    
    @Override
    public String eat()
    {
        return "The joey drinks its mother's milk.";
    }
    
    @Override
    public String play()
    {
        return "The joey plays peek-a-boo with its mom.";
    }
    
    @Override
    public String run()
    {
        return "The joey stumbles to the floor.  It can't run!";
    }
    
    @Override
    public String swim()
    {
        return "The joey flailes in the water.  It can't swim!";
    }
    
    @Override
    public String fight()
    {
        return "The joey refuses to fight.";
    }
}