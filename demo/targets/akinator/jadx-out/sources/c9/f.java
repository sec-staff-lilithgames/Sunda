package c9;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Class f11936a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f11937b;

    /* renamed from: c, reason: collision with root package name */
    public final e f11938c;

    public f(Class cls, Class cls2, e eVar) {
        this.f11936a = cls;
        this.f11937b = cls2;
        this.f11938c = eVar;
    }

    public boolean handles(Class<?> cls, Class<?> cls2) {
        return this.f11936a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f11937b);
    }
}
