package io.odeeo.internal.d;

import io.odeeo.internal.d.f;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m extends l {

    /* renamed from: i, reason: collision with root package name */
    public int[] f63413i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f63414j;

    @Override // io.odeeo.internal.d.l
    public void b() {
        this.f63414j = this.f63413i;
    }

    @Override // io.odeeo.internal.d.l
    public void d() {
        this.f63414j = null;
        this.f63413i = null;
    }

    @Override // io.odeeo.internal.d.l
    public f.a onConfigure(f.a aVar) throws f.b {
        int[] iArr = this.f63413i;
        if (iArr == null) {
            return f.a.f63351e;
        }
        if (aVar.f63354c != 2) {
            throw new f.b(aVar);
        }
        boolean z10 = aVar.f63353b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f63353b) {
                throw new f.b(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new f.a(aVar.f63352a, iArr.length, 2) : f.a.f63351e;
    }

    @Override // io.odeeo.internal.d.l, io.odeeo.internal.d.f
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) io.odeeo.internal.q0.a.checkNotNull(this.f63414j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA = a(((iLimit - iPosition) / this.f63406b.f63355d) * this.f63407c.f63355d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferA.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f63406b.f63355d;
        }
        byteBuffer.position(iLimit);
        byteBufferA.flip();
    }

    public void setChannelMap(int[] iArr) {
        this.f63413i = iArr;
    }
}
