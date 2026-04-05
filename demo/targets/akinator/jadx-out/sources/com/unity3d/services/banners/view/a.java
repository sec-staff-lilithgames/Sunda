package com.unity3d.services.banners.view;

import androidx.activity.ComponentActivity;
import com.amazon.aps.ads.activity.ApsInterstitialActivity;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.digidust.elokence.akinator.graphic.spinner.AkinatorSpinner;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.textfield.TextInputLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.VungleInitializer;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.session.UnclosedAdDetector;
import de.h;
import de.n;
import dh.d;
import dh.l;
import em.u;
import em.u0;
import em.x;
import f.m;
import f.v;
import gm.f;
import gm.o;
import hm.c;
import hm.e;
import io.bidmachine.media3.common.util.i0;
import io.bidmachine.media3.common.util.j0;
import io.bidmachine.media3.exoplayer.audio.z0;
import io.bidmachine.media3.ui.c0;
import io.bidmachine.media3.ui.k;
import io.bidmachine.protobuf.Waterfall;
import io.odeeo.internal.b.w0;
import io.odeeo.internal.s0.i;
import io.s;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50747c;

    public /* synthetic */ a(Object obj, int i10) {
        this.f50746b = i10;
        this.f50747c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z10 = false;
        x xVar = null;
        String userId = null;
        xVar = null;
        x xVar2 = null;
        xVar = null;
        x xVar3 = null;
        xVar = null;
        switch (this.f50746b) {
            case 0:
                ScarBannerContainer.lambda$destroy$0((ScarBannerContainer) this.f50747c);
                return;
            case 1:
                VungleInitializer.m3595init$lambda3((VungleInitializer) this.f50747c);
                return;
            case 2:
                BaseAdLoader.m3611loadAd$lambda0((BaseAdLoader) this.f50747c);
                return;
            case 3:
                OMInjector.m3622init$lambda2((OMInjector) this.f50747c);
                return;
            case 4:
                UnclosedAdDetector.m3642retrieveUnclosedAd$lambda3((UnclosedAdDetector) this.f50747c);
                return;
            case 5:
                h hVar = (h) this.f50747c;
                if (hVar.f52130e) {
                    return;
                }
                n nVar = hVar.f52129c;
                if (nVar != null) {
                    nVar.release(hVar.f52128b);
                }
                hVar.f52131f.f27421n.remove(hVar);
                hVar.f52130e = true;
                return;
            case 6:
                ((com.google.android.exoplayer2.drm.a) this.f50747c).release(null);
                return;
            case 7:
                ((d) this.f50747c).n(true);
                return;
            case 8:
                l lVar = (l) this.f50747c;
                boolean zIsPopupShowing = lVar.f52236h.isPopupShowing();
                lVar.n(zIsPopupShowing);
                lVar.f52241m = zIsPopupShowing;
                return;
            case 9:
                ((TextInputLayout) this.f50747c).f29477g.requestLayout();
                return;
            case 10:
                LevelPlayNativeAd.a((LevelPlayNativeAd) this.f50747c);
                return;
            case 11:
                ((CarouselLayoutManager) this.f50747c).u();
                return;
            case 12:
                try {
                    ((u) this.f50747c).b();
                    return;
                } catch (Throwable th2) {
                    nm.a.w(th2);
                    return;
                }
            case 13:
                ComponentActivity.c cVar = (ComponentActivity.c) this.f50747c;
                Runnable runnable = cVar.f4647c;
                if (runnable != null) {
                    e0.checkNotNull(runnable);
                    runnable.run();
                    cVar.f4647c = null;
                    return;
                }
                return;
            case 14:
                m.a((m) this.f50747c);
                return;
            case 15:
                v vVar = (v) this.f50747c;
                synchronized (vVar.f55244c) {
                    vVar.f55246e = false;
                    if (vVar.f55245d == 0 && !vVar.f55247f) {
                        vVar.f55243b.invoke();
                        vVar.fullyDrawnReported();
                    }
                }
                return;
            case 16:
                ((i) this.f50747c).a();
                return;
            case 17:
                ApsInterstitialActivity.useCustomButtonUpdated$lambda$17((ApsInterstitialActivity) this.f50747c);
                return;
            case 18:
                gm.d dVar = (gm.d) this.f50747c;
                f fVar = dVar.f57710b;
                AdManagerAdView adManagerAdView = fVar.f57714l;
                if (adManagerAdView != null) {
                    Waterfall.Result.EstimatedPrice estimatedPriceC = o.c(adManagerAdView, new String[]{"zza", "zzj", "zza", "a", "a", CampaignEx.JSON_KEY_AD_K, ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT});
                    ResponseInfo responseInfo = adManagerAdView.getResponseInfo();
                    String string = responseInfo != null ? responseInfo.toString() : null;
                    if (estimatedPriceC != null || string != null) {
                        xVar = new x(estimatedPriceC, string);
                    }
                }
                fVar.onAdLoaded(xVar);
                ((u0) dVar.f57711c).onAdLoaded(fVar, xVar);
                return;
            case 19:
                c cVar2 = (c) this.f50747c;
                e eVar = cVar2.f59003b;
                AdManagerAdView adManagerAdView2 = eVar.f59007l;
                if (adManagerAdView2 != null) {
                    Waterfall.Result.EstimatedPrice estimatedPriceC2 = hm.n.c(adManagerAdView2, new String[]{"zza", "zzj", "zza", "a", "a", CampaignEx.JSON_KEY_AD_K, ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT});
                    ResponseInfo responseInfo2 = adManagerAdView2.getResponseInfo();
                    String string2 = responseInfo2 != null ? responseInfo2.toString() : null;
                    if (estimatedPriceC2 != null || string2 != null) {
                        xVar3 = new x(estimatedPriceC2, string2);
                    }
                }
                eVar.onAdLoaded(xVar3);
                ((u0) cVar2.f59004c).onAdLoaded(eVar, xVar3);
                return;
            case 20:
                AkinatorSpinner akinatorSpinner = (AkinatorSpinner) this.f50747c;
                int i10 = AkinatorSpinner.f21785n;
                akinatorSpinner.showDropDown();
                return;
            case 21:
                im.c cVar3 = (im.c) this.f50747c;
                im.e eVar2 = cVar3.f59735b;
                AdManagerAdView adManagerAdView3 = eVar2.f59739l;
                if (adManagerAdView3 != null) {
                    Waterfall.Result.EstimatedPrice estimatedPriceC3 = im.o.c(adManagerAdView3, new String[]{"zza", "zzj", "zza", "a", "a", CampaignEx.JSON_KEY_AD_K, ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT});
                    ResponseInfo responseInfo3 = adManagerAdView3.getResponseInfo();
                    String string3 = responseInfo3 != null ? responseInfo3.toString() : null;
                    if (estimatedPriceC3 != null || string3 != null) {
                        xVar2 = new x(estimatedPriceC3, string3);
                    }
                }
                eVar2.onAdLoaded(xVar2);
                ((u0) cVar3.f59736c).onAdLoaded(eVar2, xVar2);
                return;
            case 22:
                ((s) this.f50747c).f68203p--;
                return;
            case 23:
                j0 j0Var = (j0) this.f50747c;
                i0 i0Var = (i0) j0Var.f60728a.get();
                if (i0Var != null) {
                    ((go.m) i0Var).onNetworkTypeChanged(j0Var.f60730c.getNetworkType());
                    return;
                }
                return;
            case 24:
                io.bidmachine.media3.exoplayer.audio.u0 u0Var = (io.bidmachine.media3.exoplayer.audio.u0) this.f50747c;
                if (u0Var.f61042j0 >= 300000) {
                    ((z0) u0Var.f61053t).onSilenceSkipped();
                    u0Var.f61042j0 = 0L;
                    return;
                }
                return;
            case 25:
                io.bidmachine.media3.ui.e eVar3 = (io.bidmachine.media3.ui.e) this.f50747c;
                int i11 = io.bidmachine.media3.ui.e.R;
                eVar3.d(false);
                return;
            case 26:
                k kVar = (k) this.f50747c;
                float[] fArr = k.C0;
                kVar.i();
                return;
            case 27:
                ((c0) this.f50747c).invalidate();
                return;
            case 28:
                ((w0) this.f50747c).a();
                return;
            default:
                ji.u uVar = (ji.u) this.f50747c;
                synchronized (uVar.f69624g) {
                    try {
                        if (uVar.f69624g.isMarked()) {
                            userId = uVar.getUserId();
                            uVar.f69624g.set(userId, false);
                            z10 = true;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (z10) {
                    uVar.f69618a.writeUserData(uVar.f69620c, userId);
                    return;
                }
                return;
        }
    }
}
