package io.odeeo.internal.b;

import android.os.Bundle;
import io.odeeo.internal.b.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v extends o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g.a<v> f63051d = new is.b(6);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f63052b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f63053c;

    public v() {
        this.f63052b = false;
        this.f63053c = false;
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public static v b(Bundle bundle) {
        io.odeeo.internal.q0.a.checkArgument(bundle.getInt(a(0), -1) == 0);
        return bundle.getBoolean(a(1), false) ? new v(bundle.getBoolean(a(2), false)) : new v();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f63053c == vVar.f63053c && this.f63052b == vVar.f63052b;
    }

    public int hashCode() {
        return io.odeeo.internal.t0.p.hashCode(Boolean.valueOf(this.f63052b), Boolean.valueOf(this.f63053c));
    }

    public boolean isHeart() {
        return this.f63053c;
    }

    @Override // io.odeeo.internal.b.o0
    public boolean isRated() {
        return this.f63052b;
    }

    @Override // io.odeeo.internal.b.o0, io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(a(0), 0);
        bundle.putBoolean(a(1), this.f63052b);
        bundle.putBoolean(a(2), this.f63053c);
        return bundle;
    }

    public v(boolean z10) {
        this.f63052b = true;
        this.f63053c = z10;
    }
}
