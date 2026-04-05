package zl;

import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b extends hr.e {

    /* renamed from: a, reason: collision with root package name */
    public final m f98223a;

    /* renamed from: b, reason: collision with root package name */
    public w f98224b;

    public b(m mVar) {
        this.f98223a = mVar;
    }

    @Override // hr.b
    public void onDestroy() {
        w wVar = this.f98224b;
        if (wVar != null) {
            wVar.destroy();
            this.f98224b = null;
        }
    }

    @Override // hr.b
    public void onShown() {
        super.onShown();
        w wVar = this.f98224b;
        if (wVar != null) {
            wVar.onAdShown();
        }
    }

    @Override // hr.b
    public void load(ContextProvider contextProvider, hr.f fVar, hr.g gVar, hr.k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        if (new n(kVar).isValid(fVar)) {
            m mVar = this.f98223a;
            if (!mVar.isOverrideCallbacks()) {
                fVar.setVisibilitySource(nm.m.f77061b);
            }
            a aVar = new a(this, fVar);
            t tVarB = mVar.f98261d.b(networkAdUnit);
            if (tVarB == null) {
                nm.a.d(mVar.f98258a, new em.o(networkAdUnit, 6));
                m.a(aVar, null, pr.a.internal("Can't find reserved GAMAd by NetworkAdUnit"));
            } else if (!(tVarB instanceof w)) {
                m.a(aVar, tVarB, pr.a.internal("InternalGAM object has an incompatible ad type"));
            } else {
                tVarB.setAdPresentListener(aVar);
                aVar.onAdLoaded(tVarB);
            }
        }
    }
}
