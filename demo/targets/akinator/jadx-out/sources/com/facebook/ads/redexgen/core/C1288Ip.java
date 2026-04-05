package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
/* renamed from: com.facebook.ads.redexgen.X.Ip, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1288Ip {
    public static String[] A08 = {"AtxLAVOLIQu", "Fle8gwQlySsExFOL9KX8wb0v", "wFpk", "KqR90lH25ch62x6cAj66e37DOVxg4eZG", "XchR4DYnLnD3gtwkslZg", "tO3f9MPY4MkMP3", "", "TthioVfwXchWaR6I8DsFZ4y13Jptm90E"};
    public final int A00;
    public final int A01;
    public final long A02;
    public final C1285Im A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public C1288Ip(C1285Im c1285Im, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        C3M.A07(iArr.length == jArr2.length);
        C3M.A07(jArr.length == jArr2.length);
        C3M.A07(iArr2.length == jArr2.length);
        this.A03 = c1285Im;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i10;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j10;
        this.A01 = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int A00(long j10) {
        for (int iA0L = AbstractC09264a.A0L(this.A07, j10, true, false); iA0L >= 0; iA0L--) {
            int i10 = this.A04[iA0L] & 1;
            int i11 = A08[1].length();
            if (i11 == 25) {
                throw new RuntimeException();
            }
            A08[1] = "GcE";
            if (i10 != 0) {
                return iA0L;
            }
        }
        return -1;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A01(long r4) {
        /*
            r3 = this;
            long[] r1 = r3.A07
            r0 = 0
            r2 = 1
            int r1 = com.facebook.ads.redexgen.core.AbstractC09264a.A0K(r1, r4, r2, r0)
        L8:
            long[] r0 = r3.A07
            int r0 = r0.length
            if (r1 >= r0) goto L18
            int[] r0 = r3.A04
            r0 = r0[r1]
            r0 = r0 & r2
            if (r0 == 0) goto L15
            return r1
        L15:
            int r1 = r1 + 1
            goto L8
        L18:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1288Ip.A01(long):int");
    }
}
