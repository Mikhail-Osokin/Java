import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Homework6_Task13 {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows10", 100000, "Huawey"));
        set.add(new Notebook("Notebook 2", 16, "Windows10", 105000, "Redmi"));
        set.add(new Notebook("Notebook 3", 32, "linux", 95000, "Lenovo"));
        set.add(new Notebook("Notebook 4", 64, "linux", 120000, "Lenovo"));

        Homework6_Task12 operation = new Homework6_Task12(set);
        operation.start();

    }
}

