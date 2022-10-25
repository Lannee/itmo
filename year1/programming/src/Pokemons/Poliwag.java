package Pokemons;

import Moves.DoubleSlap;
import Moves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwag extends Pokemon {
    public Poliwag(String name, int level) {
        super(name, level);
        this.addType(Type.WATER);

        this.setStats(40, 50, 40, 40, 40, 90);

        this.addMove(new DoubleSlap());
        this.addMove(new Rest());
    }
}
