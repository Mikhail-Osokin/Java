import java.util.Scanner;

public class Homework1_Task1 {
    public static void main(String[] args) {
        boolean b = true;
        System.out.println(1);
        for (int P = 2; P <= 1000; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(P);
            else b = true;
        }
    } 
}