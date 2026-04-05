package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amazon.device.ads.DTBMetricReport;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.openadsdk.core.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif {

    /* renamed from: cm, reason: collision with root package name */
    private static boolean f20358cm;

    /* renamed from: jd, reason: collision with root package name */
    private static String f20359jd;
    private static String jpo;
    private static String wqx;

    private static Context cm(Context context) {
        return context == null ? sq.jpo() : context;
    }

    public static String jd(Context context) {
        if (f20359jd == null && !f20358cm) {
            synchronized (Cif.class) {
                try {
                    if (!f20358cm) {
                        my(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f20359jd;
    }

    private static void jj(Context context) {
        if (cm(context) == null) {
            return;
        }
        String strJd = wqx.jpo().jd("abcd", (String) null);
        if (TextUtils.isEmpty(strJd)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strJd);
            int iOptInt = jSONObject.optInt("cypher", -1);
            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
            if (iOptInt == 3) {
                String strWqx = com.bytedance.sdk.component.utils.jpo.wqx(strOptString);
                if (TextUtils.isEmpty(strWqx)) {
                    return;
                }
                jpo = new JSONObject(strWqx).optString("abcd");
                jpo();
            }
        } catch (Throwable unused) {
        }
    }

    public static String jpo(Context context) {
        if (!TextUtils.isEmpty(jpo)) {
            return jpo;
        }
        jj(context);
        return jpo;
    }

    private static void my(Context context) {
        if (f20358cm || cm(context) == null) {
            return;
        }
        f20359jd = String.valueOf(Build.TIME);
        wqx = wqx.jpo().jd("uuid", (String) null);
        f20358cm = true;
    }

    public static String wqx(Context context) {
        if (TextUtils.isEmpty(wqx) && !f20358cm) {
            synchronized (Cif.class) {
                try {
                    if (!f20358cm) {
                        my(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return wqx;
    }

    public static void jpo(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.equals(jpo)) {
                jpo = str;
            }
            jpo();
        }
        if (TextUtils.isEmpty(jpo)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.yd.wqx.jd(jpo);
        ju.jpo(jpo);
    }

    public static String jd() {
        try {
            Locale locale = LocaleList.getDefault().get(0);
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String string = locale.toString();
            if (locale.toString().length() >= 5) {
                string = string.substring(0, 5);
            }
            if (Locale.SIMPLIFIED_CHINESE.toString().equals(string)) {
                return "zh";
            }
            return "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void jpo() {
        if (TextUtils.isEmpty(jpo)) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.duq.jd(new com.bytedance.sdk.component.xyk.xyk("update_did") { // from class: com.bytedance.sdk.openadsdk.core.if.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(DTBMetricReport.TIME, SystemClock.elapsedRealtime());
                    jSONObject.put("abcd", Cif.jpo);
                    wqx.jpo().jpo("abcd", com.bytedance.sdk.component.utils.jpo.jpo(jSONObject).toString());
                } catch (Throwable unused) {
                }
            }
        });
    }
}
