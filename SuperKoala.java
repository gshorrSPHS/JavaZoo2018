
public class SuperKoala extends Koala 
implements Swimming, Running, Flying
{
   public SuperKoala()
   {
       super(10, "Super Koala",
           "A koala from Krypton sent to Earth on a spacecraft."); 
   } 
   
   @Override
   public String makeNoise() 
   {
       return "Roarrrrr!";
   }
   
   @Override()
   public String swim() 
   {
       return "It can swim and dive.";
   } 
   @Override
   public String run() 
   {
       return "It has a mile time of 25 seconds";
   }
   @Override
   public String fly() 
   {
       return "It flies at 99% light speed";
   }
}
