package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n0 extends m0 {

    /* renamed from: i, reason: collision with root package name */
    public int[] f27217i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f27218j;

    @Override // com.google.android.exoplayer2.audio.m0
    public final void a() {
        this.f27218j = this.f27217i;
    }

    @Override // com.google.android.exoplayer2.audio.m0
    public final void c() {
        this.f27218j = null;
        this.f27217i = null;
    }

    @Override // com.google.android.exoplayer2.audio.m0
    public s onConfigure(s sVar) throws t {
        int[] iArr = this.f27217i;
        if (iArr == null) {
            return s.f27278e;
        }
        int i10 = sVar.f27281c;
        int i11 = sVar.f27280b;
        if (i10 != 2) {
            throw new t(sVar);
        }
        boolean z10 = i11 != iArr.length;
        int i12 = 0;
        while (i12 < iArr.length) {
            int i13 = iArr[i12];
            if (i13 >= i11) {
                throw new t(sVar);
            }
            z10 |= i13 != i12;
            i12++;
        }
        return z10 ? new s(sVar.f27279a, iArr.length, 2) : s.f27278e;
    }

    @Override // com.google.android.exoplayer2.audio.m0, com.google.android.exoplayer2.audio.u
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) com.google.android.exoplayer2.util.a.checkNotNull(this.f27218j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferD = d(((iLimit - iPosition) / this.f27205b.f27282d) * this.f27206c.f27282d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferD.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f27205b.f27282d;
        }
        byteBuffer.position(iLimit);
        byteBufferD.flip();
    }

    public void setChannelMap(int[] iArr) {
        this.f27217i = iArr;
    }
}
