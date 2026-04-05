package lm;

import hr.i;
import io.bidmachine.i2;
import io.bidmachine.iab.vast.t;
import io.bidmachine.iab.vast.u;
import pr.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    public final i f73401a;

    public c(i iVar) {
        this.f73401a = iVar;
    }

    @Override // io.bidmachine.iab.vast.u
    public void onVastLoadFailed(t tVar, qm.b bVar) {
        int code = bVar.getCode();
        i iVar = this.f73401a;
        if (code == 6) {
            iVar.onAdExpired();
        } else {
            iVar.onAdLoadFailed(g.mapError(bVar));
        }
    }

    @Override // io.bidmachine.iab.vast.u
    public void onVastLoaded(t tVar) {
        ((i2) this.f73401a).onAdLoaded();
    }
}
