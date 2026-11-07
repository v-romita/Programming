package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

public final class Poliwag extends Pokemon {
    public Poliwag(String name, int level){
        super(name, level);
        setType(Type.WATER);
        setStats(40, 50, 40, 40, 40, 90);
        this.setMove(new Punishment(), new DynamicPunch(), new LowKick(), new FocusEnergy());
    }
}
