package in;

import android.os.Bundle;
import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final String f59816b = a1.intToStringMaxRadix(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f59817a;

    public k(String str) {
        this.f59817a = str;
    }

    public static k fromBundle(Bundle bundle) {
        return new k((String) io.bidmachine.media3.common.util.a.checkNotNull(bundle.getString(f59816b)));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(f59816b, this.f59817a);
        return bundle;
    }
}
