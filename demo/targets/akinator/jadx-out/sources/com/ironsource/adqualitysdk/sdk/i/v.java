package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class v<T> extends y<WebView, T> {

    /* renamed from: ﻛ, reason: contains not printable characters */
    private ab f3288;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private it f3290;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Map<T, ab> f3287 = new WeakHashMap();

    /* renamed from: ｋ, reason: contains not printable characters */
    private v<T>.b f3289 = new b();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b {

        /* renamed from: ﭖ, reason: contains not printable characters */
        private boolean f3303;

        /* renamed from: ﮐ, reason: contains not printable characters */
        private boolean f3304;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private boolean f3305;

        /* renamed from: ﱡ, reason: contains not printable characters */
        private boolean f3306;

        /* renamed from: ﺙ, reason: contains not printable characters */
        private boolean f3307;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private boolean f3308;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private List<String> f3309;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private String f3310;

        /* renamed from: ｋ, reason: contains not printable characters */
        private boolean f3311;

        /* renamed from: ﾇ, reason: contains not printable characters */
        protected List<String> f3312 = new ArrayList();

        /* renamed from: ﾒ, reason: contains not printable characters */
        private boolean f3313;

        /* renamed from: ﱟ, reason: contains not printable characters */
        public final v<T>.b m3359(boolean z10) {
            this.f3307 = z10;
            return this;
        }

        /* renamed from: ﺙ, reason: contains not printable characters */
        public final v<T>.b m3360(boolean z10) {
            this.f3308 = z10;
            return this;
        }

        /* renamed from: ﻏ, reason: contains not printable characters */
        public final v<T>.b m3361(boolean z10) {
            this.f3303 = z10;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final v<T>.b m3362(String str) {
            this.f3310 = str;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final v<T>.b m3364(List<String> list) {
            this.f3309 = list;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final v<T>.b m3367(boolean z10) {
            this.f3311 = z10;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        public final v<T>.b m3368(boolean z10) {
            this.f3305 = z10;
            return this;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public final v<T>.b m3369(boolean z10) {
            this.f3313 = z10;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        public final v<T>.b m3363(boolean z10) {
            this.f3306 = z10;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        public final v<T>.b m3365(boolean z10) {
            this.f3304 = z10;
            return this;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        public final v<T>.b m3366(List<String> list) {
            if (list != null) {
                this.f3312 = list;
            }
            return this;
        }
    }

    public v(it itVar) {
        this.f3290 = itVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m3343(final JSONObject jSONObject, final T t10, String str) throws JSONException {
        boolean z10 = ((b) this.f3289).f3313 && !TextUtils.isEmpty(((b) this.f3289).f3310);
        ab abVarMo547 = ((b) this.f3289).f3308 ? this.f3287.get(t10) : this.f3288;
        if (abVarMo547 == null) {
            abVarMo547 = mo547();
            if (((b) this.f3289).f3308) {
                this.f3287.put(t10, abVarMo547);
            } else {
                this.f3288 = abVarMo547;
            }
            abVarMo547.m3417(mo542());
        }
        ab abVar = abVarMo547;
        abVar.m571();
        abVar.m573(((b) this.f3289).f3310, ((b) this.f3289).f3309, z10, ((b) this.f3289).f3304, ((b) this.f3289).f3307);
        abVar.m579(str);
        if (!((b) this.f3289).f3305) {
            super.mo577(jSONObject, (JSONObject) null, t10);
            return;
        }
        ArrayList arrayList = new ArrayList();
        mo545(t10, arrayList);
        List<WebView> arrayList2 = new ArrayList<>();
        it itVar = this.f3290;
        if (itVar != null) {
            arrayList2 = itVar.mo2019(t10);
        }
        final List<WebView> listM3090 = jv.m3090(arrayList, arrayList2);
        if (listM3090.isEmpty() || ((b) this.f3289).f3306) {
            View viewMo546 = mo546(t10);
            if (viewMo546 != null) {
                viewMo546.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.v.1

                    /* renamed from: ﮐ, reason: contains not printable characters */
                    private static int f3291 = 1;

                    /* renamed from: ﱟ, reason: contains not printable characters */
                    private static boolean f3292 = true;

                    /* renamed from: ﺙ, reason: contains not printable characters */
                    private static int f3293 = 0;

                    /* renamed from: ﻐ, reason: contains not printable characters */
                    private static char[] f3294 = {320, 367, 358, 365, 349, 364, 351, 360, 315, 350, 322, 347, 319, 361, 282, 355, 326, 371, 366, 317, 354, 353};

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private static boolean f3295 = true;

                    /* renamed from: ﾒ, reason: contains not printable characters */
                    private static int f3296 = 250;

                    /* renamed from: ﻛ, reason: contains not printable characters */
                    private static String m3348(String str2, int[] iArr, int i10, String str3) throws UnsupportedEncodingException {
                        byte[] bytes = str3;
                        if (str3 != null) {
                            bytes = str3.getBytes("ISO-8859-1");
                        }
                        byte[] bArr = bytes;
                        char[] charArray = str2;
                        if (str2 != null) {
                            charArray = str2.toCharArray();
                        }
                        char[] cArr = charArray;
                        synchronized (m.f3159) {
                            try {
                                char[] cArr2 = f3294;
                                int i11 = f3296;
                                if (f3292) {
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
                                if (f3295) {
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

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        try {
                            ArrayList arrayList3 = new ArrayList();
                            v.this.mo545(t10, arrayList3);
                            if (arrayList3.isEmpty()) {
                                return;
                            }
                            int i18 = f3291 + 81;
                            f3293 = i18 % 128;
                            if (i18 % 2 != 0) {
                                v.this.mo546(t10);
                                throw null;
                            }
                            View viewMo5462 = v.this.mo546(t10);
                            if (viewMo5462 != null && !v.this.f3289.f3306) {
                                f3293 = (f3291 + 17) % 128;
                                viewMo5462.removeOnLayoutChangeListener(this);
                            }
                            v.this.m3342((v) t10, (List<WebView>) arrayList3);
                            v.this.mo612(new JSONObject(), (JSONObject) arrayList3.get(0), t10);
                            f3291 = (f3293 + 53) % 128;
                        } catch (Throwable th2) {
                            kd.m3203(m3348(null, null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, "\u0086\u0087\u0083\u008a\u0088\u008c\u008b\u008a\u0089\u0088\u0087\u0087\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern(), m3348(null, null, TextUtils.indexOf("", "", 0, 0) + 127, "\u0087\u0096\u0088\u008c\u0095\u0094\u0093\u0082\u008e\u0092\u008c\u0091\u0088\u008e\u008f\u0088\u0090\u008f\u0086\u008e\u0086\u0086\u008d").intern(), th2, false);
                        }
                    }
                });
            }
            if (listM3090.isEmpty()) {
                super.mo577(jSONObject, (JSONObject) null, t10);
                return;
            }
        }
        if (((b) this.f3289).f3303) {
            p.m3252().post(new Runnable() { // from class: com.ironsource.adqualitysdk.sdk.i.v.2
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    v.this.m3342((v) t10, (List<WebView>) listM3090);
                    v.super.mo577(jSONObject, (JSONObject) listM3090.get(0), (WebView) t10);
                }
            });
        } else {
            m3342((v<T>) t10, listM3090);
            super.mo577(jSONObject, (JSONObject) listM3090.get(0), (WebView) t10);
        }
    }

    /* renamed from: ﻛ */
    public abstract s<WebView, T> mo542();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m3344(v<T>.b bVar) {
        this.f3289 = bVar;
    }

    /* renamed from: ｋ */
    public abstract void mo545(T t10, List<WebView> list);

    /* renamed from: ﾇ */
    public abstract View mo546(T t10);

    /* renamed from: ﾇ */
    public abstract ab mo547();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m3346(it itVar) {
        this.f3290 = itVar;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public void mo3345(T t10) throws JSONException {
        mo614(new JSONObject(), (((b) this.f3289).f3308 ? this.f3287.get(t10) : this.f3288).m572(), t10);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public void mo3347(T t10, String str) throws JSONException {
        m3343(new JSONObject(), (JSONObject) t10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public void m3342(T t10, List<WebView> list) {
        ab abVar;
        ab abVar2;
        if (((b) this.f3289).f3308) {
            abVar = this.f3287.get(t10);
        } else {
            abVar = this.f3288;
        }
        abVar.m574(list);
        if (((b) this.f3289).f3311) {
            if (((b) this.f3289).f3308) {
                abVar2 = this.f3287.get(t10);
            } else {
                abVar2 = this.f3288;
            }
            abVar2.m579(Integer.toHexString(list.get(0).hashCode()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.y, com.ironsource.adqualitysdk.sdk.i.s
    /* renamed from: ｋ */
    public final /* synthetic */ void mo577(JSONObject jSONObject, Object obj, Object obj2) throws JSONException {
        super.mo580(jSONObject, (JSONObject) obj, (WebView) obj2);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* renamed from: ｋ */
    public final String mo575(T t10) {
        ab abVar;
        if (((b) this.f3289).f3308) {
            abVar = this.f3287.get(t10);
        } else {
            abVar = this.f3288;
        }
        return abVar.mo575((ab) t10);
    }
}
