package io.odeeo.internal.b;

import android.os.Bundle;
import io.odeeo.internal.b.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v0 extends o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g.a<v0> f63054d = new is.b(7);

    /* renamed from: b, reason: collision with root package name */
    public final int f63055b;

    /* renamed from: c, reason: collision with root package name */
    public final float f63056c;

    public v0(int i10) {
        io.odeeo.internal.q0.a.checkArgument(i10 > 0, "maxStars must be a positive integer");
        this.f63055b = i10;
        this.f63056c = -1.0f;
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public static v0 b(Bundle bundle) {
        io.odeeo.internal.q0.a.checkArgument(bundle.getInt(a(0), -1) == 2);
        int i10 = bundle.getInt(a(1), 5);
        float f10 = bundle.getFloat(a(2), -1.0f);
        return f10 == -1.0f ? new v0(i10) : new v0(i10, f10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f63055b == v0Var.f63055b && this.f63056c == v0Var.f63056c;
    }

    public int getMaxStars() {
        return this.f63055b;
    }

    public float getStarRating() {
        return this.f63056c;
    }

    public int hashCode() {
        return io.odeeo.internal.t0.p.hashCode(Integer.valueOf(this.f63055b), Float.valueOf(this.f63056c));
    }

    @Override // io.odeeo.internal.b.o0
    public boolean isRated() {
        return this.f63056c != -1.0f;
    }

    @Override // io.odeeo.internal.b.o0, io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(a(0), 2);
        bundle.putInt(a(1), this.f63055b);
        bundle.putFloat(a(2), this.f63056c);
        return bundle;
    }

    public v0(int i10, float f10) {
        boolean z10 = false;
        io.odeeo.internal.q0.a.checkArgument(i10 > 0, "maxStars must be a positive integer");
        if (f10 >= 0.0f && f10 <= i10) {
            z10 = true;
        }
        io.odeeo.internal.q0.a.checkArgument(z10, "starRating is out of range [0, maxStars]");
        this.f63055b = i10;
        this.f63056c = f10;
    }
}
