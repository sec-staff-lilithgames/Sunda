package pj;

import wr.e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a0 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final z f81417a;

    public a0(z zVar) {
        this.f81417a = zVar;
    }

    public static a0 create(z zVar) {
        return new a0(zVar);
    }

    public static e4 providesApiKeyHeaders(z zVar) {
        return (e4) dj.d.checkNotNullFromProvides(zVar.providesApiKeyHeaders());
    }

    @Override // dj.b, dj.e, ru.a
    public e4 get() {
        return providesApiKeyHeaders(this.f81417a);
    }
}
