package Week3.Lambdas_Streams.Q3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       int count = countWords(Arrays.asList("dada", "mama", "cama"), 'c', 'd', 4);
        System.out.println(count);
        concat(new String[]{"A", "good", "day", "to", "write", "some", "Java"});
    }

    // a)
    public static int countWords(List<String> words, char c, char d, int len){
       long count = words.stream()
                .filter(w -> w.length() == len)
                .filter(w -> w.contains(c+ ""))
                .filter(w -> !w.contains(d+""))
                .count();
       return (int) count;
    }

    // b)
    public static void concat(String[] args) {
        Stream<String> strings = Arrays.stream(args);
        String res = strings.collect(Collectors.joining(" "));
        System.out.printf("combined: %s%n", res);
    }

    // c)
    public static void others(String[] args) {
        Stream<String> strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
        Optional<String> op = strings.findFirst();
        System.out.printf("combined: %s%n", op);
    }

}
