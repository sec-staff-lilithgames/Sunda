package pj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final d f81441a;

    public h(d dVar) {
        this.f81441a = dVar;
    }

    public static h create(d dVar) {
        return new h(dVar);
    }

    public static tj.f providesFirebaseInstallations(d dVar) {
        return (tj.f) dj.d.checkNotNullFromProvides(dVar.f81427b);
    }

    @Override // dj.b, dj.e, ru.a
    public tj.f get() {
        return providesFirebaseInstallations(this.f81441a);
    }
}
