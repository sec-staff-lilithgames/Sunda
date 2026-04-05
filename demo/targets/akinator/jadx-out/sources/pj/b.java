package pj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final a f81418a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f81419b;

    public b(a aVar, ru.a aVar2) {
        this.f81418a = aVar;
        this.f81419b = aVar2;
    }

    public static b create(a aVar, ru.a aVar2) {
        return new b(aVar, aVar2);
    }

    public static rt.a providesAnalyticsConnectorEvents(a aVar, nj.c cVar) {
        aVar.getClass();
        return (rt.a) dj.d.checkNotNullFromProvides(cVar.getAnalyticsEventsFlowable());
    }

    @Override // dj.b, dj.e, ru.a
    public rt.a get() {
        return providesAnalyticsConnectorEvents(this.f81418a, (nj.c) this.f81419b.get());
    }
}
