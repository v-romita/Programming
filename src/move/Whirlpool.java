package move;
import ru.ifmo.se.pokemon.*;
import pokemon.*;

public final class Whirlpool extends SpecialMove{
    public Whirlpool(){
        super(Type.WATER, 35, 0.85, 0, 1);
    }

    @Override public String describe(){
        return "применяет Whirlpool";
    }
}
