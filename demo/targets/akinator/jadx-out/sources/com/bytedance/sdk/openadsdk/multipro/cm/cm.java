package com.bytedance.sdk.openadsdk.multipro.cm;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.jpo;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    private static String jd(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    private static boolean jpo() {
        return sq.jpo() == null;
    }

    public static void jpo(String str, String str2, Boolean bool) {
        if (jpo()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo.jpo(jd(str), str2, bool);
        } else {
            jpo(jd(str), str2, bool);
        }
    }

    public static String jd(String str, String str2, String str3) {
        if (jpo()) {
            return str3;
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            return jpo.jd(jd(str), str2, str3);
        }
        return jpo.jpo(sq.jpo(), jd(str), str2, str3);
    }

    public static void jpo(String str, String str2, Long l9) {
        if (jpo()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo.jpo(jd(str), str2, l9);
        } else {
            jpo(jd(str), str2, l9);
        }
    }

    public static void jpo(String str, String str2, String str3) {
        if (jpo()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo.jpo(jd(str), str2, str3);
        } else {
            jpo(jd(str), str2, str3);
        }
    }

    public static void jpo(String str, String str2, Integer num) {
        if (jpo()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo.jpo(jd(str), str2, num);
        } else {
            jpo(jd(str), str2, num);
        }
    }

    public static int jpo(String str, String str2, int i10) {
        if (jpo()) {
            return i10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            return jpo.jpo(jd(str), str2, i10);
        }
        return jpo.jpo(sq.jpo(), jd(str), str2, i10);
    }

    public static boolean jpo(String str, String str2, boolean z10) {
        if (jpo()) {
            return z10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            return jpo.jpo(jd(str), str2, z10);
        }
        return jpo.jpo(sq.jpo(), jd(str), str2, z10);
    }

    public static long jpo(String str, String str2, long j10) {
        if (jpo()) {
            return j10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            return jpo.jpo(jd(str), str2, j10);
        }
        return jpo.jpo(sq.jpo(), jd(str), str2, j10);
    }

    public static void jpo(String str, String str2) {
        if (jpo()) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                jpo.jd(jd(str), str2);
            } else {
                jd.jd(sq.jpo(), jd(str), str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void jpo(String str) {
        if (jpo()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo.jpo(jd(str));
        } else {
            jd.jd(sq.jpo(), jd(str));
        }
    }

    private static <T> void jpo(String str, String str2, T t10) {
        String strJpo = jpo.jpo(str, str2);
        if (zz.qk(strJpo)) {
            jpo.wqx wqxVarJd = com.bytedance.sdk.component.jpo.jpo(sq.jpo(), jd(strJpo)).jd();
            jd.jpo(wqxVarJd, str2, (Object) t10);
            wqxVarJd.apply();
        } else {
            SharedPreferences sharedPreferencesJpo = jd.jpo(sq.jpo(), jd(strJpo));
            if (sharedPreferencesJpo == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesJpo.edit();
            jd.jpo(editorEdit, str2, t10);
            editorEdit.apply();
        }
    }
}
