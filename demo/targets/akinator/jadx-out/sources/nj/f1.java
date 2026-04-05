package nj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f1 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f76896a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f76897b;

    public f1(ru.a aVar, ru.a aVar2) {
        this.f76896a = aVar;
        this.f76897b = aVar2;
    }

    public static f1 create(ru.a aVar, ru.a aVar2) {
        return new f1(aVar, aVar2);
    }

    public static e1 newInstance(q0 q0Var, qj.a aVar) {
        return new e1(q0Var, aVar);
    }

    @Override // dj.b, dj.e, ru.a
    public e1 get() {
        return newInstance((q0) this.f76896a.get(), (qj.a) this.f76897b.get());
    }
}
