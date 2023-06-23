import java.util.ArrayDeque;
import java.util.Deque;

public class Homework4_Task1 {
    public static void main(String[] args) {
        Deque <Integer> number1 = new ArrayDeque<Integer>();
        number1.addFirst(3);
        number1.addFirst(2);
        number1.addFirst(1);
        Deque <Integer> number2 = new ArrayDeque<Integer>();
        number2.addFirst(5);
        number2.addFirst(4);
        number2.addFirst(3);
        System.out.println(number1);
        System.out.println(number2);
        int result1 = number1.pollLast()+number1.pollLast()*10+number1.pollLast()*100;
        int result2 = number2.pollLast()+number2.pollLast()*10+number2.pollLast()*100;
        Deque <Integer> number3 = new ArrayDeque<Integer>();
        int n = result1*result2;
        System.out.println(n);
        while (n != 0) {
            number3.addFirst(n%10);
            n = n/10;
        }
        System.out.println(number3);

    }
}
