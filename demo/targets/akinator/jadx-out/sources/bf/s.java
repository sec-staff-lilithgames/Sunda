package bf;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s implements qf.p {

    /* renamed from: a, reason: collision with root package name */
    public final qf.p f9427a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9428b;

    /* renamed from: c, reason: collision with root package name */
    public final r f9429c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9430d;

    /* renamed from: e, reason: collision with root package name */
    public int f9431e;

    public s(qf.p pVar, int i10, r rVar) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 > 0);
        this.f9427a = pVar;
        this.f9428b = i10;
        this.f9429c = rVar;
        this.f9430d = new byte[1];
        this.f9431e = i10;
    }

    @Override // qf.p
    public void addTransferListener(qf.c1 c1Var) {
        com.google.android.exoplayer2.util.a.checkNotNull(c1Var);
        this.f9427a.addTransferListener(c1Var);
    }

    @Override // qf.p
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // qf.p
    public Map<String, List<String>> getResponseHeaders() {
        return this.f9427a.getResponseHeaders();
    }

    @Override // qf.p
    public Uri getUri() {
        return this.f9427a.getUri();
    }

    @Override // qf.p
    public long open(qf.t tVar) {
        throw new UnsupportedOperationException();
    }

    @Override // qf.p, qf.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f9431e;
        qf.p pVar = this.f9427a;
        if (i12 == 0) {
            byte[] bArr2 = this.f9430d;
            int i13 = 0;
            if (pVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int i16 = pVar.read(bArr3, i13, i15);
                        if (i16 != -1) {
                            i13 += i16;
                            i15 -= i16;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        this.f9429c.onIcyMetadata(new com.google.android.exoplayer2.util.v0(bArr3, i14));
                    }
                }
                this.f9431e = this.f9428b;
            }
            return -1;
        }
        int i17 = pVar.read(bArr, i10, Math.min(this.f9431e, i11));
        if (i17 != -1) {
            this.f9431e -= i17;
        }
        return i17;
    }
}
