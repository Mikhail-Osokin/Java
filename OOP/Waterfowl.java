package OOP;

public class Waterfowl extends Animal {
    public Waterfowl(String color, String species, Integer legsCount) {
        super(null, null, null, color, species, null, legsCount);
    
    }
    public static void Fly() {
        System.out.println("I can't fly!");
    }
    @Override
    public String toString() {
        return "Waterfowl []";
    }

}
