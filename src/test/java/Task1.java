import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
        public static String nameOddIndex(List<String> names) {
            String result = names.stream()
                    .filter(index -> names.indexOf(index) % 2 != 0)
                    .map(index -> names.indexOf(index) + ". " + index)
                    .collect(Collectors.joining(", "));

            return result;
        }
    }
