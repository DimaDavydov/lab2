import ru.ifmo.se.pokemon.*;
public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL,70,1);
    }
    @Override
    protected java.lang.String describe() {
        return "attacks with Facade";
    }
}
