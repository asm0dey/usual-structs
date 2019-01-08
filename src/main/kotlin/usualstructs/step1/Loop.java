package usualstructs.step1;

import java.util.Arrays;
import java.util.List;

public class Loop {
    private static final List<String> strings = Arrays.asList("a", "b", "c", "d");

    public static void simplified(){
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void indexed(){
        for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            System.out.println(i + " " + string);
        }
    }
}
