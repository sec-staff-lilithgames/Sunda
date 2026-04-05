package zl;

import android.app.Activity;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p extends hr.h {

    /* renamed from: a, reason: collision with root package name */
    public final m f98267a;

    /* renamed from: b, reason: collision with root package name */
    public o f98268b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f98269c;

    public p(m mVar) {
        this.f98267a = mVar;
    }

    @Override // hr.b
    public void onDestroy() {
        this.f98268b = null;
        c0 c0Var = this.f98269c;
        if (c0Var != null) {
            c0Var.destroy();
            this.f98269c = null;
        }
    }

    @Override // hr.b
    public void onShown() {
        super.onShown();
        c0 c0Var = this.f98269c;
        if (c0Var != null) {
            c0Var.onAdShown();
        }
    }

    @Override // hr.h
    public void show(ContextProvider contextProvider, hr.i iVar, RendererConfiguration rendererConfiguration) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            iVar.onAdShowFailed(pr.a.internal("Activity is null"));
            return;
        }
        c0 c0Var = this.f98269c;
        if (c0Var == null) {
            iVar.onAdShowFailed(pr.a.internal("InternalGAM rewarded object is null"));
            return;
        }
        if (c0Var.f98282f == 6) {
            iVar.onAdShowFailed(pr.a.internal("InternalGAM rewarded object is expired"));
            return;
        }
        if (this.f98269c.f98282f != 3) {
            iVar.onAdShowFailed(pr.a.internal("InternalGAM rewarded object not loaded"));
            return;
        }
        o oVar = this.f98268b;
        if (oVar == null) {
            iVar.onAdShowFailed(pr.a.internal("InternalGAM rewarded listener is null"));
        } else {
            this.f98269c.show(activity, oVar);
        }
    }

    @Override // hr.b
    public void load(ContextProvider contextProvider, hr.i iVar, hr.j jVar, hr.k kVar, NetworkAdUnit networkAdUnit) throws Throwable {
        if (new n(kVar).isValid(iVar)) {
            o oVar = new o(iVar, this);
            this.f98268b = oVar;
            m mVar = this.f98267a;
            t tVarB = mVar.f98261d.b(networkAdUnit);
            if (tVarB == null) {
                nm.a.d(mVar.f98258a, new em.o(networkAdUnit, 4));
                m.a(oVar, null, pr.a.internal("Can't find reserved GAMAd by NetworkAdUnit"));
            } else if (!(tVarB instanceof c0)) {
                m.a(oVar, tVarB, pr.a.internal("InternalGAM object has an incompatible ad type"));
            } else {
                tVarB.setAdPresentListener(oVar);
                oVar.onAdLoaded(tVarB);
            }
        }
    }
}
