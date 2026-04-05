package zl;

import android.app.Activity;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f extends hr.h {

    /* renamed from: a, reason: collision with root package name */
    public final m f98227a;

    /* renamed from: b, reason: collision with root package name */
    public e f98228b;

    /* renamed from: c, reason: collision with root package name */
    public a0 f98229c;

    public f(m mVar) {
        this.f98227a = mVar;
    }

    @Override // hr.b
    public void onDestroy() {
        this.f98228b = null;
        a0 a0Var = this.f98229c;
        if (a0Var != null) {
            a0Var.destroy();
            this.f98229c = null;
        }
    }

    @Override // hr.b
    public void onShown() {
        super.onShown();
        a0 a0Var = this.f98229c;
        if (a0Var != null) {
            a0Var.onAdShown();
        }
    }

    @Override // hr.h
    public void show(ContextProvider contextProvider, hr.i iVar, RendererConfiguration rendererConfiguration) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            iVar.onAdShowFailed(pr.a.internal("Activity is null"));
            return;
        }
        a0 a0Var = this.f98229c;
        if (a0Var == null) {
            iVar.onAdShowFailed(pr.a.internal("InternalGAM interstitial object is null"));
            return;
        }
        if (a0Var.f98282f == 6) {
            iVar.onAdShowFailed(pr.a.internal("InternalGAM interstitial object is expired"));
            return;
        }
        if (this.f98229c.f98282f != 3) {
            iVar.onAdShowFailed(pr.a.internal("InternalGAM interstitial object not loaded"));
            return;
        }
        e eVar = this.f98228b;
        if (eVar == null) {
            iVar.onAdShowFailed(pr.a.internal("InternalGAM interstitial listener is null"));
        } else {
            this.f98229c.show(activity, eVar);
        }
    }

    @Override // hr.b
    public void load(ContextProvider contextProvider, hr.i iVar, hr.j jVar, hr.k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        if (new n(kVar).isValid(iVar)) {
            e eVar = new e(iVar, this);
            this.f98228b = eVar;
            m mVar = this.f98227a;
            t tVarB = mVar.f98261d.b(networkAdUnit);
            if (tVarB == null) {
                nm.a.d(mVar.f98258a, new em.o(networkAdUnit, 5));
                m.a(eVar, null, pr.a.internal("Can't find reserved GAMAd by NetworkAdUnit"));
            } else if (!(tVarB instanceof a0)) {
                m.a(eVar, tVarB, pr.a.internal("InternalGAM object has an incompatible ad type"));
            } else {
                tVarB.setAdPresentListener(eVar);
                eVar.onAdLoaded(tVarB);
            }
        }
    }
}
