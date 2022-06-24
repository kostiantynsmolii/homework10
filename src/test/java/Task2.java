import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<String> namesDescendingSort(List<String> names) {
         return names.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}
