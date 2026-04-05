package io.odeeo.internal.b;

import android.os.Bundle;
import io.odeeo.internal.b.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h0 extends o0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g.a<h0> f62714c = new hv.t(25);

    /* renamed from: b, reason: collision with root package name */
    public final float f62715b;

    public h0() {
        this.f62715b = -1.0f;
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public static h0 b(Bundle bundle) {
        io.odeeo.internal.q0.a.checkArgument(bundle.getInt(a(0), -1) == 1);
        float f10 = bundle.getFloat(a(1), -1.0f);
        return f10 == -1.0f ? new h0() : new h0(f10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof h0) && this.f62715b == ((h0) obj).f62715b;
    }

    public float getPercent() {
        return this.f62715b;
    }

    public int hashCode() {
        return io.odeeo.internal.t0.p.hashCode(Float.valueOf(this.f62715b));
    }

    @Override // io.odeeo.internal.b.o0
    public boolean isRated() {
        return this.f62715b != -1.0f;
    }

    @Override // io.odeeo.internal.b.o0, io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(a(0), 1);
        bundle.putFloat(a(1), this.f62715b);
        return bundle;
    }

    public h0(float f10) {
        io.odeeo.internal.q0.a.checkArgument(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f62715b = f10;
    }
}
