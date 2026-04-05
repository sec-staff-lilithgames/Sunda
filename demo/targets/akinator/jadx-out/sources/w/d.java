package w;

import android.os.Bundle;
import android.os.Parcelable;
import kc.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable[] f90274a;

    public d(Parcelable[] parcelableArr) {
        this.f90274a = parcelableArr;
    }

    public static d fromBundle(Bundle bundle) {
        p.n(bundle, "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS");
        return new d(bundle.getParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS"));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", this.f90274a);
        return bundle;
    }
}
