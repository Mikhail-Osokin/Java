import java.io.FileWriter;
import java.util.Scanner;

public class Homework2_Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int n = sc.nextInt();
        System.out.print("Введите первое число: ");
        int m = sc.nextInt();
        System.out.print("Введите операцию -+/* одну на выбор: ");
        String operation = sc.next();
        int result = 0;
        try
            {
            FileWriter writer = new FileWriter("log.txt",true);
        
            if (operation.equals("*")){
                result = n*m;
                System.out.printf("Произведение чисел = %s", result); 
                System.out.println();
                writer.write(n+"*"+m+"="+result);
                writer.write("\n");
            }
            if (operation.equals("+")){
                result = n+m;
                System.out.printf("Сумма чисел = %s", result);
                System.out.println();
                writer.write(n+"+"+m+"="+result);
                writer.write("\n");
            } 
            if (operation.equals("-")){
                result = n-m;
                System.out.printf("Разность чисел = %s", result);
                System.out.println();
                writer.write(n+"-"+m+"="+result);
                writer.write("\n");
            } 
            if (operation.equals("/")){
                result = n/m;
                System.out.printf("Результат деления первого числа на второе = %s", result);
                System.out.println();
                writer.write(n+"/"+m+"="+result);
                writer.write("\n");
            }
            
            System.out.println("Исполнено");
            writer.close();
        }
            catch (Exception e)
            {
              System.out.println("Ошибка исполнения");  
            }
    }
}
