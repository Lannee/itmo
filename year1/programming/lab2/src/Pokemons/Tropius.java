package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import Moves.*;

public class Tropius extends Pokemon {
    public Tropius(String name, int level){
        super(name, level);
        this.addType(Type.GRASS);
        this.addType(Type.FLYING);
        this.setStats(99, 68, 83, 72, 87, 51);

        this.addMove(new SteelWing());
        this.addMove(new Roost());
        this.addMove(new Stomp());
        this.addMove(new AirSlash());
    }

}

