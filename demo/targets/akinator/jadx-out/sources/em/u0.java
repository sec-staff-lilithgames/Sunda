package em;

import io.bidmachine.AdsFormat;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.Waterfall;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f54771a;

    public u0(w0 w0Var) {
        this.f54771a = w0Var;
    }

    @Override // em.g0
    public void onAdLoadFailed(u uVar, pr.a aVar) {
        Waterfall.Configuration.AdUnit adUnit = uVar.getAdUnit();
        TrackEventType trackEventType = TrackEventType.AdUnitLoadFinish;
        w0 w0Var = this.f54771a;
        w0Var.d(trackEventType, adUnit, uVar, aVar);
        TrackEventType trackEventType2 = TrackEventType.AdUnitLoss;
        w0Var.getClass();
        w0Var.d(trackEventType2, uVar.getAdUnit(), uVar, null);
        w0Var.a(adUnit, Waterfall.Result.AdUnit.Status.STATUS_ERROR, null, aVar);
        uVar.destroy();
        w0Var.getClass();
        w0Var.b(Long.valueOf((adUnit.hasSleepTimeAfter() ? adUnit.getSleepTimeAfter() : null) != null ? r4.getValue() : 0L));
    }

    @Override // em.g0
    public void onAdLoaded(u uVar, x xVar) {
        u uVarA;
        this.f54771a.d(TrackEventType.AdUnitLoadFinish, uVar.getAdUnit(), uVar, null);
        this.f54771a.d(TrackEventType.AdUnitWin, uVar.getAdUnit(), uVar, null);
        this.f54771a.a(uVar.getAdUnit(), Waterfall.Result.AdUnit.Status.STATUS_SUCCESS, xVar, null);
        w0 w0Var = this.f54771a;
        d dVar = w0Var.f54777h;
        int i10 = w0Var.f54784o;
        synchronized (dVar.f54699c) {
            try {
                AdsFormat adsFormat = uVar.getAdsFormat();
                if (dVar.b(adsFormat) >= i10) {
                    uVarA = dVar.a(adsFormat);
                    if (uVarA != null && uVarA.getPrice() <= uVar.getPrice()) {
                        nm.a.d(dVar.f54697a, new b(uVarA, 0));
                        dVar.f(uVarA);
                    }
                    uVarA = null;
                } else {
                    uVarA = null;
                }
                dVar.h(uVar);
            } finally {
            }
        }
        if (uVarA != null) {
            this.f54771a.d(TrackEventType.AdUnitCheapestDequeued, uVarA.getAdUnit(), uVarA, null);
            uVarA.destroy();
        }
        this.f54771a.f54785p.onAdLoaded();
        this.f54771a.b(null);
    }
}
