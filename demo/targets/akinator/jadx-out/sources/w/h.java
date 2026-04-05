package w;

import android.os.Bundle;
import kc.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f90282a;

    public h(boolean z10) {
        this.f90282a = z10;
    }

    public static h fromBundle(Bundle bundle) {
        p.n(bundle, "android.support.customtabs.trusted.NOTIFICATION_SUCCESS");
        return new h(bundle.getBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS"));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", this.f90282a);
        return bundle;
    }
}
