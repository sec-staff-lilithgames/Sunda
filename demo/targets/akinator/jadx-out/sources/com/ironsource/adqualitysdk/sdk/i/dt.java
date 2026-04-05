package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class dt {

    /* renamed from: 爫, reason: contains not printable characters */
    private static int f2042 = 1;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static boolean f2043;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static boolean f2044;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f2045;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static long f2046;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f2047;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static final Pattern f2048;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static final Pattern f2049;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f2050;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static final Pattern f2051;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static final List<String> f2052;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static final Pattern f2053;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static final Pattern f2054;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static final Pattern f2055;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static final Pattern f2056;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static final Pattern f2057;

    static {
        m2426();
        f2057 = Pattern.compile(m2427(null, 127 - TextUtils.getOffsetAfter("", 0), null, "\u009c\u0099\u0098\u0097\u009b\u0082\u009a\u0096\u0082\u0095\u0094\u0082\u008c\u0093\u0099\u0098\u0097\u0096\u0082\u0095\u0094\u0082\u008c\u0093\u0092").intern());
        f2056 = Pattern.compile(m2423("ဿၡ囡\ue408럭\uab6f♼ࣚ钽퉗愴₺ᤳ崨\uedeeꐂ鹊\ud892盒㥊", KeyEvent.getDeadChar(0, 0)).intern());
        f2053 = Pattern.compile(m2423("\udca5\udcfb艏䖉捆\u0a56蟽ꧣ堧ۼ삵膆햩覃䱯Ծ勐హ흓顶", View.MeasureSpec.getSize(0)).intern());
        f2054 = Pattern.compile(m2423("楘椆澡㦡軔\ude49\ufbcd緮\uedd9\ueb6f볲嗰怆搑〱턹\ue749\ue1dfꭢ", ViewConfiguration.getKeyRepeatDelay() >> 16).intern());
        f2055 = Pattern.compile(m2427(null, 127 - KeyEvent.keyCodeFromString(""), null, "\u009d\u0099\u009b\u0082\u009a\u0093\u0092").intern());
        f2048 = Pattern.compile(m2423("沙泇⏯塀슚Ñ驽ꍶ\ue85bꜽ\udd44譮旍⡛凬࿗\ue2d0귡쪃銅織㛎佱ᔱטּ멸쏖顺炔㿎䒍ᲂ췲䃀兩\ue797䤪", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1).intern());
        f2051 = Pattern.compile(m2427(null, TextUtils.getCapsMode("", 0, 0) + 127, null, "\u009e\u009e\u0092").intern());
        f2049 = Pattern.compile(m2423("\ue51b\ue545\u0011妈\ue163䀹鮨\ue3ef懟", TextUtils.indexOf("", "", 0, 0)).intern());
        f2052 = Arrays.asList(m2427(null, 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), null, "\u009f\u008e").intern(), m2427(null, 127 - TextUtils.indexOf("", "", 0), null, "\u0084\u008d \u0084").intern(), m2427(null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, null, "  ¡\u008f").intern(), m2423("\uf680\uf6f2聘\ue4e1愓옚⛉日牊қ", (-1) - ExpandableListView.getPackedPositionChild(0L)).intern(), m2423("띳뜀\ue7b4颸ۯ㙍媔関㎹", (-1) - TextUtils.lastIndexOf("", '0')).intern(), m2427(null, 127 - TextUtils.getOffsetAfter("", 0), null, "¢\u0086\u0091").intern(), m2423("췐춳谹\udc54浶展Ṽﾼ䤀", 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern());
        int i10 = f2042 + 91;
        f2047 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 24 / 0;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c4 A[SYNTHETIC] */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.ironsource.adqualitysdk.sdk.i.dx> m2424(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dt.m2424(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m2426() {
        f2043 = true;
        f2044 = true;
        f2045 = 144;
        f2050 = new char[]{205, 189, 220, 245, 264, 258, 191, 213, 255, 176, 256, 241, 259, 249, 254, 247, 260, 238, 235, 266, 209, 234, 180, 239, 237, 192, 201, 186, 187, 182, 246, 252, 261, 265};
        f2046 = 5905120210776154414L;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m2427(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (m.f3159) {
            try {
                char[] cArr2 = f2050;
                int i11 = f2045;
                if (f2044) {
                    int length = bArr.length;
                    m.f3157 = length;
                    char[] cArr3 = new char[length];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i12 = m.f3158;
                        int i13 = m.f3157 - 1;
                        int i14 = m.f3158;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f3158 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2043) {
                    int length2 = cArr.length;
                    m.f3157 = length2;
                    char[] cArr4 = new char[length2];
                    m.f3158 = 0;
                    while (m.f3158 < m.f3157) {
                        int i15 = m.f3158;
                        int i16 = m.f3157 - 1;
                        int i17 = m.f3158;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f3158 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f3157 = length3;
                char[] cArr5 = new char[length3];
                m.f3158 = 0;
                while (m.f3158 < m.f3157) {
                    int i18 = m.f3158;
                    int i19 = m.f3157 - 1;
                    int i20 = m.f3158;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f3158 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m2428(String str) {
        f2042 = (f2047 + 23) % 128;
        String strSubstring = str.substring(1, str.length() - 1);
        f2042 = (f2047 + 83) % 128;
        return strSubstring;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m2425(Pattern pattern, String str) {
        f2047 = (f2042 + 87) % 128;
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        int i10 = f2047 + 95;
        f2042 = i10 % 128;
        if (i10 % 2 != 0) {
            return str.substring(matcher.start(), matcher.end());
        }
        str.substring(matcher.start(), matcher.end());
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m2423(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (i.f2622) {
            try {
                char[] cArrM2781 = i.m2781(f2046, cArr, i10);
                i.f2623 = 4;
                while (true) {
                    int i11 = i.f2623;
                    if (i11 < cArrM2781.length) {
                        i.f2624 = i11 - 4;
                        cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f2046));
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
