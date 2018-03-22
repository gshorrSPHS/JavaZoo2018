public class Kangaroo extends Animal implements Running, Swimming
{
    private int jumpHeight;
    
    public Kangaroo(int jumpHeight)
    {
        super("Kangaroo", "A marsupial from the family Macropodidae, indigenous to Australia,\n" + 
              "characterized by having large, powerful hind legs and large feet for jumping,\n" +
              "a long muscular tail for balance, a small head, and a pouch on females to\n" +
              "carry their young, called joeys.  They are known for their massive jumps,\n" +
              "kick strength, and boxing ability.");
        this.jumpHeight = jumpHeight;
    }
    
    public String makeNoise()
    {
        return "Grrrrrrrr!!!";
    }
    
    public String eat()
    {
        return "The kangaroo eats grass and shrubs.";
    }
    
    public String play()
    {
        return "The kangaroo hops around playfully.";
    }
    
    public String run()
    {
        return "The kangaroo takes magnificent hops to travel at up to 70 kph.";
    }
    
    public String swim()
    {
        return "The kangaroo uses its powerful legs to swim across the lake.";
    }
    
    public String fight()
    {
        return "The kangaroo punches its opponent in the face, then kicks its opponent in the gut.";
    }
}