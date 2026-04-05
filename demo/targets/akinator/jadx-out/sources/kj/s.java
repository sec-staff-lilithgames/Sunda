package kj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class s implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final r f71573a;

    public s(r rVar) {
        this.f71573a = rVar;
    }

    public static s create(r rVar) {
        return new s(rVar);
    }

    public static hj.s inAppMessageLayoutConfig(r rVar) {
        return (hj.s) gj.e.checkNotNullFromProvides(rVar.f71571b);
    }

    @Override // gj.c, gj.f, ru.a
    public hj.s get() {
        return inAppMessageLayoutConfig(this.f71573a);
    }
}
