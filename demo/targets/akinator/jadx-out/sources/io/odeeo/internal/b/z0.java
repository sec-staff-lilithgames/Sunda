package io.odeeo.internal.b;

import android.os.Bundle;
import io.odeeo.internal.b.g;
import io.odeeo.internal.u0.h1;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z0 implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f63197b = new z0(h1.of());

    /* renamed from: c, reason: collision with root package name */
    public static final g.a<z0> f63198c = new is.b(15);

    /* renamed from: a, reason: collision with root package name */
    public final h1<a> f63199a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements g {

        /* renamed from: e, reason: collision with root package name */
        public static final g.a<a> f63200e = new is.b(16);

        /* renamed from: a, reason: collision with root package name */
        public final io.odeeo.internal.a0.k0 f63201a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f63202b;

        /* renamed from: c, reason: collision with root package name */
        public final int f63203c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f63204d;

        public a(io.odeeo.internal.a0.k0 k0Var, int[] iArr, int i10, boolean[] zArr) {
            int i11 = k0Var.f62395a;
            io.odeeo.internal.q0.a.checkArgument(i11 == iArr.length && i11 == zArr.length);
            this.f63201a = k0Var;
            this.f63202b = (int[]) iArr.clone();
            this.f63203c = i10;
            this.f63204d = (boolean[]) zArr.clone();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f63203c == aVar.f63203c && this.f63201a.equals(aVar.f63201a) && Arrays.equals(this.f63202b, aVar.f63202b) && Arrays.equals(this.f63204d, aVar.f63204d)) {
                    return true;
                }
            }
            return false;
        }

        public io.odeeo.internal.a0.k0 getTrackGroup() {
            return this.f63201a;
        }

        public int getTrackSupport(int i10) {
            return this.f63202b[i10];
        }

        public int getTrackType() {
            return this.f63203c;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f63204d) + ((((Arrays.hashCode(this.f63202b) + (this.f63201a.hashCode() * 31)) * 31) + this.f63203c) * 31);
        }

        public boolean isSelected() {
            return io.odeeo.internal.w0.a.contains(this.f63204d, true);
        }

        public boolean isSupported() {
            for (int i10 = 0; i10 < this.f63202b.length; i10++) {
                if (isTrackSupported(i10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSelected(int i10) {
            return this.f63204d[i10];
        }

        public boolean isTrackSupported(int i10) {
            return this.f63202b[i10] == 4;
        }

        @Override // io.odeeo.internal.b.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(a(0), this.f63201a.toBundle());
            bundle.putIntArray(a(1), this.f63202b);
            bundle.putInt(a(2), this.f63203c);
            bundle.putBooleanArray(a(3), this.f63204d);
            return bundle;
        }

        public static /* synthetic */ a a(Bundle bundle) {
            io.odeeo.internal.a0.k0 k0Var = (io.odeeo.internal.a0.k0) io.odeeo.internal.q0.c.fromNullableBundle(io.odeeo.internal.a0.k0.f62394d, bundle.getBundle(a(0)));
            io.odeeo.internal.q0.a.checkNotNull(k0Var);
            return new a(k0Var, (int[]) io.odeeo.internal.t0.o.firstNonNull(bundle.getIntArray(a(1)), new int[k0Var.f62395a]), bundle.getInt(a(2), -1), (boolean[]) io.odeeo.internal.t0.o.firstNonNull(bundle.getBooleanArray(a(3)), new boolean[k0Var.f62395a]));
        }

        public static String a(int i10) {
            return Integer.toString(i10, 36);
        }
    }

    public z0(List<a> list) {
        this.f63199a = h1.copyOf((Collection) list);
    }

    public static /* synthetic */ z0 a(Bundle bundle) {
        return new z0(io.odeeo.internal.q0.c.fromBundleNullableList(a.f63200e, bundle.getParcelableArrayList(a(0)), h1.of()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        return this.f63199a.equals(((z0) obj).f63199a);
    }

    public h1<a> getTrackGroupInfos() {
        return this.f63199a;
    }

    public int hashCode() {
        return this.f63199a.hashCode();
    }

    public boolean isTypeSelected(int i10) {
        for (int i11 = 0; i11 < this.f63199a.size(); i11++) {
            a aVar = this.f63199a.get(i11);
            if (aVar.isSelected() && aVar.getTrackType() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSupportedOrEmpty(int i10) {
        boolean z10 = true;
        for (int i11 = 0; i11 < this.f63199a.size(); i11++) {
            if (this.f63199a.get(i11).f63203c == i10) {
                if (this.f63199a.get(i11).isSupported()) {
                    return true;
                }
                z10 = false;
            }
        }
        return z10;
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(a(0), io.odeeo.internal.q0.c.toBundleArrayList(this.f63199a));
        return bundle;
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
