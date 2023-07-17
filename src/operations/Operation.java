package operations;

import interfaces.IAttackAble;

import java.util.ArrayList;
import java.util.List;

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
