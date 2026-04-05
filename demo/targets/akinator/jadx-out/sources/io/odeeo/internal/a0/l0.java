package io.odeeo.internal.a0;

import android.os.Bundle;
import io.odeeo.internal.b.g;
import io.odeeo.internal.u0.h1;
import io.odeeo.internal.u0.z1;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l0 implements io.odeeo.internal.b.g {

    /* renamed from: d, reason: collision with root package name */
    public static final l0 f62399d = new l0(new k0[0]);

    /* renamed from: e, reason: collision with root package name */
    public static final g.a<l0> f62400e = new e6.h0(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f62401a;

    /* renamed from: b, reason: collision with root package name */
    public final k0[] f62402b;

    /* renamed from: c, reason: collision with root package name */
    public int f62403c;

    public l0(k0... k0VarArr) {
        this.f62402b = k0VarArr;
        this.f62401a = k0VarArr.length;
    }

    public static /* synthetic */ l0 a(Bundle bundle) {
        return new l0((k0[]) io.odeeo.internal.q0.c.fromBundleNullableList(k0.f62394d, bundle.getParcelableArrayList(a(0)), h1.of()).toArray(new k0[0]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l0.class == obj.getClass()) {
            l0 l0Var = (l0) obj;
            if (this.f62401a == l0Var.f62401a && Arrays.equals(this.f62402b, l0Var.f62402b)) {
                return true;
            }
        }
        return false;
    }

    public k0 get(int i10) {
        return this.f62402b[i10];
    }

    public int hashCode() {
        if (this.f62403c == 0) {
            this.f62403c = Arrays.hashCode(this.f62402b);
        }
        return this.f62403c;
    }

    public int indexOf(k0 k0Var) {
        for (int i10 = 0; i10 < this.f62401a; i10++) {
            if (this.f62402b[i10] == k0Var) {
                return i10;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f62401a == 0;
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(a(0), io.odeeo.internal.q0.c.toBundleArrayList(z1.newArrayList(this.f62402b)));
        return bundle;
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
