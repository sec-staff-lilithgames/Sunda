package io.odeeo.internal.b;

import android.os.Bundle;
import io.odeeo.internal.b.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x0 extends o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g.a<x0> f63069d = new is.b(8);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f63070b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f63071c;

    public x0() {
        this.f63070b = false;
        this.f63071c = false;
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public static x0 b(Bundle bundle) {
        io.odeeo.internal.q0.a.checkArgument(bundle.getInt(a(0), -1) == 3);
        return bundle.getBoolean(a(1), false) ? new x0(bundle.getBoolean(a(2), false)) : new x0();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f63071c == x0Var.f63071c && this.f63070b == x0Var.f63070b;
    }

    public int hashCode() {
        return io.odeeo.internal.t0.p.hashCode(Boolean.valueOf(this.f63070b), Boolean.valueOf(this.f63071c));
    }

    @Override // io.odeeo.internal.b.o0
    public boolean isRated() {
        return this.f63070b;
    }

    public boolean isThumbsUp() {
        return this.f63071c;
    }

    @Override // io.odeeo.internal.b.o0, io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(a(0), 3);
        bundle.putBoolean(a(1), this.f63070b);
        bundle.putBoolean(a(2), this.f63071c);
        return bundle;
    }

    public x0(boolean z10) {
        this.f63070b = true;
        this.f63071c = z10;
    }
}
