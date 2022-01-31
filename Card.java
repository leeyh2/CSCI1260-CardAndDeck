public class Card
{
    private String creatureType;
    private String elementdmgType;
    private int attackStrength = 0;
    private int defenseStrength = 0;

    public Card(String creatureType , String elementdmgType) //Constructor
    {
        this.creatureType = creatureType;
        this.elementdmgType = elementdmgType;
    }

    @Override
    public String toString()
    {
        return "Card{" + "Creature type='" + creatureType + '\'' +'}' + '{' + "element dmg type=" +
                elementdmgType + '\'' + '}';
    }
}
