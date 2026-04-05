package ln;

import android.net.Uri;
import gn.l1;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i f73424a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f73425b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73426c;

    public c0(i iVar, l1 l1Var, int i10) {
        this.f73424a = (i) io.bidmachine.media3.common.util.a.checkNotNull(iVar);
        this.f73425b = (l1) io.bidmachine.media3.common.util.a.checkNotNull(l1Var);
        this.f73426c = i10;
    }

    @Override // ln.i
    public void addTransferListener(g0 g0Var) {
        io.bidmachine.media3.common.util.a.checkNotNull(g0Var);
        this.f73424a.addTransferListener(g0Var);
    }

    @Override // ln.i
    public void close() throws IOException {
        this.f73424a.close();
    }

    @Override // ln.i
    public Map<String, List<String>> getResponseHeaders() {
        return this.f73424a.getResponseHeaders();
    }

    @Override // ln.i
    public Uri getUri() {
        return this.f73424a.getUri();
    }

    @Override // ln.i
    public long open(m mVar) throws IOException {
        this.f73425b.proceedOrThrow(this.f73426c);
        return this.f73424a.open(mVar);
    }

    @Override // ln.i, gn.o
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f73425b.proceedOrThrow(this.f73426c);
        return this.f73424a.read(bArr, i10, i11);
    }
}
