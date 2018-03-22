
public class Koala extends Animal implements Climbing, Walking 
{
    private int cuteness;
    
    public Koala(int cuteness) 
    {
        super("Normal Koala", 
              "Animal in Australia and can climb trees");
        this.cuteness = cuteness;
    }
    
    public Koala(int cuteness, String name, String desc)
    {
        super(name, desc);
        this.cuteness = cuteness;
    }
    
    @Override
    public String eat() 
    {
        return "Mostly eucalyptus leaves, \n"
             + "up to 500 grams of leaves per day!";
    }
    
    @Override
    public String makeNoise() 
    {
        return "Super(unusual) low pitched sounds \n"
             + "ps. its deep bellow is similar to a roar \n"
             + "and is used as T-rex sounds in movies";
    }
    
    @Override
    public String play() 
    {
        return "Sleeeeeeeeeep";
    }
    
    @Override
    public String climbing()
    {
        return "Koalas mostly stay on trees";
    }
    
    @Override
    public String walking()
    {
        return "When they are not on trees, they walk slowly";
    }
}
