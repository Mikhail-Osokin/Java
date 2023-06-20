import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Homework3_Task1 {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(test.toString());
        System.out.printf("максимальное значение в списке = %s", Collections.max(test));
        System.out.println();
        System.out.printf("минимальное значение в списке = %s", Collections.min(test));
        System.out.println();
        double average = getAverage(test);
        System.out.printf("среднее арифметическое в списке = %s", average);
        System.out.println();
        for (int i = 0; i < test.size(); i++) {
            if (test.get(i)%2 == 0) {
                test.remove(i);
            }
        }
        System.out.println(test.toString());
    }  
    private static double getAverage(List<Integer> list) {
        IntSummaryStatistics stats = list.stream().collect(Collectors.summarizingInt(Integer::intValue));
        return stats.getAverage();
    }
}
