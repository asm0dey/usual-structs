package usualstructs.step4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
  mv = {1, 1, 13},
  bv = {1, 0, 3},
  k = 2,
  d1 = {"\u0000\"\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0086\u0010\u001a\u0019\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\f¨\u0006\r"},
  d2 = {"factorial", "", "i", "", "factorialLoop", "counter", "acc", "main", "", "args", "", "", "([Ljava/lang/String;)V", "usual-structs"}
)
public final class DefaultKt {
  public static final void main(@NotNull String[] args) {
    Intrinsics.checkParameterIsNotNull(args, "args");
    long var1 = factorial(6);
    System.out.println(var1);
  }

  public static final long factorial(int i) {
    return factorialLoop$default(i, 0L, 2, (Object)null);
  }

  public static final long factorialLoop(int counter, long acc) {
    while(counter != 0) {
      int var10000 = counter - 1;
      acc *= (long)counter;
      counter = var10000;
    }

    return acc;
  }

  // $FF: synthetic method
  public static long factorialLoop$default(int var0, long var1, int var3, Object var4) {
    if ((var3 & 2) != 0) {
      var1 = 1L;
    }

    return factorialLoop(var0, var1);
  }
}
