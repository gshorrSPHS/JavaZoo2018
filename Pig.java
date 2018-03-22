public class Pig extends Animal implements Running
{
    private int degreeOfTailCurl;
    public Pig (int degreeOfTailCurl)
    {
        super("Peppa the Pig", "A native of the American dinner table");
        this.degreeOfTailCurl=degreeOfTailCurl;
    }
    public Pig (int degreeOfTailCurl, String name, String description)
    {
        super(name, description);
        this.degreeOfTailCurl=degreeOfTailCurl;
    }
    @Override public String play()
    {
        return "He considers napping play";
    }
    @Override public String eat()
    {
        return "He eats a kale salad";
    }
    @Override public String makeNoise()
    {
      return "The pig speaks only fluent latin";
    }
    @Override public String run()
    {
     return "This pig doesn't like to run";   
    }
}