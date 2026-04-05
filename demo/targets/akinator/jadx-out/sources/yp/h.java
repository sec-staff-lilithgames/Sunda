package yp;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f94759b;

    public h(j jVar) {
        this.f94759b = jVar;
    }

    @Override // java.lang.Runnable
    public void run() throws IllegalStateException {
        k kVar = this.f94759b.f94761b;
        k kVar2 = k.D;
        kVar.f();
        if (kVar.f94782w) {
            kVar.stopVideoVisibilityCheckerTimer();
        }
    }
}
