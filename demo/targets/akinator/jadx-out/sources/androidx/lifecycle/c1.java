package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c1 {
    public static final q0 getLifecycleScope(b1 b1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(b1Var, "<this>");
        return z0.getCoroutineScope(b1Var.getLifecycle());
    }
}
