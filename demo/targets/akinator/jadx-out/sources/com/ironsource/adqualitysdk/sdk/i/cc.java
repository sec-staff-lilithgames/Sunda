package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.persistence.Repository;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class cc extends bg {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1428 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1429 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f1430 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f1431 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f1432 = 21465;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f1433 = -4595895092544068391L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f1434;

    public cc(String str) {
        super(str);
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static Class m1782() {
        int i10 = f1428;
        f1429 = (i10 + 43) % 128;
        int i11 = i10 + 1;
        f1429 = i11 % 128;
        if (i11 % 2 != 0) {
            return VungleApiClient.class;
        }
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static Map<String, String> m1783(Advertisement advertisement) {
        int i10 = f1428 + 85;
        f1429 = i10 % 128;
        if (i10 % 2 == 0) {
            advertisement.getDownloadableUrls();
            throw null;
        }
        Map<String, String> downloadableUrls = advertisement.getDownloadableUrls();
        int i11 = f1428 + 97;
        f1429 = i11 % 128;
        if (i11 % 2 != 0) {
            return downloadableUrls;
        }
        throw null;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static String m1784() {
        f1429 = (f1428 + 7) % 128;
        Class clsM1782 = m1782();
        hu.m2670().m2673();
        try {
            Iterator<Field> it = hu.m2670().m2673().m2615(clsM1782, hn.m2609().m2607(String.class).m2605(8).m2606(16).m2604()).iterator();
            while (it.hasNext()) {
                f1429 = (f1428 + 101) % 128;
                String str = (String) it.next().get(null);
                if (!str.startsWith(m1788("奈挩柛倚", (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), "\uef0d⣐쐒\ued87ò\ud82bꛣ\ue2de늒憸ꐸꍴ", Process.myPid() >> 22, "\u0000\u0000\u0000\u0000").intern())) {
                    int i10 = f1429 + 73;
                    f1428 = i10 % 128;
                    if (i10 % 2 != 0) {
                        if (str.startsWith(m1788("\u20c5鮏ﶻ揾", (char) (PointF.length(1.0f, 0.0f) > 0.0f ? 1 : (PointF.length(1.0f, 0.0f) == 0.0f ? 0 : -1)), "\uea8d츋팵퐜텶킝䝕⓱㬊漨组", ImageFormat.getBitsPerPixel(0) - 1147433183, "\u0000\u0000\u0000\u0000").intern())) {
                        }
                    } else if (str.startsWith(m1788("\u20c5鮏ﶻ揾", (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\uea8d츋팵퐜텶킝䝕⓱㬊漨组", ImageFormat.getBitsPerPixel(0) - 1147433183, "\u0000\u0000\u0000\u0000").intern())) {
                    }
                }
                return str.split(m1788("ᨿՂ╆‟", (char) (7973 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), "ᙰ", (Process.myTid() >> 22) + 1174749722, "\u0000\u0000\u0000\u0000").intern())[0];
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1785(Advertisement advertisement) {
        int i10 = f1429 + 63;
        f1428 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1789(advertisement);
        }
        m1789(advertisement);
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m1790(Placement placement) {
        f1428 = (f1429 + 79) % 128;
        boolean zIsIncentivized = placement.isIncentivized();
        int i10 = f1428 + 53;
        f1429 = i10 % 128;
        if (i10 % 2 != 0) {
            return zIsIncentivized;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Placement m1791(Repository repository, String str) {
        int i10 = f1428 + 37;
        f1429 = i10 % 128;
        int i11 = i10 % 2;
        Placement placementM1786 = m1786(repository, str);
        if (i11 == 0) {
            int i12 = 11 / 0;
        }
        return placementM1786;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Map m1794(Advertisement advertisement) {
        f1429 = (f1428 + 85) % 128;
        Map<String, String> mapM1783 = m1783(advertisement);
        int i10 = f1429 + 19;
        f1428 = i10 % 128;
        if (i10 % 2 == 0) {
            return mapM1783;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    public final String mo1165() {
        f1429 = (f1428 + 75) % 128;
        if (this.f1434 == null) {
            String strM1784 = m1784();
            this.f1434 = strM1784;
            m1172(strM1784);
            f1428 = (f1429 + 47) % 128;
        }
        return this.f1434;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1789(Advertisement advertisement) {
        int i10 = f1429 + 77;
        f1428 = i10 % 128;
        int i11 = i10 % 2;
        String campaign = advertisement.getCampaign();
        if (i11 != 0) {
            int i12 = 78 / 0;
        }
        return campaign;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1792(Advertisement advertisement) {
        int i10 = f1428 + 93;
        f1429 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1787(advertisement);
        }
        m1787(advertisement);
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1795(Placement placement) {
        f1429 = (f1428 + 101) % 128;
        boolean zM1790 = m1790(placement);
        int i10 = f1429 + 33;
        f1428 = i10 % 128;
        if (i10 % 2 == 0) {
            return zM1790;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        String strMo1165;
        int i10 = f1428 + 47;
        f1429 = i10 % 128;
        if (i10 % 2 == 0) {
            strMo1165 = mo1165();
            int i11 = 43 / 0;
            if (strMo1165 == null) {
                return null;
            }
        } else {
            strMo1165 = mo1165();
            if (strMo1165 == null) {
                return null;
            }
        }
        String str = strMo1165.split(m1793("\ued05\ued2a\ue701갶\ue56f", (-16777215) - Color.rgb(0, 0, 0)).intern())[1];
        int i12 = f1428 + 95;
        f1429 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 25 / 0;
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1793("豊谭榪䴖驮펨\ue307跜ὂ\uf54a䜛\ue28dꫯے\uea7a瘠", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return cc.m1791((Repository) list.get(0), (String) list.get(1));
            }
        });
        map.put(m1793("㪡㫈됒邸ᖵ屎霦遼ꦦ⣠죍隽ᰀ\udb6f斦ȏ胨俙", View.combineMeasuredStates(0, 0) + 1).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return Boolean.valueOf(cc.m1795((Placement) list.get(0)));
            }
        });
        map.put(m1788("Ԏຌ녲ꏩ", (char) (KeyEvent.keyCodeFromString("") + 59825), "\u1757퉼用枰በ簼碹蕙낱Λ푸\ue3a7㠈", TextUtils.lastIndexOf("", '0', 0, 0) + 1913555974, "\u0000\u0000\u0000\u0000").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return cc.m1792((Advertisement) list.get(0));
            }
        });
        map.put(m1788("\ua6fd댘⩫ⵅ", (char) View.getDefaultSize(0, 0), "ᴤ⛮찈甉㘃鬂ᚷ灏ၚ蛐뱝", 1806899366 - Color.alpha(0), "\u0000\u0000\u0000\u0000").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return cc.m1785((Advertisement) list.get(0));
            }
        });
        map.put(m1788("㥋鈻흍멸", (char) (30935 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "\ud83c씯겞᳞鹅㺶␟罱峯ဆ\udd35鞼꺵⯴楙\u0b4e\uf298좶䇟", 1301429049 - KeyEvent.keyCodeFromString(""), "\u0000\u0000\u0000\u0000").intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return cc.m1794((Advertisement) list.get(0));
            }
        });
        int i10 = f1428 + 105;
        f1429 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0483 A[RETURN] */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo1110(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.mo1110(java.lang.String):java.lang.Class");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1793(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f1433, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f1433));
                        i.f2623 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2781, 4, cArrM2781.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1787(Advertisement advertisement) {
        int i10 = f1429 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f1428 = i10 % 128;
        if (i10 % 2 == 0) {
            return advertisement.getAdMarketId();
        }
        advertisement.getAdMarketId();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Placement m1786(Repository repository, String str) {
        int i10 = f1429 + 25;
        f1428 = i10 % 128;
        if (i10 % 2 == 0) {
            return (Placement) repository.load(str, Placement.class).get();
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m1788(String str, char c10, String str2, int i10, String str3) {
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
                        cArr6[i15] = (char) ((((c12 ^ cArr2[i15]) ^ f1431) ^ f1430) ^ f1432);
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
}
