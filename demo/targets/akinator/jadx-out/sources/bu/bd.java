package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class bd implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final pu.h f10134b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dd f10135c;

    public bd(dd ddVar, pu.h hVar) {
        this.f10135c = ddVar;
        this.f10134b = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dd ddVar = this.f10135c;
        ddVar.f91286f.offer(new cd(this.f10134b, false));
        if (ddVar.enter()) {
            ddVar.U();
        }
    }
}
