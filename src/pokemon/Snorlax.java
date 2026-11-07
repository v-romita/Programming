package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

public final class Snorlax extends Pokemon {
    public Snorlax(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(160, 110, 65, 65, 110, 30);
        this.setMove(new Rest(), new SunnyDay(), new Whirlpool());
    }
}

