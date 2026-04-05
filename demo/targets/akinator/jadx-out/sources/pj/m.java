package pj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class m implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final k f81453a;

    public m(k kVar) {
        this.f81453a = kVar;
    }

    public static m create(k kVar) {
        return new m(kVar);
    }

    public static yi.d providesSubsriber(k kVar) {
        return (yi.d) dj.d.checkNotNullFromProvides(kVar.f81450b);
    }

    @Override // dj.b, dj.e, ru.a
    public yi.d get() {
        return providesSubsriber(this.f81453a);
    }
}
