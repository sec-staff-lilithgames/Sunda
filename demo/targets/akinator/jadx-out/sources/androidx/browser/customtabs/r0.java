package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5275a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f5276b;

    public r0(boolean z10, Uri uri) {
        this.f5275a = z10;
        this.f5276b = uri;
    }

    public static r0 a(Bundle bundle) {
        return new r0(bundle.getBoolean("androidx.browser.customtabs.PrefetchOptions.KEY_REQUIRES_ANONYMOUS_IP_WHEN_CROSS_ORIGIN"), Build.VERSION.SDK_INT >= 33 ? (Uri) a.b(bundle, "androidx.browser.customtabs.PrefetchOptions.KEY_SOURCE_ORIGIN") : (Uri) bundle.getParcelable("androidx.browser.customtabs.PrefetchOptions.KEY_SOURCE_ORIGIN"));
    }
}
