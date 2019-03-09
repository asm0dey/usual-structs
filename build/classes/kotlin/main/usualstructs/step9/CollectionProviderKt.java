package usualstructs.step9;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
  mv = {1, 1, 13},
  bv = {1, 0, 3},
  k = 2,
  d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0004\"\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"},
  d2 = {"immutableList", "", "", "getImmutableList", "()Ljava/util/List;", "immutableSet", "", "getImmutableSet", "()Ljava/util/Set;", "mutableList", "", "getMutableList", "sequence", "Lkotlin/sequences/Sequence;", "getSequence", "()Lkotlin/sequences/Sequence;", "usual-structs"}
)
public final class CollectionProviderKt {
  @NotNull
  private static final List immutableList = CollectionsKt.listOf(new Integer[]{1, 2, 3, 4});
  @NotNull
  private static final List mutableList = CollectionsKt.mutableListOf(new Integer[]{1, 2, 3, 4});
  @NotNull
  private static final Set immutableSet = SetsKt.setOf(new Integer[]{1, 2, 3, 4});
  @NotNull
  private static final Sequence sequence = SequencesKt.sequenceOf(new Integer[]{1, 2, 3, 4});

  @NotNull
  public static final List getImmutableList() {
    return immutableList;
  }

  @NotNull
  public static final List getMutableList() {
    return mutableList;
  }

  @NotNull
  public static final Set getImmutableSet() {
    return immutableSet;
  }

  @NotNull
  public static final Sequence getSequence() {
    return sequence;
  }
}
