package pj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class y implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final w f81479a;

    public y(w wVar) {
        this.f81479a = wVar;
    }

    public static y create(w wVar) {
        return new y(wVar);
    }

    public static String providesServiceHost(w wVar) {
        return (String) dj.d.checkNotNullFromProvides(wVar.providesServiceHost());
    }

    @Override // dj.b, dj.e, ru.a
    public String get() {
        return providesServiceHost(this.f81479a);
    }
}
