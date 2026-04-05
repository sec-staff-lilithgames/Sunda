package io.odeeo.internal.b;

import android.os.Bundle;
import io.odeeo.internal.b.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class o0 implements g {

    /* renamed from: a, reason: collision with root package name */
    public static final g.a<o0> f62873a = new is.b(2);

    public static o0 a(Bundle bundle) {
        int i10 = bundle.getInt(a(0), -1);
        if (i10 == 0) {
            return (o0) v.f63051d.mo3834fromBundle(bundle);
        }
        if (i10 == 1) {
            return (o0) h0.f62714c.mo3834fromBundle(bundle);
        }
        if (i10 == 2) {
            return (o0) v0.f63054d.mo3834fromBundle(bundle);
        }
        if (i10 == 3) {
            return (o0) x0.f63069d.mo3834fromBundle(bundle);
        }
        throw new IllegalArgumentException(a.b.e(i10, "Encountered unknown rating type: "));
    }

    public abstract boolean isRated();

    @Override // io.odeeo.internal.b.g
    public abstract /* synthetic */ Bundle toBundle();

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
