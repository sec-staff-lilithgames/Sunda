package gn;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h1 {

    /* renamed from: j, reason: collision with root package name */
    public static final String f57920j = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(0);

    /* renamed from: k, reason: collision with root package name */
    public static final String f57921k = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(1);

    /* renamed from: l, reason: collision with root package name */
    public static final String f57922l = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(2);

    /* renamed from: m, reason: collision with root package name */
    public static final String f57923m = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(3);

    /* renamed from: n, reason: collision with root package name */
    public static final String f57924n = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(4);

    /* renamed from: o, reason: collision with root package name */
    public static final String f57925o = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(5);

    /* renamed from: p, reason: collision with root package name */
    public static final String f57926p = io.bidmachine.media3.common.util.a1.intToStringMaxRadix(6);

    /* renamed from: a, reason: collision with root package name */
    public final Object f57927a;

    /* renamed from: b, reason: collision with root package name */
    public final int f57928b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f57929c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f57930d;

    /* renamed from: e, reason: collision with root package name */
    public final int f57931e;

    /* renamed from: f, reason: collision with root package name */
    public final long f57932f;

    /* renamed from: g, reason: collision with root package name */
    public final long f57933g;

    /* renamed from: h, reason: collision with root package name */
    public final int f57934h;

    /* renamed from: i, reason: collision with root package name */
    public final int f57935i;

    @Deprecated
    public h1(Object obj, int i10, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this(obj, i10, p0.f58045g, obj2, i11, j10, j11, i12, i13);
    }

    public static h1 fromBundle(Bundle bundle) {
        int i10 = bundle.getInt(f57920j, 0);
        Bundle bundle2 = bundle.getBundle(f57921k);
        return new h1(null, i10, bundle2 == null ? null : p0.fromBundle(bundle2), null, bundle.getInt(f57922l, 0), bundle.getLong(f57923m, 0L), bundle.getLong(f57924n, 0L), bundle.getInt(f57925o, -1), bundle.getInt(f57926p, -1));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h1.class == obj.getClass()) {
            h1 h1Var = (h1) obj;
            if (equalsForBundling(h1Var) && Objects.equals(this.f57927a, h1Var.f57927a) && Objects.equals(this.f57930d, h1Var.f57930d)) {
                return true;
            }
        }
        return false;
    }

    public boolean equalsForBundling(h1 h1Var) {
        return this.f57928b == h1Var.f57928b && this.f57931e == h1Var.f57931e && this.f57932f == h1Var.f57932f && this.f57933g == h1Var.f57933g && this.f57934h == h1Var.f57934h && this.f57935i == h1Var.f57935i && Objects.equals(this.f57929c, h1Var.f57929c);
    }

    public h1 filterByAvailableCommands(boolean z10, boolean z11) {
        if (z10 && z11) {
            return this;
        }
        return new h1(this.f57927a, z11 ? this.f57928b : 0, z10 ? this.f57929c : null, this.f57930d, z11 ? this.f57931e : 0, z10 ? this.f57932f : 0L, z10 ? this.f57933g : 0L, z10 ? this.f57934h : -1, z10 ? this.f57935i : -1);
    }

    public int hashCode() {
        return Objects.hash(this.f57927a, Integer.valueOf(this.f57928b), this.f57929c, this.f57930d, Integer.valueOf(this.f57931e), Long.valueOf(this.f57932f), Long.valueOf(this.f57933g), Integer.valueOf(this.f57934h), Integer.valueOf(this.f57935i));
    }

    public Bundle toBundle(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f57928b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f57920j, i11);
        }
        p0 p0Var = this.f57929c;
        if (p0Var != null) {
            bundle.putBundle(f57921k, p0Var.toBundle());
        }
        int i12 = this.f57931e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(f57922l, i12);
        }
        long j10 = this.f57932f;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f57923m, j10);
        }
        long j11 = this.f57933g;
        if (i10 < 3 || j11 != 0) {
            bundle.putLong(f57924n, j11);
        }
        int i13 = this.f57934h;
        if (i13 != -1) {
            bundle.putInt(f57925o, i13);
        }
        int i14 = this.f57935i;
        if (i14 != -1) {
            bundle.putInt(f57926p, i14);
        }
        return bundle;
    }

    public h1(Object obj, int i10, p0 p0Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
        this.f57927a = obj;
        this.f57928b = i10;
        this.f57929c = p0Var;
        this.f57930d = obj2;
        this.f57931e = i11;
        this.f57932f = j10;
        this.f57933g = j11;
        this.f57934h = i12;
        this.f57935i = i13;
    }

    @Deprecated
    public Bundle toBundle() {
        return toBundle(Integer.MAX_VALUE);
    }
}
