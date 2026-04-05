package nh;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a3 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f76083b;

    public a3() {
        this(false);
    }

    public static a3 bigIntegers() {
        return x2.f76753c;
    }

    public static a3 integers() {
        return y2.f76781c;
    }

    public static a3 longs() {
        return z2.f76808c;
    }

    public abstract Comparable a(Comparable comparable, long j10);

    public abstract long distance(Comparable comparable, Comparable comparable2);

    public Comparable maxValue() {
        throw new NoSuchElementException();
    }

    public Comparable minValue() {
        throw new NoSuchElementException();
    }

    public abstract Comparable next(Comparable comparable);

    public abstract Comparable previous(Comparable comparable);

    public a3(boolean z10) {
        this.f76083b = z10;
    }
}
