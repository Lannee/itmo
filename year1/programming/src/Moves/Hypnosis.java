package Moves;

import ru.ifmo.se.pokemon.*;

public class Hypnosis extends StatusMove {
    public Hypnosis() {
        super(Type.PSYCHIC, 0, 60);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect sleep = new Effect().condition(Status.SLEEP);
        p.setCondition(sleep);
    }

    @Override
    protected String describe() {
        return "использовал спотобность Hypnosis";
    }
}
