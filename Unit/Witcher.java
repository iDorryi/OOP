package Unit;

public class Witcher extends Mage{

    public Witcher(String name, float hp, int maxHp, int attack, int damageMin, int damageMax,
                 int defense, int speed, int mana, int maxMana, int posX, int posY ) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, mana, maxMana, posX, posY);
    }
    public Witcher(String name, Vector2D coords) {
        super(name, 50.f, 50, 9, -6, -6, 3,
                7, 5,5, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(Witcher.super.name)
                .append("\t| ATK:\t").append(Witcher.super.attack)
                .append("\t| HP:\t").append(Witcher.super.hp)
                .append(" \t| MP:\t").append(Witcher.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Witcher.super.coords.posX).append(".").append(Witcher.super.coords.posY);
    }
}
