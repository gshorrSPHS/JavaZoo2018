public class Poecilotheria extends Animal implements Run
{
    private int angry = 5;
    private String name;
    public Poecilotheria(int angry, String name, String desc)
    {
        super(name, desc);
        this.angry = angry;
    }
    
    @Override
    public String play()
    {
        return name + " does not want to play, he strikes " + angry + " times.";
    }
    
    @Override
    public String eat()
    {
        return name + " devours cricket.";
    }
    
    @Override
    public String makeNoise()
    {
        return name + " does not make noise.";
    }

    public String run()
    {
        return name + " gets scared, it runs and hides on your back.";
    }
}