
public class UniCentaur extends Unicorn
{
    public UniCentaur(int hornLength)
    {
        super(hornLength, "Alvin", "Sparkly");
    }
    
    public String attack()
    {
        return "Alvin kicks you with his legs and proceeds to swear at you";
    }
    
    public String converse()
    {
        return "You strike up a nice conversation with Alvin";
    }
}
