package qf;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a1 implements p {

    /* renamed from: a, reason: collision with root package name */
    public final p f82909a;

    /* renamed from: b, reason: collision with root package name */
    public long f82910b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f82911c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    public Map f82912d = Collections.EMPTY_MAP;

    public a1(p pVar) {
        this.f82909a = (p) com.google.android.exoplayer2.util.a.checkNotNull(pVar);
    }

    @Override // qf.p
    public void addTransferListener(c1 c1Var) {
        com.google.android.exoplayer2.util.a.checkNotNull(c1Var);
        this.f82909a.addTransferListener(c1Var);
    }

    @Override // qf.p
    public void close() throws IOException {
        this.f82909a.close();
    }

    public long getBytesRead() {
        return this.f82910b;
    }

    public Uri getLastOpenedUri() {
        return this.f82911c;
    }

    public Map<String, List<String>> getLastResponseHeaders() {
        return this.f82912d;
    }

    @Override // qf.p
    public Map<String, List<String>> getResponseHeaders() {
        return this.f82909a.getResponseHeaders();
    }

    @Override // qf.p
    public Uri getUri() {
        return this.f82909a.getUri();
    }

    @Override // qf.p
    public long open(t tVar) throws IOException {
        this.f82911c = tVar.f82992a;
        this.f82912d = Collections.EMPTY_MAP;
        long jOpen = this.f82909a.open(tVar);
        this.f82911c = (Uri) com.google.android.exoplayer2.util.a.checkNotNull(getUri());
        this.f82912d = getResponseHeaders();
        return jOpen;
    }

    @Override // qf.p, qf.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f82909a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f82910b += i12;
        }
        return i12;
    }

    public void resetBytesRead() {
        this.f82910b = 0L;
    }
}
