package pj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class l implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final k f81452a;

    public l(k kVar) {
        this.f81452a = kVar;
    }

    public static l create(k kVar) {
        return new l(kVar);
    }

    public static yh.d providesAnalyticsConnector(k kVar) {
        return (yh.d) dj.d.checkNotNullFromProvides(kVar.f81449a);
    }

    @Override // dj.b, dj.e, ru.a
    public yh.d get() {
        return providesAnalyticsConnector(this.f81452a);
    }
}
