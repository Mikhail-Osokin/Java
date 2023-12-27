package ToyShop;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.io.FileWriter;

import ToyShop.Toys;

public class Main {
    public static void main(String[] args) {
    ArrayList<Integer> idToys = new ArrayList<>();
    ArrayList<Integer> frequencyToys = new ArrayList<>();
    ArrayList<String> nameToys = new ArrayList<>(); 
    Queue<String> listOfToys = new PriorityQueue<String>(10);
    Toys toy = new Toys(0,0,"");
    PriseToys toy1 = new PriseToys(0,0,"");
    toy.set("1 2 конструктор");
    idToys.add(toy.getId());
    frequencyToys.add(toy.getFrequency());
    nameToys.add(toy.getName());
    idToys.add(toy1.getId());
    frequencyToys.add(toy1.getFrequency());
    nameToys.add(toy1.getName());
    listOfToys.add(toy.getToy());
    toy.set("2 2 робот");
    idToys.add(toy.getId());
    frequencyToys.add(toy.getFrequency());
    nameToys.add(toy.getName());
    idToys.add(toy1.getId());
    frequencyToys.add(toy1.getFrequency());
    nameToys.add(toy1.getName());
    listOfToys.add(toy.getToy());
    toy.set("3 6 кукла");
    idToys.add(toy.getId());
    frequencyToys.add(toy.getFrequency());
    nameToys.add(toy.getName());
    idToys.add(toy1.getId());
    frequencyToys.add(toy1.getFrequency());
    nameToys.add(toy1.getName());
    listOfToys.add(toy.getToy());
    System.out.println(listOfToys);
    System.out.println(toy);
    
    try
    {
        FileWriter writer = new FileWriter("LogPriseToys.txt",true);
        for (int i = 0; i < 10; i++) { 
        writer.write(toy1.getToy());
        writer.write("\n");
        }
    }
    catch (Exception e){
        System.out.println("Ошибка исполнения");
    }

    //public void getLuckyToy ()
}
}