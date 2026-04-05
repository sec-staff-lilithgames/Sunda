package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.i.v;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class aa extends v<View> implements View.OnLayoutChangeListener, jl {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f242 = 1;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f243 = 46571;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f244 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f245 = 51275;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f246 = 15380;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f247 = 12074;

    /* renamed from: ｋ, reason: contains not printable characters */
    private Class f248;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private WeakHashMap<View, Boolean> f249;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private e f250;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends v.b {

        /* renamed from: ﭴ, reason: contains not printable characters */
        private static int f251 = 1;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f252;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private String f258;

        /* renamed from: ｋ, reason: contains not printable characters */
        private String f259;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private String f260;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int[] f257 = {-738270424, 1881077753, -1414684862, -939376984, 1006290961, 295703542, 260890606, 1913626910, -280092621, 1016930921, 1165086259, -385708377, -412088728, 1391314251, -131758146, 23689888, 1857504460, -997869261};

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static char f256 = 26551;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static char f255 = 48324;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static char f254 = 35484;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static char f253 = 56956;

        public e(aa aaVar) {
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private e m550(String str) {
            int i10 = f252;
            this.f259 = str;
            f251 = (i10 + 53) % 128;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ String m551(e eVar) {
            int i10 = f252 + 33;
            int i11 = i10 % 128;
            f251 = i11;
            int i12 = i10 % 2;
            String str = eVar.f260;
            if (i12 == 0) {
                int i13 = 85 / 0;
            }
            f252 = (i11 + 5) % 128;
            return str;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ String m553(e eVar) {
            int i10 = f251;
            f252 = (i10 + 69) % 128;
            String str = eVar.f259;
            int i11 = i10 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f252 = i11 % 128;
            if (i11 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ String m556(e eVar) {
            int i10 = f252 + 79;
            f251 = i10 % 128;
            int i11 = i10 % 2;
            String str = eVar.f258;
            if (i11 == 0) {
                int i12 = 3 / 0;
            }
            return str;
        }

        public e(aa aaVar, JSONObject jSONObject) {
            m550(jSONObject.optString(m554(new int[]{-1185656862, -1972874879, 1321703755, -1832996330, -1651833804, -719201476, 1548840504, -1095708708, 1538362370, -1473328013, -1945324490, 999248568}, 22 - Color.green(0)).intern()));
            m552(jSONObject.optString(m557("\u137f儏ꉃ\ue7a9諿䵈뫰\ue4a5\uea50῀ⅻ㿔㢔\uf7e8", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13).intern()));
            m555(jSONObject.optString(m557("ﶮ䢴荳깸裃摿㳎䃓ꉃ\ue7a9\ua83bጩ얔ٳ㳖싊", (ViewConfiguration.getEdgeSlop() >> 16) + 16).intern()));
            m3362(jSONObject.optString(m554(new int[]{62317314, 936284828, 754909611, 19258682, 934067663, 1734239920}, (ViewConfiguration.getTouchSlop() >> 8) + 10).intern()));
            m3367(false);
            m3368(!TextUtils.isEmpty(jSONObject.optString(m554(new int[]{62317314, 936284828, 754909611, 19258682, 934067663, 1734239920}, 9 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) || jSONObject.optBoolean(m554(new int[]{-579466394, -1985330324, -89479898, -154622981, 1982882229, 943202192, 1082637033, 361640227}, View.MeasureSpec.makeMeasureSpec(0, 0) + 16).intern()) || jSONObject.optBoolean(m554(new int[]{-579466394, -1985330324, 117319562, -284025448, -1590286986, 1755432113, -678291715, -978369782, -703806030, 1489388461}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18).intern()));
            m3365(jSONObject.optBoolean(m554(new int[]{-579466394, -1985330324, -89479898, -154622981, 1982882229, 943202192, 1082637033, 361640227}, 16 - View.resolveSize(0, 0)).intern()));
            m3359(jSONObject.optBoolean(m557("퇪坥\ue121\ue14f\uf621뀖ﴛ藙ꋉ\uf1e4", KeyEvent.keyCodeFromString("") + 10).intern()));
            m3364(TextUtils.isEmpty(jSONObject.optString(m554(new int[]{-1426883331, 1831347036, 1732345266, -1316112530, -503143582, -798035453}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 9).intern())) ? null : Arrays.asList(jSONObject.optString(m554(new int[]{-1426883331, 1831347036, 1732345266, -1316112530, -503143582, -798035453}, 9 - (Process.myPid() >> 22)).intern()).split(m557("뇭\uda5b", KeyEvent.getDeadChar(0, 0) + 1).intern())));
            m3369(jSONObject.optBoolean(m557("퇪坥쯮앏浲聱뫰\ue4a5鸧۵饾\ue52d\uea82쟨", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13).intern(), true));
            m3363(false);
            m3360(jSONObject.optBoolean(m554(new int[]{-528908953, -1680978477, 1984677389, -1151871473, -1698980353, -1896790602, -524425728, -1608907316, -2012273476, 756117633}, 16 - Process.getGidForName("")).intern()));
            m3361(jSONObject.optBoolean(m554(new int[]{-38261567, 1572625625, -40815897, -2047656431, -1994081213, -1601958178}, ((Process.getThreadPriority(0) + 20) >> 6) + 9).intern()));
            m3366(kc.m3195(jSONObject.optJSONArray(m557("\u137f儏ꉃ\ue7a9乩臖笱寁䕨즛燃ﵒ㢔\uf7e8", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12).intern())));
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private e m552(String str) {
            int i10 = (f252 + 29) % 128;
            f251 = i10;
            this.f258 = str;
            f252 = (i10 + 17) % 128;
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private e m555(String str) {
            int i10 = f252 + 11;
            f251 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f260 = str;
                return this;
            }
            this.f260 = str;
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m554(int[] iArr, int i10) {
            String str;
            synchronized (d.f1845) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f257.clone();
                    d.f1846 = 0;
                    while (true) {
                        int i11 = d.f1846;
                        if (i11 < iArr.length) {
                            int i12 = iArr[i11];
                            char c10 = (char) (i12 >> 16);
                            cArr[0] = c10;
                            char c11 = (char) i12;
                            cArr[1] = c11;
                            char c12 = (char) (iArr[i11 + 1] >> 16);
                            cArr[2] = c12;
                            char c13 = (char) iArr[i11 + 1];
                            cArr[3] = c13;
                            d.f1844 = (c10 << 16) + c11;
                            d.f1847 = (c12 << 16) + c13;
                            d.m2179(iArr2);
                            for (int i13 = 0; i13 < 16; i13++) {
                                int i14 = d.f1844 ^ iArr2[i13];
                                d.f1844 = i14;
                                int iM2178 = d.m2178(i14) ^ d.f1847;
                                int i15 = d.f1844;
                                d.f1844 = iM2178;
                                d.f1847 = i15;
                            }
                            int i16 = d.f1844;
                            int i17 = d.f1847;
                            d.f1844 = i17;
                            d.f1847 = i16;
                            int i18 = i16 ^ iArr2[16];
                            d.f1847 = i18;
                            int i19 = i17 ^ iArr2[17];
                            d.f1844 = i19;
                            cArr[0] = (char) (i19 >>> 16);
                            cArr[1] = (char) i19;
                            cArr[2] = (char) (i18 >>> 16);
                            cArr[3] = (char) i18;
                            d.m2179(iArr2);
                            int i20 = d.f1846;
                            cArr2[i20 << 1] = cArr[0];
                            cArr2[(i20 << 1) + 1] = cArr[1];
                            cArr2[(i20 << 1) + 2] = cArr[2];
                            cArr2[(i20 << 1) + 3] = cArr[3];
                            d.f1846 = i20 + 2;
                        } else {
                            str = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m557(String str, int i10) {
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
                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f256)) ^ ((c11 >>> 5) + f254)));
                                cArr3[1] = c12;
                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f255) ^ ((c12 + i12) ^ ((c12 << 4) + f253))));
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

    public aa(JSONObject jSONObject) {
        super(null);
        this.f249 = new WeakHashMap<>();
        this.f250 = new e(this);
        m544(jSONObject);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        f244 = (f242 + 59) % 128;
        try {
            View viewM535 = m535(view, this.f248);
            if (viewM535 != null) {
                f242 = (f244 + 111) % 128;
                m541(viewM535);
                view.removeOnLayoutChangeListener(this);
            }
        } catch (Throwable th2) {
            kd.m3203(m540("⋌좉꼊輤丹綕頭\uf4f6矘哇\ue07f\ufddc托䊹꼊輤\ue2f1뎨䈑ᔱ", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 18).intern(), m540("칔ﴮ읧㡓鹍쾉ノ⪓\ue2c3妗⏲侏䚁寧\ua7e6沟톗ꋗ᳠磗犱ꔨ萸乡", Color.alpha(0) + 23).intern(), th2, false);
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m544(JSONObject jSONObject) {
        e eVar = new e(this, jSONObject);
        m3344((v.b) eVar);
        this.f250 = eVar;
        try {
            this.f248 = Class.forName(e.m556(eVar));
            int i10 = (f242 + 65) % 128;
            f244 = i10;
            int i11 = i10 + 91;
            f242 = i11 % 128;
            int i12 = i11 % 2;
            m539();
            if (i12 == 0) {
                throw null;
            }
        } catch (ClassNotFoundException e10) {
            String strIntern = m540("⋌좉꼊輤丹綕頭\uf4f6矘哇\ue07f\ufddc托䊹꼊輤\ue2f1뎨䈑ᔱ", TextUtils.lastIndexOf("", '0', 0, 0) + 20).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m540("칔ﴮ읧㡓鹍쾉郲겑讌꼟벓쇍ノ⪓\u05ed홧胁\ude8f櫵ꀺ\ue08e溾岜츊\ud8ca烽\uef16惘䊏㲲멽埠", TextUtils.getTrimmedLength("") + 31).intern());
            sb2.append(e.m556(eVar));
            sb2.append(m540("ḛﱹ", (ViewConfiguration.getEdgeSlop() >> 16) + 2).intern());
            sb2.append(e10.getLocalizedMessage());
            k.m3136(strIntern, sb2.toString());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.v
    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ void mo545(View view, List list) {
        f244 = (f242 + 51) % 128;
        m537(view, (List<WebView>) list);
        f242 = (f244 + 53) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.v
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ View mo546(View view) {
        f244 = (f242 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
        View viewM538 = m538(view);
        f242 = (f244 + 111) % 128;
        return viewM538;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m549() {
        int i10 = f242 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f244 = i10 % 128;
        if (i10 % 2 == 0) {
            m3417((s) null);
            ji.m3008().m3012(this);
        } else {
            m3417((s) null);
            ji.m3008().m3012(this);
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m539() {
        f242 = (f244 + 101) % 128;
        ji.m3008().m3011(this);
        f244 = (f242 + 15) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.v
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ab mo547() {
        ac acVar = new ac();
        int i10 = f242 + 53;
        f244 = i10 % 128;
        if (i10 % 2 == 0) {
            return acVar;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static View m538(View view) {
        int i10 = (f244 + 55) % 128;
        f242 = i10;
        f244 = (i10 + 9) % 128;
        return view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jl
    /* renamed from: ﾇ, reason: avoid collision after fix types in other method and contains not printable characters */
    public final void mo548(View view) throws JSONException {
        View viewM536;
        f242 = (f244 + 63) % 128;
        View viewM535 = m535(view, this.f248);
        if (viewM535 != null) {
            int i10 = f244 + 39;
            f242 = i10 % 128;
            if (i10 % 2 != 0) {
                m541(viewM535);
                return;
            } else {
                m541(viewM535);
                throw null;
            }
        }
        if (TextUtils.isEmpty(e.m551(this.f250)) || (viewM536 = m536(view, e.m551(this.f250))) == null) {
            return;
        }
        f244 = (f242 + 113) % 128;
        viewM536.addOnLayoutChangeListener(this);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private void m541(View view) throws JSONException {
        f242 = (f244 + 3) % 128;
        if (!this.f249.containsKey(view)) {
            int i10 = f242 + 53;
            f244 = i10 % 128;
            if (i10 % 2 == 0) {
                this.f249.put(view, Boolean.TRUE);
                mo3347((aa) view, Integer.toHexString(view.hashCode()));
            } else {
                this.f249.put(view, Boolean.TRUE);
                mo3347((aa) view, Integer.toHexString(view.hashCode()));
                throw null;
            }
        }
        int i11 = f244 + 31;
        f242 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 25 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.v
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final s<WebView, View> mo542() {
        int i10 = f244 + 87;
        int i11 = i10 % 128;
        f242 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i12 = i11 + 43;
        f244 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 61 / 0;
        }
        return this;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jl
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void mo543(View view) throws JSONException {
        int i10 = f244 + 67;
        f242 = i10 % 128;
        if (i10 % 2 != 0) {
            View viewM535 = m535(view, this.f248);
            if (viewM535 == null || this.f249.remove(viewM535) == null) {
                return;
            }
            int i11 = f244 + 91;
            f242 = i11 % 128;
            if (i11 % 2 != 0) {
                mo3345((aa) view);
                return;
            } else {
                mo3345((aa) view);
                int i12 = 82 / 0;
                return;
            }
        }
        m535(view, this.f248);
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m540(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f243)) ^ ((c11 >>> 5) + f245)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f246) ^ ((c12 + i12) ^ ((c12 << 4) + f247))));
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

    /* renamed from: ﻛ, reason: contains not printable characters */
    private View m535(View view, Class cls) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (cls.isAssignableFrom(childAt.getClass())) {
                    return childAt;
                }
                View viewM535 = m535(childAt, cls);
                if (viewM535 != null) {
                    int i11 = (f242 + 39) % 128;
                    f244 = i11;
                    int i12 = i11 + 47;
                    f242 = i12 % 128;
                    if (i12 % 2 != 0) {
                        return viewM535;
                    }
                    throw null;
                }
            }
        }
        f244 = (f242 + 107) % 128;
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private View m536(View view, String str) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                int i11 = f242 + 5;
                f244 = i11 % 128;
                if (i11 % 2 == 0) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getClass().getName().startsWith(str)) {
                        return childAt;
                    }
                    View viewM536 = m536(childAt, str);
                    if (viewM536 != null) {
                        f242 = (f244 + 7) % 128;
                        return viewM536;
                    }
                } else {
                    viewGroup.getChildAt(i10).getClass().getName().startsWith(str);
                    throw null;
                }
            }
        }
        f244 = (f242 + 31) % 128;
        return null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m537(View view, List<WebView> list) {
        f244 = (f242 + 25) % 128;
        ke.m3218(view, WebView.class, e.m553(this.f250), true, false, null, this.f250.f3312, list);
        int i10 = f242 + 83;
        f244 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }
}
