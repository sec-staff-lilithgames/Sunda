package l6;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f72456c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f72457a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72458b;

    public h0(String str, String str2) {
        this.f72457a = str;
        this.f72458b = str2;
        f72456c.add(this);
    }

    public static Set<h0> values() {
        return Collections.unmodifiableSet(f72456c);
    }

    public String getPublicFeatureName() {
        return this.f72457a;
    }

    public boolean isSupported(Context context) {
        return isSupportedByFramework() || isSupportedByWebView(context);
    }

    public abstract boolean isSupportedByFramework();

    public boolean isSupportedByWebView(Context context) {
        PackageInfo currentWebViewPackage = k6.v.getCurrentWebViewPackage(context);
        Bundle bundle = null;
        if (currentWebViewPackage != null) {
            ComponentName componentName = new ComponentName(currentWebViewPackage.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    bundle = androidx.browser.customtabs.a.k(context.getPackageManager(), componentName, androidx.browser.customtabs.a.o()).metaData;
                } else {
                    bundle = context.getPackageManager().getServiceInfo(componentName, 640).metaData;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (bundle == null) {
            return false;
        }
        return bundle.containsKey(this.f72458b);
    }
}
