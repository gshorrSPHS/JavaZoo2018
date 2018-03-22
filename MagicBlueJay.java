
/**
 * Write a description of class MgicBlueJay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public final class MagicBlueJay extends BlueJay
{
    public MagicBlueJay()
    {
        super(10, "Magic Blue Jay", "This is Harry Potter disguised as a blue jay.");
    }

    @Override
    public String play()
    {
        return "Harry Potter summons 20 patronuses.";
    }

    @Override
    public String makeNoise()
    {
        return "avada kedavra you dead";
    }
}
