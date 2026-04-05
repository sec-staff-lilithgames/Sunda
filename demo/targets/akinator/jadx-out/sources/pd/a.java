package pd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements ru.a, od.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f80948c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile ru.a f80949a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f80950b = f80948c;

    public a(ru.a aVar) {
        this.f80949a = aVar;
    }

    public static <P extends ru.a, T> od.a lazy(P p10) {
        return p10 instanceof od.a ? (od.a) p10 : new a((ru.a) d.checkNotNull(p10));
    }

    public static <P extends ru.a, T> ru.a provider(P p10) {
        d.checkNotNull(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    @Override // ru.a
    public Object get() {
        Object obj;
        Object obj2 = this.f80950b;
        Object obj3 = f80948c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f80950b;
                if (obj == obj3) {
                    obj = this.f80949a.get();
                    Object obj4 = this.f80950b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f80950b = obj;
                    this.f80949a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
