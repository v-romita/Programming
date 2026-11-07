package move;
import ru.ifmo.se.pokemon.*;
import pokemon.*;

public final class Punishment extends PhysicalMove{
    public Punishment(){
        super(Type.DARK, 60, 1.0, 0, 1);
    }

    @Override public String describe(){
        return "применяет Punishment";
    }
}
