public class Human extends Animal implements Running
{
       private int height;
    
     public Human(int height)
     {
            super("Human","A person");
            this.height = height; 
        
     }
     public Human(int height,String name, String desc)
     {
        super(name, desc);
        this.height = height;
     }
     @Override
     public String play()
     {
         return "The human goes on his PC and plays a game.";
     }
     @Override
     public String makeNoise()
     {
         return "OOF!!!!!";
     }
     @Override
     public String eat()
     {
         return "The human usually eats McDonalds.";
     }
     @Override 
     public String run()
     {
         return "The human can't run for long and it is very slow.";
     }
}