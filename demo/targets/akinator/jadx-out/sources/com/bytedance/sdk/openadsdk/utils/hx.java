package com.bytedance.sdk.openadsdk.utils;

import a.b;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.device.ads.DTBAdRequest;
import h2.rl.UeklptUrP;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class hx {

    /* renamed from: jd, reason: collision with root package name */
    public static boolean f21568jd = false;

    /* renamed from: jj, reason: collision with root package name */
    private static int f21569jj = Integer.MAX_VALUE;
    public static boolean jpo;
    private static String my;
    private static final CharSequence wqx = "amigo";

    /* renamed from: cm, reason: collision with root package name */
    private static final CharSequence f21567cm = "funtouch";

    /* renamed from: qk, reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f21570qk = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class jpo implements Callable<String> {
        private final String jpo;

        public jpo(String str) {
            this.jpo = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public String call() throws Exception {
            String str = (String) hx.f21570qk.get(this.jpo);
            if (str != null) {
                return str;
            }
            System.currentTimeMillis();
            String strWqx = hx.wqx(this.jpo);
            System.currentTimeMillis();
            if (strWqx != null) {
                hx.f21570qk.put(this.jpo, strWqx);
            }
            return strWqx;
        }
    }

    public static String au() {
        String strOya = oya();
        if (strOya == null || !strOya.toLowerCase().contains("emotionui")) {
            return "";
        }
        StringBuilder sbT = b.t(strOya, "_");
        sbT.append(Build.DISPLAY);
        return sbT.toString();
    }

    public static boolean cm() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    public static String hna() {
        if (prr()) {
            try {
                return "smartisan_".concat(String.valueOf(cm("ro.smartisan.version")));
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    /* renamed from: if, reason: not valid java name */
    public static String m496if() {
        if (!my()) {
            return "";
        }
        return "miui_" + cm("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    public static String jj() {
        return cm("ro.vivo.os.build.display.id") + "_" + cm("ro.vivo.product.version");
    }

    public static String jpo() throws JSONException {
        if (!TextUtils.isEmpty(my)) {
            return my;
        }
        String strJpo = com.bytedance.sdk.openadsdk.core.zz.jpo("sdk_local_rom_info", DTBAdRequest.WEEK);
        my = strJpo;
        if (TextUtils.isEmpty(strJpo)) {
            String strTu = tu();
            my = strTu;
            com.bytedance.sdk.openadsdk.core.zz.jpo("sdk_local_rom_info", strTu);
        }
        return my;
    }

    public static String jr() {
        if (!opi()) {
            return "";
        }
        return "coloros_" + cm(tic.qk("ro.build.version.kllkrom")) + "_" + Build.DISPLAY;
    }

    public static boolean ju() {
        return !TextUtils.isEmpty(cm("ro.letv.release.version"));
    }

    public static boolean my() throws ClassNotFoundException {
        if (!f21568jd) {
            try {
                Class.forName("miui.os.Build");
                jpo = true;
                f21568jd = true;
                return true;
            } catch (Exception unused) {
                f21568jd = true;
            }
        }
        return jpo;
    }

    public static boolean nmd() {
        try {
            String str = Build.BRAND;
            if (TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("huawei")) {
                String str2 = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str2)) {
                    return false;
                }
                if (!str2.toLowerCase().startsWith("huawei")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean opi() {
        if (f21569jj == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String strQk = tic.qk("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(strQk)) {
                f21569jj = 0;
            } else {
                f21569jj = 1;
            }
        }
        return f21569jj == 1;
    }

    public static String oya() {
        return cm("ro.build.version.emui");
    }

    public static boolean prr() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    public static boolean qk() {
        String strCm = cm("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(strCm) && strCm.toLowerCase().contains(f21567cm);
    }

    public static String sq() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    private static String tu() {
        if (prr()) {
            return hna();
        }
        if (my()) {
            return m496if();
        }
        if (jd()) {
            return sq();
        }
        if (opi()) {
            return jr();
        }
        String strAu = au();
        if (!TextUtils.isEmpty(strAu)) {
            return strAu;
        }
        if (qk()) {
            return jj();
        }
        if (xyk()) {
            return zz();
        }
        if (cm()) {
            return wqx();
        }
        String strYd = yd();
        return !TextUtils.isEmpty(strYd) ? strYd : Build.DISPLAY;
    }

    public static String wqx() {
        return cm("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    public static boolean xyk() {
        String str = Build.DISPLAY;
        return !TextUtils.isEmpty(str) && str.toLowerCase().contains(wqx);
    }

    public static String yd() {
        if (!ju()) {
            return "";
        }
        return "eui_" + cm("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    public static String zz() {
        return Build.DISPLAY + "_" + cm("ro.gn.sv.version");
    }

    public static boolean jd() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals(UeklptUrP.dMVCsXyaETAoK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(4:49|3|43|4)|(2:51|5)|39|6|34|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        com.bytedance.sdk.component.utils.nmd.jpo("ToolUtils", "Exception while closing InputStream", r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String wqx(java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Exception while closing InputStream"
            java.lang.String r1 = "ToolUtils"
            java.lang.String r2 = ""
            r3 = 0
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L67
            java.lang.String r5 = "getprop "
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L67
            java.lang.String r5 = r5.concat(r6)     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L67
            java.lang.Process r4 = r4.exec(r5)     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L67
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L41
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L41
            java.io.InputStream r7 = r4.getInputStream()     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L41
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L41
            r7 = 1024(0x400, float:1.435E-42)
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L3d java.lang.IllegalThreadStateException -> L41
            java.lang.String r2 = r5.readLine()     // Catch: java.lang.Throwable -> L39 java.lang.IllegalThreadStateException -> L3b
            r4.exitValue()     // Catch: java.lang.Throwable -> L39 java.lang.IllegalThreadStateException -> L3b
        L30:
            r5.close()     // Catch: java.io.IOException -> L34
            goto L6e
        L34:
            r8 = move-exception
            com.bytedance.sdk.component.utils.nmd.jpo(r1, r0, r8)
            goto L6e
        L39:
            r3 = move-exception
            goto L43
        L3b:
            r3 = r4
            goto L68
        L3d:
            r4 = move-exception
            r5 = r3
            r3 = r4
            goto L43
        L41:
            r5 = r3
            goto L3b
        L43:
            java.lang.String r4 = "Unable to read sysprop "
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r8 = r4.concat(r8)     // Catch: java.lang.Throwable -> L5b
            com.bytedance.sdk.component.utils.nmd.jpo(r1, r8, r3)     // Catch: java.lang.Throwable -> L5b
            if (r5 == 0) goto L5a
            r5.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r8 = move-exception
            com.bytedance.sdk.component.utils.nmd.jpo(r1, r0, r8)
        L5a:
            return r2
        L5b:
            r8 = move-exception
            if (r5 == 0) goto L66
            r5.close()     // Catch: java.io.IOException -> L62
            goto L66
        L62:
            r2 = move-exception
            com.bytedance.sdk.component.utils.nmd.jpo(r1, r0, r2)
        L66:
            throw r8
        L67:
            r5 = r3
        L68:
            r3.destroy()     // Catch: java.lang.Throwable -> L6b
        L6b:
            if (r5 == 0) goto L6e
            goto L30
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.hx.wqx(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String cm(String str) {
        String str2;
        String str3 = f21570qk.get(str);
        if (str3 != null) {
            return str3;
        }
        if (!TextUtils.isEmpty("")) {
            str2 = "";
        } else {
            final com.bytedance.sdk.component.xyk.qk qkVar = new com.bytedance.sdk.component.xyk.qk(new jpo(str), 5, 2);
            duq.jd(new com.bytedance.sdk.component.xyk.xyk("_getSystemPropertyTask") { // from class: com.bytedance.sdk.openadsdk.utils.hx.1
                @Override // java.lang.Runnable
                public void run() {
                    qkVar.run();
                }
            });
            str2 = (String) qkVar.get(1L, TimeUnit.SECONDS);
        }
        return str2 == null ? "" : str2;
    }

    public static boolean jpo(String str) {
        if (TextUtils.isEmpty(str)) {
            str = oya();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || nmd();
    }
}
