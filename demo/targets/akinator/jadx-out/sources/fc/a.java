package fc;

import cc.h;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a extends d implements vb.b {
    public ByteBuffer M0;

    public a(h hVar, int i10, gc.b bVar) {
        super(hVar, i10, bVar);
        this.M0 = ByteBuffer.wrap(wb.c.f90518k);
    }

    @Override // vb.b
    public void feedInput(ByteBuffer byteBuffer) throws IOException {
        int i10 = this.f90513v;
        int i11 = this.f90514w;
        if (i10 < i11) {
            n(Integer.valueOf(i11 - i10), "Still have %d undecoded bytes, should not call 'feedInput'");
            throw null;
        }
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        if (iLimit < iPosition) {
            throw e(String.format("Input end (%d) may not be before start (%d)", Integer.valueOf(iLimit), Integer.valueOf(iPosition)));
        }
        if (this.f55599w0) {
            throw e("Already closed, can not feed more input");
        }
        long j10 = this.f90515x + this.C0;
        this.f90515x = j10;
        this.f90527f.validateDocumentLength(j10);
        this.f90517z = iPosition - (this.f90514w - this.f90517z);
        this.f55601y0 = iPosition;
        this.M0 = byteBuffer;
        this.f90513v = iPosition;
        this.f90514w = iLimit;
        this.C0 = iLimit - iPosition;
    }

    @Override // fc.d
    public final byte o1(int i10) {
        return this.M0.get(i10);
    }

    @Override // fc.d
    public final byte p1() {
        ByteBuffer byteBuffer = this.M0;
        int i10 = this.f90513v;
        this.f90513v = i10 + 1;
        return byteBuffer.get(i10);
    }

    @Override // fc.d
    public final int q1() {
        ByteBuffer byteBuffer = this.M0;
        int i10 = this.f90513v;
        this.f90513v = i10 + 1;
        return byteBuffer.get(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // fc.c, ub.u
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i10 = this.f90514w - this.f90513v;
        if (i10 > 0) {
            Channels.newChannel(outputStream).write(this.M0);
        }
        return i10;
    }

    @Override // ub.u
    public vb.c getNonBlockingInputFeeder() {
        return this;
    }
}
