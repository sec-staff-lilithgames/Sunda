package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.90, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass90 implements InterfaceC2403lN {
    public static String[] A07 = {"YlHQuKLayYbpqzx9FSV6CQrLdQj96AeM", "S4RZcb4lBSGk97kEvSl91HaEV0P4", "uVSfNf", "Coq", "aQ2CxhcvUBulJYKynnVyQo", "flTysjHMhLtcJrzUbSTnFz15x2mZl", "8oFgaOvQgeQ1BxQlutu1jILF1QVjJ1FW", "wjWZdP"};
    public int A00;
    public int A01;
    public long A02;
    public byte[] A03;
    public final long A04;
    public final InterfaceC2549nl A05;
    public final byte[] A06;

    public AnonymousClass90(InterfaceC2549nl interfaceC2549nl, long j10, long j11) {
        this(interfaceC2549nl, j10, j11, false);
    }

    public AnonymousClass90(InterfaceC2549nl interfaceC2549nl, long j10, long j11, boolean z10) {
        this.A05 = interfaceC2549nl;
        this.A02 = j10;
        this.A04 = j11;
        this.A03 = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];
        this.A06 = new byte[4096];
    }

    private int A00(int i10) {
        int bytesSkipped = Math.min(this.A00, i10);
        A05(bytesSkipped);
        return bytesSkipped;
    }

    private int A01(byte[] bArr, int i10, int i11) {
        if (this.A00 == 0) {
            return 0;
        }
        int iMin = Math.min(this.A00, i11);
        System.arraycopy(this.A03, 0, bArr, i10, iMin);
        A05(iMin);
        return iMin;
    }

    private int A02(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int i13 = this.A05.read(bArr, i10 + i12, i11 - i12);
            if (i13 == -1) {
                if (i12 == 0 && z10) {
                    return -1;
                }
                throw new EOFException();
            }
            return i12 + i13;
        }
        throw new InterruptedIOException();
    }

    private void A03(int i10) {
        if (i10 != -1) {
            this.A02 += i10;
        }
    }

    private void A04(int i10) {
        int i11 = this.A01 + i10;
        int requiredLength = this.A03.length;
        if (i11 > requiredLength) {
            int requiredLength2 = this.A03.length;
            int requiredLength3 = 524288 + i11;
            int newPeekCapacity = AbstractC09264a.A07(requiredLength2 * 2, C.DEFAULT_BUFFER_SEGMENT_SIZE + i11, requiredLength3);
            this.A03 = Arrays.copyOf(this.A03, newPeekCapacity);
        }
    }

    private void A05(int i10) {
        this.A00 -= i10;
        this.A01 = 0;
        byte[] bArr = this.A03;
        if (this.A00 < this.A03.length - 524288) {
            bArr = new byte[this.A00 + C.DEFAULT_BUFFER_SEGMENT_SIZE];
        }
        byte[] bArr2 = this.A03;
        int i11 = this.A00;
        if (A07[3].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[7] = "U6HOVF";
        strArr[2] = "FLrwJS";
        System.arraycopy(bArr2, i10, bArr, 0, i11);
        this.A03 = bArr;
    }

    public final boolean A06(int i10, boolean z10) throws IOException {
        int iA00 = A00(i10);
        while (true) {
            String[] strArr = A07;
            String str = strArr[1];
            String str2 = strArr[5];
            int length = str.length();
            int bytesSkipped = str2.length();
            if (length == bytesSkipped) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "VT2oIT";
            strArr2[2] = "AHKvNZ";
            if (iA00 >= i10 || iA00 == -1) {
                break;
            }
            int bytesSkipped2 = this.A06.length;
            iA00 = A02(this.A06, -iA00, Math.min(i10, bytesSkipped2 + iA00), iA00, z10);
        }
        A03(iA00);
        return iA00 != -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2403lN
    public final void A3z(int i10) throws IOException {
        A40(i10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        throw new java.lang.RuntimeException();
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2403lN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A40(int r7, boolean r8) throws java.io.IOException {
        /*
            r6 = this;
            r3 = r7
            r6.A04(r3)
            int r4 = r6.A00
            int r0 = r6.A01
            int r4 = r4 - r0
        L9:
            if (r4 >= r3) goto L39
            byte[] r1 = r6.A03
            int r2 = r6.A01
            r0 = r6
            r5 = r8
            int r4 = r0.A02(r1, r2, r3, r4, r5)
            r0 = -1
            if (r4 != r0) goto L33
            r3 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass90.A07
            r0 = 6
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 25
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L59
        L2d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L33:
            int r0 = r6.A01
            int r0 = r0 + r4
            r6.A00 = r0
            goto L9
        L39:
            int r0 = r6.A01
            int r0 = r0 + r3
            r6.A01 = r0
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass90.A07
            r0 = 1
            r1 = r2[r0]
            r0 = 5
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2d
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass90.A07
            java.lang.String r1 = "05c"
            r0 = 3
            r2[r0] = r1
            r0 = 1
            return r0
        L59:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.AnonymousClass90.A07
            java.lang.String r1 = "U9yRyStfgEDvt0OpJggQJXPRXL9S"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "yvkfr8ZSlHssIeYh6rwGG04GsxspU"
            r0 = 5
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AnonymousClass90.A40(int, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2403lN
    public final long A8G() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2403lN
    public final long A8a() {
        return this.A02 + this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2403lN
    public final long A8f() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2403lN
    public final Uri A9H() {
        return this.A05.A9H();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2403lN
    public final int AG8(byte[] bArr, int i10, int i11) throws IOException {
        int iMin;
        A04(i11);
        int bytesPeeked = this.A00 - this.A01;
        if (bytesPeeked == 0) {
            iMin = A02(this.A03, this.A01, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            int peekBufferRemainingBytes = this.A00;
            this.A00 = peekBufferRemainingBytes + iMin;
        } else {
            iMin = Math.min(i11, bytesPeeked);
        }
        byte[] bArr2 = this.A03;
        int peekBufferRemainingBytes2 = this.A01;
        System.arraycopy(bArr2, peekBufferRemainingBytes2, bArr, i10, iMin);
        int peekBufferRemainingBytes3 = this.A01;
        this.A01 = peekBufferRemainingBytes3 + iMin;
        return iMin;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2403lN
    public final void AG9(byte[] bArr, int i10, int i11) throws IOException {
        AGA(bArr, i10, i11, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2403lN
    public final boolean AGA(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!A40(i11, z10)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2403lN
    public final boolean AGh(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int iA01 = A01(bArr, i10, i11);
        while (iA01 < i11 && iA01 != -1) {
            iA01 = A02(bArr, i10, i11, iA01, z10);
        }
        A03(iA01);
        return iA01 != -1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2403lN
    public final void AI1() {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2403lN
    public final int AJG(int i10) throws IOException {
        int iA00 = A00(i10);
        if (iA00 == 0) {
            byte[] bArr = this.A06;
            int bytesSkipped = this.A06.length;
            iA00 = A02(bArr, 0, Math.min(i10, bytesSkipped), 0, true);
        }
        A03(iA00);
        String[] strArr = A07;
        String str = strArr[7];
        String str2 = strArr[2];
        int length = str.length();
        int bytesSkipped2 = str2.length();
        if (length != bytesSkipped2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "4muWdj2u5Q3eId9F7O7O9kyn7QS9F70y";
        strArr2[0] = "MQBZi4ACHP4vbg8D4iuKjBQaYQ9ASuUs";
        return iA00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2403lN
    public final void AJJ(int i10) throws IOException {
        A06(i10, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2403lN, com.facebook.ads.redexgen.core.AnonymousClass20
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int bytesRead = A01(bArr, i10, i11);
        if (bytesRead == 0) {
            bytesRead = A02(bArr, i10, i11, 0, true);
        }
        A03(bytesRead);
        return bytesRead;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2403lN
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        AGh(bArr, i10, i11, false);
    }
}
