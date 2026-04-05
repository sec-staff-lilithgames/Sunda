package ik;

import ek.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a0 implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f59665a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f59666b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f59667c;

    public a0(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        this.f59665a = aVar;
        this.f59666b = aVar2;
        this.f59667c = aVar3;
    }

    public static a0 create(ru.a aVar, ru.a aVar2, ru.a aVar3) {
        return new a0(aVar, aVar2, aVar3);
    }

    public static z newInstance(zu.m mVar, z1 z1Var, k4.n nVar) {
        return new z(mVar, z1Var, nVar);
    }

    @Override // hk.b, hk.e, ru.a
    public z get() {
        return newInstance((zu.m) this.f59665a.get(), (z1) this.f59666b.get(), (k4.n) this.f59667c.get());
    }
}
