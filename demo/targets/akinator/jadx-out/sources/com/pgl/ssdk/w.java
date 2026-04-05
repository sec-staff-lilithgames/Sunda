package com.pgl.ssdk;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static String f50496a;

    /* renamed from: b, reason: collision with root package name */
    private static long[][] f50497b;

    /* renamed from: c, reason: collision with root package name */
    private static String f50498c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TextUtils.isEmpty(w.f50498c)) {
                String unused = w.f50498c = w.d();
                ax.b(z.b(), "romtype", w.f50498c);
            }
        }
    }

    public static JSONArray[] c(Context context) throws JSONException {
        if (f50497b == null) {
            f50497b = (long[][]) com.pgl.ssdk.ces.a.meta(157, context, null);
        }
        long[][] jArr = f50497b;
        if (jArr == null || jArr.length != 2) {
            f50497b = null;
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long[][] jArr2 = f50497b;
        long[] jArr3 = jArr2[0];
        long[] jArr4 = jArr2[1];
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (int i10 = 0; i10 < jArr3.length; i10++) {
            try {
                jSONArray.put(i10, jCurrentTimeMillis - jArr3[i10]);
                jSONArray2.put(i10, jCurrentTimeMillis - jArr4[i10]);
            } catch (JSONException unused) {
            }
        }
        return new JSONArray[]{jSONArray, jSONArray2};
    }

    public static boolean d(Context context) {
        Object objMeta = com.pgl.ssdk.ces.a.meta(ModuleDescriptor.MODULE_VERSION, context, null);
        if (objMeta instanceof Boolean) {
            return ((Boolean) objMeta).booleanValue();
        }
        return false;
    }

    public static int e() {
        return ((Integer) com.pgl.ssdk.ces.a.meta(162, null, null)).intValue();
    }

    public static boolean b(Context context) {
        Object objMeta = com.pgl.ssdk.ces.a.meta(156, context, null);
        if (objMeta instanceof Boolean) {
            return ((Boolean) objMeta).booleanValue();
        }
        return false;
    }

    public static String a(Context context) {
        String str = f50496a;
        if (str != null) {
            return str;
        }
        String string = Settings.Global.getString(context.getContentResolver(), "boot_count");
        f50496a = string;
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d() {
        return (b("com.samsung.android.knox.SemPersonaManager") || b("com.samsung.android.knoxguard.KnoxGuardManager")) ? "samsung" : (b("androidhnext.Manifest") || b("androidhnext.R")) ? "honor" : (b("androidhwext.Manifest") || b("androidhwext.R")) ? "huawei" : (b("oppo.Manifest") || b("oppo.R") || b("oplus.Manifest") || b("oplus.R") || b("com.oneplus.Manifest") || b("com.oneplus.R")) ? "oppo" : (b("vivo.Manifest") || b("vivo.R")) ? "vivo" : (b("miui.Manifest") || b("miui.R") || b("miui.os.Build")) ? "xiaomi" : (b("lineageos.platform.Manifest") || b("lineageos.platform.R")) ? "lineage" : c("/system/framework/com.motorola.motosignature.jar") ? "moto" : (c("/system/framework/transsion-framework.jar") || c("/system/framework/transsion-services.jar")) ? "transsion" : "other";
    }

    private static boolean b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean c(String str) {
        try {
            return new File(str).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String c() {
        if (!TextUtils.isEmpty(f50498c)) {
            return f50498c;
        }
        String strA = ax.a(z.b(), "romtype", (String) null);
        f50498c = strA;
        if (!TextUtils.isEmpty(strA)) {
            return f50498c;
        }
        ar.b(new a());
        return "";
    }
}
