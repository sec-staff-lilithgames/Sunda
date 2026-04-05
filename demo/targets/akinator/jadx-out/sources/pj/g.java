package pj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final d f81438a;

    public g(d dVar) {
        this.f81438a = dVar;
    }

    public static g create(d dVar) {
        return new g(dVar);
    }

    public static com.google.firebase.g providesFirebaseApp(d dVar) {
        return (com.google.firebase.g) dj.d.checkNotNullFromProvides(dVar.f81426a);
    }

    @Override // dj.b, dj.e, ru.a
    public com.google.firebase.g get() {
        return providesFirebaseApp(this.f81438a);
    }
}
