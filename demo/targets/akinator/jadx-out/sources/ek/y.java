package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class y implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f54675a;

    public y(ru.a aVar) {
        this.f54675a = aVar;
    }

    public static b applicationInfo(com.google.firebase.g gVar) {
        return (b) hk.d.checkNotNullFromProvides(w.f54661a.applicationInfo(gVar));
    }

    public static y create(ru.a aVar) {
        return new y(aVar);
    }

    @Override // hk.b, hk.e, ru.a
    public b get() {
        return applicationInfo((com.google.firebase.g) this.f54675a.get());
    }
}
