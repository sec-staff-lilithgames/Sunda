package mc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f74153a;

    /* renamed from: b, reason: collision with root package name */
    public final ub.p f74154b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f74155c;

    public b0(Object obj, Class<?> cls, ub.p pVar) {
        this.f74153a = obj;
        this.f74155c = cls;
        this.f74154b = pVar;
    }

    public Object getId() {
        return this.f74153a;
    }

    public ub.p getLocation() {
        return this.f74154b;
    }

    public Class<?> getType() {
        return this.f74155c;
    }

    public String toString() {
        return String.format("Object id [%s] (for %s) at %s", this.f74153a, dd.i.nameOf((Class<?>) this.f74155c), this.f74154b);
    }
}
