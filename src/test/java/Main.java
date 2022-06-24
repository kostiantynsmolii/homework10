import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("---TASK1---");
        List<String> names = Arrays.asList("Ivan", "Peter", "Jon", "Joma", "Torn", "B.I.G");
        System.out.println(Task1.nameOddIndex(names));

        System.out.println("---TASK2---");
        List<String> sort = new ArrayList<>(names);
        System.out.println(Task2.namesDescendingSort(sort));

        System.out.println("---TASK3---");
        List<String> numbers = Arrays.asList("1, 2, 0", "4, 5");
        System.out.println(Task3.digitConcat(numbers));

        System.out.println("---TASK4---");
        Task4 task4 = new Task4(3446L, 25214903917L, 11, (long) Math.pow(2, 48));
        task4
                .randomAlgorithm().limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("---TASK5---");
        Stream<Integer> stream1 = Stream.of(100, 200, 300, 400, 500, 600, 700);
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<String> result = Task5.zip(stream1, stream2)
                .map(String::valueOf)
                .collect(Collectors.toList());
                 System.out.println(result);
    }
}

