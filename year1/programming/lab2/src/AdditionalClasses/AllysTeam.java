package AdditionalClasses;

import ru.ifmo.se.pokemon.*;

public class AllysTeam {

    private static int amountOfPokemons = 0;
    public static void add(Battle b, Pokemon p) {
        b.addAlly(p);
        amountOfPokemons++;
    }

    public static int getAmountOfPokemons() {
        return amountOfPokemons;
    }

}
