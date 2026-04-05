package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.g1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2778g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f32855a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f32856b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f32857c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f32858d;

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f32859e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final byte f32860f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        PackageManager packageManager;
        byte b10 = 2;
        f32860f = (byte) 2;
        Context contextD = C2925od.d();
        String strValueOf = null;
        if (contextD != null) {
            try {
                packageManager = contextD.getPackageManager();
            } catch (Exception unused) {
            }
        } else {
            packageManager = null;
        }
        ApplicationInfo applicationInfo = packageManager != null ? packageManager.getApplicationInfo(contextD.getPackageName(), 128) : null;
        if (applicationInfo != null) {
            String str = applicationInfo.packageName;
            f32855a = str;
            f32858d = applicationInfo.loadLabel(packageManager).toString();
            kotlin.jvm.internal.e0.checkNotNull(str);
            f32856b = packageManager.getInstallerPackageName(str);
        }
        PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo(contextD.getPackageName(), 128) : null;
        if (packageInfo != null && ((strValueOf = packageInfo.versionName) == null || strValueOf.length() == 0)) {
            strValueOf = Build.VERSION.SDK_INT < 28 ? String.valueOf(packageInfo.versionCode) : String.valueOf(packageInfo.getLongVersionCode());
        }
        if (D2.a(strValueOf)) {
            f32857c = strValueOf;
        }
        try {
            b10 = R3.f32183a.R() ? !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : 0;
        } catch (Error | Exception unused2) {
        }
        f32860f = b10;
        String str2 = f32855a;
        if (str2 != null) {
            f32859e.put("u-appbid", str2);
        }
        String str3 = f32858d;
        if (str3 != null) {
            f32859e.put("u-appdnm", str3);
        }
        String str4 = f32857c;
        if (str4 != null) {
            f32859e.put("u-appver", str4);
        }
        f32859e.put("u-appsecure", String.valueOf((int) b10));
    }
}
