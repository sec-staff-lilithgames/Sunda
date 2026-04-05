package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ac implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tc f92251b;

    public ac(tc tcVar) {
        this.f92251b = tcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tc tcVar = this.f92251b;
        if (tcVar.f93064z) {
            return;
        }
        tcVar.f93059u.onReady();
    }
}
