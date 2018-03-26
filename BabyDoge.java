
public class BabyDoge extends Doge
{
    // instance variables - replace the example below with your own
    public BabyDoge(){
        super("Baby Doge",
        "Shiba inu, but smaller and cuter. \n" +
        "They are babies.");
    }
    public String play()
    {
        return super.play() + " then spits it out";
    }
}