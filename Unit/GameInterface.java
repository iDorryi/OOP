package Unit;

import java.util.ArrayList;

public interface GameInterface {
    StringBuilder getInfo();
    void step(ArrayList<Human> team1, ArrayList<Human> team2);
}
