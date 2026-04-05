package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import com.applovin.shadow.okio.Utf8;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network.dex */
public final class FC {
    public static byte[] A0H;
    public static String[] A0I = {"rW72zgk", "C1hEbBxBlhumPMJNbyjIrBXoyDOZyeey", "ZkENgJUqZtwNap1lTYBK5Tw9wBrPiUY", "8fmzsEm", "wrUw6R", "UNvp", "7vU7fZKotBGMTNV66wYbOo96IVt1XuHJ", "PSHPw"};
    public Handler A04;
    public Pair<Long, C2614or> A05;
    public Pair<Surface, C4N> A06;
    public CopyOnWriteArrayList<InterfaceC09053f> A08;
    public boolean A0A;
    public boolean A0B;
    public final C0O A0C;
    public final FV A0D;
    public final boolean A0G;
    public final ArrayDeque<Long> A0F = new ArrayDeque<>();
    public final ArrayDeque<Pair<Long, C2614or>> A0E = new ArrayDeque<>();
    public int A00 = -1;
    public boolean A09 = true;
    public long A02 = C.TIME_UNSET;
    public C2567o4 A07 = C2567o4.A06;
    public long A03 = C.TIME_UNSET;
    public long A01 = C.TIME_UNSET;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0H = new byte[]{48, 61, 61, 62, 38, 124, 55, 35, 48, 60, 52, 124, 53, 35, 62, 33, 106, 123, 108, 104, 125, 108, 46, 36, 61, 59, 32, 44, 46, Utf8.REPLACEMENT_BYTE, 2, 37, 59, 62, Utf8.REPLACEMENT_BYTE, 24, 62, 57, 45, 42, 40, 46, 43, 41, 56, 28, 41, 34, 40, 37, 34, 43, 5, 34, 60, 57, 56, 10, 62, 45, 33, 41, 15, 35, 57, 34, 56, 95, 72, 65, 72, 76, 94, 72, 107, 124, 119, 125, 124, 107, 86, 108, 109, 105, 108, 109, 95, 107, 120, 116, 124, 123, 109, 124, 65, 102, 120, 125, 124, 78, 122, 105, 101, 109, 65, 102, 110, 103, 89, 79, 94, 101, 95, 94, 90, 95, 94, 121, 95, 88, 76, 75, 73, 79, 99, 68, 76, 69};
    }

    static {
        A02();
    }

    public FC(FV fv2, C0O c0o, boolean z10) {
        this.A0D = fv2;
        this.A0C = c0o;
        this.A0G = z10;
    }

    private void A03(long j10, boolean z10) {
        C3M.A02(null);
        throw new NullPointerException(A01(74, 17, 52));
    }

    @MetaExoPlayerCustomization("The threshold here is non configurable and too low. Our renderer stalls and gets stuck if this is too strict")
    public static boolean A04(long j10) {
        if (MetaExoPlayerUpgradeConfig.A03(EnumC2213i2.A1s)) {
            return j10 > ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT;
        }
        int releaseLowerThresholdUs = MetaExoPlayerUpgradeConfig.A00(EnumC2214i3.A08);
        int releaseUpperThresholdUs = MetaExoPlayerUpgradeConfig.A00(EnumC2214i3.A07);
        return releaseLowerThresholdUs > 0 && releaseUpperThresholdUs > 0 && j10 > ((long) releaseUpperThresholdUs) && j10 < ((long) releaseLowerThresholdUs);
    }

    public final MediaFormat A06(MediaFormat mediaFormat) {
        if (AbstractC09264a.A02 >= 29 && this.A0C.A0q.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            mediaFormat.setInteger(A01(0, 16, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), 0);
        }
        return mediaFormat;
    }

    public final Surface A07() {
        C3M.A01(null);
        throw new NullPointerException(A01(27, 15, 102));
    }

    public final void A08() {
        C3M.A01(null);
        throw new NullPointerException(A01(108, 20, 7));
    }

    public final void A09() {
        C3M.A02(null);
        throw new NullPointerException(A01(22, 5, 101));
    }

    public final void A0A() {
        C3M.A01(null);
        throw new NullPointerException(A01(67, 7, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        if (r11 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        A03(-1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
    
        if (r11 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        if (r23 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        if (r31 != r30.A0C.A0L) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        if (A04(r2) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        r30.A0D.A0G(r0);
        r2 = r30.A0D.A0B(java.lang.System.nanoTime() + (r2 * 1000));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
    
        if (r30.A0C.A28((r2 - java.lang.System.nanoTime()) / 1000, r33, r7) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        A03(-2, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ee, code lost:
    
        if (r30.A0E.isEmpty() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0102, code lost:
    
        if (r0 <= ((java.lang.Long) r30.A0E.peek().first).longValue()) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0104, code lost:
    
        r30.A05 = r30.A0E.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010e, code lost:
    
        r30.A0C.A0S(r24, r2, (com.facebook.ads.redexgen.core.C2614or) r30.A05.second, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0125, code lost:
    
        if (r30.A03 < r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0127, code lost:
    
        r30.A03 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012e, code lost:
    
        A03(r2, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0132, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(long r31, long r33) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.FC.A0B(long, long):void");
    }

    public final void A0C(Surface surface, C4N c4n) {
        if (this.A06 != null && ((Surface) this.A06.first).equals(surface) && ((C4N) this.A06.second).equals(c4n)) {
            return;
        }
        this.A06 = Pair.create(surface, c4n);
        if (A0G()) {
            C3M.A01(null);
            new C4O(surface, c4n.A03(), c4n.A02());
            throw new NullPointerException(A01(108, 20, 7));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.3g] */
    public final void A0D(C2614or c2614or) {
        C3M.A01(null);
        final int i10 = c2614or.A0L;
        final int i11 = c2614or.A0A;
        new Object(i10, i11) { // from class: com.facebook.ads.redexgen.X.3g
            public float A00 = 1.0f;
            public int A01;
            public int A02;
            public long A03;

            {
                this.A02 = i10;
                this.A01 = i11;
            }

            public final C09063g A00(float f10) {
                this.A00 = f10;
                return this;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.3h] */
            public final C09073h A01() {
                return new Object(this.A02, this.A01, this.A00, this.A03) { // from class: com.facebook.ads.redexgen.X.3h
                    public static byte[] A04;
                    public final float A00;
                    public final int A01;
                    public final int A02;
                    public final long A03;

                    static {
                        A01();
                    }

                    public static String A00(int i12, int i13, int i14) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i12, i12 + i13);
                        for (int i15 = 0; i15 < bArrCopyOfRange.length; i15++) {
                            bArrCopyOfRange[i15] = (byte) ((bArrCopyOfRange[i15] - i14) - 118);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A01() {
                        A04 = new byte[]{75, 72, 76, 74, 75, 87, 3, 80, 88, 86, 87, 3, 69, 72, 3, 83, 82, 86, 76, 87, 76, 89, 72, 15, 3, 69, 88, 87, 3, 76, 86, 29, 3, -1, -15, -20, -4, -16, -88, -11, -3, -5, -4, -88, -22, -19, -88, -8, -9, -5, -15, -4, -15, -2, -19, -76, -88, -22, -3, -4, -88, -15, -5, -62, -88};
                    }

                    {
                        C3M.A09(i > 0, A00(33, 32, 18) + i);
                        C3M.A09(i > 0, A00(0, 33, 109) + i);
                        this.A02 = i;
                        this.A01 = i;
                        this.A00 = f;
                        this.A03 = j;
                    }
                };
            }
        }.A00(c2614or.A02).A01();
        throw new NullPointerException(A01(91, 17, 37));
    }

    public final void A0E(String str) {
        this.A00 = AbstractC09264a.A09(this.A0C.A0q, str, false);
    }

    public final void A0F(List<InterfaceC09053f> list) {
        if (this.A08 == null) {
            this.A08 = new CopyOnWriteArrayList<>(list);
        } else {
            this.A08.clear();
            this.A08.addAll(list);
        }
    }

    @MetaExoPlayerCustomization("SR video effects for AV1")
    public final boolean A0G() {
        return (!this.A0G || 0 == 0 || this.A0C.A21()) ? false : true;
    }

    public final boolean A0H() {
        return this.A06 == null || !((C4N) this.A06.second).equals(C4N.A03);
    }

    public final boolean A0I() {
        return this.A0B;
    }

    public final boolean A0J(C2614or c2614or, long j10) throws C9Y {
        C3M.A08(!A0G());
        if (!this.A09) {
            return false;
        }
        if (this.A08 == null) {
            this.A09 = false;
            return false;
        }
        this.A04 = AbstractC09264a.A0Y();
        this.A0C.A26(c2614or.A0N);
        try {
            if (!C0O.A0h() && c2614or.A0F != 0) {
                CopyOnWriteArrayList<InterfaceC09053f> copyOnWriteArrayList = this.A08;
                FB.A00(c2614or.A0F);
                copyOnWriteArrayList.add(0, null);
            }
            FB.A01();
            Context unused = this.A0C.A0q;
            C3M.A01(this.A08);
            Handler handler = this.A04;
            Objects.requireNonNull(handler);
            new ExecutorC10358l(handler);
            new C2414lZ(this, c2614or);
            throw new NullPointerException(A01(16, 6, 36));
        } catch (Exception e10) {
            throw this.A0C.A1S(e10, c2614or, 7000);
        }
    }

    public final boolean A0K(C2614or c2614or, long j10, boolean z10) {
        C3M.A02(null);
        C3M.A08(this.A00 != -1);
        throw new NullPointerException(A01(42, 25, 97));
    }
}
