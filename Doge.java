public class Doge extends Animal implements running
{
    public Doge(String name, String description, int cuteness)
    {
        super("Jeff", "Shiba inu");
        this.cuteness = cuteness;
    } 
    public Doge(int cuteness, String name, String desc)
    {
        super(name, desc);
        this.cuteness = cuteness;
    }
    @Override
    public String play(String toy)
    {
        return "eats " + toy;
    }
}
    public String runs()
    {
    return "nyoom"
    }
}
