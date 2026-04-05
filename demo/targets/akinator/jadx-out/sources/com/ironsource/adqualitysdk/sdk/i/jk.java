package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.kc;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class jk {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static jk f3013;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, e> f3014;

    /* renamed from: ｋ, reason: contains not printable characters */
    private Map<String, e> f3016 = new HashMap();

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Handler f3015 = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum e {
        f3023,
        f3022,
        f3024;


        /* renamed from: ﮐ, reason: contains not printable characters */
        private static int f3020 = 1;

        /* renamed from: ﱟ, reason: contains not printable characters */
        private static int f3021;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static long f3025;

        static {
            m3023();
            int i10 = f3021 + 87;
            f3020 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public static e valueOf(String str) {
            f3021 = (f3020 + 85) % 128;
            e eVar = (e) Enum.valueOf(e.class, str);
            f3020 = (f3021 + 109) % 128;
            return eVar;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static e[] valuesCustom() {
            f3021 = (f3020 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE) % 128;
            e[] eVarArr = (e[]) values().clone();
            int i10 = f3021 + 89;
            f3020 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 6 / 0;
            }
            return eVarArr;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m3021(String str, int i10) {
            String str2;
            char[] charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = charArray;
            synchronized (i.f2622) {
                try {
                    char[] cArrM2781 = i.m2781(f3025, cArr, i10);
                    i.f2623 = 4;
                    while (true) {
                        int i11 = i.f2623;
                        if (i11 < cArrM2781.length) {
                            i.f2624 = i11 - 4;
                            cArrM2781[i11] = (char) ((cArrM2781[i11] ^ cArrM2781[i11 % 4]) ^ (r2 * f3025));
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

        /* renamed from: ﾒ, reason: contains not printable characters */
        public static void m3023() {
            f3025 = 1218391058915700659L;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        public static e m3022(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            int iHashCode = str.hashCode();
            if (iHashCode == 3642) {
                if (!str.equals(m3021("淣\u2e6a涑膵\uf7f5䏼", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1).intern())) {
                    return null;
                }
                int i10 = f3020 + 97;
                f3021 = i10 % 128;
                if (i10 % 2 != 0) {
                    return null;
                }
                return f3024;
            }
            if (iHashCode != 96921) {
                if (iHashCode == 109261 && str.equals(m3021("嵊鼟崤ッ빓폺\ue15b", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1).intern())) {
                    return f3023;
                }
                return null;
            }
            if (!str.equals(m3021("黿樣麞엤ᨽ啺䔷", (ViewConfiguration.getTouchSlop() >> 8) + 1).intern())) {
                return null;
            }
            int i11 = (f3020 + 81) % 128;
            f3021 = i11;
            e eVar = f3022;
            f3020 = (i11 + 105) % 128;
            return eVar;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private synchronized Map<String, e> m3014() {
        try {
            if (this.f3014 == null) {
                this.f3014 = new HashMap();
                JSONObject jSONObjectMo820 = aq.m814().mo820();
                if (jSONObjectMo820 != null) {
                    this.f3014 = kc.m3186(jSONObjectMo820, new kc.b<e>() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.kc.b
                        /* renamed from: ﻐ */
                        public final /* synthetic */ e mo879(JSONObject jSONObject, String str) {
                            return e.m3022(jSONObject.optString(str));
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f3014;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private synchronized e m3015(Activity activity) {
        if (activity != null) {
            String name = activity.getClass().getName();
            if (m3016().containsKey(name)) {
                return m3016().get(name);
            }
            if (m3014().containsKey(name)) {
                return m3014().get(name);
            }
        }
        return e.m3022(aq.m814().mo822());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized jk m3017() {
        try {
            if (f3013 == null) {
                f3013 = new jk();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f3013;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized boolean m3020(Activity activity) {
        return e.f3022 == m3015(activity);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m3018(final String str, final e eVar) {
        this.f3015.post(new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.2
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* renamed from: ﻐ */
            public final void mo590() {
                synchronized (jk.this) {
                    jk.this.f3016.put(str, eVar);
                }
            }
        });
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m3019(Activity activity) {
        return e.f3024 == m3015(activity);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private synchronized Map<String, e> m3016() {
        return new HashMap(this.f3016);
    }
}
