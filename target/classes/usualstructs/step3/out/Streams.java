package usualstructs.step3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Streams {
   private static final List integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

   public static void main(String[] args) {
      integers.stream().filter((it) -> {
         return it % 2 == 0;
      }).map((it) -> {
         return it * it;
      }).map((it) -> {
         return (double)it / 17.0D;
      }).forEach((it) -> {
         System.out.println(it);
      });
   }
}
