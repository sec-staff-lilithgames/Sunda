package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ag implements Comparable<ag> {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f394 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f395 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f396 = 2215294167266606182L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private je f397;

    public ag(je jeVar) {
        this.f397 = jeVar;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String m680() {
        f394 = (f395 + 105) % 128;
        String strM2966 = this.f397.m2966();
        f394 = (f395 + 109) % 128;
        return strM2966;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private long m681() {
        f394 = (f395 + 19) % 128;
        long jOptLong = m687().optLong(m686("ꪏ\uaafb᧯ꗺ\ufdcc珹", Color.blue(0)).intern());
        f395 = (f394 + 69) % 128;
        return jOptLong;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private long m682() {
        JSONObject jSONObjectM687;
        int iAxisFromString;
        int i10 = f395 + 85;
        f394 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObjectM687 = m687();
            iAxisFromString = 1 >>> MotionEvent.axisFromString("");
        } else {
            jSONObjectM687 = m687();
            iAxisFromString = MotionEvent.axisFromString("") + 1;
        }
        long jOptInt = jSONObjectM687.optInt(m686("셥섀跟㇗⭺둼", iAxisFromString).intern());
        int i11 = f395 + 45;
        f394 = i11 % 128;
        if (i11 % 2 != 0) {
            return jOptInt;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static List<String> m684() {
        f394 = (f395 + 65) % 128;
        List<String> listAsList = Arrays.asList(ig.f2669);
        int i10 = f394 + 71;
        f395 = i10 % 128;
        if (i10 % 2 == 0) {
            return listAsList;
        }
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ag agVar) {
        int i10 = f394 + 63;
        f395 = i10 % 128;
        int i11 = i10 % 2;
        int iM685 = m685(agVar);
        if (i11 != 0) {
            int i12 = 43 / 0;
        }
        return iM685;
    }

    public final boolean equals(Object obj) {
        int i10 = f394;
        f395 = (i10 + 3) % 128;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        int i11 = i10 + 73;
        f395 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (ag.class != obj.getClass()) {
            return false;
        }
        return m680().equals(((ag) obj).m680());
    }

    public final int hashCode() {
        if (m687() == null) {
            int i10 = f395 + 105;
            f394 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 10 / 0;
            }
            return 0;
        }
        int i12 = f394 + 93;
        f395 = i12 % 128;
        if (i12 % 2 == 0) {
            return m687().hashCode();
        }
        m687().hashCode();
        throw null;
    }

    public final String toString() {
        int i10 = f395 + 63;
        f394 = i10 % 128;
        if (i10 % 2 == 0) {
            m687().toString();
            throw null;
        }
        String string = m687().toString();
        int i11 = f395 + 33;
        f394 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 5 / 0;
        }
        return string;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized JSONObject m687() {
        f395 = (f394 + 89) % 128;
        JSONObject jSONObjectM2967 = this.f397.m2967();
        int i10 = f394 + 99;
        f395 = i10 % 128;
        if (i10 % 2 == 0) {
            return jSONObjectM2967;
        }
        int i11 = 11 / 0;
        return jSONObjectM2967;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m688() {
        JSONObject jSONObjectM687;
        int maxKeyCode;
        int i10 = f395 + 5;
        f394 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObjectM687 = m687();
            maxKeyCode = KeyEvent.getMaxKeyCode() % 63;
        } else {
            jSONObjectM687 = m687();
            maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
        }
        return jSONObjectM687.optString(m686("ྙ\u0fe9磺쓰揽᭖ꕞ适", maxKeyCode).intern());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m690() {
        JSONObject jSONObjectM687;
        int longPressTimeout;
        int i10 = f395 + 41;
        f394 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObjectM687 = m687();
            longPressTimeout = ViewConfiguration.getLongPressTimeout() + 9;
        } else {
            jSONObjectM687 = m687();
            longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
        }
        String strOptString = jSONObjectM687.optString(m686("㖕㗠\u09ca뗅\udd2aꖂ茑", longPressTimeout).intern(), null);
        f394 = (f395 + 87) % 128;
        return strOptString;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m692(int i10) {
        try {
            f394 = (f395 + 83) % 128;
            if (this.f397.m2967() != null) {
                int i11 = f395 + 7;
                f394 = i11 % 128;
                if (i11 % 2 == 0) {
                    kc.m3181(this.f397.m2967(), i10, m684());
                    throw null;
                }
                kc.m3181(this.f397.m2967(), i10, m684());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private int m683(ag agVar) {
        f394 = (f395 + 91) % 128;
        long jM682 = m682();
        long jM6822 = agVar.m682();
        if (jM682 < jM6822) {
            return -1;
        }
        if (jM682 == jM6822) {
            return 0;
        }
        f395 = (f394 + 27) % 128;
        return 1;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private int m685(ag agVar) {
        int i10 = f394 + 91;
        f395 = i10 % 128;
        if (i10 % 2 != 0) {
            m681();
            agVar.m681();
            throw null;
        }
        long jM681 = m681();
        long jM6812 = agVar.m681();
        if (jM681 >= jM6812) {
            if (jM681 == jM6812) {
                return m683(agVar);
            }
            return 1;
        }
        int i11 = f395 + 105;
        f394 = i11 % 128;
        if (i11 % 2 != 0) {
            return -1;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m689(String str) throws JSONException {
        JSONObject jSONObjectM687;
        String strM686;
        int i10 = f395 + 101;
        f394 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                jSONObjectM687 = m687();
                strM686 = m686("㖕㗠\u09ca뗅\udd2aꖂ茑", ViewConfiguration.getMinimumFlingVelocity() << 109);
            } else {
                jSONObjectM687 = m687();
                strM686 = m686("㖕㗠\u09ca뗅\udd2aꖂ茑", ViewConfiguration.getMinimumFlingVelocity() >> 16);
            }
            jSONObjectM687.put(strM686.intern(), str);
            int i11 = f395 + 87;
            f394 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final je m691() {
        int i10 = f395;
        je jeVar = this.f397;
        int i11 = i10 + 107;
        f394 = i11 % 128;
        if (i11 % 2 != 0) {
            return jeVar;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m686(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f396, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f396));
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
