package ln;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i f73443a;

    /* renamed from: b, reason: collision with root package name */
    public long f73444b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f73445c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    public Map f73446d = Collections.EMPTY_MAP;

    public e0(i iVar) {
        this.f73443a = (i) io.bidmachine.media3.common.util.a.checkNotNull(iVar);
    }

    @Override // ln.i
    public void addTransferListener(g0 g0Var) {
        io.bidmachine.media3.common.util.a.checkNotNull(g0Var);
        this.f73443a.addTransferListener(g0Var);
    }

    @Override // ln.i
    public void close() throws IOException {
        this.f73443a.close();
    }

    public long getBytesRead() {
        return this.f73444b;
    }

    public Uri getLastOpenedUri() {
        return this.f73445c;
    }

    public Map<String, List<String>> getLastResponseHeaders() {
        return this.f73446d;
    }

    @Override // ln.i
    public Map<String, List<String>> getResponseHeaders() {
        return this.f73443a.getResponseHeaders();
    }

    @Override // ln.i
    public Uri getUri() {
        return this.f73443a.getUri();
    }

    @Override // ln.i
    public long open(m mVar) throws IOException {
        this.f73445c = mVar.f73467a;
        this.f73446d = Collections.EMPTY_MAP;
        try {
            return this.f73443a.open(mVar);
        } finally {
            Uri uri = getUri();
            if (uri != null) {
                this.f73445c = uri;
            }
            this.f73446d = getResponseHeaders();
        }
    }

    @Override // ln.i, gn.o
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f73443a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f73444b += i12;
        }
        return i12;
    }

    public void resetBytesRead() {
        this.f73444b = 0L;
    }
}
