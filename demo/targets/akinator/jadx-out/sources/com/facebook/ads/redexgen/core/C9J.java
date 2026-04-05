package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.9J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9J extends AbstractC2500my {
    public static String[] A0C = {"kTOKNBh1Wp6avXYwKxrfNqHQCe6IowZb", "fsh7jTNUZTGCSew0VT63IO4tkQUYppyQ", "CGsUWOpaOXfE7pNtsFBesiWCOQ75lYHg", "3QzqyUj5HYGt0uXrFXWs5fdma44AOfyL", "C3DxIlHWWAPwLuHgY8W8WEDh6NP", "cCeo7h1kMT8v6dcJbz1RM5PEEOyjnS1I", "8Ip3ivaO", "u5WK46JzMVMnhOVxX0VDjJ353j7WObAc"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public byte[] A07;
    public byte[] A08;
    public final long A09;
    public final long A0A;
    public final short A0B;

    public C9J() {
        this(150000L, 20000L, (short) 1024);
    }

    public C9J(long j10, long j11, short s10) {
        C3M.A07(j11 <= j10);
        this.A09 = j10;
        this.A0A = j11;
        this.A0B = s10;
        this.A07 = AbstractC09264a.A07;
        this.A08 = AbstractC09264a.A07;
    }

    private int A00(long j10) {
        return (int) ((super.A05.A03 * j10) / 1000000);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(java.nio.ByteBuffer r4) {
        /*
            r3 = this;
            int r0 = r4.limit()
            int r2 = r0 + (-2)
        L6:
            int r0 = r4.position()
            if (r2 < r0) goto L25
            short r0 = r4.getShort(r2)
            int r1 = java.lang.Math.abs(r0)
            short r0 = r3.A0B
            if (r1 <= r0) goto L22
            int r1 = r3.A00
            int r0 = r3.A00
            int r2 = r2 / r0
            int r1 = r1 * r2
            int r0 = r3.A00
            int r1 = r1 + r0
            return r1
        L22:
            int r2 = r2 + (-2)
            goto L6
        L25:
            int r0 = r4.position()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C9J.A01(java.nio.ByteBuffer):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A02(java.nio.ByteBuffer r4) {
        /*
            r3 = this;
            int r2 = r4.position()
        L4:
            int r0 = r4.limit()
            if (r2 >= r0) goto L20
            short r0 = r4.getShort(r2)
            int r1 = java.lang.Math.abs(r0)
            short r0 = r3.A0B
            if (r1 <= r0) goto L1d
            int r1 = r3.A00
            int r0 = r3.A00
            int r2 = r2 / r0
            int r1 = r1 * r2
            return r1
        L1d:
            int r2 = r2 + 2
            goto L4
        L20:
            int r0 = r4.limit()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C9J.A02(java.nio.ByteBuffer):int");
    }

    private void A03(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        A00(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.A06 = true;
        }
    }

    private void A04(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int maybeSilenceBufferRemaining = A02(byteBuffer);
        int limit = byteBuffer.position();
        int maybeSilenceInputSize = maybeSilenceBufferRemaining - limit;
        int noisePosition = this.A07.length;
        int limit2 = this.A01;
        int noisePosition2 = noisePosition - limit2;
        if (maybeSilenceBufferRemaining < iLimit && maybeSilenceInputSize < noisePosition2) {
            byte[] bArr = this.A07;
            int maybeSilenceBufferRemaining2 = this.A01;
            int noisePosition3 = A0C[4].length();
            if (noisePosition3 == 0) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[2] = "id1mOky4Zsioh8kkFhZ0Iqg9uH7l7sht";
            strArr[7] = "uHcgX8Q5LBy4SketH3HUZ8MVXP73GzFI";
            A08(bArr, maybeSilenceBufferRemaining2);
            this.A01 = 0;
            this.A03 = 0;
            return;
        }
        int maybeSilenceInputSize2 = Math.min(maybeSilenceInputSize, noisePosition2);
        int limit3 = byteBuffer.position();
        byteBuffer.limit(limit3 + maybeSilenceInputSize2);
        byte[] bArr2 = this.A07;
        int limit4 = this.A01;
        byteBuffer.get(bArr2, limit4, maybeSilenceInputSize2);
        int limit5 = this.A01;
        this.A01 = limit5 + maybeSilenceInputSize2;
        int noisePosition4 = this.A01;
        int limit6 = this.A07.length;
        if (noisePosition4 == limit6) {
            if (this.A06) {
                byte[] bArr3 = this.A07;
                int limit7 = this.A02;
                A08(bArr3, limit7);
                long j10 = this.A04;
                int noisePosition5 = this.A01;
                int limit8 = this.A02;
                int noisePosition6 = noisePosition5 - (limit8 * 2);
                int limit9 = this.A00;
                this.A04 = j10 + (noisePosition6 / limit9);
            } else {
                long j11 = this.A04;
                int noisePosition7 = this.A01;
                int limit10 = this.A02;
                int noisePosition8 = noisePosition7 - limit10;
                int limit11 = this.A00;
                this.A04 = j11 + (noisePosition8 / limit11);
            }
            byte[] bArr4 = this.A07;
            int limit12 = this.A01;
            A07(byteBuffer, bArr4, limit12);
            this.A01 = 0;
            this.A03 = 2;
        }
        byteBuffer.limit(iLimit);
    }

    private void A05(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int limit = this.A07.length;
        byteBuffer.limit(Math.min(iLimit, iPosition + limit));
        int noiseLimit = A01(byteBuffer);
        int limit2 = byteBuffer.position();
        if (noiseLimit == limit2) {
            this.A03 = 1;
        } else {
            byteBuffer.limit(noiseLimit);
            A03(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void A06(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iA02 = A02(byteBuffer);
        byteBuffer.limit(iA02);
        long j10 = this.A04;
        int noisyPosition = byteBuffer.remaining();
        int limit = this.A00;
        this.A04 = j10 + (noisyPosition / limit);
        byte[] bArr = this.A08;
        int limit2 = this.A02;
        A07(byteBuffer, bArr, limit2);
        if (iA02 < iLimit) {
            byte[] bArr2 = this.A08;
            int limit3 = this.A02;
            A08(bArr2, limit3);
            this.A03 = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void A07(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.A02);
        int i11 = this.A02 - iMin;
        System.arraycopy(bArr, i10 - i11, this.A08, 0, i11);
        int fromInputSize = byteBuffer.limit();
        byteBuffer.position(fromInputSize - iMin);
        byteBuffer.get(this.A08, i11, iMin);
    }

    private void A08(byte[] bArr, int i10) {
        A00(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.A06 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2500my
    public final AnonymousClass36 A09(AnonymousClass36 anonymousClass36) throws AnonymousClass37 {
        if (anonymousClass36.A02 == 2) {
            return this.A05 ? anonymousClass36 : AnonymousClass36.A05;
        }
        throw new AnonymousClass37(anonymousClass36);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2500my
    public final void A0A() {
        if (this.A05) {
            this.A00 = super.A05.A00;
            int iA00 = A00(this.A09) * this.A00;
            int maybeSilenceBufferSize = this.A07.length;
            if (maybeSilenceBufferSize != iA00) {
                this.A07 = new byte[iA00];
            }
            int iA002 = A00(this.A0A);
            int maybeSilenceBufferSize2 = this.A00;
            this.A02 = iA002 * maybeSilenceBufferSize2;
            int length = this.A08.length;
            int maybeSilenceBufferSize3 = this.A02;
            if (length != maybeSilenceBufferSize3) {
                int maybeSilenceBufferSize4 = this.A02;
                this.A08 = new byte[maybeSilenceBufferSize4];
            }
        }
        this.A03 = 0;
        this.A04 = 0L;
        this.A01 = 0;
        this.A06 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2500my
    public final void A0B() {
        if (this.A01 > 0) {
            A08(this.A07, this.A01);
        }
        boolean z10 = this.A06;
        if (A0C[0].charAt(10) == 'o') {
            throw new RuntimeException();
        }
        A0C[3] = "3PybTV2kdzhjV0AdFBUr0i874h0Ge15Q";
        if (!z10) {
            this.A04 += this.A02 / this.A00;
        }
    }

    public final long A0C() {
        return this.A04;
    }

    public final void A0D(boolean z10) {
        this.A05 = z10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2500my, com.facebook.ads.redexgen.core.AnonymousClass38
    public final boolean AAC() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass38
    public final void AGX(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !A01()) {
            switch (this.A03) {
                case 0:
                    A05(byteBuffer);
                    break;
                case 1:
                    A04(byteBuffer);
                    break;
                case 2:
                    A06(byteBuffer);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }
}
