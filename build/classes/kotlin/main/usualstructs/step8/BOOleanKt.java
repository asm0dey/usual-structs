package usualstructs.step8;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
  mv = {1, 1, 13},
  bv = {1, 0, 3},
  k = 2,
  d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"},
  d2 = {"asBool", "", "Lusualstructs/step8/BOOlean;", "usual-structs"}
)
public final class BOOleanKt {
  public static final boolean asBool(@NotNull BOOlean $receiver) {
    Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");
    boolean var10000;
    if ($receiver instanceof BOOlean.TRUE) {
      var10000 = true;
    } else {
      if (!($receiver instanceof BOOlean.FALSE)) {
        throw new NoWhenBranchMatchedException();
      }

      var10000 = false;
    }

    return var10000;
  }
}
