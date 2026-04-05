package com.fyber.inneractive.sdk.external;

import android.app.Activity;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.factories.i;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.s0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Iterator;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class InneractiveFullscreenUnitController extends s0 implements InneractiveFullscreenAdActivity.FullScreenRendererProvider, InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener {

    /* renamed from: b, reason: collision with root package name */
    public InneractiveFullScreenAdRewardedListener f23496b;
    protected com.fyber.inneractive.sdk.interfaces.f mRenderer;

    /* renamed from: a, reason: collision with root package name */
    public boolean f23495a = false;

    /* renamed from: c, reason: collision with root package name */
    public final g f23497c = new g(this);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class AdExpiredError extends InneractiveUnitController.AdDisplayError {
        public AdExpiredError() {
            super("Ad Expired");
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        com.fyber.inneractive.sdk.interfaces.f fVar = this.mRenderer;
        if (fVar != null) {
            fVar.destroy();
            this.mRenderer = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public com.fyber.inneractive.sdk.interfaces.f getFullscreenRenderer() {
        return this.mRenderer;
    }

    public InneractiveFullScreenAdRewardedListener getRewardedListener() {
        return this.f23496b;
    }

    public boolean isAvailable() {
        i0 i0Var = (i0) v.a(this.mAdSpot);
        return i0Var != null && i0Var.isReady();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.OnInneractiveFullscreenAdDestroyListener
    public void onActivityDestroyed(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f23495a = false;
    }

    public void setRewardedListener(InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener) {
        this.f23496b = inneractiveFullScreenAdRewardedListener;
    }

    public void show(Activity activity) {
        if (activity == null) {
            IAlog.f("show() called with a null activity", new Object[0]);
            return;
        }
        if (this.f23495a) {
            IAlog.f("InneractiveFullscreenUnitController->show(android.content.Context) called while an ad is already showing", new Object[0]);
            return;
        }
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.f("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        x adContent = adSpot.getAdContent();
        com.fyber.inneractive.sdk.interfaces.f fVarB = null;
        if (adContent != null) {
            u uVar = u.IA_PUBLISHER_REQUESTED_SHOW;
            InneractiveAdRequest inneractiveAdRequest = adContent.f23944a;
            com.fyber.inneractive.sdk.response.e eVarB = adContent.b();
            JSONArray jSONArrayB = adContent.f23946c.b();
            w wVar = new w(eVarB);
            wVar.f24326c = uVar;
            wVar.f24324a = inneractiveAdRequest;
            wVar.f24327d = jSONArrayB;
            wVar.a((String) null);
        }
        if (!adSpot.isReady()) {
            InneractiveUnitController.EventsListener eventsListener = this.mEventsListener;
            if (eventsListener != null) {
                ((InneractiveFullscreenAdEventsListener) eventsListener).onAdEnteredErrorState(adSpot, new AdExpiredError());
                return;
            }
            return;
        }
        if (this.mRenderer == null) {
            i iVar = com.fyber.inneractive.sdk.factories.h.f23524a;
            InneractiveAdSpot adSpot2 = getAdSpot();
            Iterator it = iVar.f23525a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.fyber.inneractive.sdk.factories.g gVar = (com.fyber.inneractive.sdk.factories.g) it.next();
                if (gVar.a(adSpot2)) {
                    fVarB = gVar.b(adSpot2);
                    break;
                }
            }
            this.mRenderer = fVarB;
        }
        selectContentController();
        (adContent instanceof com.fyber.inneractive.sdk.dv.a ? new com.fyber.inneractive.sdk.display.b() : new com.fyber.inneractive.sdk.display.c()).a(activity, adSpot, adSpot.getLocalUniqueId());
        this.f23495a = true;
        com.fyber.inneractive.sdk.interfaces.f fVar = this.mRenderer;
        if (fVar != null) {
            fVar.a(this.f23497c);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.config.s0 s0Var = inneractiveAdSpot.getAdContent().f23947d;
        if (s0Var != null) {
            r0 r0Var = (r0) s0Var;
            if (r0Var.f23347e == null) {
                l0 l0Var = r0Var.f23345c;
                if (l0Var != null && UnitDisplayType.INTERSTITIAL.equals(l0Var.f23330b)) {
                    return true;
                }
                t0 t0Var = r0Var.f23348f;
                return t0Var != null && (UnitDisplayType.REWARDED.equals(t0Var.f23408j) || UnitDisplayType.INTERSTITIAL.equals(t0Var.f23408j) || UnitDisplayType.VERTICAL.equals(t0Var.f23408j));
            }
        }
        IAlog.f("%s : supports() called with unit config null", IAlog.a(this));
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supportsRefresh() {
        return false;
    }
}
