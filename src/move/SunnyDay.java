package move;
import ru.ifmo.se.pokemon.*;
import pokemon.*;

public final class SunnyDay extends StatusMove {
    public SunnyDay() {
        super(Type.FIRE, 0, 1.0);
    }

    @Override public String describe() {
        return "применяет Sunny Day";
    }
}