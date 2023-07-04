package OOP;

public class Flying extends Animal {
    public Flying(String color, String species, Integer legsCount) {
        super(null, null, null, color, species, null, legsCount);
    
    }
    public static void Swim() {
        System.out.println("I can't swim!");
    }
    @Override
    public String toString() {
        return "Waterfowl []";
    }

}

