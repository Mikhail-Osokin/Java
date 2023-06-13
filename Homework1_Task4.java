import java.util.Scanner;

public class Homework1_Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String str = sc.next();
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        String str4 = sc.next();
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str4);
        char[] chars = str.toCharArray();
        char[] chars2 = str2.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])){
                System.out.println(chars[i]);
            }
        }
        //String [] a = str.split("[+\\s=],");
        //for (int i = 0; i < ; i++) {
        //   System.out.print(a[i]);
        //}
    }
}
