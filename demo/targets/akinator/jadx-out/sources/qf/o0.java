package qf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface o0 {
    m0 getFallbackSelectionFor(l0 l0Var, n0 n0Var);

    int getMinimumLoadableRetryCount(int i10);

    long getRetryDelayMsFor(n0 n0Var);

    default void onLoadTaskConcluded(long j10) {
    }
}
