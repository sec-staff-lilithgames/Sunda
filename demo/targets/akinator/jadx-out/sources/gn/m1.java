package gn;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f58005a = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    public static m1 fromBundle(Bundle bundle) {
        int i10 = bundle.getInt(f58005a, -1);
        if (i10 == 0) {
            return x.fromBundle(bundle);
        }
        if (i10 == 1) {
            return a1.fromBundle(bundle);
        }
        if (i10 == 2) {
            return n1.fromBundle(bundle);
        }
        if (i10 == 3) {
            return p1.fromBundle(bundle);
        }
        throw new IllegalArgumentException(a.b.e(i10, "Unknown RatingType: "));
    }

    public abstract boolean isRated();

    public abstract Bundle toBundle();
}
