import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static String digitConcat(List<String> numbers) {
            return Stream.of(String.join(", ", numbers).split(", "))
                    .sorted()
                    .collect(Collectors.joining(", "));
        }
}

