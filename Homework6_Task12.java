import java.util.*;

public class Homework6_Task12 {
    private Set<Notebook> notebooks = new HashSet<>();
    private List<Factors> factors = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public void printList(){
        for (Notebook notebook : notebooks){
            if (notebookIsCorrect(notebook)){
                System.out.println(notebook);
            }
        }
    }
    public boolean notebookIsCorrect(Notebook notebook){
        for (Factors factor : factors){
            Object valueNotebook = null;
            if (factor.property.equals("name")){
                valueNotebook = notebook.getName();
            }else if (factor.property.equals("amountRAM")){
                valueNotebook = notebook.getAmountRAM();
            }else if (factor.property.equals("operatingSystem")){
                valueNotebook = notebook.getOperatingSystem();
            }else if (factor.property.equals("price")){
                valueNotebook = notebook.getPrice();
            }else if (factor.property.equals("model")){
                valueNotebook = notebook.getModel();
            }else {continue;
            }
            if (factor.value != null && !factor.value.equals(valueNotebook)){return false;
            }
            if (factor.maxValue != null && factor.maxValue < Double.parseDouble(Objects.toString(valueNotebook))){return false;
            }
            if (factor.minValue != null && factor.minValue > Double.parseDouble(Objects.toString(valueNotebook))){return false;
            }
        }
        return true;
    }
    public Homework6_Task12(Set<Notebook> notebooks) {
        this.sc = new Scanner(System.in);
        this.notebooks = notebooks;
    }
    public Homework6_Task12(Set<Notebook> notebooks, List<Factors> factors) {
        this.sc = new Scanner(System.in);
        this.notebooks = notebooks;
        this.factors = factors;
    }
    public int getFactors(){
        String text = "Введите цифру, соответствующую выбранному фактору: ";
        List<String> properties = propertiesForFilter();
        for (int i = 0; i < properties.size(); i++)
        {
            text += "\n" + (i + 1) + ". " + getPropertyDescription(properties.get(i));
        }
        System.out.println(text);
        int value = sc.nextInt();
        return value;
    }
    public String getPropertyDescription(String property){
        Map<String, String> descriptionsProperties = descriptionsProperties();
        return descriptionsProperties.get(property);
    }
    public Map<String, String> descriptionsProperties(){
        Map<String, String> map = new HashMap<>();
        map.put("name", "Наименование");
        map.put("amountRAM", "Оперативка");
        map.put("operatingSystem", "Операционная система");
        map.put("price", "цена");
        map.put("model", "модель");
        return map;
    }
    public List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("name");
        list.add("amountRAM");
        list.add("operatingSystem");
        list.add("price");
        list.add("model");
        return list;
    }
    public String getOperations(){
        String text = "Выберите опрерацию: \n " +
                "1. Добавить критерий \n " +
                "2. Вывести список \n " +
                "3. Завершить";
        System.out.println(text);
        String answer = sc.next();
        return answer;
    }
    public Set<String> pricevalue(){
        Set<String> set = new HashSet<>();
        set.add("amountRAM");
        set.add("price");
        return set;
    }
    public Set<String> stringSelection(){
        Set<String> set = new HashSet<>();
        set.add("name");
        set.add("operatingSystem");
        set.add("model");
        return set;
    }
    public void start(){
        boolean flag = true;
        while (flag){
            String operation = getOperations();
            if (operation.equals("3")){
                flag = false;
                sc.close();
                continue;
            }else if(operation.equals("1")){
                int factor = getFactors();
                List<String> properties = propertiesForFilter();
                if (factor - 1 < 0 || factor - 1 > properties.size() - 1){
                    System.out.println("Неверно");
                    continue;
                }
                String property = properties.get(factor - 1);
                Factors inputvalue = null;
                try {
                    if (pricevalue().contains(property)){
                        inputvalue = Factors.startGetting(sc, property, true);
                    }else {
                        inputvalue = Factors.startGetting(sc, property, false);
                    }
                }catch (Exception e){
                    System.out.println("Ошибка при выборе фактора");
                    continue;
                }
                if (inputvalue != null){
                    System.out.println("Фактор добавлен");
                    factors.add(inputvalue);
                }
            }
            else if (operation.equals("2")){
                printList();
            }
        }
    }
}
class Factors {

    Object value;
    Double minValue;
    Double maxValue;
    boolean isQuantitative;
    String property;
    public Factors(String property, boolean isQuantitative, Object value, Double minValue, Double maxValue) {
        this.property = property;
        this.isQuantitative = isQuantitative;
        this.value = value;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
    public static Factors startGetting(Scanner sc, String property, boolean isQuantitative) {
        if (isQuantitative) {
            String quest = "Выберите тип криетрия: " +
                    "\n 1. Значение" +
                    "\n 2. Меньше" +
                    "\n 3. Больше" +
                    "\n 4. Интервал";
            System.out.println(quest);
            String text = sc.next();
            Factors factor = null;
            if (text.equals("1")) {
                System.out.println("Введите значение: ");
                int getValue = sc.nextInt();
                factor = new Factors(property, isQuantitative, getValue, null, null);
            } else if (text.equals("2")) {
                System.out.println("Введите максимум: ");
                double getValue = sc.nextDouble();
                factor = new Factors(property, isQuantitative, null, null, getValue);
            } else if (text.equals("3")) {
                System.out.println("Введите минимум: ");
                double getValue = sc.nextDouble();
                factor = new Factors(property, isQuantitative, null, getValue, null);
            } else if (text.equals("4")) {
                System.out.println("Введите минимум: ");
                double getMin = sc.nextDouble();
                System.out.println("Введите максимум: ");
                double getMax = sc.nextDouble();
                factor = new Factors(property, isQuantitative, null, getMin, getMax);
            }
            return factor;
        }
        System.out.println("Введите значение: ");
        String getValue = sc.next();
        return new Factors(property, isQuantitative, getValue, null, null);
}

}

