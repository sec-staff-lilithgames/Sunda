package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ga implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ na f92562b;

    public ga(na naVar) {
        this.f92562b = naVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        na naVar = this.f92562b;
        naVar.f92821k = null;
        if (naVar.f92818h.increment()) {
            naVar.requestConnection();
        }
    }
}
