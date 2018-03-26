

public class Blobfish extends Animal implements Swimming
{
    private int hunger;
    
    public Blobfish(int hunger){
        super("blob","the builder");
        this.hunger = hunger;
    }
    public Blobfish(int hunger, String name, String desc){
        super(name, desc);
        this.hunger = hunger;
    }
    @Override
    public String makeNoise(){
        return "it uters a resounding roar ... but no one notices";
    }
    @Override
    public String eat(){
        return "As it floats along, the blobfish swallows\n"
               +hunger+" small crustaceans";
    }
    @Override
    public String play(){
        return "you look the blobfish in the eye, but it stares right back";
    }
    @Override
    public String swim(){
        return "blobfish float, they do not swim, wikipedia said so";
    }
}

