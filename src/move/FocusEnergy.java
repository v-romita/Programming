package move;
import ru.ifmo.se.pokemon.*;
import pokemon.*;

public final class FocusEnergy extends StatusMove{
    public FocusEnergy(){
        super(Type.NORMAL, 0, 1.0, 0, 0);
    }

    @Override public void applySelfEffects(Pokemon p){
    }
    @Override public String describe(){
        return "применяет Focus Energy";
    }
}
