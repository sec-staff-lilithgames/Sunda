package nh;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l2 extends n2 {
    public static n2 a(int i10) {
        return i10 < 0 ? n2.f76490b : i10 > 0 ? n2.f76491c : n2.f76489a;
    }

    @Override // nh.n2
    public n2 compare(Comparable<?> comparable, Comparable<?> comparable2) {
        return a(comparable.compareTo(comparable2));
    }

    @Override // nh.n2
    public n2 compareFalseFirst(boolean z10, boolean z11) {
        return a(Boolean.compare(z10, z11));
    }

    @Override // nh.n2
    public n2 compareTrueFirst(boolean z10, boolean z11) {
        return a(Boolean.compare(z11, z10));
    }

    @Override // nh.n2
    public int result() {
        return 0;
    }

    @Override // nh.n2
    public <T> n2 compare(T t10, T t11, Comparator<T> comparator) {
        return a(comparator.compare(t10, t11));
    }

    @Override // nh.n2
    public n2 compare(int i10, int i11) {
        return a(Integer.compare(i10, i11));
    }

    @Override // nh.n2
    public n2 compare(long j10, long j11) {
        return a(Long.compare(j10, j11));
    }

    @Override // nh.n2
    public n2 compare(float f10, float f11) {
        return a(Float.compare(f10, f11));
    }

    @Override // nh.n2
    public n2 compare(double d10, double d11) {
        return a(Double.compare(d10, d11));
    }
}
