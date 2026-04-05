package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class v0 implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f54649a;

    public v0(ru.a aVar) {
        this.f54649a = aVar;
    }

    public static v0 create(ru.a aVar) {
        return new v0(aVar);
    }

    public static u0 newInstance(f1 f1Var) {
        return new u0(f1Var);
    }

    @Override // hk.b, hk.e, ru.a
    public u0 get() {
        return newInstance((f1) this.f54649a.get());
    }
}
