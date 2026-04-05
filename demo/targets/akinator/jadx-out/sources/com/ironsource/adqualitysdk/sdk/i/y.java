package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class y<K, T> implements s<K, T> {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f3370 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f3371 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f3372 = {'6', 129, 150, 152, 151, 148, 156, 166, 156, 'r', AbstractJsonLexerKt.END_OBJ, 160, 153, 161, 'N', 163, 169, 135, 136, 179, 179, 175, 183, 157, 'W', 143, 142, 133, 136, 'f', 136, AbstractJsonLexerKt.BEGIN_OBJ, 130, GMTDateParser.ZONE, 132, 'w', '^', GMTDateParser.ZONE};

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f3373 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static long f3374 = 5250353211299395752L;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f3375;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private s<K, T> f3376 = new s<K, T>() { // from class: com.ironsource.adqualitysdk.sdk.i.y.5
        @Override // com.ironsource.adqualitysdk.sdk.i.s
        /* renamed from: ﻐ */
        public final void mo612(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.s
        /* renamed from: ｋ */
        public final void mo577(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.s
        /* renamed from: ﾒ */
        public final void mo616(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.s
        /* renamed from: ﻐ */
        public final void mo613(JSONObject jSONObject, K k10, Object obj, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.s
        /* renamed from: ｋ */
        public final void mo615(JSONObject jSONObject, K k10, Object obj, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.s
        /* renamed from: ﾒ */
        public final void mo617(JSONObject jSONObject, K k10, Object obj, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.s
        /* renamed from: ﻛ */
        public final void mo614(JSONObject jSONObject, K k10, T t10) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.s
        /* renamed from: ﾇ */
        public final void mo580(JSONObject jSONObject, K k10, T t10) {
        }
    };

    /* renamed from: ﾇ, reason: contains not printable characters */
    private s<K, T> f3377;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private s<K, T> m3414() {
        int i10 = (f3370 + 75) % 128;
        f3371 = i10;
        s<K, T> sVar = this.f3377;
        if (sVar == null) {
            return this.f3376;
        }
        f3370 = (i10 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE) % 128;
        return sVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.s
    /* renamed from: ﻐ */
    public final void mo613(JSONObject jSONObject, K k10, Object obj, T t10) throws JSONException {
        f3371 = (f3370 + 63) % 128;
        JSONObject jSONObjectM3416 = m3416(jSONObject, t10);
        m3412(m3413("䦉ꕙ怙ః剗ꂧ℗⡞骧참괌", TextUtils.lastIndexOf("", '0', 0) + 528623888, "ཛ舩蘟ᅀ", "\uf8a8飔m䣝", (char) Color.green(0)).intern(), jSONObjectM3416);
        m3414().mo613(jSONObjectM3416, k10, obj, t10);
        f3371 = (f3370 + 5) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m3417(s<K, T> sVar) {
        int i10 = (f3370 + 77) % 128;
        f3371 = i10;
        this.f3377 = sVar;
        int i11 = i10 + 49;
        f3370 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ｋ */
    public abstract String mo575(T t10);

    @Override // com.ironsource.adqualitysdk.sdk.i.s
    /* renamed from: ｋ */
    public void mo577(JSONObject jSONObject, K k10, T t10) throws JSONException {
        f3371 = (f3370 + 69) % 128;
        JSONObject jSONObjectM3416 = m3416(jSONObject, t10);
        m3412(m3413("緵뵐崳锪㾽买ᩩ㣘鱣\uf6e3쵮˶妩", ((byte) KeyEvent.getModifierMetaStateMask()) - 1739196974, "퇏嗵窘쥥", "\uf8a8飔m䣝", (char) (25978 - View.combineMeasuredStates(0, 0))).intern(), jSONObjectM3416);
        m3414().mo577(jSONObjectM3416, k10, t10);
        int i10 = f3370 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f3371 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.s
    /* renamed from: ﾒ */
    public final void mo617(JSONObject jSONObject, K k10, Object obj, T t10) throws JSONException {
        f3370 = (f3371 + 43) % 128;
        JSONObject jSONObjectM3416 = m3416(jSONObject, t10);
        m3412(m3413("왙ᰡ튲\ue742廔\u0dcd\u218d\u001f啱띸ꌔⲳ\uea3b壇榰\uffbf脴釪鈯", ExpandableListView.getPackedPositionChild(0L) + 1920822417, "郚絬푲䫭", "\uf8a8飔m䣝", (char) (60884 - KeyEvent.keyCodeFromString(""))).intern(), jSONObjectM3416);
        m3414().mo617(jSONObjectM3416, k10, obj, t10);
        f3370 = (f3371 + 113) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.s
    /* renamed from: ﻛ */
    public final void mo614(JSONObject jSONObject, K k10, T t10) throws JSONException {
        f3371 = (f3370 + 63) % 128;
        JSONObject jSONObjectM3416 = m3416(jSONObject, t10);
        m3412(m3413("傘ꑖ뼍\uda69陷ܕ茺쓏愱", View.combineMeasuredStates(0, 0) + 1533632921, "馺楡굛稏", "\uf8a8飔m䣝", (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), jSONObjectM3416);
        m3414().mo614(jSONObjectM3416, k10, t10);
        int i10 = f3371 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f3370 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.s
    /* renamed from: ﾇ */
    public void mo580(JSONObject jSONObject, K k10, T t10) throws JSONException {
        f3371 = (f3370 + 103) % 128;
        JSONObject jSONObjectM3416 = m3416(jSONObject, t10);
        m3412(m3413("邢ↇ䒩⡲\u125fꭐ\uf74e\uf8f6㠏襏\ud8c7㦕ｽ횅괎ﻂ镈醲პ", (ViewConfiguration.getScrollBarSize() >> 8) - 403241075, "跖\uf707\udde7㫄", "\uf8a8飔m䣝", (char) (50397 - (KeyEvent.getMaxKeyCode() >> 16))).intern(), jSONObjectM3416);
        m3414().mo580(jSONObjectM3416, k10, t10);
        int i10 = f3370 + 19;
        f3371 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.s
    /* renamed from: ﻐ */
    public final void mo612(JSONObject jSONObject, K k10, T t10) throws JSONException {
        f3371 = (f3370 + 7) % 128;
        JSONObject jSONObjectM3416 = m3416(jSONObject, t10);
        m3412(m3415(new int[]{0, 14, 50, 0}, true, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001").intern(), jSONObjectM3416);
        m3414().mo612(jSONObjectM3416, k10, t10);
        f3371 = (f3370 + 29) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.s
    /* renamed from: ｋ */
    public final void mo615(JSONObject jSONObject, K k10, Object obj, T t10) throws JSONException {
        f3370 = (f3371 + 25) % 128;
        JSONObject jSONObjectM3416 = m3416(jSONObject, t10);
        m3412(m3415(new int[]{14, 10, 70, 0}, false, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000").intern(), jSONObjectM3416);
        m3414().mo615(jSONObjectM3416, k10, obj, t10);
        f3371 = (f3370 + 93) % 128;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.s
    /* renamed from: ﾒ */
    public final void mo616(JSONObject jSONObject, K k10, T t10) throws JSONException {
        f3370 = (f3371 + 63) % 128;
        JSONObject jSONObjectM3416 = m3416(jSONObject, t10);
        m3412(m3413("ష죺메ᑰ跪\ue34e값\"娜♥鎟䥅防", TextUtils.getOffsetAfter("", 0) - 1215626594, "黬謂覷≙", "\uf8a8飔m䣝", (char) (22921 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern(), jSONObjectM3416);
        m3414().mo616(jSONObjectM3416, k10, t10);
        f3371 = (f3370 + 33) % 128;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m3413(String str, int i10, String str2, String str3, char c10) {
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
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr3.length;
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
                        cArr6[i15] = (char) ((((c12 ^ cArr3[i15]) ^ f3374) ^ f3375) ^ f3373);
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
    private static String m3415(int[] iArr, boolean z10, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        synchronized (g.f2307) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f3372, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    g.f2306 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = g.f2306;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        g.f2306 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    g.f2306 = 0;
                    while (true) {
                        int i16 = g.f2306;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        g.f2306 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    g.f2306 = 0;
                    while (true) {
                        int i17 = g.f2306;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        g.f2306 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m3412(String str, JSONObject jSONObject) {
        String strIntern = m3415(new int[]{24, 14, 22, 1}, true, (String) null).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(m3413("㻏\udc55쏥", (-1693391271) - Color.rgb(0, 0, 0), "奡ღᾜ틩", "\uf8a8飔m䣝", (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 59679)).intern());
        sb2.append(str);
        k.m3153(strIntern, sb2.toString(), jSONObject);
        f3370 = (f3371 + 3) % 128;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject m3416(JSONObject jSONObject, T t10) throws JSONException {
        f3370 = (f3371 + 47) % 128;
        try {
            if (!jSONObject.has(ig.f2706)) {
                jSONObject.put(ig.f2706, mo575(t10));
            }
            if (!jSONObject.has(ig.f2701)) {
                f3371 = (f3370 + 73) % 128;
                jSONObject.put(ig.f2701, jv.m3085());
                f3370 = (f3371 + 21) % 128;
            }
            return jSONObject;
        } catch (JSONException e10) {
            k.m3145(m3415(new int[]{24, 14, 22, 1}, true, (String) null).intern(), m3413("づ₊鎊䮌곉岘렐謌墆\ue75dጬ夀\ue676䠿끛繱\ue2e9芺눧橯\ueda2\uea44Ʇ\uf578䲖", (-1980507239) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "飵\uf3db侉１", "\uf8a8飔m䣝", (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), (Throwable) e10);
            return jSONObject;
        }
    }
}
