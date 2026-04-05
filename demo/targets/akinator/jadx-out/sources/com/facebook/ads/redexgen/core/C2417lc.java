package com.facebook.ads.redexgen.core;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.ads.redexgen.X.lc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2417lc {
    public static byte[] A03;
    public static String[] A04 = {"unLJAGqnT9K2C6pR52hzklfZHwTRg6Yr", "LeSEUls9Myr0akOYyr4ALINYOEymKOkL", "W8GYPv6JCblyMHrg4mb8qhrlE9HlP5p8", "LeDDfwbzgRXTDhaT1cwFWvWAB6ITTWPz", "taf7WKL89SeyG6P6BerDozU5lBYArJ2v", "", "BSTJObkWS6NqTAYjIRk7bCGrxc9Lgut2", "ohz3nwuOVveogY5495fLWWA936p3Bkwf"};
    public static final C1177Eh A05;
    public static final C1177Eh A06;
    public static final C1177Eh A07;
    public static final C1177Eh A08;
    public HandlerC1178Ei<? extends InterfaceC1179Ej> A00;
    public IOException A01;
    public final InterfaceExecutorC1195Ez A02;

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A03 = new byte[]{62, 3, 20, 43, 23, 26, 2, 30, 9, 65, 55, 20, 26, 31, 30, 9, 65};
    }

    static {
        A07();
        A07 = A01(false, C.TIME_UNSET);
        A08 = A01(true, C.TIME_UNSET);
        A05 = new C1177Eh(2, C.TIME_UNSET);
        A06 = new C1177Eh(3, C.TIME_UNSET);
    }

    @MetaExoPlayerCustomization(type = {"MERGED"})
    public C2417lc(InterfaceExecutorC1195Ez interfaceExecutorC1195Ez) {
        this.A02 = interfaceExecutorC1195Ez;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"})
    public C2417lc(String str) {
        this(AbstractC1194Ey.A00(AbstractC09264a.A0u(A06(0, 17, 64) + str), new C3X() { // from class: com.facebook.ads.redexgen.X.ld
            @Override // com.facebook.ads.redexgen.core.C3X
            public final void A31(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eg != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Ej> */
    @MetaExoPlayerCustomization("D14742363 Needed to accept supplied looper for Exo2DashLiveManifestFetcher manifest loading")
    private final <T extends InterfaceC1179Ej> long A00(Looper looper, T t10, InterfaceC1176Eg<T> interfaceC1176Eg, int i10) {
        C3M.A08(looper != null);
        this.A01 = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC1178Ei(this, looper, t10, interfaceC1176Eg, i10, jElapsedRealtime).A06(0L);
        return jElapsedRealtime;
    }

    public static C1177Eh A01(boolean z10, long j10) {
        return new C1177Eh(z10 ? 1 : 0, j10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eg != com.facebook.ads.androidx.media3.exoplayer.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Ej> */
    public final <T extends InterfaceC1179Ej> long A08(T t10, InterfaceC1176Eg<T> interfaceC1176Eg, int i10) {
        Looper looper = (Looper) C3M.A02(Looper.myLooper());
        return A00(looper, t10, interfaceC1176Eg, i10);
    }

    public final void A09() {
        ((HandlerC1178Ei) C3M.A02(this.A00)).A07(false);
    }

    public final void A0A() {
        this.A01 = null;
    }

    public final void A0B(int i10) throws IOException {
        if (this.A01 == null) {
            if (this.A00 != null) {
                HandlerC1178Ei<? extends InterfaceC1179Ej> handlerC1178Ei = this.A00;
                if (i10 == Integer.MIN_VALUE) {
                    HandlerC1178Ei<? extends InterfaceC1179Ej> handlerC1178Ei2 = this.A00;
                    String[] strArr = A04;
                    if (strArr[6].charAt(7) == strArr[1].charAt(7)) {
                        throw new RuntimeException();
                    }
                    A04[2] = "wo2YdO45DQEJfRTdGKzxAcazBLTDj4mX";
                    i10 = handlerC1178Ei2.A07;
                }
                handlerC1178Ei.A05(i10);
                return;
            }
            return;
        }
        throw this.A01;
    }

    public final void A0C(InterfaceC1180Ek interfaceC1180Ek) {
        if (this.A00 != null) {
            HandlerC1178Ei<? extends InterfaceC1179Ej> handlerC1178Ei = this.A00;
            String[] strArr = A04;
            if (strArr[5].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "XVuhTdSnDMDRP6HltjyP328n9S8al0u6";
            strArr2[0] = "1piWh3nqPhJ4K6qVEs9qRP5dHkNT6n7u";
            handlerC1178Ei.A07(true);
        }
        if (interfaceC1180Ek != null) {
            this.A02.execute(new RunnableC1181El(interfaceC1180Ek));
        }
        this.A02.AGr();
    }

    public final boolean A0D() {
        return this.A01 != null;
    }

    public final boolean A0E() {
        return this.A00 != null;
    }
}
