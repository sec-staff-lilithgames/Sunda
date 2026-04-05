package tv;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u implements z {

    /* renamed from: a, reason: collision with root package name */
    public static final u f87462a = new u();

    /* renamed from: b, reason: collision with root package name */
    public static final long f87463b = System.nanoTime();

    /* renamed from: adjustReading-6QKq23U, reason: not valid java name */
    public final long m7230adjustReading6QKq23U(long j10, long j11) {
        return x.m7239constructorimpl(t.m7229saturatingAddNuflL3o(j10, i.f87439c, j11));
    }

    /* renamed from: differenceBetween-fRLX17w, reason: not valid java name */
    public final long m7231differenceBetweenfRLX17w(long j10, long j11) {
        return t.saturatingOriginsDiff(j10, j11, i.f87439c);
    }

    /* renamed from: elapsedFrom-6eNON_k, reason: not valid java name */
    public final long m7232elapsedFrom6eNON_k(long j10) {
        return t.saturatingDiff(System.nanoTime() - f87463b, j10, i.f87439c);
    }

    @Override // tv.z, tv.a0
    public /* bridge */ /* synthetic */ d markNow() {
        return x.m7236boximpl(m7233markNowz9LOYto());
    }

    /* renamed from: markNow-z9LOYto, reason: not valid java name */
    public long m7233markNowz9LOYto() {
        return x.m7239constructorimpl(System.nanoTime() - f87463b);
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    @Override // tv.z, tv.a0
    public /* bridge */ /* synthetic */ w markNow() {
        return x.m7236boximpl(m7233markNowz9LOYto());
    }
}
