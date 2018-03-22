public class WizardAxolotl extends Axolotl implements Flying
{
    private int power;
    private String elementOfChoice;
    public WizardAxolotl(String name, String description, String color, int size, int power, String elementOfChoice)
    {
        super(name,description,color,size);
        this.power=power;
        this.elementOfChoice = elementOfChoice;

    }
    @Override
    public String fly()
    {
        return "Axolotl flies to Mars and back in the blink of an eye.";
    }
    public String castSpell()
    {
        return "Axolotl controls " +elementOfChoice+ "all around me.";
    }
    public String getStrength()
    {
        return "This is a level " + power + "Wizard Axolotl.";
    }

}
