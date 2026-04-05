package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ay {

    /* renamed from: טּ, reason: contains not printable characters */
    private static int f790 = 1;

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f791;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String f800;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String f801;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String f802;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f803;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f804;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f805;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f796 = {19090, 6193, 61382, 48493, ';', 55258, 42339, 45813, 57424, 6066, 17672, 63571, 12213, 23812, 61549, 53231, 40230, 27312, 'W', 21197, 42290, 63406, 19145, 40237, 61319, 'A', 21196, 42241, 63373, 19137, 40228, 61337, 17132, 38201, 59323, 15060, 36211, GMTDateParser.MONTH, 21197, 42275, 63371, 19137, 40239, 61333, 17058, 38240, '-', 21125, 42365, 63445, 19085, 40293, 61405, 17077, 38253, 59333, 15037, 36117, 57293, 12965, 34064, 1229, 9374, 30262, 33230, 54118, 28222, 47574, 52078, 26118, 45534, 50038, 7694, 43430, 64382, 5654, 'N', 21191, 42276, 63448, 19142, 40237, 61316, 17147, 38184, 59277, 15092, 1276, 22055, 41416, 62319, 20060, 39394, 60233, 17974, 37359, 58205, 15907, 35210, 56070, 13940, 53037, 40403, 27256, 14499, 34284, 21003, 8408, 36326, 23085, 10386, 62955, 16985, 4231, 65006, 18968, 6389, 58875, 45568, 177, 60675, 47624, 2222, 54551, 41572, 28904, 56601, 43645, 30916, 50504, 37491, 24781, 52512, 39544, 26831, 13610, 33668, 20685, 15652, 35800, 22770, 9521, 62400, 16620, 11608, 64397, 18592, 5467, 58303, 45286, 7502, 60349, 47123, 1372, 54191, 40970};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static long f797 = 6357781148853883560L;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static char f792 = 62020;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static char f795 = 40828;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static char f793 = 61676;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static char f794 = 40629;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private a f799 = a.f817;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private d f798 = d.f830;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ay$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: ﻐ, reason: contains not printable characters */
        static final /* synthetic */ int[] f806;

        /* renamed from: ｋ, reason: contains not printable characters */
        static final /* synthetic */ int[] f807;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            f807 = iArr;
            try {
                iArr[d.f823.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f807[d.f829.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f807[d.f827.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f807[d.f826.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f807[d.f828.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[a.valuesCustom().length];
            f806 = iArr2;
            try {
                iArr2[a.f814.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f806[a.f813.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f806[a.f816.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f806[a.f809.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f806[a.f815.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        f817,
        f814,
        f813,
        f816,
        f815,
        f809;


        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f808 = 0;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f811 = 0;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f812 = 1;

        static {
            m1036();
            f808 = (f812 + 79) % 128;
        }

        public static a valueOf(String str) {
            int i10 = f812 + 99;
            f808 = i10 % 128;
            int i11 = i10 % 2;
            a aVar = (a) Enum.valueOf(a.class, str);
            if (i11 != 0) {
                int i12 = 63 / 0;
            }
            return aVar;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            f808 = (f812 + 27) % 128;
            a[] aVarArr = (a[]) values().clone();
            f812 = (f808 + 13) % 128;
            return aVarArr;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public static void m1036() {
            f811 = 77;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m1037(int i10, int i11, String str, int i12, boolean z10) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (e.f2108) {
                try {
                    char[] cArr2 = new char[i11];
                    e.f2107 = 0;
                    while (true) {
                        int i13 = e.f2107;
                        if (i13 >= i11) {
                            break;
                        }
                        e.f2110 = cArr[i13];
                        cArr2[e.f2107] = (char) (e.f2110 + i10);
                        int i14 = e.f2107;
                        cArr2[i14] = (char) (cArr2[i14] - f811);
                        e.f2107 = i14 + 1;
                    }
                    if (i12 > 0) {
                        e.f2109 = i12;
                        char[] cArr3 = new char[i11];
                        System.arraycopy(cArr2, 0, cArr3, 0, i11);
                        int i15 = e.f2109;
                        System.arraycopy(cArr3, 0, cArr2, i11 - i15, i15);
                        int i16 = e.f2109;
                        System.arraycopy(cArr3, i16, cArr2, 0, i11 - i16);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i11];
                        e.f2107 = 0;
                        while (true) {
                            int i17 = e.f2107;
                            if (i17 >= i11) {
                                break;
                            }
                            cArr4[i17] = cArr2[(i11 - i17) - 1];
                            e.f2107 = i17 + 1;
                        }
                        cArr2 = cArr4;
                    }
                    str2 = new String(cArr2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum d {
        f830,
        f829,
        f827,
        f826,
        f828,
        f823;


        /* renamed from: ﭖ, reason: contains not printable characters */
        private static int f818 = 1;

        /* renamed from: ﭸ, reason: contains not printable characters */
        private static int f819;

        /* renamed from: ﮉ, reason: contains not printable characters */
        private static boolean f820;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static char[] f822;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static boolean f824;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f825;

        static {
            m1038();
            int i10 = f819 + 51;
            f818 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public static d valueOf(String str) {
            f818 = (f819 + 75) % 128;
            d dVar = (d) Enum.valueOf(d.class, str);
            f818 = (f819 + 29) % 128;
            return dVar;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            f819 = (f818 + 3) % 128;
            d[] dVarArr = (d[]) values().clone();
            f818 = (f819 + 31) % 128;
            return dVarArr;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public static void m1038() {
            f824 = true;
            f820 = true;
            f825 = ModuleDescriptor.MODULE_VERSION;
            f822 = new char[]{233, 234, 224, 242, 237, 250, 220, 226, 239, 236, 240, 228, 223, 238, 235, 230, 241, 231, 245, 225, 222};
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m1039(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f822;
                    int i11 = f825;
                    if (f820) {
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
                    if (f824) {
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
    }

    public ay(String str) {
        this.f803 = str;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private String m1023() {
        int i10 = f790 + 3;
        f791 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.f801 == null || this.f805 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m1030("겚\ue741滚⋑䈁\udfe8゛\uef00\uf21e\ude9d꼩㥨\ude3a\ue96f듋\ue344ﶞT獇⋁亠ᾄਜ਼⯜", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23).intern());
        sb2.append(this.f801);
        sb2.append(m1030("\ue8fc拃誸ꣃ", ((byte) KeyEvent.getModifierMetaStateMask()) + 4).intern());
        sb2.append(this.f805);
        String string = sb2.toString();
        f790 = (f791 + 49) % 128;
        return string;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    private String m1024() {
        f791 = (f790 + 1) % 128;
        String strName = this.f799.name();
        f790 = (f791 + 85) % 128;
        return strName;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String m1026(d dVar) {
        f791 = (f790 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        if (dVar == null) {
            return null;
        }
        int i10 = AnonymousClass5.f807[dVar.ordinal()];
        if (i10 == 1) {
            return m1030("ᢣ鮨뼇逪샦㢡ꋯ䧝\uea08걼䱫씼庻ת\ud8fe쟫Фﶶ\uddf7ﵬ亠ᾄ", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22).intern();
        }
        if (i10 == 2) {
            return String.format(m1030("䣌\uea99\ude3a\ue96f疥\ue5beр\uf821\uea08걼惬鑳岘诃㪇ᚸ南ᾛҸ嚐ꪟ끟雩㪯ꢡ핆腃嬇\uf27e\u0b0d斠콀\ueac4Ȣᘃᕦ뺶⠐麞实ῷ쩞р\uf821\uea08걼惬鑳岘诃㪇ᚸ南ᾛ௮◲聉㲾핛갣\uea08걼", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 62).intern(), this.f803, this.f802, this.f800);
        }
        if (i10 == 3) {
            return String.format(m1028((char) (53000 - (ViewConfiguration.getTouchSlop() >> 8)), TextUtils.getOffsetAfter("", 0) + 55, 100 - TextUtils.lastIndexOf("", '0')).intern(), this.f803, this.f802);
        }
        if (i10 == 4) {
            return m1030("ଣ蓁䮲遦亠ᾄ\uec79ٻ⽷姌\ueade\uecbd粶\udfa6ꕱ溮ᘃᕦ뱗࡛퐍捠岘诃⽍㡭ф\ue335௮◲", 30 - TextUtils.getOffsetBefore("", 0)).intern();
        }
        if (i10 != 5) {
            return null;
        }
        String strIntern = m1030("ଣ蓁䮲遦亠ᾄ\uec79ٻ⽷姌Ԃ⒫庘銮緈禍퐍捠岘诃⽍㡭ф\ue335௮◲", Color.rgb(0, 0, 0) + 16777242).intern();
        int i11 = f791 + 11;
        f790 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 38 / 0;
        }
        return strIntern;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009a  */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1031(com.ironsource.adqualitysdk.sdk.i.cn r8) {
        /*
            r7 = this;
            r8.m1950()
            java.lang.String r0 = r8.m1951()
            r7.f803 = r0
            java.lang.String r0 = r8.m1953()
            r7.f804 = r0
            java.lang.String r0 = r8.m1945()
            r7.f802 = r0
            int r0 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            int r0 = r0 >> 16
            int r0 = 19159 - r0
            char r0 = (char) r0
            r1 = 0
            int r3 = android.widget.ExpandableListView.getPackedPositionType(r1)
            int r3 = 7 - r3
            r4 = 0
            int r5 = android.graphics.ImageFormat.getBitsPerPixel(r4)
            r6 = 1
            int r5 = r5 + r6
            java.lang.String r0 = m1028(r0, r3, r5)
            java.lang.String r0 = r0.intern()
            java.lang.String r3 = r7.f802
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L9a
            int r0 = com.ironsource.adqualitysdk.sdk.i.ay.f791
            int r0 = r0 + 7
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ay.f790 = r3
            int r0 = r0 % 2
            r3 = 45744(0xb2b0, float:6.4101E-41)
            if (r0 != 0) goto L75
            int r0 = android.widget.ExpandableListView.getPackedPositionChild(r1)
            int r0 = r0 * r3
            char r0 = (char) r0
            int r1 = android.graphics.ImageFormat.getBitsPerPixel(r6)
            int r1 = 33 - r1
            float r2 = android.media.AudioTrack.getMinVolume()
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r3 = 65
            int r2 = r3 >> r2
            java.lang.String r0 = m1028(r0, r1, r2)
            java.lang.String r0 = r0.intern()
            java.lang.String r1 = r7.f802
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc9
            goto L9a
        L75:
            int r0 = android.widget.ExpandableListView.getPackedPositionChild(r1)
            int r3 = r3 - r0
            char r0 = (char) r3
            int r1 = android.graphics.ImageFormat.getBitsPerPixel(r4)
            int r1 = r1 + 9
            float r2 = android.media.AudioTrack.getMinVolume()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            int r2 = 7 - r2
            java.lang.String r0 = m1028(r0, r1, r2)
            java.lang.String r0 = r0.intern()
            java.lang.String r1 = r7.f802
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc9
        L9a:
            int r0 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r0 = r0 >> 16
            r1 = 53153(0xcfa1, float:7.4483E-41)
            int r0 = r0 + r1
            char r0 = (char) r0
            java.lang.String r1 = ""
            r2 = 48
            int r1 = android.text.TextUtils.indexOf(r1, r2, r4, r4)
            int r1 = 2 - r1
            int r2 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r2 = r2 >> 16
            int r2 = r2 + 15
            java.lang.String r0 = m1028(r0, r1, r2)
            java.lang.String r0 = r0.intern()
            r7.f802 = r0
            int r0 = com.ironsource.adqualitysdk.sdk.i.ay.f791
            int r0 = r0 + 15
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ay.f790 = r0
        Lc9:
            java.lang.String r0 = r8.m1944()
            r7.f801 = r0
            java.lang.String r0 = r8.m1943()
            r7.f805 = r0
            java.lang.String r8 = r8.m1946()
            r7.f800 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ay.m1031(com.ironsource.adqualitysdk.sdk.i.cn):void");
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m1033(d dVar) {
        int i10 = f790 + 49;
        f791 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f798 = dVar;
            m1034(a.f809);
        } else {
            this.f798 = dVar;
            m1034(a.f809);
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m1034(a aVar) {
        this.f799 = aVar;
        if (aVar != a.f809) {
            f790 = (f791 + 103) % 128;
            this.f798 = d.f830;
        }
        int i10 = AnonymousClass5.f806[aVar.ordinal()];
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            m1025();
            f790 = (f791 + 7) % 128;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m1035() {
        a aVar = this.f799;
        if (aVar == a.f814) {
            return true;
        }
        int i10 = f791 + 33;
        f790 = i10 % 128;
        if (i10 % 2 == 0) {
            a aVar2 = a.f817;
            throw null;
        }
        if (aVar == a.f813 || aVar == a.f817) {
            return true;
        }
        f790 = (f791 + 11) % 128;
        return false;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private String m1027() {
        String strIntern;
        if (this.f803 == null || (strIntern = this.f802) == null) {
            return null;
        }
        f791 = (f790 + 37) % 128;
        if (strIntern.equals(m1028((char) (53154 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 3 - Color.green(0), 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
            int i10 = f791 + 93;
            f790 = i10 % 128;
            if (i10 % 2 == 0) {
                a aVar = a.f817;
                throw null;
            }
            if (this.f799 != a.f815) {
                strIntern = m1028((char) (ViewConfiguration.getTouchSlop() >> 8), 11 - (ViewConfiguration.getScrollBarSize() >> 8), 76 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern();
                f790 = (f791 + 53) % 128;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f803);
        return com.google.android.gms.internal.play_billing.a.k(sb2, m1028((char) (TextUtils.indexOf((CharSequence) "", '0') + 1245), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 13, 87 - TextUtils.indexOf("", "", 0, 0)), strIntern);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String m1029() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m1028((char) Color.red(0), 15 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 46 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
        sb2.append(this.f803);
        String strI = com.google.android.gms.internal.play_billing.a.i(m1030("퐍捠岘诃⽍㡭ф\ue335௮◲誸ꣃ", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10), sb2);
        if (this.f804 != null) {
            StringBuilder sbU = o2.u(strI);
            sbU.append(this.f804);
            strI = com.google.android.gms.internal.play_billing.a.i(m1028((char) (1261 - TextUtils.getCapsMode("", 0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), Color.green(0) + 61), sbU);
            f790 = (f791 + 87) % 128;
        }
        String strI2 = com.google.android.gms.internal.play_billing.a.i(m1028((char) (9395 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 13 - ImageFormat.getBitsPerPixel(0), 61 - TextUtils.lastIndexOf("", '0', 0)), o2.u(strI));
        int i10 = f791 + 57;
        f790 = i10 % 128;
        if (i10 % 2 != 0) {
            return strI2;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m1032() {
        f791 = (f790 + 69) % 128;
        String strM1026 = m1026(this.f798);
        f790 = (f791 + 1) % 128;
        return strM1026;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m1025() {
        f790 = (f791 + 67) % 128;
        if (this.f803.equals(m1028((char) TextUtils.getTrimmedLength(""), 8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19).intern())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m1029());
        sb3.append(m1030("㟄暢", 1 - View.resolveSizeAndState(0, 0, 0)).intern());
        sb2.append(sb3.toString());
        String strM1027 = m1027();
        if (strM1027 != null) {
            StringBuilder sbU = o2.u(strM1027);
            sbU.append(m1030("㟄暢", Color.rgb(0, 0, 0) + 16777217).intern());
            sb2.append(sbU.toString());
        }
        String strM1023 = m1023();
        if (strM1023 != null) {
            StringBuilder sbU2 = o2.u(strM1023);
            sbU2.append(m1030("㟄暢", -TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
            sb2.append(sbU2.toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(m1030("꼏뾩㊳\ud963K댰ਜ਼⯜", 8 - Drawable.resolveOpacity(0, 0)).intern());
        sb4.append(m1024());
        sb4.append(m1030("㟄暢", -TextUtils.indexOf((CharSequence) "", '0')).intern());
        sb2.append(sb4.toString());
        a aVar = this.f799;
        if (aVar != a.f816 && aVar != a.f815) {
            String strM1026 = m1026(this.f798);
            if (strM1026 != null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(m1028((char) (ViewConfiguration.getScrollBarSize() >> 8), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 9, MotionEvent.axisFromString("") + 38).intern());
                sb5.append(strM1026);
                sb2.append(sb5.toString());
            }
            k.m3152(m1028((char) ((-1) - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getEdgeSlop() >> 16) + 12, 26 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern(), sb2.toString());
            f791 = (f790 + 79) % 128;
            return;
        }
        k.m3138(m1028((char) View.getDefaultSize(0, 0), (Process.myPid() >> 22) + 12, 25 - (Process.myTid() >> 22)).intern(), sb2.toString());
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m1028(char c10, int i10, int i11) {
        String str;
        synchronized (c.f1373) {
            try {
                char[] cArr = new char[i10];
                c.f1374 = 0;
                while (true) {
                    int i12 = c.f1374;
                    if (i12 < i10) {
                        cArr[i12] = (char) ((f796[i11 + i12] ^ (i12 * f797)) ^ c10);
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

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m1030(String str, int i10) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (o.f3166) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3167 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3167;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f792)) ^ ((c11 >>> 5) + f793)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f795) ^ ((c12 + i12) ^ ((c12 << 4) + f794))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3167;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3167 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
