package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.ads.redexgen.X.eJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1996eJ {
    public static InterfaceC09384m A06;
    public static BT A07;
    public static InterfaceC1364Ln A08;
    public static C1996eJ A09;
    public static File A0A;
    public static byte[] A0B;
    public static String[] A0C = {"4y", "AwMrvrZaA3qCUMe4DaWf", "nMell2jjCxhf1iVkS1T4", "JoDZxKxhXC6KTCYPanywHJvOgx3oSz2Q", "c4TvbpAtmy9oRzm3BRhbekxSipSfphPN", "JNxty2uNXQJQugnl9tUmEGg4l4lnFcO6", "Bo5IZ2fGdsUyi7NqIQl4cfXztCU0TldF", "nOSbM9ZPEjvtyh7HAXbSWFPDuf7zpKmZ"};
    public boolean A00;
    public final C1911cu A04;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final SparseArray<C1994eH> A02 = new SparseArray<>();
    public final Runnable A05 = new RunnableC1993eG(this);
    public final BS A03 = new CN(this);

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 5);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0B = new byte[]{11, 6, 11, 73, 82, 95, 78, 88, 116, 79, 68, 92, 69, 71, 68, 74, 79, 78, 79, 17, 55, 58, 55, 103, 114, 101, 116, 114, 121, 99, 118, 112, 114, 55, 115, 120, 96, 121, 123, 120, 118, 115, 114, 115, 45, 123, 118, 123, 40, 47, 58, 47, 62, 97, 35, 65, 122, 119, 102, 112, 57, 35, 33, 99, 120, 117, 100, 114, 33, 4, 4, 4, 4, 9, 91, 76, 88, 92, 76, 90, 93, 96, 77, 19, 25, 50, 42, 51, 49, 50, 60, 57, 56, 57, 115, 125, 14, 41, 60, 41, 56, 103, 125, 62, 9, 9, 20, 9, 85, 91, 40, 15, 26, 15, 30, 65, 91, 110, 91, 73, 81, 126, 123, 113, 104, 50, 123, 112, 104, 113, 115, 112, 126, 123, 108, 37, 32, 55, 84, 86, 84, 95, 82};
    }

    static {
        A0D();
    }

    public C1996eJ(C1911cu c1911cu, BT bt2) {
        this.A04 = c1911cu;
        if (bt2 != null) {
            A07 = bt2;
            bt2.A0F(this.A03);
        }
        A03().A0E();
    }

    public static synchronized InterfaceC09384m A01(Context context) {
        if (A06 == null) {
            A06 = new C2552no(context);
        }
        return A06;
    }

    private C10529j A02() {
        return new C10529j().A01(A08(135, 3, 65)).A00(null);
    }

    private synchronized BT A03() {
        A0E();
        return A07;
    }

    public static synchronized InterfaceC1364Ln A04(Context context) {
        if (A08 == null) {
            A08 = new C2261ir(new File(A07(context), A08(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 14, 26)), new C7R(U7.A0T(context)));
        }
        return A08;
    }

    public static C2267ix A05(C2548nk c2548nk, InterfaceC1364Ln interfaceC1364Ln) {
        return new C2267ix().A06(interfaceC1364Ln).A05(c2548nk).A04(new C2542ne()).A03(2);
    }

    public static synchronized C1996eJ A06(C1911cu c1911cu) {
        if (A09 == null) {
            A09 = new C1996eJ(c1911cu, null);
        }
        return A09;
    }

    public static synchronized File A07(Context context) {
        if (A0A == null) {
            A0A = context.getCacheDir();
            if (A0A == null) {
                A0A = context.getFilesDir();
            }
        }
        return A0A;
    }

    public static String A09(C1911cu c1911cu, Uri uri) {
        try {
            if (!U7.A1r(c1911cu)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e10) {
            c1911cu.A08().AAy(A08(138, 5, 50), AbstractC1550Sv.A0u, new C1551Sw(e10));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0A() {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1996eJ.A0A():void");
    }

    private void A0B() {
        if (!this.A00) {
            this.A00 = true;
            this.A01.post(this.A05);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A01.removeCallbacks(this.A05);
        this.A00 = false;
    }

    private synchronized void A0E() {
        if (A07 == null) {
            A07 = new BT(this.A04, A01(this.A04), A04(this.A04), A0H(this.A04), Executors.newFixedThreadPool(6));
            A07.A0F(this.A03);
        }
    }

    public final InterfaceC09484w A0H(Context context) {
        return A05(new C2548nk(context, (C5H) null, A02()), A04(context));
    }

    public final void A0I(Uri uri, InterfaceC1995eI interfaceC1995eI, long j10) {
        String cacheKey = A09(this.A04, uri);
        if (cacheKey == null) {
            cacheKey = uri.toString();
        }
        boolean zA0J = A0J(cacheKey);
        DownloadRequest downloadRequestA05 = new BW(uri.toString(), uri).A00(cacheKey).A05();
        A03().A0G(downloadRequestA05);
        this.A02.put(downloadRequestA05.A02.hashCode(), new C1994eH(interfaceC1995eI, j10, zA0J, null));
        A0B();
    }

    public final boolean A0J(String str) {
        return A04(this.A04).A74(str, 0L, 1L) > 0;
    }
}
