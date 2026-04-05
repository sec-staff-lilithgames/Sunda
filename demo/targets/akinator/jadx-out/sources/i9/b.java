package i9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import n8.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f59434a = new ConcurrentHashMap();

    public static q obtain(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap = f59434a;
        q qVar = (q) concurrentHashMap.get(packageName);
        if (qVar != null) {
            return qVar;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
            packageInfo = null;
        }
        d dVar = new d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
        q qVar2 = (q) concurrentHashMap.putIfAbsent(packageName, dVar);
        return qVar2 == null ? dVar : qVar2;
    }
}
