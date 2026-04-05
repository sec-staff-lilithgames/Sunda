package em;

import io.bidmachine.TrackEventType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t0 implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f54760a;

    public t0(w0 w0Var) {
        this.f54760a = w0Var;
    }

    @Override // em.w
    public void onAdDestroyed(u uVar, boolean z10) {
        w0 w0Var = this.f54760a;
        d dVar = w0Var.f54777h;
        if (!z10) {
            dVar.i(uVar);
        } else if (dVar.f(uVar)) {
            ((p) w0Var.f54779j).cacheWaterfall(uVar.getAdsFormat(), true);
        }
    }

    @Override // em.w
    public void onAdExpired(u uVar) {
        this.f54760a.d(TrackEventType.AdUnitExpired, uVar.getAdUnit(), uVar, null);
    }

    @Override // em.w
    public void onAdShown(u uVar) {
        w0 w0Var = this.f54760a;
        if (w0Var.f54777h.f(uVar)) {
            ((p) w0Var.f54779j).cacheWaterfall(uVar.getAdsFormat(), true);
        }
        w0Var.d(TrackEventType.AdUnitShown, uVar.getAdUnit(), uVar, null);
    }

    @Override // em.w
    public void onPaidEvent(u uVar) {
        this.f54760a.d(TrackEventType.AdUnitPaidEvent, uVar.getAdUnit(), uVar, null);
    }
}
