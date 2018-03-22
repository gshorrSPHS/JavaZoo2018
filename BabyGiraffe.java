public class BabyGiraffe extends Giraffe
{
    public BabyGiraffe()
    {
        //super comes first in the constructor
        super(10,"Giraffe", "The tallest living animal.");
    }
    
    @Override
    public String run()
    {
        return "Just watch me fall.";
    }
}
