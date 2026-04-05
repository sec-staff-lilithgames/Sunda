package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FV {
    public static byte[] A0H;
    public static String[] A0I = {"El1apek5TdjhfhN6viIbzGI1k6A8fvYa", "7lO0T01iPA0M2Tn6ez9XJF6fi3WcV0bl", "BUJOgokLGuaRN3Jb1lPoBsNrm7KBSu3J", "mjIihJQoirK71A6rZ4qRVtTe6TTtSgwc", "PHElykquIwSutGmUMi14ryiOqojKYZje", "FFUtkd6qKeeUYHXUT7DV9hX7r9PAWeGY", "aVKnabS1yBALevTpM7jFXLX0kSbTApQh", "pYdHEl16nY3gI4cpQf6RN4y0bom4H0uh"};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Surface A0C;
    public boolean A0D;
    public final F9 A0E = new F9();
    public final FT A0F;
    public final FU A0G;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0H = new byte[]{-62, -37, -50, -49, -39, -46, -115, -31, -36, -115, -34, -30, -46, -33, -26, -115, -47, -42, -32, -35, -39, -50, -26, -115, -33, -46, -45, -33, -46, -32, -43, -115, -33, -50, -31, -46, -121, -102, -107, -106, -96, 119, -93, -110, -98, -106, -125, -106, -99, -106, -110, -92, -106, 121, -106, -99, -95, -106, -93};
    }

    static {
        A06();
    }

    public FV(Context context) {
        this.A0F = A01(context);
        this.A0G = this.A0F != null ? FU.A00() : null;
        this.A0A = C.TIME_UNSET;
        this.A0B = C.TIME_UNSET;
        this.A00 = -1.0f;
        this.A01 = 1.0f;
        this.A04 = 0;
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

    public static FT A01(Context context) {
        C2411lW c2411lWA01 = null;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (AbstractC09264a.A02 >= 17) {
            c2411lWA01 = C2411lW.A01(applicationContext);
        }
        if (c2411lWA01 == null) {
            return C2412lX.A00(applicationContext);
        }
        return c2411lWA01;
    }

    private void A03() {
        if (AbstractC09264a.A02 < 30 || this.A0C == null || this.A04 == Integer.MIN_VALUE || this.A03 == 0.0f) {
            return;
        }
        this.A03 = 0.0f;
        Surface surface = this.A0C;
        if (A0I[2].charAt(9) != 'u') {
            throw new RuntimeException();
        }
        A0I[2] = "PQOfzOqD2ukvp3odpMH5qIU7xJUCien7";
        FR.A02(surface, 0.0f);
    }

    private void A04() {
        this.A05 = 0L;
        this.A06 = -1L;
        this.A08 = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05() {
        /*
            r8 = this;
            int r0 = com.facebook.ads.redexgen.core.AbstractC09264a.A02
            r2 = 30
            if (r0 < r2) goto La
            android.view.Surface r0 = r8.A0C
            if (r0 != 0) goto Lb
        La:
            return
        Lb:
            com.facebook.ads.redexgen.X.F9 r0 = r8.A0E
            boolean r0 = r0.A06()
            if (r0 == 0) goto L20
            com.facebook.ads.redexgen.X.F9 r0 = r8.A0E
            float r4 = r0.A00()
        L19:
            float r0 = r8.A02
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L23
            return
        L20:
            float r4 = r8.A00
            goto L19
        L23:
            r7 = 1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L69
            float r0 = r8.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L69
            com.facebook.ads.redexgen.X.F9 r0 = r8.A0E
            boolean r0 = r0.A06()
            if (r0 == 0) goto L67
            com.facebook.ads.redexgen.X.F9 r0 = r8.A0E
            long r5 = r0.A03()
            r1 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L67
            r0 = 1
        L49:
            if (r0 == 0) goto L64
            r1 = 1017370378(0x3ca3d70a, float:0.02)
        L4e:
            float r0 = r8.A02
            float r0 = r4 - r0
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L62
        L5a:
            if (r7 == 0) goto L61
            r8.A02 = r4
            r8.A09(r3)
        L61:
            return
        L62:
            r7 = 0
            goto L5a
        L64:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L4e
        L67:
            r0 = 0
            goto L49
        L69:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L6f
            r7 = 1
            goto L5a
        L6f:
            com.facebook.ads.redexgen.X.F9 r0 = r8.A0E
            int r0 = r0.A01()
            if (r0 < r2) goto L78
            goto L5a
        L78:
            r7 = 0
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.FV.A05():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(Display display) {
        if (display != null) {
            double defaultDisplayRefreshRate = display.getRefreshRate();
            this.A0A = (long) (1.0E9d / defaultDisplayRefreshRate);
            this.A0B = (this.A0A * 80) / 100;
        } else {
            AnonymousClass44.A07(A02(36, 23, 19), A02(0, 36, 79));
            this.A0A = C.TIME_UNSET;
            this.A0B = C.TIME_UNSET;
        }
    }

    private void A09(boolean z10) {
        if (AbstractC09264a.A02 < 30 || this.A0C == null || this.A04 == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.A0D && this.A02 != -1.0f) {
            float f11 = this.A02;
            float surfacePlaybackFrameRate = this.A01;
            f10 = f11 * surfacePlaybackFrameRate;
        }
        if (!z10) {
            float surfacePlaybackFrameRate2 = this.A03;
            if (surfacePlaybackFrameRate2 == f10) {
                return;
            }
        }
        this.A03 = f10;
        FR.A02(this.A0C, f10);
    }

    public static boolean A0A(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    public final long A0B(long j10) {
        long j11 = j10;
        if (this.A06 != -1 && this.A0E.A06()) {
            long jA02 = this.A0E.A02();
            long frameDurationNs = this.A07;
            long j12 = this.A05;
            long adjustedReleaseTimeNs = this.A06;
            long frameDurationNs2 = frameDurationNs + ((long) (((j12 - adjustedReleaseTimeNs) * jA02) / this.A01));
            if (A0A(j11, frameDurationNs2)) {
                j11 = frameDurationNs2;
            } else {
                A04();
            }
        }
        long adjustedReleaseTimeNs2 = this.A05;
        this.A08 = adjustedReleaseTimeNs2;
        this.A09 = j11;
        if (this.A0G == null || this.A0A == C.TIME_UNSET) {
            return j11;
        }
        long j13 = this.A0G.A04;
        if (j13 == C.TIME_UNSET) {
            return j11;
        }
        long sampledVsyncTimeNs = A00(j11, j13, this.A0A);
        long adjustedReleaseTimeNs3 = this.A0B;
        return sampledVsyncTimeNs - adjustedReleaseTimeNs3;
    }

    public final void A0C() {
        A04();
    }

    public final void A0D() {
        this.A0D = true;
        A04();
        if (this.A0F != null) {
            ((FU) C3M.A01(this.A0G)).A06();
            this.A0F.AGn(new FS() { // from class: com.facebook.ads.redexgen.X.lY
                @Override // com.facebook.ads.redexgen.core.FS
                public final void ACz(Display display) {
                    this.A00.A07(display);
                }
            });
        }
        A09(false);
    }

    public final void A0E() {
        this.A0D = false;
        if (this.A0F != null) {
            this.A0F.AJl();
            ((FU) C3M.A01(this.A0G)).A07();
        }
        A03();
    }

    public final void A0F(float f10) {
        this.A00 = f10;
        this.A0E.A04();
        A05();
    }

    public final void A0G(long j10) {
        if (this.A08 != -1) {
            this.A06 = this.A08;
            this.A07 = this.A09;
        }
        this.A05++;
        this.A0E.A05(1000 * j10);
        A05();
    }
}
