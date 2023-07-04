package OOP;

public class AnimalNew extends Animal{

    private Integer eyesCount;
    public AnimalNew(String name, Integer age, String vaccination, String color, String species, String owner,
            Integer legsCount, Integer eyesCount) {
        super(name, age, vaccination, color, species, owner, legsCount);
        this.eyesCount = eyesCount;
        //TODO Auto-generated constructor stub
    }
    
}
