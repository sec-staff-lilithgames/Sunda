package hk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a implements e, gk.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f58996c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile e f58997a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f58998b = f58996c;

    public a(e eVar) {
        this.f58997a = eVar;
    }

    public static <P extends e, T> gk.a lazy(P p10) {
        return p10 instanceof gk.a ? (gk.a) p10 : new a((e) d.checkNotNull(p10));
    }

    public static <P extends e, T> e provider(P p10) {
        d.checkNotNull(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    @Override // hk.e, ru.a
    public Object get() {
        Object obj;
        Object obj2 = this.f58998b;
        Object obj3 = f58996c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f58998b;
                if (obj == obj3) {
                    obj = this.f58997a.get();
                    Object obj4 = this.f58998b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f58998b = obj;
                    this.f58997a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public static <P extends ru.a, T> gk.a lazy(P p10) {
        return lazy(g.asDaggerProvider(p10));
    }

    @Deprecated
    public static <P extends ru.a, T> ru.a provider(P p10) {
        return provider(g.asDaggerProvider(p10));
    }
}
