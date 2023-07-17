import operations.Operation;
import interfaces.IAttackAble;
import soldiers.CombatSoldier;
import soldiers.HackerSoldier;
import soldiers.ResearchSoldier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CombatSoldier combatSoldier = new CombatSoldier("Bob", 19, "avdv4w@");
        HackerSoldier hackerSoldier = new HackerSoldier("Naveah", 17);

        ResearchSoldier researchSoldier = new ResearchSoldier("Yontan", 23);

        ArrayList<IAttackAble> soldiers = new ArrayList<>(Arrays.asList(combatSoldier, hackerSoldier));

        Operation operation1 = new Operation(soldiers);
        operation1.attack();
    }

}
