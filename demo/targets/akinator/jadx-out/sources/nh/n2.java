package nh;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static final l2 f76489a = new l2();

    /* renamed from: b, reason: collision with root package name */
    public static final m2 f76490b = new m2(-1);

    /* renamed from: c, reason: collision with root package name */
    public static final m2 f76491c = new m2(1);

    public static n2 start() {
        return f76489a;
    }

    public abstract n2 compare(double d10, double d11);

    public abstract n2 compare(float f10, float f11);

    public abstract n2 compare(int i10, int i11);

    public abstract n2 compare(long j10, long j11);

    @Deprecated
    public final n2 compare(Boolean bool, Boolean bool2) {
        return compareFalseFirst(bool.booleanValue(), bool2.booleanValue());
    }

    public abstract n2 compare(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> n2 compare(T t10, T t11, Comparator<T> comparator);

    public abstract n2 compareFalseFirst(boolean z10, boolean z11);

    public abstract n2 compareTrueFirst(boolean z10, boolean z11);

    public abstract int result();
}
