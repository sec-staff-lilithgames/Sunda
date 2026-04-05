package io.bidmachine.media3.exoplayer.audio;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class z extends hn.j {

    /* renamed from: i, reason: collision with root package name */
    public int[] f61113i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f61114j;

    @Override // hn.j, hn.h
    public /* bridge */ /* synthetic */ long getDurationAfterProcessorApplied(long j10) {
        return super.getDurationAfterProcessorApplied(j10);
    }

    @Override // hn.j
    public hn.f onConfigure(hn.f fVar) throws hn.g {
        int[] iArr = this.f61113i;
        if (iArr == null) {
            return hn.f.f59037e;
        }
        int i10 = fVar.f59040c;
        int i11 = fVar.f59039b;
        if (i10 != 2 && i10 != 4) {
            throw new hn.g(fVar);
        }
        boolean z10 = i11 != iArr.length;
        int i12 = 0;
        while (i12 < iArr.length) {
            int i13 = iArr[i12];
            if (i13 >= i11) {
                throw new hn.g("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", fVar);
            }
            z10 |= i13 != i12;
            i12++;
        }
        return z10 ? new hn.f(fVar.f59038a, iArr.length, fVar.f59040c) : hn.f.f59037e;
    }

    @Override // hn.j
    public final void onFlush() {
        this.f61114j = this.f61113i;
    }

    @Override // hn.j
    public final void onReset() {
        this.f61114j = null;
        this.f61113i = null;
    }

    @Override // hn.j, hn.h
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) io.bidmachine.media3.common.util.a.checkNotNull(this.f61114j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA = a(((iLimit - iPosition) / this.f59043b.f59041d) * this.f59044c.f59041d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                int byteDepth = (io.bidmachine.media3.common.util.a1.getByteDepth(this.f59043b.f59040c) * i10) + iPosition;
                int i11 = this.f59043b.f59040c;
                if (i11 == 2) {
                    byteBufferA.putShort(byteBuffer.getShort(byteDepth));
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("Unexpected encoding: " + this.f59043b.f59040c);
                    }
                    byteBufferA.putFloat(byteBuffer.getFloat(byteDepth));
                }
            }
            iPosition += this.f59043b.f59041d;
        }
        byteBuffer.position(iLimit);
        byteBufferA.flip();
    }

    public void setChannelMap(int[] iArr) {
        this.f61113i = iArr;
    }
}
