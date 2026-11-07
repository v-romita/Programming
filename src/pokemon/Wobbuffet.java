package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

public final class Wobbuffet extends Pokemon {
    public Wobbuffet(String name, int level){
        super(name, level);
        setType(Type.FIGHTING);
        setStats(190, 33, 58, 33, 58, 33);
        this.setMove(new Rest(), new SunnyDay());
    }
}