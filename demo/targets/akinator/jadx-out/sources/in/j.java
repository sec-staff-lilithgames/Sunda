package in;

import android.os.Bundle;
import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final String f59810d = a1.intToStringMaxRadix(0);

    /* renamed from: e, reason: collision with root package name */
    public static final String f59811e = a1.intToStringMaxRadix(1);

    /* renamed from: f, reason: collision with root package name */
    public static final String f59812f = a1.intToStringMaxRadix(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f59813a;

    /* renamed from: b, reason: collision with root package name */
    public final int f59814b;

    /* renamed from: c, reason: collision with root package name */
    public final int f59815c;

    public j(int i10, int i11, int i12) {
        this.f59813a = i10;
        this.f59814b = i11;
        this.f59815c = i12;
    }

    public static j fromBundle(Bundle bundle) {
        return new j(bundle.getInt(f59810d), bundle.getInt(f59811e), bundle.getInt(f59812f));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f59810d, this.f59813a);
        bundle.putInt(f59811e, this.f59814b);
        bundle.putInt(f59812f, this.f59815c);
        return bundle;
    }
}
