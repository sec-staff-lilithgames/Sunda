package io.odeeo.internal.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c<T> implements b<T>, io.odeeo.internal.x0.a<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final c<Object> f67546b = new c<>(null);

    /* renamed from: a, reason: collision with root package name */
    public final T f67547a;

    public c(T t10) {
        this.f67547a = t10;
    }

    public static <T> c<T> a() {
        return (c<T>) f67546b;
    }

    public static <T> b<T> create(T t10) {
        return new c(d.checkNotNull(t10, "instance cannot be null"));
    }

    public static <T> b<T> createNullable(T t10) {
        return t10 == null ? a() : new c(t10);
    }

    @Override // io.odeeo.internal.y0.b, io.odeeo.internal.x1.a
    public T get() {
        return this.f67547a;
    }
}
