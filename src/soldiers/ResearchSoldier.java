package soldiers;

public class ResearchSoldier extends Soldier {
    public ResearchSoldier(String name, int age) {
        super(name, age);
    }


    public static void research() {
        System.out.println("I research");
    }
}
