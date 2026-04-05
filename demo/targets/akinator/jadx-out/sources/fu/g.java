package fu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final h f56023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f56024c;

    public g(l lVar, h hVar) {
        this.f56024c = lVar;
        this.f56023b = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        h hVar = this.f56023b;
        hVar.f56028c.replace(this.f56024c.scheduleDirect(hVar));
    }
}
