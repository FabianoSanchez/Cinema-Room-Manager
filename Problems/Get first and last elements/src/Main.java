import java.util.*;
import java.util.stream.Stream;

public class Main {


    public static int[] getFirstAndLast(int[] arrays) {

        int first = arrays[0];
        int last = arrays[arrays.length - 1];

        int[] both = new int[2];

        both[0] = first;
        both[1] = last;
        return both;
    }
    // write a method here

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}