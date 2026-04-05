package com.facebook.ads.redexgen.core;

import android.provider.Settings;
import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.ev, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2034ev {
    public static InterfaceC2014eb A00;
    public static byte[] A01;
    public static final Set<String> A02;
    public static final Set<String> A03;
    public static final AtomicBoolean A04;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{51, 114, 121, 9, 84, 69, 113, 55, 55, 120, 5, 112, 1, 25, 51, 18, 114, 47, 24, 117, 44, 46, 36, 43, 114, 40, 55, 48, 114, 21, 47, 51, 43, 125, 74, Utf8.REPLACEMENT_BYTE, 96, 71, 122, 102, 66, AbstractJsonLexerKt.TC_INVALID, 106, 97, 126, 98, 39, 91, 97, 106, 72, 100, 122, 126, 62, 101, 90, 100, 35, 117, 94, AbstractJsonLexerKt.TC_INVALID, 49, 6, 81, 35, 43, 66, 103, 86, 39, 106, 95, 80, 119, AbstractJsonLexerKt.TC_INVALID, 122, 39, 97, 99, 103, 106, 98, 82, 86, 112, 105, 75, 92, 118, 82, 46, 25, 88, 115, 98, 97, 121, 100, 125, AbstractJsonLexerKt.TC_INVALID, 120, 113, 54, 116, 115, 112, 121, 100, 115, 54, AbstractJsonLexerKt.TC_INVALID, 120, AbstractJsonLexerKt.TC_INVALID, 98, 55, 83, 81, 83, 66, 61, 106, 101, 81, 105, 111, 64, 109, 32, AbstractJsonLexerKt.TC_INVALID, 106, 94, 89, 111, 101, 114, 94, 67, 62, 98, 123, 108, 70, 54, 1, 15, 7, 28, 30, 2, 15, 0, 11, 49, 3, 1, 10, 11, 49, 1, 0, 29, 22, 7, 4, 28, 1, 24, 33, 58, 15, 103, 18, 7, 59, 7, Utf8.REPLACEMENT_BYTE, 22, 108, 5, 96, 3, 3, 0, 49, 22, 37, 26, 39, 19, 29, 109, 57, 51, 4, 104, 95};
    }

    static {
        A07();
        A02 = new HashSet();
        A03 = new HashSet();
        A02.add(A05(6, 29, 93));
        A03.add(A05(168, 29, 72));
        A03.add(A05(35, 29, 17));
        A03.add(A05(64, 29, 14));
        A03.add(A05(116, 29, 22));
        A04 = new AtomicBoolean();
    }

    public static InterfaceC2016ed A00(SQ sq2) {
        return A03(true, sq2);
    }

    public static InterfaceC2016ed A01(SQ sq2) {
        return A02(true, sq2);
    }

    public static InterfaceC2016ed A02(boolean z10, SQ sq2) {
        C2020eh c2020eh = new C2020eh();
        C2023ek networkModuleRequestConfigurationBuilder = A04(sq2);
        if (!A0B(sq2)) {
            c2020eh.A02(A03);
            c2020eh.A01(A02);
        }
        if (WS.A04()) {
            networkModuleRequestConfigurationBuilder.A08(WS.A02());
        }
        CI ciA00 = AbstractC2018ef.A00();
        C2020eh networkModuleConfigurationBuilder = c2020eh.A00(networkModuleRequestConfigurationBuilder.A09());
        return ciA00.A00(networkModuleConfigurationBuilder.A03(z10).A04(sq2.A05().AAF()).A05(), sq2.A08(), XU.A01());
    }

    public static InterfaceC2016ed A03(boolean z10, SQ sq2) {
        return AbstractC2018ef.A00().A00(new C2020eh().A03(z10).A00(A04(sq2).A09()).A04(sq2.A05().AAF()).A05(), sq2.A08(), XU.A01());
    }

    public static C2023ek A04(SQ sq2) {
        A08(sq2);
        C2023ek c2023ek = new C2023ek();
        if (A0B(sq2) || WS.A04()) {
            c2023ek.A02(360000).A04(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        } else {
            c2023ek.A02(U7.A09(sq2)).A04(U7.A0B(sq2));
        }
        c2023ek.A03(U7.A0A(sq2)).A05(U7.A0C(sq2)).A06(U7.A0D(sq2));
        synchronized (C2034ev.class) {
            if (A00 != null && (A00 instanceof InterfaceC2014eb)) {
                c2023ek.A07(A00);
            }
        }
        return c2023ek;
    }

    public static void A06() {
        A04.set(true);
    }

    public static void A08(SQ sq2) {
        if (!A04.get()) {
            sq2.A08().AAy(A05(161, 7, 110), AbstractC1550Sv.A21, new C1551Sw(A05(93, 23, 11)));
        }
    }

    public static synchronized void A09(InterfaceC2014eb interfaceC2014eb) {
        A00 = interfaceC2014eb;
    }

    public static boolean A0A(SQ sq2) {
        return Settings.Global.getInt(sq2.getContentResolver(), A05(145, 16, 115), 0) != 0;
    }

    public static boolean A0B(SQ sq2) {
        String strA9I = sq2.A05().A9I();
        if (!TextUtils.isEmpty(strA9I)) {
            String urlPrefix = A05(3, 3, 58);
            if (!strA9I.endsWith(urlPrefix)) {
                String urlPrefix2 = A05(0, 3, 0);
                if (strA9I.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}
