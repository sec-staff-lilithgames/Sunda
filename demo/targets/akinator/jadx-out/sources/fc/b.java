package fc;

import cc.h;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b extends d implements vb.a {
    public byte[] M0;

    public b(h hVar, int i10, gc.b bVar) {
        super(hVar, i10, bVar);
        this.M0 = wb.c.f90518k;
    }

    @Override // vb.a
    public void feedInput(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f90513v;
        int i13 = this.f90514w;
        if (i12 < i13) {
            n(Integer.valueOf(i13 - i12), "Still have %d undecoded bytes, should not call 'feedInput'");
            throw null;
        }
        if (i11 < i10) {
            throw e(String.format("Input end (%d) may not be before start (%d)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
        if (this.f55599w0) {
            throw e("Already closed, can not feed more input");
        }
        long j10 = this.f90515x + this.C0;
        this.f90515x = j10;
        this.f90527f.validateDocumentLength(j10);
        this.f90517z = i10 - (this.f90514w - this.f90517z);
        this.f55601y0 = i10;
        this.M0 = bArr;
        this.f90513v = i10;
        this.f90514w = i11;
        this.C0 = i11 - i10;
    }

    @Override // fc.d
    public final byte o1(int i10) {
        return this.M0[i10];
    }

    @Override // fc.d
    public final byte p1() {
        byte[] bArr = this.M0;
        int i10 = this.f90513v;
        this.f90513v = i10 + 1;
        return bArr[i10];
    }

    @Override // fc.d
    public final int q1() {
        byte[] bArr = this.M0;
        int i10 = this.f90513v;
        this.f90513v = i10 + 1;
        return bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // fc.c, ub.u
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i10 = this.f90514w;
        int i11 = this.f90513v;
        int i12 = i10 - i11;
        if (i12 > 0) {
            outputStream.write(this.M0, i11, i12);
        }
        return i12;
    }

    @Override // ub.u
    public vb.a getNonBlockingInputFeeder() {
        return this;
    }
}
