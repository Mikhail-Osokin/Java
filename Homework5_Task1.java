import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Homework5_Task1 {
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите действие: ");
            String operation = sc.nextLine();
            if (operation.equals("+")){
                System.out.print("Введите фамилию: ");
                String name = sc.nextLine();
                System.out.print("Введите телефон: ");
                String phone = sc.nextLine();
                add(name,phone);
            }
            sc.close();
            if (operation.equals("*")) {
                printt();
            }
        }
      
    public static void add(String name, String phone) {
        Map<String,ArrayList<String>> phonebook = new HashMap<>();
        if (phonebook.containsKey(name)) {
            ArrayList<String> phones = phonebook.get(name);
            phones.add(phone);
            phonebook.put(name,phones);
            }
        else {
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phone);
            phonebook.put(name,phones);
        }
    }  
    public static void printt() {
        Map<String,ArrayList<String>> phonebook = new HashMap<>();
        ArrayList<Map.Entry<String,ArrayList<String>>> list = new ArrayList<>(phonebook.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String,ArrayList<String>>>(){ 
        
        @Override 
        public int compare(Map.Entry<String,ArrayList<String>> o1, Map.Entry<String,ArrayList<String>> o2){
        return o2.getValue().size() - o1.getValue().size();
        }
        });

        for (Map.Entry<String,ArrayList<String>>entry:list){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}


    