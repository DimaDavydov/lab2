import ru.ifmo.se.pokemon.*;
public class Slash extends PhysicalMove {
    public Slash(){
        super(Type.NORMAL,70,1);
    }
    @Override
    protected java.lang.String describe(){
        return "The target is attacked with a slash";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(1).turns(1).stat(Stat.HP, -2); 
        p.addEffect(e);
    }
}



