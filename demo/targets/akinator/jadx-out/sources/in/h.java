package in;

import android.os.Bundle;
import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final String f59806c = a1.intToStringMaxRadix(0);

    /* renamed from: d, reason: collision with root package name */
    public static final String f59807d = a1.intToStringMaxRadix(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f59808a;

    /* renamed from: b, reason: collision with root package name */
    public final int f59809b;

    public h(String str, int i10) {
        this.f59808a = str;
        this.f59809b = i10;
    }

    public static h fromBundle(Bundle bundle) {
        return new h((String) io.bidmachine.media3.common.util.a.checkNotNull(bundle.getString(f59806c)), bundle.getInt(f59807d));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(f59806c, this.f59808a);
        bundle.putInt(f59807d, this.f59809b);
        return bundle;
    }
}
