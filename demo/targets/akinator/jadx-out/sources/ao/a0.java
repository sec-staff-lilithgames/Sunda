package ao;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a0 implements ln.i {

    /* renamed from: a, reason: collision with root package name */
    public final ln.i f7538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7539b;

    /* renamed from: c, reason: collision with root package name */
    public final z f7540c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f7541d;

    /* renamed from: e, reason: collision with root package name */
    public int f7542e;

    public a0(ln.i iVar, int i10, z zVar) {
        io.bidmachine.media3.common.util.a.checkArgument(i10 > 0);
        this.f7538a = iVar;
        this.f7539b = i10;
        this.f7540c = zVar;
        this.f7541d = new byte[1];
        this.f7542e = i10;
    }

    @Override // ln.i
    public void addTransferListener(ln.g0 g0Var) {
        io.bidmachine.media3.common.util.a.checkNotNull(g0Var);
        this.f7538a.addTransferListener(g0Var);
    }

    @Override // ln.i
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // ln.i
    public Map<String, List<String>> getResponseHeaders() {
        return this.f7538a.getResponseHeaders();
    }

    @Override // ln.i
    public Uri getUri() {
        return this.f7538a.getUri();
    }

    @Override // ln.i
    public long open(ln.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override // ln.i, gn.o
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f7542e;
        ln.i iVar = this.f7538a;
        if (i12 == 0) {
            byte[] bArr2 = this.f7541d;
            int i13 = 0;
            if (iVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & 255) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int i16 = iVar.read(bArr3, i13, i15);
                        if (i16 != -1) {
                            i13 += i16;
                            i15 -= i16;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        this.f7540c.onIcyMetadata(new io.bidmachine.media3.common.util.m0(bArr3, i14));
                    }
                }
                this.f7542e = this.f7539b;
            }
            return -1;
        }
        int i17 = iVar.read(bArr, i10, Math.min(this.f7542e, i11));
        if (i17 != -1) {
            this.f7542e -= i17;
        }
        return i17;
    }
}
