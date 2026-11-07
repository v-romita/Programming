package move;
import ru.ifmo.se.pokemon.*;
import pokemon.*;

public final class Peck extends PhysicalMove{
    public Peck(){
        super(Type.FLYING, 35, 1.0, 0, 1);
    }

    @Override public String describe(){
        return "применяет Peck";
    }
}