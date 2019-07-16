import ru.ifmo.se.pokemon.*;
public class FocusEnergy extends StatusMove {
    public FocusEnergy(){
        super(Type.NORMAL,0,0);
    }
    @Override
    protected java.lang.String describe() {
        return "takes a deep breath and focuses to raise its critical-hit ratio";
    }
}
