package kj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class t implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final r f71574a;

    public t(r rVar) {
        this.f71574a = rVar;
    }

    public static t create(r rVar) {
        return new t(rVar);
    }

    public static rj.o providesBannerMessage(r rVar) {
        return (rj.o) gj.e.checkNotNullFromProvides(rVar.f71570a);
    }

    @Override // gj.c, gj.f, ru.a
    public rj.o get() {
        return providesBannerMessage(this.f71574a);
    }
}
