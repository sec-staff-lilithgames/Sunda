package hi;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f58779a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58780b;

    /* renamed from: c, reason: collision with root package name */
    public final List f58781c;

    /* renamed from: d, reason: collision with root package name */
    public final String f58782d;

    /* renamed from: e, reason: collision with root package name */
    public final String f58783e;

    /* renamed from: f, reason: collision with root package name */
    public final String f58784f;

    /* renamed from: g, reason: collision with root package name */
    public final String f58785g;

    /* renamed from: h, reason: collision with root package name */
    public final ei.e f58786h;

    public a(String str, String str2, List<f> list, String str3, String str4, String str5, String str6, ei.e eVar) {
        this.f58779a = str;
        this.f58780b = str2;
        this.f58781c = list;
        this.f58782d = str3;
        this.f58783e = str4;
        this.f58784f = str5;
        this.f58785g = str6;
        this.f58786h = eVar;
    }

    public static a create(Context context, n0 n0Var, String str, String str2, List<f> list, ei.e eVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String installerPackageName = n0Var.getInstallerPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, list, installerPackageName, packageName, string, str3, eVar);
    }
}
