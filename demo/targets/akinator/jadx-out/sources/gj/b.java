package gj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b implements f, fj.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f57699c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile f f57700a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f57701b = f57699c;

    public b(f fVar) {
        this.f57700a = fVar;
    }

    public static <P extends f, T> fj.a lazy(P p10) {
        return p10 instanceof fj.a ? (fj.a) p10 : new b((f) e.checkNotNull(p10));
    }

    public static <P extends f, T> f provider(P p10) {
        e.checkNotNull(p10);
        return p10 instanceof b ? p10 : new b(p10);
    }

    @Override // gj.f, ru.a
    public Object get() {
        Object obj;
        Object obj2 = this.f57701b;
        Object obj3 = f57699c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f57701b;
                if (obj == obj3) {
                    obj = this.f57700a.get();
                    Object obj4 = this.f57701b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f57701b = obj;
                    this.f57700a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public static <P extends ru.a, T> fj.a lazy(P p10) {
        return lazy(h.asDaggerProvider(p10));
    }

    @Deprecated
    public static <P extends ru.a, T> ru.a provider(P p10) {
        return provider(h.asDaggerProvider(p10));
    }
}
