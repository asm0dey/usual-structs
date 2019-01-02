package usualstructs.step3;

import java.util.Arrays;
import java.util.List;

public class Streams {
    private static final List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {
        integers
                .stream()
                .filter(it -> it % 2 == 0)
                .map(it -> it * it)
                .map(it -> (double) it / 17)
                .forEach(it -> System.out.println(it));
    }
}
