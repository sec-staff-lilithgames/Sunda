package pj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class x implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final w f81477a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f81478b;

    public x(w wVar, ru.a aVar) {
        this.f81477a = wVar;
        this.f81478b = aVar;
    }

    public static x create(w wVar, ru.a aVar) {
        return new x(wVar, aVar);
    }

    public static wr.j providesGrpcChannel(w wVar, String str) {
        return (wr.j) dj.d.checkNotNullFromProvides(wVar.providesGrpcChannel(str));
    }

    @Override // dj.b, dj.e, ru.a
    public wr.j get() {
        return providesGrpcChannel(this.f81477a, (String) this.f81478b.get());
    }
}
