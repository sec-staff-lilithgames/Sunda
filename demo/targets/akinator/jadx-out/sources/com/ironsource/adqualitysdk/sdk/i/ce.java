package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementData;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.TJSplitWebView;
import com.tapjoy.Tapjoy;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ce extends bg {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1450 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1451 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f1453 = 53080;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f1455;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1456;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1452 = {'T', 15515, 31201, 46620, 62250, 12385, 27779, 43481, 59132, 8984, 24649, 40079, 55717, 5867, 21255, 36939, 52585, 'c', 15550, 31183, 46685, 62256, 12404, 27798, 43485, 59111, 8992, 24580, 40111, 55686, 5854, 21249, 36945, 52580, 2436, 18140, 33783, 49173, 64838, 14722, 30382, 46062, 61440, 11598, 27250, 'T', 15515, 31218, 46623, 62245, 12406, 27779, 43482, 59117, 9015, 24670, 40127, 55725, 5865, 21263, 'T', 15515, 31221, 46614, 62246, 12355, 27791, 43474, 59135, 'T', 15515, 31203, 46615, 62225, 12411, 27791, 43459, 'T', 15515, 31218, 46623, 62245, 12406, 27779, 43482, 59117, 9015, 24670, 40119, 55717, 5870, 21274, 36954, 52606, 2436, 18112, 'T', 15515, 31220, 46618, 62240, 12400, 27785, 43515, 59105, 9002, 24670, 40094, 55714, 5880, 21276, 33240, 48407, 63599, 14235, 29341, 45559, 60675, 10319, 26451, 41648, 57796, 7457, 22569, 38772, 53909, 4607, 19701, 34846, 51018, 618, 16822, 31948, 47112, 'T', 15515, 31203, 46615, 62225, 12411, 27791, 43459, 59074, 8970, 24680, 40073, 55717, 5881, 21257, 36954, 'T', 15515, 31203, 46596, 62245, 12391, 27778, 43508, 59133, 9003, 24664, 40094, 55714, 5886, 21271, 36979, 52601, 2450, 18118, 33766, 49210, 64832, 14724, 'c', 15550, 31183, 46685, 62256, 12404, 27798, 43485, 59111, 8992, 24580, 40111, 55686, 5838, 21278, 36947, 52601, 2453, 18149, 33766, 49206, 64883, 14751, 30370, 46063, 44027, 38696, 53834, 7615, 22708, 39912, 50969, 590, 19833, 34976, 52184, 14099, 29214, 48480, 63647, 15302, 'g', 15540, 31190, 46630, 62262, 12409, 'g', 15540, 31190, 46653, 62245, 12408, 27779, 52887, 62020, 46886, 30927, 15837, 65174, 41570, 26402, 10262, 60876, 44712, 'g', 15540, 31190, 46629, 62253, 12401, 27779, 43480, 59076, 9008, 24665, 40079, 55721, 5875, 21259, 36941, 28914, 19509, 2391, 50852, 33708, 16624, 7170, 55641, 38469, 21425, 4312, 60430, 43304, 26226, 9098, 57548, 'g', 15540, 31190, 46655, 62245, 12390, 27794, 43490, 59130, 9013};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f1454 = 5513364116228488401L;

    public ce(String str) {
        super(str);
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static TJPlacementVideoListener m1804(TJPlacement tJPlacement) {
        f1451 = (f1450 + 23) % 128;
        TJPlacementVideoListener videoListener = tJPlacement.getVideoListener();
        int i10 = f1450 + 25;
        f1451 = i10 % 128;
        if (i10 % 2 == 0) {
            return videoListener;
        }
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static String m1805(TJPlacementData tJPlacementData) {
        int i10 = f1451 + 19;
        f1450 = i10 % 128;
        int i11 = i10 % 2;
        String httpResponse = tJPlacementData.getHttpResponse();
        if (i11 == 0) {
            int i12 = 90 / 0;
        }
        int i13 = f1451 + 31;
        f1450 = i13 % 128;
        if (i13 % 2 != 0) {
            return httpResponse;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ TJPlacementListener m1806(TJPlacement tJPlacement) {
        int i10 = f1450 + 77;
        f1451 = i10 % 128;
        if (i10 % 2 != 0) {
            m1819(tJPlacement);
            throw null;
        }
        TJPlacementListener tJPlacementListenerM1819 = m1819(tJPlacement);
        int i11 = f1451 + 67;
        f1450 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 48 / 0;
        }
        return tJPlacementListenerM1819;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ TJPlacementVideoListener m1808(TJPlacement tJPlacement) {
        f1451 = (f1450 + 27) % 128;
        TJPlacementVideoListener tJPlacementVideoListenerM1804 = m1804(tJPlacement);
        f1451 = (f1450 + 65) % 128;
        return tJPlacementVideoListenerM1804;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1810(TJPlacement tJPlacement) {
        f1451 = (f1450 + 61) % 128;
        String strM1815 = m1815(tJPlacement);
        f1451 = (f1450 + 53) % 128;
        return strM1815;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1816(TJPlacementData tJPlacementData) {
        int i10 = f1450 + 95;
        f1451 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1805(tJPlacementData);
        }
        m1805(tJPlacementData);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1821(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i10 = f1450 + 75;
        f1451 = i10 % 128;
        int i11 = i10 % 2;
        m1813(tJPlacement, tJPlacementVideoListener);
        if (i11 != 0) {
            throw null;
        }
        f1450 = (f1451 + 5) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1809(TJPlacementData tJPlacementData) {
        f1450 = (f1451 + 93) % 128;
        String strM1807 = m1807(tJPlacementData);
        int i10 = f1450 + 71;
        f1451 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 34 / 0;
        }
        return strM1807;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1811(TJPlacementData tJPlacementData) {
        int i10 = f1450 + 107;
        f1451 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1820(tJPlacementData);
        }
        m1820(tJPlacementData);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1817(TJSplitWebView tJSplitWebView) {
        f1450 = (f1451 + 111) % 128;
        String strM1812 = m1812(tJSplitWebView);
        f1451 = (f1450 + 17) % 128;
        return strM1812;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1820(TJPlacementData tJPlacementData) {
        f1451 = (f1450 + 47) % 128;
        String placementName = tJPlacementData.getPlacementName();
        f1450 = (f1451 + 53) % 128;
        return placementName;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        String version;
        int i10 = f1451 + 11;
        f1450 = i10 % 128;
        if (i10 % 2 == 0) {
            version = Tapjoy.getVersion();
            int i11 = 54 / 0;
        } else {
            version = Tapjoy.getVersion();
        }
        int i12 = f1450 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f1451 = i12 % 128;
        if (i12 % 2 == 0) {
            return version;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1807(TJPlacementData tJPlacementData) {
        f1451 = (f1450 + 91) % 128;
        String url = tJPlacementData.getUrl();
        int i10 = f1450 + 61;
        f1451 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 75 / 0;
        }
        return url;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m1813(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i10 = f1451 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f1450 = i10 % 128;
        int i11 = i10 % 2;
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        if (i11 == 0) {
            throw null;
        }
        f1451 = (f1450 + 31) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static TJPlacementListener m1819(TJPlacement tJPlacement) {
        f1451 = (f1450 + 75) % 128;
        TJPlacementListener listener = tJPlacement.getListener();
        f1450 = (f1451 + 9) % 128;
        return listener;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:89:0x043f  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo1110(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 1314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ce.mo1110(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1814((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 43932), 16 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 198).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return ce.m1811((TJPlacementData) list.get(0));
            }
        });
        map.put(m1814((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6, (ViewConfiguration.getLongPressTimeout() >> 16) + Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return ce.m1809((TJPlacementData) list.get(0));
            }
        });
        map.put(m1818("곌鐎ﮂ㛧", (char) ((Process.myTid() >> 22) + 59387), "채떫䲕튱ٛ왲춤ȓ\uf021⦪ጇɹ魰썪ཪ", (-2104226133) - ImageFormat.getBitsPerPixel(0), "\u0000\u0000\u0000\u0000").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return ce.m1816((TJPlacementData) list.get(0));
            }
        });
        map.put(m1814((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return ce.m1810((TJPlacement) list.get(0));
            }
        });
        map.put(m1814((char) ((ViewConfiguration.getTapTimeout() >> 16) + 52976), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, Process.getGidForName("") + 228).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return ce.m1806((TJPlacement) list.get(0));
            }
        });
        map.put(m1814((char) View.MeasureSpec.makeMeasureSpec(0, 0), View.resolveSize(0, 0) + 16, Process.getGidForName("") + 239).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return ce.m1808((TJPlacement) list.get(0));
            }
        });
        map.put(m1814((char) (28801 - ExpandableListView.getPackedPositionType(0L)), 16 - TextUtils.indexOf("", ""), 254 - Gravity.getAbsoluteGravity(0, 0)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                ce.m1821((TJPlacement) list.get(0), (TJPlacementVideoListener) list.get(1));
                return null;
            }
        });
        map.put(m1814((char) (AndroidCharacter.getMirror('0') - '0'), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9, 270 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.ce.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return ce.m1817((TJSplitWebView) list.get(0));
            }
        });
        int i10 = f1451 + 91;
        f1450 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1812(TJSplitWebView tJSplitWebView) {
        int i10 = f1450 + 87;
        f1451 = i10 % 128;
        if (i10 % 2 != 0) {
            tJSplitWebView.getLastUrl();
            throw null;
        }
        String lastUrl = tJSplitWebView.getLastUrl();
        f1451 = (f1450 + 49) % 128;
        return lastUrl;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1815(TJPlacement tJPlacement) {
        int i10 = f1451 + 27;
        f1450 = i10 % 128;
        int i11 = i10 % 2;
        String name = tJPlacement.getName();
        if (i11 == 0) {
            int i12 = 59 / 0;
        }
        return name;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1818(String str, char c10, String str2, int i10, String str3) {
        String str4;
        char[] charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = charArray;
        char[] charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = charArray3;
        synchronized (f.f2212) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                f.f2213 = 0;
                while (true) {
                    int i11 = f.f2213;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2211 = c12;
                        cArr5[i13] = (char) e3.g.e(cArr4[i13], 32718, c11, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c12;
                        int i15 = f.f2213;
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f1456) ^ f1455) ^ f1453);
                        f.f2213 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1814(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f1452[i11 + i12] ^ (i12 * f1454)) ^ c10);
                        c.f1374 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
