public class Pichu extends Pikachu
{
    private String type; 
    public Pichu(String type)
    {
        super("Pichu", "A small Pikachu.", type);
        this.type= type;
    }
}