package io.odeeo.internal.u0;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f67192a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final y f67193b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    public static final y f67194c = new b(1);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends y {
        public a() {
            super(null);
        }

        public y a(int i10) {
            return i10 < 0 ? y.f67193b : i10 > 0 ? y.f67194c : y.f67192a;
        }

        @Override // io.odeeo.internal.u0.y
        public y compare(Comparable comparable, Comparable comparable2) {
            return a(comparable.compareTo(comparable2));
        }

        @Override // io.odeeo.internal.u0.y
        public y compareFalseFirst(boolean z10, boolean z11) {
            return a(io.odeeo.internal.w0.a.compare(z10, z11));
        }

        @Override // io.odeeo.internal.u0.y
        public y compareTrueFirst(boolean z10, boolean z11) {
            return a(io.odeeo.internal.w0.a.compare(z11, z10));
        }

        @Override // io.odeeo.internal.u0.y
        public int result() {
            return 0;
        }

        @Override // io.odeeo.internal.u0.y
        public <T> y compare(T t10, T t11, Comparator<T> comparator) {
            return a(comparator.compare(t10, t11));
        }

        @Override // io.odeeo.internal.u0.y
        public y compare(int i10, int i11) {
            return a(io.odeeo.internal.w0.d.compare(i10, i11));
        }

        @Override // io.odeeo.internal.u0.y
        public y compare(long j10, long j11) {
            return a(io.odeeo.internal.w0.e.compare(j10, j11));
        }

        @Override // io.odeeo.internal.u0.y
        public y compare(float f10, float f11) {
            return a(Float.compare(f10, f11));
        }

        @Override // io.odeeo.internal.u0.y
        public y compare(double d10, double d11) {
            return a(Double.compare(d10, d11));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends y {

        /* renamed from: d, reason: collision with root package name */
        public final int f67195d;

        public b(int i10) {
            super(null);
            this.f67195d = i10;
        }

        @Override // io.odeeo.internal.u0.y
        public y compare(double d10, double d11) {
            return this;
        }

        @Override // io.odeeo.internal.u0.y
        public int result() {
            return this.f67195d;
        }

        @Override // io.odeeo.internal.u0.y
        public y compare(float f10, float f11) {
            return this;
        }

        @Override // io.odeeo.internal.u0.y
        public y compare(int i10, int i11) {
            return this;
        }

        @Override // io.odeeo.internal.u0.y
        public y compare(long j10, long j11) {
            return this;
        }

        @Override // io.odeeo.internal.u0.y
        public y compare(Comparable comparable, Comparable comparable2) {
            return this;
        }

        @Override // io.odeeo.internal.u0.y
        public <T> y compare(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        @Override // io.odeeo.internal.u0.y
        public y compareFalseFirst(boolean z10, boolean z11) {
            return this;
        }

        @Override // io.odeeo.internal.u0.y
        public y compareTrueFirst(boolean z10, boolean z11) {
            return this;
        }
    }

    public y() {
    }

    public static y start() {
        return f67192a;
    }

    public abstract y compare(double d10, double d11);

    public abstract y compare(float f10, float f11);

    public abstract y compare(int i10, int i11);

    public abstract y compare(long j10, long j11);

    @Deprecated
    public final y compare(Boolean bool, Boolean bool2) {
        return compareFalseFirst(bool.booleanValue(), bool2.booleanValue());
    }

    public abstract y compare(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> y compare(T t10, T t11, Comparator<T> comparator);

    public abstract y compareFalseFirst(boolean z10, boolean z11);

    public abstract y compareTrueFirst(boolean z10, boolean z11);

    public abstract int result();

    public /* synthetic */ y(a aVar) {
        this();
    }
}
