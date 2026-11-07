package move;
import ru.ifmo.se.pokemon.*;
import pokemon.*;

public final class LowKick extends PhysicalMove{
    public LowKick(){
        super(Type.FIGHTING, 20, 1.0, 0, 1);
    }

    @Override public String describe(){
        return "применяет Low Kick";
    }
}