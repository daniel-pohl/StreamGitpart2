import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> zahlenListe = Arrays.asList(19, 31, 12, 3, 25, 7, 42);

    // Step 1: Filter a list of numbers and only output the even numbers.
        System.out.println("even numbers: ");
        zahlenListe.stream()
                    .filter(zahl -> zahl % 2 == 0)
                    .forEach(System.out::println);




        System.out.println("hotfi2 Daniel ");
    }
}
