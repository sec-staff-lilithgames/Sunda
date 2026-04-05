package w;

import android.os.Bundle;
import kc.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f90275a;

    /* renamed from: b, reason: collision with root package name */
    public final int f90276b;

    public e(String str, int i10) {
        this.f90275a = str;
        this.f90276b = i10;
    }

    public static e fromBundle(Bundle bundle) {
        p.n(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
        p.n(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
        return new e(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("android.support.customtabs.trusted.PLATFORM_TAG", this.f90275a);
        bundle.putInt("android.support.customtabs.trusted.PLATFORM_ID", this.f90276b);
        return bundle;
    }
}
