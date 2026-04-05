package j$.time.temporal;

/* loaded from: classes3.dex */
public interface l extends m {
    l g(long j10, p pVar);

    l h(j$.time.h hVar);

    l j(long j10, r rVar);

    default l a(long j10, r rVar) {
        return j10 == Long.MIN_VALUE ? j(Long.MAX_VALUE, rVar).j(1L, rVar) : j(-j10, rVar);
    }
}
