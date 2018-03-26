public class Pikachu extends Animal  implements Running
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Pikachu
     */
    public Pikachu()
    {
        super("Pikachu", "This Pokémon has electricity-storing pouches on its cheeks.\n" +
               " These appear to become electrically charged during the night while Pikachu sleeps.\n" +
               " It occasionally discharges electricity when it is dozy after waking up.");
    }
    public Pikachu(String name, String description){
        super(name, description);
        
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public String play(){
        return "Running in a grassy field rubbing cheeks." ;   
    }
    public String eat(){
        return "In the wild, Pikachu eats fruits and berries off natural plants.\n" + 
            "When caught you must feed it with electric type Pokémon food.";
    }
    public String makeNoise(){
        return "pika pika pika CHUUUUUUUUUUUUUUUUUUUUUUUUUUU";
    }
    public String run(){
        return "Realistically, it is actually using the move quick attack,\n" +
            " which allows it to move quickly in any direction.";
        
    }
}
