package move;
import ru.ifmo.se.pokemon.*;
import pokemon.*;

public final class IceBeam extends SpecialMove{
    public IceBeam(){
        super(Type.NORMAL, 90, 1.0, 0, 1);
    }

    @Override public void applyOppEffects(Pokemon p){
        if (Math.random()<0.1){
            Effect.freeze(p);
        }
    }
    @Override public String describe(){
        return "применяет Ice Beam";
    }
}
