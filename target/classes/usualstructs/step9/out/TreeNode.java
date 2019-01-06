package usualstructs.step9;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 1, 13},
   bv = {1, 0, 3},
   k = 1,
   d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000HÆ\u0003J>\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R \u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"},
   d2 = {"Lusualstructs/step9/TreeNode;", "T", "", "value", "left", "right", "(Ljava/lang/Object;Lusualstructs/step9/TreeNode;Lusualstructs/step9/TreeNode;)V", "getLeft", "()Lusualstructs/step9/TreeNode;", "setLeft", "(Lusualstructs/step9/TreeNode;)V", "getRight", "setRight", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Lusualstructs/step9/TreeNode;Lusualstructs/step9/TreeNode;)Lusualstructs/step9/TreeNode;", "equals", "", "other", "hashCode", "", "toString", "", "usual-structs"}
)
public final class TreeNode {
   @NotNull
   private final Object value;
   @Nullable
   private TreeNode left;
   @Nullable
   private TreeNode right;

   @NotNull
   public final Object getValue() {
      return this.value;
   }

   @Nullable
   public final TreeNode getLeft() {
      return this.left;
   }

   public final void setLeft(@Nullable TreeNode var1) {
      this.left = var1;
   }

   @Nullable
   public final TreeNode getRight() {
      return this.right;
   }

   public final void setRight(@Nullable TreeNode var1) {
      this.right = var1;
   }

   public TreeNode(@NotNull Object value, @Nullable TreeNode left, @Nullable TreeNode right) {
      Intrinsics.checkParameterIsNotNull(value, "value");
      super();
      this.value = value;
      this.left = left;
      this.right = right;
   }

   // $FF: synthetic method
   public TreeNode(Object var1, TreeNode var2, TreeNode var3, int var4, DefaultConstructorMarker var5) {
      if ((var4 & 2) != 0) {
         var2 = (TreeNode)null;
      }

      if ((var4 & 4) != 0) {
         var3 = (TreeNode)null;
      }

      this(var1, var2, var3);
   }

   @NotNull
   public final Object component1() {
      return this.value;
   }

   @Nullable
   public final TreeNode component2() {
      return this.left;
   }

   @Nullable
   public final TreeNode component3() {
      return this.right;
   }

   @NotNull
   public final TreeNode copy(@NotNull Object value, @Nullable TreeNode left, @Nullable TreeNode right) {
      Intrinsics.checkParameterIsNotNull(value, "value");
      return new TreeNode(value, left, right);
   }

   // $FF: synthetic method
   @NotNull
   public static TreeNode copy$default(TreeNode var0, Object var1, TreeNode var2, TreeNode var3, int var4, Object var5) {
      if ((var4 & 1) != 0) {
         var1 = var0.value;
      }

      if ((var4 & 2) != 0) {
         var2 = var0.left;
      }

      if ((var4 & 4) != 0) {
         var3 = var0.right;
      }

      return var0.copy(var1, var2, var3);
   }

   @NotNull
   public String toString() {
      return "TreeNode(value=" + this.value + ", left=" + this.left + ", right=" + this.right + ")";
   }

   public int hashCode() {
      Object var10000 = this.value;
      int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
      TreeNode var10001 = this.left;
      var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
      var10001 = this.right;
      return var1 + (var10001 != null ? var10001.hashCode() : 0);
   }

   public boolean equals(@Nullable Object var1) {
      if (this != var1) {
         if (var1 instanceof TreeNode) {
            TreeNode var2 = (TreeNode)var1;
            if (Intrinsics.areEqual(this.value, var2.value) && Intrinsics.areEqual(this.left, var2.left) && Intrinsics.areEqual(this.right, var2.right)) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }
}
