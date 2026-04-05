package go;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface t {
    r getFallbackSelectionFor(q qVar, s sVar);

    int getMinimumLoadableRetryCount(int i10);

    long getRetryDelayMsFor(s sVar);

    default void onLoadTaskConcluded(long j10) {
    }
}
