import java.util.HashMap;
import java.util.Map;

public class Homework2_Task1 {
     public static void main(String[] args) {
        Map<String, String> parts = new HashMap<String,String>();
        parts.put("name","Ivanov");
        parts.put("country","Russia");
        parts.put("city","Moscow");
        parts.put("age",null);
        System.out.println(Zapros(parts));
    }
    public static String Zapros(Map<String, String> parts)
    {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String,String> pair : parts.entrySet())
        {
            if (pair.getValue() != null)
            {
                sb.append(pair.getKey() +" = '" + pair.getValue()+"' AND ");
            }
        }
        sb.delete(sb.toString().length()-5,sb.toString().length());
        return sb.toString();
    }
}


