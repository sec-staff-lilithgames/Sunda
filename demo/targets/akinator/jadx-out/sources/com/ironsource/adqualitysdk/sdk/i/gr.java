package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.ironsource.mediationsdk.IronSource;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class gr extends gk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2392 = {'c', 'o', GMTDateParser.MINUTES, '.', 'i', 'r', 'n', GMTDateParser.SECONDS, AbstractJsonLexerKt.UNICODE_ESC, 'e', GMTDateParser.DAY_OF_MONTH, 'a', 't', 'k', 'I', 'S'};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f2393 = 4;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2394 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2395;

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻐ */
    public final String mo2524() {
        f2394 = (f2395 + 17) % 128;
        String strIntern = m2554(10 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) (66 - KeyEvent.normalizeMetaState(0)), "\u0005\u0006\u0002\u0005\u0005\u0003\t\u0004\u0001\b").intern();
        int i10 = f2395 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2394 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﻛ */
    public final Class mo2525() {
        f2394 = (f2395 + 71) % 128;
        return IronSource.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾇ */
    public final bg mo2526() {
        bw bwVar = new bw(mo2524());
        int i10 = f2395 + 87;
        f2394 = i10 % 128;
        if (i10 % 2 != 0) {
            return bwVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gk
    /* renamed from: ﾒ */
    public final String mo2527() {
        int fadingEdgeLength;
        int iMyTid;
        int i10 = f2395 + 77;
        f2394 = i10 % 128;
        if (i10 % 2 == 0) {
            fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() / 67) + 105;
            iMyTid = 58 - (Process.myTid() * 126);
        } else {
            fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 38;
            iMyTid = 46 - (Process.myTid() >> 22);
        }
        String strIntern = m2554(fadingEdgeLength, (byte) iMyTid, "\u0001\u0002\u0003\u0000\u0005\u0006\u0002\u0005\u0005\u0003\t\u0004\u0001\b\u0000\u0003\n\u000b\u0007\b\u0000\b\u0002\u0005\u0006\u000b\u000f\u0001\r\u0006\u0002\u0005\r\u0003\t\u0004\u0001\b").intern();
        int i11 = f2395 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f2394 = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2554(int i10, byte b10, String str) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (h.f2445) {
            try {
                char[] cArr2 = f2392;
                char c10 = f2393;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    h.f2448 = 0;
                    while (true) {
                        int i11 = h.f2448;
                        if (i11 >= i10) {
                            break;
                        }
                        h.f2450 = cArr[i11];
                        h.f2449 = cArr[h.f2448 + 1];
                        if (h.f2450 == h.f2449) {
                            cArr3[h.f2448] = (char) (h.f2450 - b10);
                            cArr3[h.f2448 + 1] = (char) (h.f2449 - b10);
                        } else {
                            h.f2447 = h.f2450 / c10;
                            h.f2444 = h.f2450 % c10;
                            h.f2446 = h.f2449 / c10;
                            h.f2443 = h.f2449 % c10;
                            if (h.f2444 == h.f2443) {
                                h.f2447 = e3.g.x(h.f2447, c10, 1, c10);
                                h.f2446 = e3.g.x(h.f2446, c10, 1, c10);
                                int i12 = (h.f2447 * c10) + h.f2444;
                                int i13 = (h.f2446 * c10) + h.f2443;
                                int i14 = h.f2448;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (h.f2447 == h.f2446) {
                                h.f2444 = e3.g.x(h.f2444, c10, 1, c10);
                                h.f2443 = e3.g.x(h.f2443, c10, 1, c10);
                                int i15 = (h.f2447 * c10) + h.f2444;
                                int i16 = (h.f2446 * c10) + h.f2443;
                                int i17 = h.f2448;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (h.f2447 * c10) + h.f2443;
                                int i19 = (h.f2446 * c10) + h.f2444;
                                int i20 = h.f2448;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        h.f2448 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
