package operationExercise.soldiers;

import operationExercise.soldiers.interfaces.IAttackable;

public class HackerSoldier extends Soldier implements IAttackable {

    public HackerSoldier(String name, int age) {
        super(name, age);
    }


    @Override
    public void attack() {
        System.out.println("I hack!");
    }
}
