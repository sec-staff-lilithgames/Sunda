package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.core.fid.Constants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class xyk {
    private static final AtomicReference<Boolean> jpo = new AtomicReference<>(null);

    /* renamed from: jd, reason: collision with root package name */
    private static final AtomicReference<String> f21624jd = new AtomicReference<>(null);

    public static int cm(Context context) {
        return 1;
    }

    public static int jd(Context context) {
        if (xyk(context)) {
            return 1;
        }
        if (zz(context)) {
            return 2;
        }
        return yd(context) ? 3 : 4;
    }

    public static PackageInfo jj(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return WebView.getCurrentWebViewPackage();
            }
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
            return packageInfo != null ? packageInfo : ju(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static void jpo(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (jd()) {
                com.bytedance.sdk.openadsdk.core.wqx wqxVarJpo = com.bytedance.sdk.openadsdk.core.wqx.jpo();
                wqxVarJpo.jpo("w_ver", my(context));
                wqxVarJpo.jpo("bp", jd(context));
                wqxVarJpo.jpo("is_fold", qk(context) ? 1 : 0);
                wqxVarJpo.jpo("abi", jpo());
                wqxVarJpo.jpo("t_ver", wqx(context));
                wqxVarJpo.jpo(CampaignEx.JSON_KEY_AAB, cm(context));
            }
        } catch (Throwable unused) {
        }
    }

    private static PackageInfo ju(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String my(Context context) {
        try {
            AtomicReference<String> atomicReference = f21624jd;
            String str = atomicReference.get();
            if (str != null) {
                return str;
            }
            PackageInfo packageInfoJj = jj(context);
            String str2 = packageInfoJj != null ? packageInfoJj.versionName : "";
            while (!atomicReference.compareAndSet(null, str2) && atomicReference.get() == null) {
            }
            return str2;
        } catch (Throwable unused) {
            AtomicReference<String> atomicReference2 = f21624jd;
            while (!atomicReference2.compareAndSet(null, "") && atomicReference2.get() == null) {
            }
            return "";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0057. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean qk(android.content.Context r9) {
        /*
            r9 = 0
            r0 = 0
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = com.bytedance.sdk.openadsdk.utils.xyk.jpo     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> Ldd
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> Ldd
            if (r2 == 0) goto L11
            boolean r9 = r2.booleanValue()     // Catch: java.lang.Throwable -> Ldd
            return r9
        L11:
            java.lang.String r2 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> Ldd
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Ldd
            if (r3 != 0) goto L1d
            java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Throwable -> Ldd
        L1d:
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> Ldd
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Ldd
            if (r4 != 0) goto L29
            java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Throwable -> Ldd
        L29:
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Ldd
            if (r4 == 0) goto L45
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Ldd
            if (r4 == 0) goto L45
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Ldd
        L37:
            boolean r3 = r1.compareAndSet(r9, r2)     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto L3e
            goto L44
        L3e:
            java.lang.Object r3 = r1.get()     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto L37
        L44:
            return r0
        L45:
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r5 = "xiaomi"
            java.lang.String r6 = "oppo"
            java.lang.String r7 = "vivo"
            java.lang.String r8 = "samsung"
            if (r4 != 0) goto L8c
            int r4 = r2.hashCode()     // Catch: java.lang.Throwable -> Ldd
            switch(r4) {
                case -759499589: goto L7e;
                case 3418016: goto L73;
                case 3620012: goto L68;
                case 1864941562: goto L5b;
                default: goto L5a;
            }     // Catch: java.lang.Throwable -> Ldd
        L5a:
            goto L89
        L5b:
            boolean r2 = r2.equals(r8)     // Catch: java.lang.Throwable -> Ldd
            if (r2 == 0) goto L89
            boolean r2 = cm()     // Catch: java.lang.Throwable -> Ldd
        L65:
            r4 = r2
            r2 = r0
            goto L8e
        L68:
            boolean r2 = r2.equals(r7)     // Catch: java.lang.Throwable -> Ldd
            if (r2 == 0) goto L89
            boolean r2 = jj()     // Catch: java.lang.Throwable -> Ldd
            goto L65
        L73:
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Throwable -> Ldd
            if (r2 == 0) goto L89
            boolean r2 = zz()     // Catch: java.lang.Throwable -> Ldd
            goto L65
        L7e:
            boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> Ldd
            if (r2 == 0) goto L89
            boolean r2 = my()     // Catch: java.lang.Throwable -> Ldd
            goto L65
        L89:
            r2 = 1
            r4 = r0
            goto L8e
        L8c:
            r2 = r0
            r4 = r2
        L8e:
            if (r2 == 0) goto Lcb
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> Ldd
            if (r2 != 0) goto Lcb
            int r2 = r3.hashCode()     // Catch: java.lang.Throwable -> Ldd
            switch(r2) {
                case -759499589: goto Lbf;
                case 3418016: goto Lb4;
                case 3620012: goto La9;
                case 1864941562: goto L9e;
                default: goto L9d;
            }     // Catch: java.lang.Throwable -> Ldd
        L9d:
            goto Lca
        L9e:
            boolean r2 = r3.equals(r8)     // Catch: java.lang.Throwable -> Ldd
            if (r2 == 0) goto Lca
            boolean r4 = cm()     // Catch: java.lang.Throwable -> Ldd
            goto Lcb
        La9:
            boolean r2 = r3.equals(r7)     // Catch: java.lang.Throwable -> Ldd
            if (r2 == 0) goto Lca
            boolean r4 = jj()     // Catch: java.lang.Throwable -> Ldd
            goto Lcb
        Lb4:
            boolean r2 = r3.equals(r6)     // Catch: java.lang.Throwable -> Ldd
            if (r2 == 0) goto Lca
            boolean r4 = zz()     // Catch: java.lang.Throwable -> Ldd
            goto Lcb
        Lbf:
            boolean r2 = r3.equals(r5)     // Catch: java.lang.Throwable -> Ldd
            if (r2 == 0) goto Lca
            boolean r4 = my()     // Catch: java.lang.Throwable -> Ldd
            goto Lcb
        Lca:
            r4 = r0
        Lcb:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> Ldd
        Lcf:
            boolean r3 = r1.compareAndSet(r9, r2)     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto Ld6
            return r4
        Ld6:
            java.lang.Object r3 = r1.get()     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto Lcf
            return r4
        Ldd:
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1 = com.bytedance.sdk.openadsdk.utils.xyk.jpo
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        Le1:
            boolean r3 = r1.compareAndSet(r9, r2)
            if (r3 == 0) goto Le8
            goto Lee
        Le8:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto Le1
        Lee:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.xyk.qk(android.content.Context):boolean");
    }

    public static String wqx(Context context) {
        try {
            return String.valueOf(context.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean xyk(Context context) throws ClassNotFoundException {
        try {
            Class.forName("com.unity3d.player.UnityPlayerActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libunity.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static boolean yd(Context context) throws ClassNotFoundException {
        try {
            Class.forName("com.facebook.react.ReactActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libreactnativejni.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static boolean zz(Context context) throws ClassNotFoundException {
        try {
            Class.forName("io.flutter.embedding.android.FlutterActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libflutter.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static boolean cm() {
        String lowerCase;
        if (ju()) {
            return true;
        }
        String[] strArr = {"sm-f9000", "sm-f9160", "sm-f9260", "sm-f9360", "sm-f9460", "sm-f9560", "sm-f7000", "sm-f7070", "sm-f7110", "sm-f7210", "sm-f7310", "sm-f7410"};
        String[] strArr2 = {"winner", "f2q", "q2q", "q4q", "q5q", "q6q", "bloomq", "bloomxq", "b2q", "b4q", "b5q", "b6q"};
        try {
            String lowerCase2 = Build.DEVICE.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase2)) {
                for (int i10 = 0; i10 < 12; i10++) {
                    if (lowerCase2.contains(strArr2[i10])) {
                        return true;
                    }
                }
            }
            lowerCase = Build.MODEL.toLowerCase();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(lowerCase)) {
            return false;
        }
        for (int i11 = 0; i11 < 12; i11++) {
            if (lowerCase.contains(strArr[i11])) {
                return true;
            }
        }
        if (jd()) {
            String strJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("fold_config", "fold_samung", "");
            if (TextUtils.isEmpty(strJpo)) {
                return false;
            }
            for (String str : strJpo.split(",")) {
                if (lowerCase.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean jd() {
        return com.bytedance.sdk.openadsdk.rq.jpo.jpo("fold_config", a.f37604j, 0) == 1;
    }

    public static String wqx() {
        return com.bytedance.sdk.openadsdk.rq.jpo.jpo("fold_config", "fold_default", "");
    }

    private static boolean xyk() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("BED", "isXiaomiFold return false " + th2.getMessage());
            return false;
        }
    }

    private static boolean yd() {
        try {
            Class<?> cls = Class.forName(PtLatqAYjEFT.UHvyalRiRjJam);
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), "oplus.hardware.type.fold");
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("BED", VPCjETNfjxu.FAWYZiPYpuBurwy + e10.getMessage());
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean zz() {
        if (yd()) {
            return true;
        }
        String[] strArr = {"CPH2439", "CPH2437", "CPH2499", "CPH2519", "PEUM00", "PGU110", "PGT110", "PHN110", "PHT110"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 9; i10++) {
                    if (lowerCase.contains(strArr[i10].toLowerCase())) {
                        return true;
                    }
                }
                if (jd()) {
                    String strWqx = wqx();
                    if (TextUtils.isEmpty(strWqx)) {
                        return false;
                    }
                    for (String str : strWqx.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean ju() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object objInvoke = cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
            Method declaredMethod = cls.getDeclaredMethod("getString", String.class);
            if ("TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD"))) {
                return true;
            }
            return "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("PAG_BANNER", "get ss fold device error: " + e10.getMessage());
            return false;
        }
    }

    private static boolean my() {
        if (xyk()) {
            return true;
        }
        String[] strArr = {"M2011J18C", "22061218C", "2308CPXD0C", "24072PX77C", "2405CPX3DC", "2405CPX3DG"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 6; i10++) {
                    if (lowerCase.contains(strArr[i10])) {
                        return true;
                    }
                }
                if (jd()) {
                    String strWqx = wqx();
                    if (TextUtils.isEmpty(strWqx)) {
                        return false;
                    }
                    for (String str : strWqx.split(",")) {
                        if (lowerCase.contains(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean jj() {
        if (qk()) {
            return true;
        }
        String[] strArr = {"V2330", "V2178A", "V2229A", "V2303A", "V2337A", "V2256A", "V2266A"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 7; i10++) {
                    if (lowerCase.contains(strArr[i10].toLowerCase())) {
                        return true;
                    }
                }
                if (jd()) {
                    String strWqx = wqx();
                    if (TextUtils.isEmpty(strWqx)) {
                        return false;
                    }
                    for (String str : strWqx.split(",")) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static String jpo() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception unused) {
            return "";
        }
    }

    public static void jpo(JSONObject jSONObject, Context context) {
        if (context == null) {
            return;
        }
        try {
            if (jd()) {
                com.bytedance.sdk.openadsdk.core.wqx wqxVarJpo = com.bytedance.sdk.openadsdk.core.wqx.jpo();
                String strJd = wqxVarJpo.jd("md", com.bytedance.sdk.openadsdk.core.zz.jd().qk());
                if (!TextUtils.isEmpty(strJd)) {
                    jSONObject.put("md", strJd);
                }
                int iJd = wqxVarJpo.jd("bp", jd(context));
                if (iJd != 4) {
                    jSONObject.put("bp", iJd);
                }
                String strJd2 = wqxVarJpo.jd("t_ver", wqx(context));
                if (!TextUtils.isEmpty(strJd2)) {
                    jSONObject.put("t_ver", strJd2);
                }
                jSONObject.put("is_fold", wqxVarJpo.jd("is_fold", qk(context) ? 1 : 0));
                jSONObject.put(CampaignEx.JSON_KEY_AAB, wqxVarJpo.jd(CampaignEx.JSON_KEY_AAB, cm(context)));
                String strJd3 = wqxVarJpo.jd("w_ver", my(context));
                if (!TextUtils.isEmpty(strJd3)) {
                    jSONObject.put("w_ver", strJd3);
                }
                String strJd4 = wqxVarJpo.jd("abi", jpo());
                if (TextUtils.isEmpty(strJd4)) {
                    return;
                }
                jSONObject.put("abi", strJd4);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean qk() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", null).invoke(null, null));
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("BED", "isVIVOFoldDevice return false " + th2.getMessage());
            return false;
        }
    }
}
