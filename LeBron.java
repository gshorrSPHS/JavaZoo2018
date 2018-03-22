public final class LeBron extends Human 
{
    
     public LeBron()
        {
            super(80,"LeBron James","Not a regular human");

        }
     @Override
     public String play()
     {
         return "LeBron plays Basketball";
     }
     @Override
     public String makeNoise()
     {
         return "OOF!!!!!";
     }
     @Override
     public String eat()
     {
         return "LeBron usually eats healthy";
     }
     @Override 
     public String run()
     {
         return "LeBron runs down the court and dunks.";
     }
}