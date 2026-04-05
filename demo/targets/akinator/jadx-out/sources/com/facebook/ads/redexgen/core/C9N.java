package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.9N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9N extends AbstractC2500my {
    public int[] A00;
    public int[] A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC2500my
    public final AnonymousClass36 A09(AnonymousClass36 anonymousClass36) throws AnonymousClass37 {
        int[] iArr = this.A01;
        if (iArr == null) {
            return AnonymousClass36.A05;
        }
        if (anonymousClass36.A02 == 2) {
            int i10 = anonymousClass36.A01 != iArr.length ? 1 : 0;
            int i11 = 0;
            while (i11 < iArr.length) {
                int i12 = iArr[i11];
                if (i12 < anonymousClass36.A01) {
                    i10 |= i12 != i11 ? 1 : 0;
                    i11++;
                } else {
                    throw new AnonymousClass37(anonymousClass36);
                }
            }
            if (i10 != 0) {
                return new AnonymousClass36(anonymousClass36.A03, iArr.length, 2);
            }
            return AnonymousClass36.A05;
        }
        throw new AnonymousClass37(anonymousClass36);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2500my
    public final void A0A() {
        this.A00 = this.A01;
    }

    public final void A0C(int[] iArr) {
        this.A01 = iArr;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass38
    public final void AGX(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C3M.A01(this.A00);
        int iPosition = byteBuffer.position();
        int outputSize = byteBuffer.limit();
        int position = outputSize - iPosition;
        ByteBuffer byteBufferA00 = A00(this.A06.A00 * (position / this.A05.A00));
        while (iPosition < outputSize) {
            for (int i10 : iArr) {
                byteBufferA00.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.A05.A00;
        }
        byteBuffer.position(outputSize);
        byteBufferA00.flip();
    }
}
