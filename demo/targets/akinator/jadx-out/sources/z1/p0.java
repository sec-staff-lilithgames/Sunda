package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class p0 {
    public static final void add(b0 b0Var, b0 child) {
        kotlin.jvm.internal.e0.checkNotNullParameter(b0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(child, "child");
        b0Var.insertAt$ui_release(b0Var.getChildren$ui_release().size(), child);
    }

    public static final s1 requireOwner(b0 b0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(b0Var, "<this>");
        s1 owner$ui_release = b0Var.getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner");
    }
}
