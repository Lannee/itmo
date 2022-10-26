package Pokemons;

import Moves.MudShot;

public class Poliwhirl extends Poliwag {
    public Poliwhirl(String name, int level) {
        super(name, level);
        this.setStats(65, 65, 65, 50, 50, 90);

        this.addMove(new MudShot());
    }
}
