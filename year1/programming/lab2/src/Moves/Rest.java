package Moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect sleep = new Effect().turns(2).condition(Status.SLEEP);
        Effect healing = new Effect().stat(Stat.HP, (int)p.getStat(Stat.HP));
        p.setCondition(sleep);
        p.addEffect(healing);
    }

    @Override
    protected String describe() {
        return "использовал способность Rest";
    }
}
