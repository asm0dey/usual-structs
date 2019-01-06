package usualstructs.step9;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 1, 13},
   bv = {1, 0, 3},
   k = 2,
   d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u001a\u0019\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\n\u001a%\u0010\u000b\u001a\n\u0012\u0004\u0012\u0002H\f\u0018\u00010\u0001\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\r*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000e"},
   d2 = {"z", "Lusualstructs/step9/TreeNode;", "", "getZ", "()Lusualstructs/step9/TreeNode;", "main", "", "args", "", "", "([Ljava/lang/String;)V", "findChildWithClass", "T", "", "usual-structs"}
)
public final class ReifiedKt {
   @NotNull
   private static final TreeNode z = new TreeNode(1, new TreeNode("s", (TreeNode)null, (TreeNode)null, 6, (DefaultConstructorMarker)null), new TreeNode(3L, (TreeNode)null, (TreeNode)null, 6, (DefaultConstructorMarker)null));

   @NotNull
   public static final TreeNode getZ() {
      return z;
   }

   private static final TreeNode findChildWithClass(@NotNull TreeNode $receiver) {
      LinkedList toInspect = new LinkedList();
      toInspect.add($receiver);

      while(!toInspect.isEmpty()) {
         TreeNode currentRoot = (TreeNode)toInspect.pollFirst();
         KClass var10000 = Reflection.getOrCreateKotlinClass(currentRoot.getValue().getClass());
         Intrinsics.reifiedOperationMarker(4, "T");
         if (Intrinsics.areEqual(var10000, Reflection.getOrCreateKotlinClass(Object.class))) {
            if (currentRoot == null) {
               throw new TypeCastException("null cannot be cast to non-null type usualstructs.step9.TreeNode<T>");
            }

            return currentRoot;
         }

         SequencesKt.filterNotNullTo(SequencesKt.sequenceOf(new TreeNode[]{currentRoot.getLeft(), currentRoot.getRight()}), (Collection)toInspect);
      }

      return null;
   }

   public static final void main(@NotNull String[] args) {
      Intrinsics.checkParameterIsNotNull(args, "args");
      TreeNode $receiver$iv = z;
      LinkedList toInspect$iv = new LinkedList();
      toInspect$iv.add($receiver$iv);

      TreeNode var10000;
      TreeNode currentRoot$iv;
      while(true) {
         if (toInspect$iv.isEmpty()) {
            var10000 = null;
            break;
         }

         currentRoot$iv = (TreeNode)toInspect$iv.pollFirst();
         if (Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(currentRoot$iv.getValue().getClass()), Reflection.getOrCreateKotlinClass(String.class))) {
            var10000 = currentRoot$iv;
            if (currentRoot$iv == null) {
               throw new TypeCastException("null cannot be cast to non-null type usualstructs.step9.TreeNode<T>");
            }
            break;
         }

         SequencesKt.filterNotNullTo(SequencesKt.sequenceOf(new TreeNode[]{currentRoot$iv.getLeft(), currentRoot$iv.getRight()}), (Collection)toInspect$iv);
      }

      $receiver$iv = var10000;
      System.out.println($receiver$iv);
      $receiver$iv = z;
      toInspect$iv = new LinkedList();
      toInspect$iv.add($receiver$iv);

      while(true) {
         if (toInspect$iv.isEmpty()) {
            var10000 = null;
            break;
         }

         currentRoot$iv = (TreeNode)toInspect$iv.pollFirst();
         if (Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(currentRoot$iv.getValue().getClass()), Reflection.getOrCreateKotlinClass(Integer.class))) {
            var10000 = currentRoot$iv;
            if (currentRoot$iv == null) {
               throw new TypeCastException("null cannot be cast to non-null type usualstructs.step9.TreeNode<T>");
            }
            break;
         }

         SequencesKt.filterNotNullTo(SequencesKt.sequenceOf(new TreeNode[]{currentRoot$iv.getLeft(), currentRoot$iv.getRight()}), (Collection)toInspect$iv);
      }

      $receiver$iv = var10000;
      System.out.println($receiver$iv);
   }
}
