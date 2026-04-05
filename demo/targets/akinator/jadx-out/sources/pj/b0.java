package pj;

import wr.e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b0 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final z f81420a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f81421b;

    /* renamed from: c, reason: collision with root package name */
    public final ru.a f81422c;

    public b0(z zVar, ru.a aVar, ru.a aVar2) {
        this.f81420a = zVar;
        this.f81421b = aVar;
        this.f81422c = aVar2;
    }

    public static b0 create(z zVar, ru.a aVar, ru.a aVar2) {
        return new b0(zVar, aVar, aVar2);
    }

    public static rk.t providesInAppMessagingSdkServingStub(z zVar, wr.j jVar, e4 e4Var) {
        return (rk.t) dj.d.checkNotNullFromProvides(zVar.providesInAppMessagingSdkServingStub(jVar, e4Var));
    }

    @Override // dj.b, dj.e, ru.a
    public rk.t get() {
        return providesInAppMessagingSdkServingStub(this.f81420a, (wr.j) this.f81421b.get(), (e4) this.f81422c.get());
    }
}
