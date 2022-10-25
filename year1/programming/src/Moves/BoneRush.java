package Moves;

import ru.ifmo.se.pokemon.*;

public class BoneRush extends PhysicalMove {
    public BoneRush() {
        super(Type.GROUND, 25, 90);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        float[] chances = { 1, 3f/8f, 3f/8f, 1f/8f, 1f/8f};
        int[] powers = {(int)damage, 30, 40, 60, 75};
        for(int i = 0; i < chances.length; i++) {
            if(Math.random() > chances[i]) {
                break;
            }
            p.setMod(Stat.HP, (int)Math.round(powers[i]));
        }
    }

    @Override
    protected String describe(){
        return "использовал атаку Bone Rush";
    }

}
