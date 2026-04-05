package com.bytedance.sdk.openadsdk.multipro.cm;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.jpo;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.zz;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class jd {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> jpo;

    private static void jd(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = jpo;
        if (softReference == null || softReference.get() == null || (map = jpo.get().get(jpo(str))) == null) {
            return;
        }
        map.clear();
    }

    public static SharedPreferences jpo(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(jpo(str), 0);
        } catch (Throwable th2) {
            nmd.wqx("SPMultiHelperImpl", "getSharedPreferences error ", th2.getMessage());
            return null;
        }
    }

    public static Map<String, ?> wqx(Context context, String str) {
        SharedPreferences sharedPreferencesJpo = jpo(context, str);
        if (sharedPreferencesJpo == null) {
            return null;
        }
        return sharedPreferencesJpo.getAll();
    }

    private static String jpo(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object jd(Context context, String str, String str2, String str3) {
        String strJpo = jpo(str);
        if (!jpo(context, strJpo, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase("string")) {
            return jpo.jpo(context, strJpo, str2, (String) null);
        }
        if (str3.equalsIgnoreCase("boolean")) {
            return Boolean.valueOf(jpo.jpo(context, strJpo, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(jpo.jpo(context, strJpo, str2, 0));
        }
        if (str3.equalsIgnoreCase("long")) {
            return Long.valueOf(jpo.jpo(context, strJpo, str2, 0L));
        }
        if (str3.equalsIgnoreCase("float")) {
            return Float.valueOf(jpo.jpo(context, strJpo, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return jpo.jpo(context, strJpo, str2, (String) null);
        }
        return null;
    }

    private static Object jpo(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = jpo;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(jpo(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static void jpo(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = jpo;
        if (softReference == null || softReference.get() == null) {
            jpo = new SoftReference<>(new ConcurrentHashMap());
        }
        String strJpo = jpo(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = jpo.get();
        if (concurrentHashMap.get(strJpo) == null) {
            concurrentHashMap.put(strJpo, new HashMap());
        }
        concurrentHashMap.get(strJpo).put(str2, obj);
    }

    public static synchronized <T> void jpo(Context context, String str, String str2, T t10) {
        String strJpo = jpo.jpo(str, str2);
        if (zz.qk(strJpo)) {
            com.bytedance.sdk.component.jpo jpoVarJpo = com.bytedance.sdk.component.jpo.jpo(context, strJpo);
            if (t10.equals(jpo(strJpo, str2))) {
                return;
            }
            jpo.wqx wqxVarJd = jpoVarJpo.jd();
            jpo(wqxVarJd, str2, (Object) t10);
            wqxVarJd.apply();
            jpo(strJpo, str2, t10);
            return;
        }
        SharedPreferences sharedPreferencesJpo = jpo(context, strJpo);
        if (sharedPreferencesJpo == null) {
            return;
        }
        if (t10.equals(jpo(strJpo, str2))) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesJpo.edit();
        jpo(editorEdit, str2, t10);
        editorEdit.apply();
        jpo(strJpo, str2, t10);
    }

    public static void jd(Context context, String str, String str2) {
        try {
            String strJpo = jpo.jpo(str, str2);
            if (zz.qk(strJpo)) {
                com.bytedance.sdk.component.jpo.jpo(context, strJpo).jd().remove(str2).apply();
                return;
            }
            SharedPreferences sharedPreferencesJpo = jpo(context, strJpo);
            if (sharedPreferencesJpo == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesJpo.edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = jpo;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = jpo.get().get(jpo(strJpo));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void jd(Context context, String str) {
        if (zz.qk(str)) {
            com.bytedance.sdk.component.jpo.jpo(context, str).jd().clear().apply();
            jd(str);
            return;
        }
        SharedPreferences sharedPreferencesJpo = jpo(context, str);
        if (sharedPreferencesJpo == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesJpo.edit();
        editorEdit.clear();
        editorEdit.apply();
        jd(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void jpo(SharedPreferences.Editor editor, String str, T t10) {
        if (t10 instanceof Integer) {
            editor.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            editor.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            editor.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            editor.putString(str, (String) t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void jpo(jpo.wqx wqxVar, String str, T t10) {
        if (t10 instanceof Integer) {
            wqxVar.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            wqxVar.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            wqxVar.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            wqxVar.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            wqxVar.putString(str, (String) t10);
        }
    }

    public static String jpo(Context context, String str, String str2, String str3) {
        Object objJpo = jpo(str, str2);
        if (objJpo != null) {
            return String.valueOf(objJpo);
        }
        Object objJd = jd(context, str, str2, str3);
        jpo(str, str2, objJd);
        return String.valueOf(objJd);
    }

    public static boolean jpo(Context context, String str, String str2) {
        String strJpo = jpo.jpo(str, str2);
        if (zz.qk(strJpo)) {
            return com.bytedance.sdk.component.jpo.jpo(context, strJpo).jpo(str2);
        }
        SharedPreferences sharedPreferencesJpo = jpo(context, strJpo);
        return sharedPreferencesJpo != null && sharedPreferencesJpo.contains(str2);
    }
}
