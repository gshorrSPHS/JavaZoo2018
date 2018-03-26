
public final class PopcornyUnicorn extends CornyUnicorn
{
    public PopcornyUnicorn()
    {
       super(10, "PopcornyUnicorn",
           "This is a subgenre of the corny Unicorn. Instead of a corn, this unicorn has a popcorn horn!"); 
    }
    
    @Override
    public String makeNoise()
    {
       return "Pop Pop Popcorn!: " + super.makeNoise();   
    }
    

}
