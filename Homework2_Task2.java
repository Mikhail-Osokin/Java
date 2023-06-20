import java.io.FileWriter;

public class Homework2_Task2 {
    public static void main(String[] args) {
        int [] arr = {1, 3, 4, 2};
 
        boolean flag = false;
        int a;
        try
        {
            FileWriter writer = new FileWriter("file.txt",true);
                while(!flag) {
                flag = true;
                for (int i = 0; i < arr.length-1; i++) {
                    if(arr[i] > arr[i+1]){
                    flag = false;
                    a = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = a;
                }
            }
                for (int i = 0; i < arr.length; i++) {    
                    writer.write(arr[i]+" ");
                }
                writer.write("\n");
                      
        }
            System.out.println("Исполнено");
            writer.close();
        }
        catch (Exception e){
        System.out.println("Ошибка исполнения");
    }
}
}