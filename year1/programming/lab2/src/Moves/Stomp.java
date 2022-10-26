package Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;

public class Stomp extends PhysicalMove {
    public Stomp() {
        super(Type.NORMAL, 65, 100);
    }

    @Override
    protected java.lang.String describe() {
        return "использовал атаку Stomp";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if(Math.random() < 0.3){
            Effect.flinch(pokemon);
        }
    }
}

// Done
