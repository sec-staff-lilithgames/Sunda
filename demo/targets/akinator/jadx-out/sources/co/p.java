package co;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class p extends e {

    /* renamed from: j, reason: collision with root package name */
    public final long f12470j;

    public p(ln.i iVar, ln.m mVar, io.bidmachine.media3.common.b bVar, int i10, Object obj, long j10, long j11, long j12) {
        super(iVar, mVar, 1, bVar, i10, obj, j10, j11);
        io.bidmachine.media3.common.util.a.checkNotNull(bVar);
        this.f12470j = j12;
    }

    @Override // co.e, go.x
    public abstract /* synthetic */ void cancelLoad();

    public long getNextChunkIndex() {
        long j10 = this.f12470j;
        if (j10 != -1) {
            return j10 + 1;
        }
        return -1L;
    }

    public abstract boolean isLoadCompleted();

    @Override // co.e, go.x
    public abstract /* synthetic */ void load() throws IOException;
}
