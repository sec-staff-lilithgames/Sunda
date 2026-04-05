package ml;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ol.f f74803b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kl.d f74804c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f74805e;

    public b(f fVar, ol.f fVar2, kl.d dVar) {
        this.f74805e = fVar;
        this.f74803b = fVar2;
        this.f74804c = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f74803b.loadAd(new a(this));
    }
}
