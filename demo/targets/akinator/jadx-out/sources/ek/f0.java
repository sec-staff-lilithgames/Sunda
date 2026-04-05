package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f0 implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f54513a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f54514b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f54515c;

    /* renamed from: d, reason: collision with root package name */
    public final ru.a f54516d;

    public f0(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4) {
        this.f54513a = aVar;
        this.f54514b = aVar2;
        this.f54515c = aVar3;
        this.f54516d = aVar4;
    }

    public static f0 create(ru.a aVar, ru.a aVar2, ru.a aVar3, ru.a aVar4) {
        return new f0(aVar, aVar2, aVar3, aVar4);
    }

    public static u newInstance(com.google.firebase.g gVar, ik.o oVar, zu.m mVar, i1 i1Var) {
        return new u(gVar, oVar, mVar, i1Var);
    }

    @Override // hk.b, hk.e, ru.a
    public u get() {
        return newInstance((com.google.firebase.g) this.f54513a.get(), (ik.o) this.f54514b.get(), (zu.m) this.f54515c.get(), (i1) this.f54516d.get());
    }
}
