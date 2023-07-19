package operationExercise.operations;

import operationExercise.soldiers.interfaces.IAttackable;

import java.util.ArrayList;

public class Operation {
    ArrayList<IAttackable> soldiers;

    public Operation(ArrayList<IAttackable> soldiers) {
      this.soldiers = soldiers;
    }

    public void attack() {
        for (IAttackable soldier : soldiers) {
            soldier.attack();
        }
    }
}
