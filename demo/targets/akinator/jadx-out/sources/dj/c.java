package dj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c implements b, cj.a {

    /* renamed from: b, reason: collision with root package name */
    public static final c f52347b = new c(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f52348a;

    public c(Object obj) {
        this.f52348a = obj;
    }

    public static <T> b create(T t10) {
        return new c(d.checkNotNull(t10, "instance cannot be null"));
    }

    public static <T> b createNullable(T t10) {
        return t10 == null ? f52347b : new c(t10);
    }

    @Override // dj.b, dj.e, ru.a
    public Object get() {
        return this.f52348a;
    }
}
