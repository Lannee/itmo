package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Messages;

public class SteelWing extends PhysicalMove{
    public SteelWing(){
        super(Type.STEEL, 70, 90);
    }

    @Override
    protected java.lang.String describe() {
        return "использовал атаку Steel Wing";
    }
}

// Done