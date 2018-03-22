
public class Panda extends Animal implements Running, Rap, Climbing
{
    
    

    public Panda()
    {
        super("Panda",
        "An animal with black patches around its eyes, ears, and body.\n" +
        "Pandas are found in China,and they are also called Panda bear");
   
    }
    public Panda(String name, String description){
        super(name, description);
    }
    @Override 
    public String play()
    {
        return "Hanging on a tree.";
    }
    public String eat()
    {
        return "Typically Pandas eat bambos and leaves.";
    }
    public String makeNoise()
    {
        return "skkkrrra";
    }
    public String run()
    {
        return "Pandas run on four legs, but they are slow.";
    
    }
    public String rap()
    {
        return "Panda, Panda Panda, Panda, Panda, Panda, Panda\n" + 
        "I got broads in Atlanta Twistin' dope, lean, and the Fanta";
    }
    public String climb()
    {
        return "It climbs trees.";
    }

  

}
