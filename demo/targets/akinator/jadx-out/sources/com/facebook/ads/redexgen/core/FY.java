package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.shadow.okio.Utf8;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FY {
    public static byte[] A0C;
    public static String[] A0D = {"vrjy3LPqmZ4VYL", "kldC8xOSHjGgI0Rq8UB5uDItbCAb4yeD", "ZtlkL6mqEDvYXWdJ148AMfPypAXzloX0", "vv3uN80MDVvh0kr3i18f6F5St9zthXAP", "5vSY45XZaWTc5ARQpJ6MABJkKRGBO5p9", "E4RES2qVkVhri6POLSj0lZrJ1TN13SFq", "ZPGU8CInoZ6FL7owV0UYW5v36RZ6UHPP", "wFHJA8K1ufuqr0OxwfXIZVwS7Glp9Dxp"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final FW A0A;
    public final FX A0B;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{108, 97, 123, 120, 100, 105, 113, 38, 56, Utf8.REPLACEMENT_BYTE, 53, 62, 38};
    }

    static {
        A04();
    }

    public FY() {
        this(null);
    }

    public FY(Context context) {
        if (context != null) {
            this.A09 = (WindowManager) context.getSystemService(A02(7, 6, 32));
        } else {
            this.A09 = null;
        }
        if (this.A09 != null) {
            this.A0A = AbstractC09264a.A02 >= 17 ? A01(context) : null;
            this.A0B = FX.A00();
        } else {
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = C.TIME_UNSET;
        this.A07 = C.TIME_UNSET;
    }

    public static long A00(long j10, long j11, long j12) {
        long j13;
        long vsyncCount = j12 * ((j10 - j11) / j12);
        long j14 = j11 + vsyncCount;
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j13 = j14;
            j14 += j12;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private FW A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, Sdk.SDKError.Reason.TPAT_ERROR_VALUE));
        if (displayManager == null) {
            return null;
        }
        return new FW(this, displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            this.A06 = (long) (1.0E9d / defaultDisplay.getRefreshRate());
            this.A07 = (this.A06 * 80) / 100;
        }
    }

    private boolean A06(long j10, long j11) {
        long j12 = j10 - this.A04;
        long elapsedFrameTimeNs = this.A05;
        return Math.abs((j11 - elapsedFrameTimeNs) - j12) > 20000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A07(long r19, long r21) {
        /*
            r18 = this;
            r12 = r18
            r6 = 1000(0x3e8, double:4.94E-321)
            r10 = r19
            long r6 = r6 * r10
            r14 = r6
            r8 = r21
            r2 = r8
            boolean r0 = r12.A08
            if (r0 == 0) goto L3d
            long r0 = r12.A02
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 == 0) goto L20
            long r0 = r12.A01
            r4 = 1
            long r0 = r0 + r4
            r12.A01 = r0
            long r0 = r12.A03
            r12.A00 = r0
        L20:
            long r0 = r12.A01
            r16 = 6
            r13 = 0
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 < 0) goto L7b
            long r0 = r12.A04
            long r16 = r6 - r0
            long r0 = r12.A01
            long r16 = r16 / r0
            long r4 = r12.A00
            long r4 = r4 + r16
            boolean r0 = r12.A06(r4, r8)
            if (r0 == 0) goto L60
            r12.A08 = r13
        L3d:
            boolean r0 = r12.A08
            if (r0 != 0) goto L4c
            r12.A04 = r6
            r12.A05 = r8
            r0 = 0
            r12.A01 = r0
            r0 = 1
            r12.A08 = r0
        L4c:
            r12.A02 = r10
            r12.A03 = r14
            com.facebook.ads.redexgen.X.FX r0 = r12.A0B
            if (r0 == 0) goto L5f
            long r4 = r12.A06
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L9c
        L5f:
            return r2
        L60:
            long r2 = r12.A05
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.FY.A0D
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 4
            if (r1 == r0) goto Lb2
            java.lang.String[] r13 = com.facebook.ads.redexgen.core.FY.A0D
            java.lang.String r1 = "LxalG4mHATb18PeqaNeAayN2I9HozhV7"
            r0 = 2
            r13[r0] = r1
            long r2 = r2 + r4
            long r0 = r12.A04
            long r2 = r2 - r0
            r14 = r4
            goto L3d
        L7b:
            boolean r5 = r12.A06(r6, r8)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.FY.A0D
            r0 = 2
            r1 = r1[r0]
            r0 = 6
            char r1 = r1.charAt(r0)
            r0 = 109(0x6d, float:1.53E-43)
            if (r1 == r0) goto L92
            if (r5 == 0) goto L3d
        L8f:
            r12.A08 = r13
            goto L3d
        L92:
            java.lang.String[] r4 = com.facebook.ads.redexgen.core.FY.A0D
            java.lang.String r1 = "QXST6c0zZjLjc8mFjZqys1TY6ZZx4"
            r0 = 0
            r4[r0] = r1
            if (r5 == 0) goto L3d
            goto L8f
        L9c:
            com.facebook.ads.redexgen.X.FX r0 = r12.A0B
            long r4 = r0.A04
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto La5
            return r2
        La5:
            long r0 = r12.A06
            r10 = r0
            r6 = r2
            r8 = r4
            long r2 = A00(r6, r8, r10)
            long r0 = r12.A07
            long r2 = r2 - r0
            return r2
        Lb2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.FY.A07(long, long):long");
    }

    public final void A08() {
        if (this.A09 != null) {
            if (this.A0A != null) {
                this.A0A.A01();
            }
            this.A0B.A07();
        }
    }

    public final void A09() {
        this.A08 = false;
        if (this.A09 != null) {
            this.A0B.A06();
            if (this.A0A != null) {
                this.A0A.A00();
            }
            A03();
        }
    }
}
