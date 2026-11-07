package move;
import ru.ifmo.se.pokemon.*;
import pokemon.*;

public final class KarateChop extends PhysicalMove{
    public KarateChop(){
        super(Type.FIGHTING, 50, 1.0, 0, 1);
    }

    @Override public String describe(){
        return "применяет Karate Chop";
    }
}
