package pd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements b, od.a {

    /* renamed from: b, reason: collision with root package name */
    public static final c f80951b = new c(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f80952a;

    public c(Object obj) {
        this.f80952a = obj;
    }

    public static <T> b create(T t10) {
        return new c(d.checkNotNull(t10, "instance cannot be null"));
    }

    public static <T> b createNullable(T t10) {
        return t10 == null ? f80951b : new c(t10);
    }

    @Override // pd.b, ru.a
    public Object get() {
        return this.f80952a;
    }
}
