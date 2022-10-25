package Moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;

public class AirSlash extends SpecialMove {

    public AirSlash() {
        super(Type.FLYING, 75, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(Math.random() < 0.3) {
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использовал атаку Air Slash";
    }

}
