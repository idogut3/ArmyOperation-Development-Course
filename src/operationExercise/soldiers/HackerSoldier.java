package operationExercise.soldiers;

public class HackerSoldier extends Soldier implements IAttackAble {

    public HackerSoldier(String name, int age) {
        super(name, age);
    }


    @Override
    public void attack() {
        System.out.println("I hack!");
    }
}
