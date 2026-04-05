package dd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f52103a;

    /* renamed from: b, reason: collision with root package name */
    public t f52104b;

    public t(Object obj, t tVar) {
        this.f52103a = obj;
        this.f52104b = tVar;
    }

    public static <ST> boolean contains(t tVar, ST st2) {
        while (tVar != null) {
            if (tVar.value() == st2) {
                return true;
            }
            tVar = tVar.next();
        }
        return false;
    }

    public void linkNext(t tVar) {
        if (this.f52104b != null) {
            throw new IllegalStateException();
        }
        this.f52104b = tVar;
    }

    public t next() {
        return this.f52104b;
    }

    public Object value() {
        return this.f52103a;
    }
}
