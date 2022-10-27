import ru.ifmo.se.pokemon.Battle;
import Pokemons.*;
import AdditionalClasses.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

//        AllysTeam.add(b, new Tropius("Гусеничка", 51));
//        AllysTeam.add(b, new Poliwhirl("Крутыш", 95));
//        AllysTeam.add(b, new Poliwrath("Биг-Босс", 95));
//
//        FoesTeam.add(b, new Poliwag("Криветка", 21));
//        FoesTeam.add(b, new Vullaby("Птичка", 53));
//        FoesTeam.add(b, new Mandibuzz("Сокол", 53));

        if(AllysTeam.getAmountOfPokemons() == 0 && FoesTeam.getAmountOfPokemons() == 0) {
            System.out.print("Ни одна из комманд не пришла!");
        }
        else if(AllysTeam.getAmountOfPokemons() == 0) {
            System.out.print("Комманда Ally не пришла!");
        }
        else if(FoesTeam.getAmountOfPokemons() == 0) {
            System.out.print("Комманда Foe не пришла!");
        }
        else {
            b.go();
        }

    }
}