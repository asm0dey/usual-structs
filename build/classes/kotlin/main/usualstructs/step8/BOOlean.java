package usualstructs.step8;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(
  mv = {1, 1, 13},
  bv = {1, 0, 3},
  k = 1,
  d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"},
  d2 = {"Lusualstructs/step8/BOOlean;", "", "()V", "value", "", "getValue", "()Z", "FALSE", "TRUE", "Lusualstructs/step8/BOOlean$TRUE;", "Lusualstructs/step8/BOOlean$FALSE;", "usual-structs"}
)
public abstract class BOOlean {
  public abstract boolean getValue();

  private BOOlean() {
  }

  // $FF: synthetic method
  public BOOlean(DefaultConstructorMarker $constructor_marker) {
    this();
  }

  @Metadata(
    mv = {1, 1, 13},
    bv = {1, 0, 3},
    k = 1,
    d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"},
    d2 = {"Lusualstructs/step8/BOOlean$TRUE;", "Lusualstructs/step8/BOOlean;", "()V", "value", "", "getValue", "()Z", "usual-structs"}
  )
  public static final class TRUE extends BOOlean {
    private final boolean value = true;

    public boolean getValue() {
      return this.value;
    }

    public TRUE() {
      super((DefaultConstructorMarker)null);
    }
  }

  @Metadata(
    mv = {1, 1, 13},
    bv = {1, 0, 3},
    k = 1,
    d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"},
    d2 = {"Lusualstructs/step8/BOOlean$FALSE;", "Lusualstructs/step8/BOOlean;", "()V", "value", "", "getValue", "()Z", "usual-structs"}
  )
  public static final class FALSE extends BOOlean {
    private final boolean value;

    public boolean getValue() {
      return this.value;
    }

    public FALSE() {
      super((DefaultConstructorMarker)null);
    }
  }
}
