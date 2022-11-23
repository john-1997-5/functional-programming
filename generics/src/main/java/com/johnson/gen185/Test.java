package com.johnson.gen185;

interface FinalBossMonster {
    void killEveryone();
}
interface Monster {
    void attack();
}

class WaterMonster implements Monster {
    @Override
    public void attack() {
        System.out.println("attack with water!");
    }
}
class FireMonster implements Monster, FinalBossMonster{
    @Override
    public void attack() {
        System.out.println("attack with fire!");
    }

    @Override
    public void killEveryone() {
        System.out.println("killing everyone...");
    }
}

class StoneMonster {
    public void attack() {
        System.out.println("attack with stones!");
    }
}

public class Test {
    public static void main(String[] args) {
        /**
         * pueden usarse como argumento del método doYourThing()
         * porque waterMonster y fireMonster implementan Monster
         */
        Monster waterMonster = new WaterMonster();
        Monster fireMonster = new FireMonster();
        doYourThing(waterMonster);
        doYourThing(fireMonster);


       /* no puede usarse
        StoneMonster stoneMonster = new StoneMonster();
        doYourThing(stoneMonster); //stoneMonster no implementa Monster por tanto no vale
        */

        /**
         * puede usarse como argumento del método doYourFinalBossThing() porque
         * FireMonster implementa ambas interfaces
         */
        FireMonster finalBossMonster = new FireMonster();
        doYourFinalBossThing(finalBossMonster);
    }
    
    public static <T extends Monster> void doYourThing(T monster) {
        monster.attack();
    }

    public static <T extends Monster & FinalBossMonster> void doYourFinalBossThing(T monster) {
        monster.attack();
        monster.killEveryone();
    }
}
