package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class C1 {
    public static boolean a() {
        return true;
    }

    public static String b(Context context) {
        try {
            return a(context).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    public static String c(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getPath();
        }
        return null;
    }

    public static boolean d(Context context, String str) throws PackageManager.NameNotFoundException {
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        z10 = false;
        if (!TextUtils.isEmpty(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    boolean zEquals = false;
                    while (true) {
                        try {
                            String[] strArr = packageInfo.requestedPermissions;
                            if (i10 >= strArr.length || zEquals) {
                                break;
                            }
                            zEquals = str.equals(strArr[i10]);
                            i10++;
                        } catch (Exception e10) {
                            e = e10;
                            z10 = zEquals;
                            C3422r4.d().a(e);
                            IronLog.INTERNAL.error(e.toString());
                            return z10;
                        }
                    }
                    return zEquals;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return z10;
    }

    public static String e(Context context) {
        String installerPackageName;
        try {
            installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            installerPackageName = null;
        }
        return TextUtils.isEmpty(installerPackageName) ? "" : installerPackageName;
    }

    public static long f(Context context) {
        try {
            return a(context).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1L;
        }
    }

    public static String g(Context context) {
        return context.getPackageName();
    }

    public static int a(Activity activity) {
        return activity.getRequestedOrientation();
    }

    public static JSONObject a(Context context, JSONArray jSONArray) throws JSONException, PackageManager.NameNotFoundException {
        JSONObject jSONObject = new JSONObject();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            int i10 = 0;
            if (jSONArray.length() == 0) {
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    jSONObject.put(strArr[i10], (packageInfo.requestedPermissionsFlags[i10] & 2) != 0 ? "Granted" : "Rejected");
                    i10++;
                }
            } else {
                List listAsList = Arrays.asList(packageInfo.requestedPermissions);
                while (i10 < jSONArray.length()) {
                    String string = jSONArray.getString(i10);
                    int iIndexOf = listAsList.indexOf(string);
                    if (iIndexOf != -1) {
                        jSONObject.put(string, (packageInfo.requestedPermissionsFlags[iIndexOf] & 2) != 0 ? "Granted" : "Rejected");
                    } else {
                        jSONObject.put(string, "notFoundInManifest");
                    }
                    i10++;
                }
            }
            return jSONObject;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    public static boolean c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static String b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return "";
        }
    }

    public static long d(Context context) {
        try {
            return a(context).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return -1L;
        }
    }

    public static PackageInfo a(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(g(context), 0);
    }

    public static String a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || TextUtils.isEmpty(str)) {
                return null;
            }
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return null;
        }
    }
}
