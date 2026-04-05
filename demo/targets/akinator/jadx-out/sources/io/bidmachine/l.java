package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f60587b;

    public l(n nVar) {
        this.f60587b = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            up.a adObject = this.f60587b.getAdObject();
            if (adObject != null) {
                adObject.onDestroy();
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
        this.f60587b.f61914u = null;
    }
}
