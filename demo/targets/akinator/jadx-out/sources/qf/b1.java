package qf;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b1 implements p {

    /* renamed from: a, reason: collision with root package name */
    public final p f82913a;

    /* renamed from: b, reason: collision with root package name */
    public final n f82914b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f82915c;

    /* renamed from: d, reason: collision with root package name */
    public long f82916d;

    public b1(p pVar, n nVar) {
        this.f82913a = (p) com.google.android.exoplayer2.util.a.checkNotNull(pVar);
        this.f82914b = (n) com.google.android.exoplayer2.util.a.checkNotNull(nVar);
    }

    @Override // qf.p
    public void addTransferListener(c1 c1Var) {
        com.google.android.exoplayer2.util.a.checkNotNull(c1Var);
        this.f82913a.addTransferListener(c1Var);
    }

    @Override // qf.p
    public void close() throws IOException {
        n nVar = this.f82914b;
        try {
            this.f82913a.close();
        } finally {
            if (this.f82915c) {
                this.f82915c = false;
                nVar.close();
            }
        }
    }

    @Override // qf.p
    public Map<String, List<String>> getResponseHeaders() {
        return this.f82913a.getResponseHeaders();
    }

    @Override // qf.p
    public Uri getUri() {
        return this.f82913a.getUri();
    }

    @Override // qf.p
    public long open(t tVar) throws IOException {
        long jOpen = this.f82913a.open(tVar);
        this.f82916d = jOpen;
        if (jOpen == 0) {
            return 0L;
        }
        if (tVar.f82998g == -1 && jOpen != -1) {
            tVar = tVar.subrange(0L, jOpen);
        }
        this.f82915c = true;
        this.f82914b.open(tVar);
        return this.f82916d;
    }

    @Override // qf.p, qf.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f82916d == 0) {
            return -1;
        }
        int i12 = this.f82913a.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f82914b.write(bArr, i10, i12);
            long j10 = this.f82916d;
            if (j10 != -1) {
                this.f82916d = j10 - i12;
            }
        }
        return i12;
    }
}
