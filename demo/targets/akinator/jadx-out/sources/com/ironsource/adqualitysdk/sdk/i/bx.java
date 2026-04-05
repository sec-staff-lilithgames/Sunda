package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.bg;
import com.my.target.ads.Reward;
import com.my.target.common.MyTargetVersion;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class bx extends bg {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f1308 = 3893996694930472985L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1309 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static long f1310 = -275039829338753846L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f1311 = 1;

    public bx(String str) {
        super(str);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1607(Reward reward) {
        int i10 = f1311 + 71;
        f1309 = i10 % 128;
        if (i10 % 2 != 0) {
            m1609(reward);
            throw null;
        }
        String strM1609 = m1609(reward);
        int i11 = f1309 + 71;
        f1311 = i11 % 128;
        if (i11 % 2 != 0) {
            return strM1609;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1609(Reward reward) {
        int i10 = f1311 + 89;
        f1309 = i10 % 128;
        int i11 = i10 % 2;
        String str = reward.type;
        if (i11 != 0) {
            throw null;
        }
        int i12 = f1311 + 3;
        f1309 = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m1610(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (j.f2852) {
            try {
                j.f2850 = i10;
                char[] cArr2 = new char[cArr.length];
                j.f2851 = 0;
                while (true) {
                    int i11 = j.f2851;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f1310);
                        j.f2851++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0269  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo1110(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bx.mo1110(java.lang.String):java.lang.Class");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﾇ */
    public final Map<String, bg.a> mo1111() {
        HashMap map = new HashMap();
        map.put(m1610("\uf4adైհḭᜳ⠾⇁㫩㎖㒁䶵䕗幻", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 63718).intern(), new bg.a() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.a
            /* renamed from: ﻐ */
            public final Object mo1112(List<Object> list, ch chVar) {
                return bx.m1607((Reward) list.get(0));
            }
        });
        int i10 = f1309 + 97;
        f1311 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bg
    /* renamed from: ﻐ */
    public final String mo1109() {
        int i10 = f1311 + 109;
        f1309 = i10 % 128;
        try {
            try {
                return (String) (i10 % 2 != 0 ? MyTargetVersion.class.getDeclaredField(m1610("\uf49c풞뒺钪瓇哐㓢", 2973 - Drawable.resolveOpacity(0, 0)).intern()) : MyTargetVersion.class.getDeclaredField(m1610("\uf49c풞뒺钪瓇哐㓢", Drawable.resolveOpacity(0, 0) + 8209).intern())).get(null);
            } catch (Exception unused) {
                return hu.m2670().m2672().m2723(MyTargetVersion.class, m1608("\ue846\ue818䍰̵㩒먄䰭\ue87e䌬뫪䳏\ue8a5䎈뫌谽䴊", -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m1608(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f1308, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f1308));
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
}
