package fu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f56041b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f56042c;

    public k0(Runnable runnable, mt.f fVar) {
        this.f56042c = runnable;
        this.f56041b = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mt.f fVar = this.f56041b;
        try {
            this.f56042c.run();
        } finally {
            fVar.onComplete();
        }
    }
}
