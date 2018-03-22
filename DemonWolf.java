
/**
 * Write a description of class DemonWolf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class DemonWolf extends Wolf
{

    /**
     * Constructor for objects of class DemonWolf
     */
    public DemonWolf()
    {
        super(900000, "DarknessBoi", "A demon savage dark boi with super speed. Embodiment of doom");
    }

    public String hunt()
    {
        return "DemonWolf got no mercy for any of the little animals. Nom nom.";
    }

    public String darknessSlash()
    {
        return "RIP to Mr.Opponent. Ultimate GG attack of death.";
    }

    @Override
    public String running()
    {
        return "This boi dashes through the fabric of space. He is da pure darkness and moves faster than speed of light.";

    }
}

