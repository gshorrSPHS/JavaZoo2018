public class Minion extends Animal implements Running, Swimming, Destroying, Making
{
    private int hyperness;
    private int evilness;
    private int goodness;
    private int eyeNumber;
    private double height;
    private int intelligenceQuotient;
    public Minion(int height)
    {
        super("Minion", "A Minion is a small, yellow, cylindrical creature, who has one or two eyes.");

        this.height=height;

    }

    public Minion(String name, String desc, int hyperness, int evilness, int goodness, int eyeNumber, double height, int intelligenceQuotient)
    {
        super(name, desc);
        this.hyperness=hyperness;
        this.evilness=evilness;
        this.goodness=goodness;
        this.eyeNumber=eyeNumber;
        this.height=height;
        this.intelligenceQuotient=intelligenceQuotient;
    }

    @Override
    public String play()
    {
        return "Minion steals";
    }

    @Override
    public String eat()
    {
        return "Me want banana";
    }

    @Override
    public String makeNoise()
    {
        return"MINIONS";
    }

    @Override
    public String run()
    {
        return "Tara, Tropa";
    }

    @Override
    public String swim()
    {
        return "Bananonina";
    }

    @Override
    public String destroy()
    {
        return "Butt";
    }

    @Override
    public String make()
    {
        return"bomba?";
    }
}