package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class yc implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f11266b;

    /* renamed from: c, reason: collision with root package name */
    public final zc f11267c;

    public yc(long j10, zc zcVar) {
        this.f11266b = j10;
        this.f11267c = zcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        zc zcVar = this.f11267c;
        if (zcVar.f91287g) {
            zcVar.f11340u = true;
        } else {
            zcVar.f91286f.offer(this);
        }
        if (zcVar.enter()) {
            zcVar.U();
        }
    }
}
