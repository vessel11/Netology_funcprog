import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {



        final String sourceText = "какая-то надпись dfsdf Просто";

        Function<String, String> function = str -> Arrays.stream(str.split(" "))
                .sorted()
                .map(word -> new StringBuilder(word).append(" "))
                .collect(Collectors.joining());

        System.out.println(function.apply(sourceText));
    }
}