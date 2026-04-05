package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e1 {
    public static final void checkLifecycleStateTransition(b1 b1Var, j0 current, j0 next) {
        kotlin.jvm.internal.e0.checkNotNullParameter(current, "current");
        kotlin.jvm.internal.e0.checkNotNullParameter(next, "next");
        if (current == j0.f6615c && next == j0.f6614b) {
            throw new IllegalStateException(("State must be at least '" + j0.f6616e + "' to be moved to '" + next + "' in component " + b1Var).toString());
        }
        j0 j0Var = j0.f6614b;
        if (current != j0Var || current == next) {
            return;
        }
        throw new IllegalStateException(("State is '" + j0Var + "' and cannot be moved to `" + next + "` in component " + b1Var).toString());
    }
}
