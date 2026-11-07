package move;
import ru.ifmo.se.pokemon.*;
import pokemon.*;

public final class Fling extends PhysicalMove{
    public Fling(){
        super(Type.DARK, 30, 1.0, 0, 1);
    }

    @Override public String describe(){
        return "применяет Fling";
    }
}