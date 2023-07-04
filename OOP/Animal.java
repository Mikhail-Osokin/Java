package OOP;

public class Animal {
    private String name;
    private Integer age;
    private String vaccination;
    private String color;
    private String species;
    private String owner;
    private Integer legsCount;

    public Animal(String name, Integer age, String vaccination, String color, String species, String owner, Integer legsCount) {
        this.name = name;
        this.age = age;
        this.vaccination = vaccination;
        this.color = color;
        this.species = species;
        this.owner = owner;
        this.legsCount = legsCount;
    }
    public Animal(String color, String species, Integer legsCount) {
        this(null, null, null, color, species, null, legsCount);
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public static void toGo(){
        System.out.println("I can run!");
    }
    public static void Swim(){
        System.out.println("I can swim!");
    }
    public static void Fly(){
        System.out.println("I can fly!");
    }
    public static void foo() {
        System.out.println("I'm foo");
    }
    @Override
    public String toString() {
        return String.format("Animal:  {name=%s, owner=%s}", name, owner);
    }
}

