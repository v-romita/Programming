package lab2;
import ru.ifmo.se.pokemon.*;
import pokemon.*;
import move.*;

public class Main{
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Poliwag("Поливаг", 24));
        b.addAlly(new Riolu("Риолу", 20));
        b.addAlly(new Snorlax("Снорлакс", 30));
        b.addFoe(new Wobbuffet("Воббаффет", 15));
        b.addFoe(new Lucario("Лукарио", 30));
        b.addFoe(new Girafarig("Жирафариг", 31));
        b.go();
    }
}