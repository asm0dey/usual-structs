package usualstructs.step3;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 13},
   bv = {1, 0, 3},
   k = 2,
   d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\b\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"},
   d2 = {"ints", "", "", "main", "", "args", "", "", "([Ljava/lang/String;)V", "usual-structs"}
)
public final class SequencesKt {
   private static final List ints = CollectionsKt.listOf(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

   public static final void main(@NotNull String[] args) {
      Intrinsics.checkParameterIsNotNull(args, "args");
      Sequence $receiver$iv = kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.filter(CollectionsKt.asSequence((Iterable)ints), (Function1)null.INSTANCE), (Function1)null.INSTANCE), (Function1)null.INSTANCE);
      Iterator var2 = $receiver$iv.iterator();

      while(var2.hasNext()) {
         Object element$iv = var2.next();
         double it = ((Number)element$iv).doubleValue();
         System.out.println(it);
      }

   }
}
