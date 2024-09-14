import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //first task
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        int oddNumbers;

        for (int i = 0; i < nums.size(); i++) {
            if (i % 2 != 0) {
                oddNumbers = i;
                System.out.print(oddNumbers);
            }
        }
        System.out.println();

        //second task
        for (int i = 0; i < nums.size(); i++) {
            if (i % 2 == 0 && i != 0) {
                oddNumbers = i;
                System.out.print(oddNumbers);
            }
        }
        System.out.println();

        //third task
        Set<String> words = new HashSet<>(List.of("возможность", "значение", "значение", "стремление",
                "кресноречие", "преступление", "повторение", "повторение", "повторение", "повторение"));
        Set<String> duplicates = new HashSet<>();
        Set<String> tracking = new HashSet<>();

        for (String word : words) {
            if (!tracking.add(word)) {
                duplicates.add(word);
            }
        }
        System.out.println(words);

        System.out.println();

        //fourth task
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> replays = strings.stream().collect(Collectors.toMap(
                        e -> e,
                        e -> 1,
                        Integer::sum));
        replays.forEach((k,v) -> System.out.println(k + ": " + v));
    }
}

