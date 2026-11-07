package pokemon;
import ru.ifmo.se.pokemon.*;
import move.*;

public final class Lucario extends Riolu {
    public Lucario(String name, int level){
        super(name, level);
        setStats(70, 110, 70, 115, 70, 90);
        this.addMove(new KarateChop());
    }
}