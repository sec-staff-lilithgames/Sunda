package com.bytedance.sdk.openadsdk.multipro.cm;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.jj.jpo.jj;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz;
import j1.o2;
import java.util.HashSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public static HashSet<String> jpo = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.multipro.cm.jpo.1
        {
            add("app_id");
            add("tt_gdpr");
            add("extra_data");
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    private static String cm() {
        return o2.o(new StringBuilder(), com.bytedance.sdk.openadsdk.multipro.cm.f21284jd, "/t_sp/");
    }

    private static jj jd() {
        try {
            if (jpo()) {
                return com.bytedance.sdk.openadsdk.multipro.jpo.jpo.jpo(sq.jpo());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean jpo() {
        return sq.jpo() != null;
    }

    private static Context wqx() {
        return sq.jpo();
    }

    public static synchronized void jpo(String str, String str2, Boolean bool) {
        if (jpo()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                    jd.jpo(wqx(), str, str2, bool);
                    return;
                }
                jj jjVarJd = jd();
                if (jjVarJd != null) {
                    Uri uri = Uri.parse(cm() + "boolean/" + str2 + jd(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", bool);
                    jjVarJd.jpo(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static String jd(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "?sp_file_name=".concat(String.valueOf(str));
    }

    public static String jd(String str, String str2, String str3) {
        if (jpo()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                    return jpo(wqx(), str, str2, str3);
                }
                jj jjVarJd = jd();
                if (jjVarJd != null) {
                    String strJpo = jjVarJd.jpo(Uri.parse(cm() + "string/" + str2 + jd(str)));
                    if (strJpo != null && !strJpo.equals(AbstractJsonLexerKt.NULL)) {
                        return strJpo;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return str3;
    }

    public static void jd(String str, String str2) {
        if (jpo()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                    jd.jd(wqx(), str, str2);
                    return;
                }
                jj jjVarJd = jd();
                if (jjVarJd != null) {
                    jjVarJd.jpo(Uri.parse(cm() + "long/" + str2 + jd(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void jpo(String str, String str2, String str3) {
        if (jpo()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                    jd.jpo(wqx(), str, str2, str3);
                    return;
                }
                jj jjVarJd = jd();
                if (jjVarJd != null) {
                    Uri uri = Uri.parse(cm() + "string/" + str2 + jd(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", str3);
                    jjVarJd.jpo(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void jpo(String str, String str2, Integer num) {
        if (jpo()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                    jd.jpo(wqx(), str, str2, num);
                    return;
                }
                jj jjVarJd = jd();
                if (jjVarJd != null) {
                    Uri uri = Uri.parse(cm() + "int/" + str2 + jd(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", num);
                    jjVarJd.jpo(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void jpo(String str, String str2, Long l9) {
        if (jpo()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                    jd.jpo(wqx(), str, str2, l9);
                    return;
                }
                jj jjVarJd = jd();
                if (jjVarJd != null) {
                    Uri uri = Uri.parse(cm() + "long/" + str2 + jd(str));
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("value", l9);
                    jjVarJd.jpo(uri, contentValues, null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static String jpo(Context context, String str, String str2, String str3) {
        String strJpo = jpo(str, str2);
        if (zz.qk(strJpo)) {
            return com.bytedance.sdk.component.jpo.jpo(context, strJpo).jpo(str2, str3);
        }
        SharedPreferences sharedPreferencesJpo = jd.jpo(context, strJpo);
        return sharedPreferencesJpo == null ? str3 : sharedPreferencesJpo.getString(str2, str3);
    }

    public static String jpo(String str, String str2) {
        return jpo.contains(str2) ? "pag_sp_bad_par" : str;
    }

    public static int jpo(String str, String str2, int i10) {
        if (jpo()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                    return jpo(wqx(), str, str2, i10);
                }
                jj jjVarJd = jd();
                if (jjVarJd != null) {
                    String strJpo = jjVarJd.jpo(Uri.parse(cm() + "int/" + str2 + jd(str)));
                    if (strJpo != null && !strJpo.equals(AbstractJsonLexerKt.NULL)) {
                        return Integer.parseInt(strJpo);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return i10;
    }

    public static int jpo(Context context, String str, String str2, int i10) {
        String strJpo = jpo(str, str2);
        if (zz.qk(strJpo)) {
            return com.bytedance.sdk.component.jpo.jpo(context, strJpo).jpo(str2, i10);
        }
        SharedPreferences sharedPreferencesJpo = jd.jpo(context, strJpo);
        return sharedPreferencesJpo == null ? i10 : sharedPreferencesJpo.getInt(str2, i10);
    }

    public static float jpo(Context context, String str, String str2, float f10) {
        String strJpo = jpo(str, str2);
        if (zz.qk(strJpo)) {
            return com.bytedance.sdk.component.jpo.jpo(context, strJpo).jpo(str2, f10);
        }
        SharedPreferences sharedPreferencesJpo = jd.jpo(context, strJpo);
        return sharedPreferencesJpo == null ? f10 : sharedPreferencesJpo.getFloat(str2, f10);
    }

    public static boolean jpo(String str, String str2, boolean z10) {
        if (jpo()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                    return jpo(wqx(), str, str2, z10);
                }
                jj jjVarJd = jd();
                if (jjVarJd != null) {
                    String strJpo = jjVarJd.jpo(Uri.parse(cm() + "boolean/" + str2 + jd(str)));
                    if (strJpo != null && !strJpo.equals(AbstractJsonLexerKt.NULL)) {
                        return Boolean.parseBoolean(strJpo);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return z10;
    }

    public static boolean jpo(Context context, String str, String str2, boolean z10) {
        String strJpo = jpo(str, str2);
        if (zz.qk(strJpo)) {
            return com.bytedance.sdk.component.jpo.jpo(context, strJpo).jpo(str2, z10);
        }
        SharedPreferences sharedPreferencesJpo = jd.jpo(context, strJpo);
        return sharedPreferencesJpo == null ? z10 : sharedPreferencesJpo.getBoolean(str2, z10);
    }

    public static long jpo(String str, String str2, long j10) {
        if (jpo()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                    return jpo(wqx(), str, str2, j10);
                }
                jj jjVarJd = jd();
                if (jjVarJd != null) {
                    String strJpo = jjVarJd.jpo(Uri.parse(cm() + "long/" + str2 + jd(str)));
                    if (strJpo != null && !strJpo.equals(AbstractJsonLexerKt.NULL)) {
                        return Long.parseLong(strJpo);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return j10;
    }

    public static long jpo(Context context, String str, String str2, long j10) {
        String strJpo = jpo(str, str2);
        if (zz.qk(strJpo)) {
            return com.bytedance.sdk.component.jpo.jpo(context, strJpo).jpo(str2, j10);
        }
        SharedPreferences sharedPreferencesJpo = jd.jpo(context, strJpo);
        return sharedPreferencesJpo == null ? j10 : sharedPreferencesJpo.getLong(str2, j10);
    }

    public static void jpo(String str) {
        if (jpo()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                    jd.jd(wqx(), str);
                    return;
                }
                jj jjVarJd = jd();
                if (jjVarJd != null) {
                    jjVarJd.jpo(Uri.parse(cm() + "clean" + jd(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
