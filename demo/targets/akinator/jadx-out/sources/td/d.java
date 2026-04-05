package td;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements pd.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f86824a;

    public d(ru.a aVar) {
        this.f86824a = aVar;
    }

    public static ud.e config(xd.a aVar) {
        return (ud.e) pd.d.checkNotNullFromProvides(ud.e.getDefault(aVar));
    }

    public static d create(ru.a aVar) {
        return new d(aVar);
    }

    @Override // pd.b, ru.a
    public ud.e get() {
        return config((xd.a) this.f86824a.get());
    }
}
