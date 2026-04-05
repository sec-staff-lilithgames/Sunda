package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class n5 {
    public static final <T> y4 neverEqualPolicy() {
        m2 m2Var = m2.f80338a;
        kotlin.jvm.internal.e0.checkNotNull(m2Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return m2Var;
    }

    public static final <T> y4 referentialEqualityPolicy() {
        g4 g4Var = g4.f80222a;
        kotlin.jvm.internal.e0.checkNotNull(g4Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return g4Var;
    }

    public static final <T> y4 structuralEqualityPolicy() {
        y5 y5Var = y5.f80615a;
        kotlin.jvm.internal.e0.checkNotNull(y5Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return y5Var;
    }
}
