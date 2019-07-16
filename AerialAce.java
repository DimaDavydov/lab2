import ru.ifmo.se.pokemon.*;
public class AerialAce extends PhysicalMove {
    public AerialAce(){
        super(Type.FLYING,60,1);
    }
    @Override
    protected java.lang.String describe(){
        return "An extremely fast attack against one target";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(1).turns(1).stat(Stat.HP, -3);
        p.addEffect(e);
    }
}
