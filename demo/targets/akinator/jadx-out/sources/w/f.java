package w;

import android.os.Bundle;
import kc.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f90277a;

    public f(String str) {
        this.f90277a = str;
    }

    public static f fromBundle(Bundle bundle) {
        p.n(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
        return new f(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("android.support.customtabs.trusted.CHANNEL_NAME", this.f90277a);
        return bundle;
    }
}
