package zl;

import io.bidmachine.i2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class d extends c implements z {
    @Override // zl.z
    public void onAdClosed() {
        ((i2) ((hr.i) this.f98225a)).onAdClosed();
    }

    @Override // zl.z
    public void onAdComplete() {
        ((i2) ((hr.i) this.f98225a)).onAdFinished();
    }

    @Override // zl.c, zl.u, zl.x
    public void onAdLoaded(y yVar) {
        ((i2) ((hr.i) this.f98225a)).onAdLoaded();
    }
}
