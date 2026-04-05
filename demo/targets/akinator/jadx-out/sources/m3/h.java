package m3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.Executors;
import ji.t;
import sh.n1;
import t3.v;
import w2.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h {
    public static boolean areUnusedAppRestrictionsAvailable(PackageManager packageManager) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 >= 30) || ((i10 < 30) && (getPermissionRevocationVerifierApp(packageManager) != null));
    }

    public static String getPermissionRevocationVerifierApp(PackageManager packageManager) {
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent("android.intent.action.AUTO_REVOKE_PERMISSIONS").setData(Uri.fromParts("package", "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    public static n1 getUnusedAppRestrictionsStatus(Context context) {
        s sVarCreate = s.create();
        if (!v.isUserUnlocked(context)) {
            sVarCreate.set(0);
            Log.e("PackageManagerCompat", "User is in locked direct boot mode");
            return sVarCreate;
        }
        if (!areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            sVarCreate.set(1);
            return sVarCreate;
        }
        int i10 = context.getApplicationInfo().targetSdkVersion;
        if (i10 < 30) {
            sVarCreate.set(0);
            Log.e("PackageManagerCompat", "Target SDK version below API 30");
            return sVarCreate;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            if (c4.a.a(context)) {
                sVarCreate.set(Integer.valueOf(i10 >= 31 ? 5 : 4));
                return sVarCreate;
            }
            sVarCreate.set(2);
            return sVarCreate;
        }
        if (i11 == 30) {
            sVarCreate.set(Integer.valueOf(c4.a.a(context) ? 4 : 2));
            return sVarCreate;
        }
        m mVar = new m(context);
        sVarCreate.addListener(new t(mVar, 6), Executors.newSingleThreadExecutor());
        mVar.connectAndFetchResult(sVarCreate);
        return sVarCreate;
    }
}
