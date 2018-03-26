
public final class PopcornyUnicorn extends CornyUnicorn
{
    public PopcornyUnicorn()
    {
       super(10, "PopcornyUnicorn",
           "This is a subgenre of the orny Unicorn. Instead of a corn, this unicorn uses a popcorn horn!"); 
    }
    
    @Override
    public String makeNoise()
    {
       return "Pop Pop Popcorn!: " + super.makeNoise();   
    }
    

}
