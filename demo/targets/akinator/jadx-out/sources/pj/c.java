package pj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final a f81423a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f81424b;

    public c(a aVar, ru.a aVar2) {
        this.f81423a = aVar;
        this.f81424b = aVar2;
    }

    public static c create(a aVar, ru.a aVar2) {
        return new c(aVar, aVar2);
    }

    public static nj.c providesAnalyticsEventsManager(a aVar, yh.d dVar) {
        aVar.getClass();
        return (nj.c) dj.d.checkNotNullFromProvides(new nj.c(dVar));
    }

    @Override // dj.b, dj.e, ru.a
    public nj.c get() {
        return providesAnalyticsEventsManager(this.f81423a, (yh.d) this.f81424b.get());
    }
}
