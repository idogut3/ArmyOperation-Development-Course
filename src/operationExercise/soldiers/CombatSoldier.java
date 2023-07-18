package operationExercise.soldiers;

import operationExercise.soldiers.interfaces.IShootAble;

public class CombatSoldier extends Soldier implements IShootAble {
    String gunLicense;

    public CombatSoldier(String name, int age, String gunLicense) {
        super(name, age);
        this.gunLicense = gunLicense;
    }

    @Override
    public void attack() {
        shoot();
    }

    @Override
    public void shoot() {
        System.out.println("I shoot! pew pew!!");
    }
}
