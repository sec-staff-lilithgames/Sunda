package com.fyber.inneractive.sdk.external;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.t0;
import com.fyber.inneractive.sdk.flow.g0;
import com.fyber.inneractive.sdk.flow.h0;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.r0;
import com.fyber.inneractive.sdk.flow.s0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import com.fyber.inneractive.sdk.util.v;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class InneractiveAdViewUnitController extends s0 implements g0, InneractiveFullscreenAdActivity.FullScreenRendererProvider {
    public static final int DISABLED_REFRESH_INTERVAL = -1;

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f23491a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23492b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f23493c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23494d;
    protected int mAdContentHeight;
    protected int mAdContentWidth;

    public InneractiveAdViewUnitController() {
        this.f23492b = false;
        this.mAdContentWidth = -1;
        this.mAdContentHeight = -1;
        this.f23494d = 0;
        this.f23491a = new HashSet();
    }

    public final void a() {
        this.f23492b = true;
        Iterator it = new HashSet(this.f23491a).iterator();
        while (it.hasNext()) {
            ((InneractiveAdRenderer) it.next()).destroy();
        }
        this.f23491a.clear();
        this.f23493c = null;
        super.destroy();
    }

    public void bindView(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.interfaces.d dVarA;
        IAlog.a("%sPPPP bindView called with parent: %s", logPrefix(), viewGroup);
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.f("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        IAlog.a("%sPPPP bindView spot is %s", logPrefix(), adSpot);
        Iterator it = new HashSet(this.f23491a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                if (dVar.b(viewGroup)) {
                    dVar.m();
                    IAlog.a("%sPPPP bindAdToRenderer returning an already attached renderer %s", logPrefix(), dVar);
                    return;
                }
            }
        }
        this.f23493c = viewGroup;
        Iterator it2 = com.fyber.inneractive.sdk.factories.b.f23520a.f23521a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                dVarA = null;
                break;
            }
            com.fyber.inneractive.sdk.factories.a aVar = (com.fyber.inneractive.sdk.factories.a) it2.next();
            if (aVar.a(adSpot)) {
                dVarA = aVar.a();
                break;
            }
        }
        int i10 = this.f23494d;
        if (i10 != 0) {
            dVarA.a(i10);
        }
        if (dVarA == null) {
            IAlog.f("%sCould not find a renderer for the given spot! Did you add the appropriate module to your project?", logPrefix());
            return;
        }
        dVarA.initialize(adSpot);
        selectContentController();
        dVarA.a(viewGroup);
        this.f23491a.add(dVarA);
        IAlog.a("%sPPPP bindView created renderer %s", logPrefix(), dVarA);
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean canRefreshAd() {
        if (!supportsRefresh()) {
            return false;
        }
        Iterator it = this.f23491a.iterator();
        while (it.hasNext()) {
            if (!((InneractiveAdRenderer) it.next()).canRefreshAd()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            r.f26804b.post(new f(this));
        } else {
            a();
        }
    }

    public int getAdContentHeight() {
        int iO;
        Iterator it = this.f23491a.iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) && (iO = ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).o()) > 0) {
                return iO;
            }
        }
        return this.mAdContentHeight;
    }

    public int getAdContentWidth() {
        int iE;
        Iterator it = this.f23491a.iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if ((inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) && (iE = ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).e()) > 0) {
                return iE;
            }
        }
        return this.mAdContentWidth;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public com.fyber.inneractive.sdk.interfaces.f getFullscreenRenderer() {
        com.fyber.inneractive.sdk.interfaces.f fVarB;
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) v.a(this.mAdSpot);
        Iterator it = com.fyber.inneractive.sdk.factories.h.f23524a.f23525a.iterator();
        while (true) {
            if (!it.hasNext()) {
                fVarB = null;
                break;
            }
            com.fyber.inneractive.sdk.factories.g gVar = (com.fyber.inneractive.sdk.factories.g) it.next();
            if (gVar.a(inneractiveAdSpot)) {
                fVarB = gVar.b(inneractiveAdSpot);
                break;
            }
        }
        this.f23491a.add(fVarB);
        return fVarB;
    }

    @Override // com.fyber.inneractive.sdk.flow.s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    @Override // com.fyber.inneractive.sdk.flow.g0
    public void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        Iterator it = new HashSet(this.f23491a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).q();
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.g0
    public void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.interfaces.d dVar;
        Iterator it = new HashSet(this.f23491a).iterator();
        while (true) {
            if (!it.hasNext()) {
                dVar = null;
                break;
            }
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                if (dVar.a(inneractiveAdSpot.getAdContent())) {
                    break;
                }
            }
        }
        if (dVar != null) {
            dVar.a((ViewGroup) null);
        } else {
            onAdRefreshFailed(inneractiveAdSpot, InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
        try {
            if (inneractiveAdSpot instanceof h0) {
                int i10 = IAlog.f26748a;
                IAlog.d("%s %s", "AD_REFRESH", ((h0) inneractiveAdSpot).f23653h.f23759d.b());
            }
        } catch (Exception unused) {
        }
        IAlog.a("InneractiveFullscreenUnitController onAdRefreshed called", new Object[0]);
    }

    public void refreshAd() {
        IAlog.a("InneractiveFullscreenUnitController refreshAd called", new Object[0]);
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) v.a(this.mAdSpot);
        if (inneractiveAdSpot == null || !(inneractiveAdSpot instanceof r0)) {
            return;
        }
        ((r0) inneractiveAdSpot).a(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) inneractiveAdSpot.getAdContent().f23947d;
        if (r0Var.f23347e != null) {
            return false;
        }
        l0 l0Var = r0Var.f23345c;
        if (l0Var != null) {
            if (UnitDisplayType.BANNER.equals(l0Var.f23330b) || UnitDisplayType.MRECT.equals(l0Var.f23330b)) {
                return true;
            }
            if (UnitDisplayType.INTERSTITIAL.equals(l0Var.f23330b)) {
                return inneractiveAdSpot.getCurrentProcessedRequest() != null && inneractiveAdSpot.getCurrentProcessedRequest().getAllowFullscreen();
            }
        }
        t0 t0Var = r0Var.f23348f;
        return t0Var != null && (UnitDisplayType.LANDSCAPE.equals(t0Var.f23408j) || UnitDisplayType.SQUARE.equals(t0Var.f23408j) || UnitDisplayType.MRECT.equals(t0Var.f23408j));
    }

    @Override // com.fyber.inneractive.sdk.flow.s0
    public boolean supportsRefresh() {
        return true;
    }

    public void unbindFullscreenRenderer(com.fyber.inneractive.sdk.interfaces.f fVar) {
        WeakReference<i0> weakReference;
        IAlog.a("%sremoving full screen ad renderer %s", logPrefix(), fVar);
        HashSet hashSet = this.f23491a;
        if (hashSet != null) {
            hashSet.remove(fVar);
        }
        if (this.f23492b) {
            return;
        }
        Iterator it = new HashSet(this.f23491a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                ((com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer).r();
                if (this.mEventsListener != null && (weakReference = this.mAdSpot) != null && weakReference.get() != null) {
                    ((InneractiveAdViewEventsListener) this.mEventsListener).onAdCollapsed(this.mAdSpot.get());
                }
            }
        }
    }

    public void unbindView(View view) {
        if (this.f23493c != view) {
            IAlog.f("%s unbindView invoked with incorrect view, was - %s received - %s", logPrefix(), this.f23493c, view);
        } else {
            this.f23493c = null;
        }
        IAlog.a("%sPPPP unbindView called with %s", logPrefix(), view);
        IAlog.a("%sPPPP spot is %s", logPrefix(), this.mAdSpot);
        Iterator it = new HashSet(this.f23491a).iterator();
        while (it.hasNext()) {
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof com.fyber.inneractive.sdk.interfaces.d) {
                com.fyber.inneractive.sdk.interfaces.d dVar = (com.fyber.inneractive.sdk.interfaces.d) inneractiveAdRenderer;
                if (dVar.b(view)) {
                    IAlog.a("%sPPPP unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                    dVar.t();
                    this.f23491a.remove(dVar);
                    return;
                }
            }
        }
    }

    public InneractiveAdViewUnitController(int i10) {
        this();
        if (i10 >= 30) {
            IAlog.a("InneractiveAdViewUnitController: Overriding remote config refresh interval to: %d", Integer.valueOf(i10));
            this.f23494d = i10;
        } else {
            IAlog.a("InneractiveAdViewUnitController: Overriding remote config refresh interval - value too low. Setting to default: %d -> %d", Integer.valueOf(i10), 30);
            this.f23494d = 30;
        }
    }

    public InneractiveAdViewUnitController(boolean z10) {
        this();
        if (z10) {
            this.f23494d = -1;
        }
    }
}
