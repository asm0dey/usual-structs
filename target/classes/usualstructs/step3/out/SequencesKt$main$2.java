package usualstructs.step3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(
   mv = {1, 1, 13},
   bv = {1, 0, 3},
   k = 3,
   d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"},
   d2 = {"<anonymous>", "", "it", "invoke"}
)
final class SequencesKt$main$2 extends Lambda implements Function1 {
   public static final SequencesKt$main$2 INSTANCE = new SequencesKt$main$2();

   public final int invoke(int it) {
      return it * it;
   }

   SequencesKt$main$2() {
      super(1);
   }
}
