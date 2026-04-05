package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.i.az;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class ab<T> extends y<WebView, T> implements View.OnLayoutChangeListener {

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f261 = 1;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static char f262 = 8211;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f263 = 0;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static char f264 = 31785;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static char f265 = 56070;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f266 = 9889;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private jq f267;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private Map<WebView, jt> f268 = new WeakHashMap();

    /* renamed from: ﻏ, reason: contains not printable characters */
    private List<jm> f269 = new ArrayList();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private List<String> f270;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f271;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f272;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f273;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private jt f274;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.adqualitysdk.sdk.i.ab$2, reason: invalid class name */
    public class AnonymousClass2 implements jm {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f275 = 0;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static long f276 = -497769966198334775L;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f277 = 1;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static int[] f278 = {1055209900, -1408402207, -1655861278, 1844985199, -724628077, 312100386, -1947292554, 2127500896, 148328153, 561096222, 1548267381, -214468353, -1874008870, -1806255890, 1494073661, -1257785110, 958543292, 1782933041};

        public AnonymousClass2() {
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private void m582(final WebView webView, final String str, final boolean z10) {
            p.m3253(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.2.3
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ */
                public final void mo590() {
                    final String originalUrl = webView.getOriginalUrl();
                    final Object objMo581 = ab.this.mo581(webView);
                    p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.2.3.3

                        /* renamed from: ﱡ, reason: contains not printable characters */
                        private static int f288 = 1;

                        /* renamed from: ﻛ, reason: contains not printable characters */
                        private static int[] f289 = {-1833447589, -321657379, 151317490, -382395043, 491605187, -1104880914, 1966767750, 661928265, -540506400, -1177989174, -250528450, -1641512400, -1062856170, 1211890969, 217875166, 1535584811, 1436942021, 1256337210};

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static int f290;

                        /* renamed from: ｋ, reason: contains not printable characters */
                        private static String m591(int[] iArr, int i10) {
                            String str2;
                            synchronized (d.f1845) {
                                try {
                                    char[] cArr = new char[4];
                                    char[] cArr2 = new char[iArr.length << 1];
                                    int[] iArr2 = (int[]) f289.clone();
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
                                            str2 = new String(cArr2, 0, i10);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return str2;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.ironsource.adqualitysdk.sdk.i.iu
                        /* renamed from: ﻐ */
                        public final void mo590() throws JSONException {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(ig.f2692, str);
                                jSONObject.put(ig.f2690, m591(new int[]{-1093468707, -1184874988}, TextUtils.indexOf((CharSequence) "", '0', 0) + 4).intern());
                                jSONObject.put(ig.f2700, originalUrl);
                                if (z10) {
                                    f290 = (f288 + 87) % 128;
                                    jSONObject.put(ig.f2699, true);
                                }
                                f290 = (f288 + 115) % 128;
                            } catch (JSONException e10) {
                                String strIntern = m591(new int[]{2064591548, -1891404573, -454032359, -2120222581, 2088671300, 153185008, 988244711, -1187597234}, 16 - Color.argb(0, 0, 0, 0)).intern();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m591(new int[]{-306652385, -1314805208, 1606296723, 535034762, -1144467017, 1157631943, -2048591997, -1710748438, -524071306, -664469547, 99119517, -1683860844, 1689526059, 298999620}, 27 - Color.green(0)).intern());
                                sb2.append(e10.getLocalizedMessage());
                                k.m3147(strIntern, sb2.toString());
                            }
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            ab abVar = ab.this;
                            abVar.mo617(jSONObject, webView, ab.m570(abVar), objMo581);
                        }
                    });
                }
            });
            f275 = (f277 + 87) % 128;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ void m584(AnonymousClass2 anonymousClass2, WebView webView, String str, boolean z10) {
            f275 = (f277 + 5) % 128;
            anonymousClass2.m582(webView, str, z10);
            f275 = (f277 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jm
        /* renamed from: ﻛ, reason: contains not printable characters */
        public final void mo586(WebView webView, String str, String str2) throws JSONException, UnsupportedEncodingException {
            String strSubstring = str2.substring(0, str2.indexOf(63));
            String strSubstring2 = str2.substring(str2.indexOf(63) + 1);
            if (strSubstring.equals(m583("\udaba旖ꑽ\ue4eb✄枻", Color.alpha(0) + 49003).intern())) {
                ab.m567(ab.this, webView);
                return;
            }
            if (strSubstring.equals(m585(new int[]{1674931626, -602125259, -2020799924, -426679219}, Color.red(0) + 6).intern())) {
                JSONObject jSONObjectM564 = ab.m564(strSubstring2);
                ab abVar = ab.this;
                abVar.m576(jSONObjectM564, webView, (WebView) abVar.mo581(webView));
                return;
            }
            if (strSubstring.equals(m583("\udaba쪄龎\uea01驌讵", 4153 - Drawable.resolveOpacity(0, 0)).intern())) {
                JSONObject jSONObjectM5642 = ab.m564(strSubstring2);
                ab abVar2 = ab.this;
                abVar2.mo613(jSONObjectM5642, webView, ab.m570(abVar2), ab.this.mo581(webView));
                return;
            }
            if (!strSubstring.equals(m585(new int[]{1674931626, -602125259, 2100816822, 1322208804}, (ViewConfiguration.getPressedStateDuration() >> 16) + 6).intern())) {
                if (strSubstring.equals(m585(new int[]{1674931626, -602125259, -1165134394, -710476610}, Color.rgb(0, 0, 0) + 16777222).intern())) {
                    f277 = (f275 + 79) % 128;
                    JSONObject jSONObjectM5643 = ab.m564(strSubstring2);
                    kd.m3199(jSONObjectM5643.optString(m585(new int[]{-2144618583, -2106877766}, 3 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern()), jSONObjectM5643.optString(m583("\udaac⚌⋊⸟⩲", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 64567).intern()), jSONObjectM5643.optString(m583("\udaac謜秤⹓鰱䋯", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20903).intern()), jSONObjectM5643.optString(m585(new int[]{-1404576880, -204660285, -40981655, -1054455548}, (Process.myTid() >> 22) + 5).intern()));
                    return;
                }
                return;
            }
            int i10 = f275 + 25;
            f277 = i10 % 128;
            if (i10 % 2 != 0) {
                JSONObject jSONObjectM5644 = ab.m564(strSubstring2);
                jSONObjectM5644.remove(ig.f2701);
                ab abVar3 = ab.this;
                abVar3.mo616(jSONObjectM5644, webView, abVar3.mo581(webView));
                return;
            }
            JSONObject jSONObjectM5645 = ab.m564(strSubstring2);
            jSONObjectM5645.remove(ig.f2701);
            ab abVar4 = ab.this;
            abVar4.mo616(jSONObjectM5645, webView, abVar4.mo581(webView));
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jm
        /* renamed from: ﾒ, reason: contains not printable characters */
        public final void mo588(WebView webView) {
            int i10 = f277 + 99;
            f275 = i10 % 128;
            if (i10 % 2 == 0) {
                ab.m567(ab.this, webView);
            } else {
                ab.m567(ab.this, webView);
                int i11 = 20 / 0;
            }
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m583(String str, int i10) {
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
                            cArr2[i11] = (char) ((cArr[i11] ^ (j.f2850 * i11)) ^ f276);
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jm
        /* renamed from: ﾒ, reason: contains not printable characters */
        public final void mo589(WebView webView, String str) throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ig.f2702, str);
                jSONObject.put(ig.f2695, ig.f2694);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ig.f2703, jSONObject);
                ab abVar = ab.this;
                abVar.mo615(jSONObject2, webView, this, abVar.mo581(webView));
                f275 = (f277 + 115) % 128;
            } catch (Exception e10) {
                kd.m3203(m585(new int[]{-690014451, 1247474889, 575463023, 1687671669, -358889272, 1871995032, -1829202267, 1399157597}, 16 - Gravity.getAbsoluteGravity(0, 0)).intern(), m583("\uda8c⧌㱕Ãᝧᮺ湠狺䄔喇堛경댳螥詫饇\uedda\uf04d쒷쭹\udff3≯㚝Ԍু᰼悬眫箣", 62327 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), e10, false);
            }
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m585(int[] iArr, int i10) {
            String str;
            synchronized (d.f1845) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f278.clone();
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

        @Override // com.ironsource.adqualitysdk.sdk.i.jm
        /* renamed from: ﻛ, reason: contains not printable characters */
        public final void mo587(final WebView webView, final String str, final boolean z10) {
            p.m3247(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.ab.2.2
                @Override // com.ironsource.adqualitysdk.sdk.i.iu
                /* renamed from: ﻐ, reason: contains not printable characters */
                public final void mo590() {
                    if (ab.m569(ab.this)) {
                        if (ab.m563(ab.this) == null || ab.m563(ab.this).isEmpty()) {
                            AnonymousClass2.m584(AnonymousClass2.this, webView, str, z10);
                            return;
                        }
                        Iterator it = ab.m563(ab.this).iterator();
                        while (it.hasNext()) {
                            if (str.startsWith((String) it.next())) {
                                AnonymousClass2.m584(AnonymousClass2.this, webView, str, z10);
                                return;
                            }
                        }
                    }
                }
            });
            f277 = (f275 + 53) % 128;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ List m563(ab abVar) {
        int i10 = f263 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f261 = i10 % 128;
        int i11 = i10 % 2;
        List<String> list = abVar.f270;
        if (i11 != 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m567(ab abVar, WebView webView) {
        int i10 = f263 + 17;
        f261 = i10 % 128;
        int i11 = i10 % 2;
        abVar.m559(webView);
        if (i11 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ az.e m570(ab abVar) {
        f261 = (f263 + 3) % 128;
        az.e eVarM566 = abVar.m566();
        int i10 = f263 + 11;
        f261 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 10 / 0;
        }
        return eVarM566;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = f263;
        int i19 = i18 + 65;
        f261 = i19 % 128;
        try {
            if (i19 % 2 == 0) {
                throw null;
            }
            if (view instanceof WebView) {
                f261 = (i18 + 81) % 128;
                WebView webView = (WebView) view;
                if (this.f268.containsKey(webView)) {
                    int i20 = f263 + 67;
                    f261 = i20 % 128;
                    if (i20 % 2 == 0) {
                        m559(webView);
                        throw null;
                    }
                    m559(webView);
                }
            }
            f263 = (f261 + 93) % 128;
        } catch (Throwable th2) {
            kd.m3203(m562("ﵛ蜮碝㬓重盃뀇㈏\u3104ܨ壖Ź\ue8f3풵䎙틵", 16 - KeyEvent.getDeadChar(0, 0)).intern(), m562("駧鴫ᷕ罪\udea6㈾ꕍ斑\ue145㣖⾆욉볨⌶퀊\uee39勜ᄠ圠툸일ᮚ㽶諘", Gravity.getAbsoluteGravity(0, 0) + 23).intern(), th2, false);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m571() {
        for (WebView webView : this.f268.keySet()) {
            webView.removeOnLayoutChangeListener(this);
            jt jtVar = this.f268.get(webView);
            Iterator<jm> it = this.f269.iterator();
            while (it.hasNext()) {
                f261 = (f263 + 99) % 128;
                jtVar.m3054(it.next());
            }
            f263 = (f261 + 43) % 128;
        }
        this.f269.clear();
        this.f274 = null;
        this.f268.clear();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m573(String str, List<String> list, boolean z10, boolean z11, boolean z12) {
        this.f273 = z10;
        this.f267 = new jq(str, z12);
        this.f271 = z11;
        this.f270 = list;
        f261 = (f263 + 95) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public abstract T mo581(WebView webView);

    /* renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m564(String str) throws UnsupportedEncodingException {
        int i10 = f261 + 107;
        f263 = i10 % 128;
        if (i10 % 2 == 0) {
            return m558(str);
        }
        m558(str);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.y, com.ironsource.adqualitysdk.sdk.i.s
    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ void mo580(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
        f263 = (f261 + 35) % 128;
        m568(jSONObject, (WebView) obj, (WebView) obj2);
        int i10 = f263 + 53;
        f261 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m569(ab abVar) {
        int i10 = f261;
        int i11 = i10 + 75;
        f263 = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = abVar.f271;
        if (i12 != 0) {
            int i13 = 97 / 0;
        }
        f263 = (i10 + 19) % 128;
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.y, com.ironsource.adqualitysdk.sdk.i.s
    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* bridge */ /* synthetic */ void mo577(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
        f263 = (f261 + 31) % 128;
        m576(jSONObject, (WebView) obj, (WebView) obj2);
        int i10 = f261 + 75;
        f263 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 54 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private jm m561() {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        f261 = (f263 + 5) % 128;
        return anonymousClass2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private az.e m566() {
        jt jtVar = this.f274;
        if (jtVar == null) {
            return null;
        }
        f261 = (f263 + 91) % 128;
        az.e eVarM3052 = jtVar.m3052();
        f261 = (f263 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) % 128;
        return eVarM3052;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private void m565(WebView webView) {
        f263 = (f261 + 15) % 128;
        this.f267.m3044(webView);
        f263 = (f261 + 53) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final WebView m572() {
        jt jtVar = this.f274;
        if (jtVar != null) {
            f263 = (f261 + 105) % 128;
            return jtVar.m3053();
        }
        int i10 = f261 + 17;
        f263 = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* renamed from: ｋ, reason: contains not printable characters */
    public final String mo575(T t10) {
        int i10 = (f261 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE) % 128;
        f263 = i10;
        String str = this.f272;
        f261 = (i10 + 87) % 128;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m576(JSONObject jSONObject, WebView webView, T t10) throws JSONException {
        f261 = (f263 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE) % 128;
        m560(jSONObject, webView);
        super.mo577(jSONObject, (JSONObject) webView, (WebView) t10);
        int i10 = f263 + 3;
        f261 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m578(WebView webView) {
        int i10 = f261 + 87;
        f263 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 49 / 0;
            if (webView == null) {
                return;
            }
        } else if (webView == null) {
            return;
        }
        if (this.f268.containsKey(webView)) {
            return;
        }
        jt jtVarM3050 = jt.m3050(webView, m562("\udc68\ufdda㞦ᵘ욯⻦훇\ufbcb洍\ue505", ((Process.getThreadPriority(0) + 20) >> 6) + 9).intern());
        if (this.f274 == null) {
            int i12 = (f263 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
            f261 = i12;
            this.f274 = jtVarM3050;
            f263 = (i12 + 63) % 128;
        }
        this.f268.put(webView, jtVarM3050);
        jm jmVarM561 = m561();
        this.f269.add(jmVarM561);
        jtVarM3050.m3058(jmVarM561);
        m559(webView);
        webView.addOnLayoutChangeListener(this);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m574(List<WebView> list) {
        if (list != null) {
            f261 = (f263 + 55) % 128;
            Iterator<WebView> it = list.iterator();
            while (it.hasNext()) {
                m578(it.next());
                f261 = (f263 + 105) % 128;
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m562(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f262)) ^ ((c11 >>> 5) + f264)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f265) ^ ((c12 + i12) ^ ((c12 << 4) + f266))));
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
    private void m559(WebView webView) {
        jt jtVar = this.f268.get(webView);
        if (this.f273 && jtVar.m3056()) {
            int i10 = f263 + 67;
            f261 = i10 % 128;
            if (i10 % 2 != 0) {
                if (!kf.m3229(webView)) {
                    f263 = (f261 + 97) % 128;
                    jtVar.m3057();
                }
                m565(webView);
                f261 = (f263 + 71) % 128;
            } else {
                kf.m3229(webView);
                throw null;
            }
        }
        int i11 = f261 + 59;
        f263 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 88 / 0;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m558(String str) throws UnsupportedEncodingException {
        f263 = (f261 + 99) % 128;
        try {
            String strDecode = URLDecoder.decode(str, m562("ᣂ㫪㓓\udfcaꕛ禍", 5 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern());
            if (!TextUtils.isEmpty(strDecode)) {
                return new JSONObject(strDecode);
            }
        } catch (Exception e10) {
            k.m3145(m562("ﵛ蜮碝㬓重盃뀇㈏\u3104ܨ壖Ź\ue8f3풵䎙틵", 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), m562("駧鴫ᷕ罪\udea6㈾⦌比\udc21ၸꕍ斑\ud803\uf395퍑⤰烠葧", ((Process.getThreadPriority(0) + 20) >> 6) + 18).intern(), (Throwable) e10);
        }
        JSONObject jSONObject = new JSONObject();
        int i10 = f261 + 115;
        f263 = i10 % 128;
        if (i10 % 2 == 0) {
            return jSONObject;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static void m560(JSONObject jSONObject, WebView webView) throws JSONException {
        boolean z10;
        if (webView != null) {
            f261 = (f263 + 113) % 128;
            try {
                String str = ig.f2659;
                if (webView.getWindowToken() != null) {
                    f261 = (f263 + 19) % 128;
                    z10 = true;
                } else {
                    z10 = false;
                }
                jSONObject.put(str, z10);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m579(String str) {
        int i10 = f261 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        int i11 = i10 % 128;
        f263 = i11;
        int i12 = i10 % 2;
        this.f272 = str;
        if (i12 != 0) {
            throw null;
        }
        int i13 = i11 + 41;
        f261 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m568(JSONObject jSONObject, WebView webView, T t10) throws JSONException {
        f263 = (f261 + 113) % 128;
        jSONObject.remove(ig.f2701);
        super.mo580(jSONObject, (JSONObject) webView, (WebView) t10);
        f261 = (f263 + 1) % 128;
    }
}
