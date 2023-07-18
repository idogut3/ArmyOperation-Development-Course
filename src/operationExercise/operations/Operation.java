package operationExercise.operations;

import operationExercise.soldiers.IAttackAble;

import java.util.ArrayList;

public class Operation {
    ArrayList<IAttackAble> soldiers;

    public Operation(ArrayList<IAttackAble> soldiers) {
      this.soldiers = soldiers;
    }

    public void attack() {
        for (IAttackAble soldier : soldiers) {
            soldier.attack();
        }
    }
}
