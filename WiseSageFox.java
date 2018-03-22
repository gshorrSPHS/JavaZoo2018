public class WiseSageFox extends Fox
{
    private int wiseFactor;
    private int age;
    
    public WiseSageFox(String name, String description, int tamenessFactor, String furColor, 
                        String eyeColor, String species, int wiseFactor, int age)
    {
        super(name, description, tamenessFactor, furColor, eyeColor, species);
        this.wiseFactor = wiseFactor;
        this.age = age;
    }
    
    public String giveAdvice()
    {
        return "It's better to poop yourself than die from constipation!";
    }
    
    public String getAge()
    {
        return "I am " + age;
    }
    
    @Override
    public String play()
    {
        return "Instead of jumping around like a normal fox, The Wise Sage Fox pulls out a stick and " + 
                "starts whittling it instead while singing.";
    }
}