package Unit;

public class Preacher extends Mage{
    public Preacher(String name, Vector2D coords) {
        super(name, 50.f, 50, 5, -7, -7, 3,
                7, 5 ,5, coords.posX, coords.posY);

    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Preacher.super.name)
                .append("\t| ATK:\t").append(Preacher.super.attack)
                .append("\t| HP:\t").append(Preacher.super.hp)
                .append(" \t| MP:\t").append(Preacher.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Preacher.super.coords.posX).append(".").append(Preacher.super.coords.posY);
    }
}
