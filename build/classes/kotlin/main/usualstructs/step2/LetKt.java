package usualstructs.step2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
  mv = {1, 1, 13},
  bv = {1, 0, 3},
  k = 2,
  d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\t\u001a\u0019\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0002\u0010\f¨\u0006\r"},
  d2 = {"fact", "", "i", "", "main", "", "args", "", "", "([Ljava/lang/String;)V", "nullableFactorial", "input", "(Ljava/lang/Integer;)Ljava/lang/Long;", "usual-structs"}
)
public final class LetKt {
  public static final void main(@NotNull String[] args) {
    Intrinsics.checkParameterIsNotNull(args, "args");
    Long var1 = nullableFactorial(6);
    System.out.println(var1);
    var1 = nullableFactorial((Integer)null);
    System.out.println(var1);
  }

  private static final Long nullableFactorial(Integer input) {
    Long var10000;
    if (input != null) {
      int it = ((Number)input).intValue();
      var10000 = fact(it);
    } else {
      var10000 = null;
    }

    return var10000;
  }

  private static final long fact(int i) {
    return i < 1 ? 1L : (long)i * fact(i - 1);
  }
}
