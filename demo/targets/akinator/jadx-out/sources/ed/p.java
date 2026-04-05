package ed;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final o f54118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f54119c;

    public p(v vVar, o oVar) {
        this.f54119c = vVar;
        this.f54118b = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        v vVar = this.f54119c;
        d dVar = vVar.f54134e;
        o oVar = this.f54118b;
        if (dVar.a(oVar)) {
            dVar.b(oVar);
        }
        vVar.e(oVar);
    }
}
