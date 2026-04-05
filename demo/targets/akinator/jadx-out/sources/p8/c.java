package p8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f80734b;

    public c(e eVar) {
        this.f80734b = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        e eVar = this.f80734b;
        while (!eVar.f80748f) {
            try {
                eVar.b((d) eVar.f80746d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
