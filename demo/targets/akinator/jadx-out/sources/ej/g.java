package ej;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f54418b;

    public g(h hVar) {
        this.f54418b = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        h hVar = this.f54418b;
        hVar.f54422j.f54429h.show(hVar.f54419g, hVar.f54420h);
        if (hVar.f54419g.getConfig().animate().booleanValue()) {
            j jVar = hVar.f54422j;
            jVar.f54432k.slideIntoView(jVar.f54431j, hVar.f54419g.getRootView(), hj.f.f58944b);
        }
    }
}
