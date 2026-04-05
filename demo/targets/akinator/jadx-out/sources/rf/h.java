package rf;

import java.io.IOException;
import java.io.InterruptedIOException;
import qf.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final t f84340a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f84341b;

    public h(e eVar, t tVar, byte[] bArr, g gVar) {
        eVar.getCache();
        this.f84340a = tVar;
        ((pe.a) eVar.getCacheKeyFactory()).buildCacheKey(tVar);
    }

    public void cache() throws IOException {
        if (this.f84341b) {
            throw new InterruptedIOException();
        }
        long j10 = this.f84340a.f82997f;
        throw null;
    }

    public void cancel() {
        this.f84341b = true;
    }
}
