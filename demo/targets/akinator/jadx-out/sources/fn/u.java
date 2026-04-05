package fn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.bidmachine.iab.vast.t f55774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f55775c;

    public u(y yVar, io.bidmachine.iab.vast.t tVar) {
        this.f55775c = yVar;
        this.f55774b = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        y yVar = this.f55775c;
        try {
            yVar.setupAdMeasurer(this.f55774b);
            nm.j.onUiThread(new x(yVar, yVar.f55782i));
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}
