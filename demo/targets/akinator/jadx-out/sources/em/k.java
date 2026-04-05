package em;

import io.bidmachine.i2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k extends g implements d0 {

    /* renamed from: b, reason: collision with root package name */
    public final j f54708b;

    public k(hr.i iVar, j jVar) {
        super(iVar);
        this.f54708b = jVar;
    }

    @Override // em.d0
    public void onAdClosed() {
        ((i2) ((hr.i) this.f54705a)).onAdClosed();
    }

    @Override // em.d0
    public void onAdComplete() {
        ((i2) ((hr.i) this.f54705a)).onAdFinished();
    }

    @Override // em.g, em.y
    public void onAdLoaded(c0 c0Var) {
        this.f54708b.f54707b = c0Var;
        ((i2) ((hr.i) this.f54705a)).onAdLoaded();
    }
}
