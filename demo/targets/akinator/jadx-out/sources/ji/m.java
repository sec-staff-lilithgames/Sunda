package ji;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public int f69598b;

    /* renamed from: c, reason: collision with root package name */
    public int f69599c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f69600e;

    public m(o oVar, l lVar) {
        this.f69600e = oVar;
        int i10 = lVar.f69596a + 4;
        Logger logger = o.f69601i;
        this.f69598b = oVar.f(i10);
        this.f69599c = lVar.f69597b;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        Logger logger = o.f69601i;
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.f69599c;
        if (i12 <= 0) {
            return -1;
        }
        if (i11 > i12) {
            i11 = i12;
        }
        int i13 = this.f69598b;
        o oVar = this.f69600e;
        oVar.d(i13, i10, i11, bArr);
        this.f69598b = oVar.f(this.f69598b + i11);
        this.f69599c -= i11;
        return i11;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f69599c == 0) {
            return -1;
        }
        o oVar = this.f69600e;
        oVar.f69602b.seek(this.f69598b);
        int i10 = oVar.f69602b.read();
        this.f69598b = oVar.f(this.f69598b + 1);
        this.f69599c--;
        return i10;
    }
}
