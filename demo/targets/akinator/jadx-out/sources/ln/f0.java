package ln;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i f73447a;

    /* renamed from: b, reason: collision with root package name */
    public final g f73448b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f73449c;

    /* renamed from: d, reason: collision with root package name */
    public long f73450d;

    public f0(i iVar, g gVar) {
        this.f73447a = (i) io.bidmachine.media3.common.util.a.checkNotNull(iVar);
        this.f73448b = (g) io.bidmachine.media3.common.util.a.checkNotNull(gVar);
    }

    @Override // ln.i
    public void addTransferListener(g0 g0Var) {
        io.bidmachine.media3.common.util.a.checkNotNull(g0Var);
        this.f73447a.addTransferListener(g0Var);
    }

    @Override // ln.i
    public void close() throws IOException {
        g gVar = this.f73448b;
        try {
            this.f73447a.close();
        } finally {
            if (this.f73449c) {
                this.f73449c = false;
                gVar.close();
            }
        }
    }

    @Override // ln.i
    public Map<String, List<String>> getResponseHeaders() {
        return this.f73447a.getResponseHeaders();
    }

    @Override // ln.i
    public Uri getUri() {
        return this.f73447a.getUri();
    }

    @Override // ln.i
    public long open(m mVar) throws IOException {
        long jOpen = this.f73447a.open(mVar);
        this.f73450d = jOpen;
        if (jOpen == 0) {
            return 0L;
        }
        if (mVar.f73473g == -1 && jOpen != -1) {
            mVar = mVar.subrange(0L, jOpen);
        }
        this.f73449c = true;
        this.f73448b.open(mVar);
        return this.f73450d;
    }

    @Override // ln.i, gn.o
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f73450d == 0) {
            return -1;
        }
        int i12 = this.f73447a.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f73448b.write(bArr, i10, i12);
            long j10 = this.f73450d;
            if (j10 != -1) {
                this.f73450d = j10 - i12;
            }
        }
        return i12;
    }
}
