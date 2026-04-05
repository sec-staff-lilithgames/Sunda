package ql;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sl.f f83279b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kl.d f83280c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f83281e;

    public b(f fVar, sl.f fVar2, kl.d dVar) {
        this.f83281e = fVar;
        this.f83279b = fVar2;
        this.f83280c = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f83279b.loadAd(new a(this));
    }
}
