import ru.ifmo.se.pokemon.*;
public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC,0,0);
    }
    @Override
    protected java.lang.String describe() {
        return "Sleep for 2 turns";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().chance(0.4).stat(Stat.HP,1);
    }
}