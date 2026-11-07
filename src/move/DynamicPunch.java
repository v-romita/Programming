package move;
import ru.ifmo.se.pokemon.*;
import pokemon.*;

public final class DynamicPunch extends PhysicalMove{
    public DynamicPunch(){
        super(Type.FIGHTING, 100, 0.5, 0, 1);
    }

    @Override public void applyOppEffects(Pokemon p){
        p.confuse();
    }
    @Override public String describe(){
        return "применяет Dynamic Punch";
    }
}