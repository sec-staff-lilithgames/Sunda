package mn;

import java.io.IOException;
import java.io.InterruptedIOException;
import ln.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final m f74847a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f74848b;

    public h(e eVar, m mVar, byte[] bArr, g gVar) {
        eVar.getCache();
        this.f74847a = mVar;
        ((li.a) eVar.getCacheKeyFactory()).buildCacheKey(mVar);
    }

    public void cache() throws IOException {
        if (this.f74848b) {
            throw new InterruptedIOException();
        }
        long j10 = this.f74847a.f73472f;
        throw null;
    }

    public void cancel() {
        this.f74848b = true;
    }
}
