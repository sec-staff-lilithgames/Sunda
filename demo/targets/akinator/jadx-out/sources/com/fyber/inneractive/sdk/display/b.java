package com.fyber.inneractive.sdk.display;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.p0;
import com.fyber.inneractive.sdk.interfaces.e;
import com.fyber.inneractive.sdk.interfaces.f;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b extends a implements e {

    /* renamed from: a, reason: collision with root package name */
    public InneractiveAdSpot f23426a;

    /* renamed from: b, reason: collision with root package name */
    public f f23427b;

    @Override // com.fyber.inneractive.sdk.display.a
    public final void a(Activity activity, InneractiveAdSpot inneractiveAdSpot, String str) {
        InneractiveAdSpot spot;
        if (TextUtils.isEmpty(str) || (spot = InneractiveAdSpotManager.get().getSpot(str)) == null || spot.getAdContent() == null) {
            spot = null;
        }
        this.f23426a = spot;
        if (spot != null) {
            InneractiveUnitController selectedUnitController = spot.getSelectedUnitController();
            if (selectedUnitController instanceof InneractiveFullscreenAdActivity.FullScreenRendererProvider) {
                f fullscreenRenderer = ((InneractiveFullscreenAdActivity.FullScreenRendererProvider) selectedUnitController).getFullscreenRenderer();
                this.f23427b = fullscreenRenderer;
                if (fullscreenRenderer != null) {
                    ((p0) fullscreenRenderer).initialize(this.f23426a);
                    try {
                        this.f23427b.a(this, activity);
                    } catch (Resources.NotFoundException e10) {
                        IAlog.f("Interstitial Activity: %s", e10.getMessage());
                    } catch (InneractiveUnitController.AdDisplayError e11) {
                        IAlog.f("Interstitial Activity: %s", e11.getMessage());
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public final void dismissAd(boolean z10) {
        f fVar = this.f23427b;
        if (fVar != null) {
            fVar.destroy();
            this.f23427b = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public final View getCloseButton() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public final ViewGroup getLayout() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public final boolean isCloseButtonDisplay() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public final boolean wasDismissedByUser() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public final void destroy() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public final void disableCloseButton() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public final void secondEndCardWasDisplayed() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public final void showCloseCountdown() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public final void updateCloseCountdown(int i10) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public final void setActivityOrientation(boolean z10, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.e
    public final void showCloseButton(boolean z10, int i10, int i11) {
    }
}
