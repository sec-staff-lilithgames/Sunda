package io.odeeo.internal.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a<T> implements io.odeeo.internal.x1.a<T>, io.odeeo.internal.x0.a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f67542c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ boolean f67543d = true;

    /* renamed from: a, reason: collision with root package name */
    public volatile io.odeeo.internal.x1.a<T> f67544a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f67545b = f67542c;

    public a(io.odeeo.internal.x1.a<T> aVar) {
        if (!f67543d && aVar == null) {
            throw new AssertionError();
        }
        this.f67544a = aVar;
    }

    public static Object a(Object obj, Object obj2) {
        if (obj == f67542c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public static <P extends io.odeeo.internal.x1.a<T>, T> io.odeeo.internal.x0.a<T> lazy(P p10) {
        return p10 instanceof io.odeeo.internal.x0.a ? (io.odeeo.internal.x0.a) p10 : new a((io.odeeo.internal.x1.a) d.checkNotNull(p10));
    }

    public static <P extends io.odeeo.internal.x1.a<T>, T> io.odeeo.internal.x1.a<T> provider(P p10) {
        d.checkNotNull(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    @Override // io.odeeo.internal.x1.a
    public T get() {
        T t10;
        T t11 = (T) this.f67545b;
        Object obj = f67542c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f67545b;
                if (t10 == obj) {
                    t10 = this.f67544a.get();
                    this.f67545b = a(this.f67545b, t10);
                    this.f67544a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }
}
