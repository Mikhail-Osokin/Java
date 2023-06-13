import java.util.Scanner;

public class Homework1_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int n = sc.nextInt();
        int triangle = 0;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            triangle += i;
            factorial *= i;
        }
        System.out.printf("Треугольное число = %s", triangle);
        System.out.println();
        System.out.printf("Факториал = %s", factorial);
        System.out.println();
        sc.close();
}
}
