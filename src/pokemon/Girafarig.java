package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

public final class Girafarig extends Pokemon {
    public Girafarig(String name, int level){
        super(name, level);
        setType(Type.NORMAL, Type.PSYCHIC);
        setStats(70, 80, 65, 90, 65, 85);
        this.setMove(new Rest(), new SunnyDay(), new Whirlpool(), new Peck());
    }
}