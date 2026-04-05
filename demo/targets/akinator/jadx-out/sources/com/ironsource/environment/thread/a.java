package com.ironsource.environment.thread;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.l0;
import br.p1;
import br.z;
import com.google.android.exoplayer2.z0;
import com.ironsource.lh;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.controller.v;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityShowCallback;
import com.moloco.sdk.internal.unity_bridge.internal.b;
import com.moloco.sdk.publisher.MolocoAdError;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.internal.VungleInternal;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.load.BaseAdLoader$assetDownloadListener$1;
import com.vungle.ads.internal.load.DefaultAdLoader;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.session.UnclosedAdDetector;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.util.ImageLoader;
import cq.e;
import cq.f;
import de.h;
import em.d;
import em.s0;
import em.t0;
import em.u;
import em.u0;
import em.w0;
import f.d0;
import io.bidmachine.AdsFormat;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.Waterfall;
import io.odeeo.internal.q0.v;
import io.odeeo.internal.r.c;
import io.odeeo.internal.r0.l;
import io.odeeo.internal.r0.m;
import io.odeeo.internal.s0.i;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.e0;
import kv.l;
import nm.j;
import pr.n;
import tu.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36655c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f36656e;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f36654b = i10;
        this.f36655c = obj;
        this.f36656e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f36654b;
        int i11 = 2;
        Object obj = this.f36656e;
        Object obj2 = this.f36655c;
        switch (i10) {
            case 0:
                IronSourceThreadManager.a((Runnable) obj2, (CountDownLatch) obj);
                break;
            case 1:
                ((v) obj2).j((String) obj);
                break;
            case 2:
                ((v.r) obj2).b((String) obj);
                break;
            case 3:
                b.a((MolocoUnityShowCallback) obj2, (String) obj);
                break;
            case 4:
                b.C0390b.a((MolocoUnityShowCallback) obj2, (MolocoAdError) obj);
                break;
            case 5:
                UnityAdsImplementation.lambda$load$1((IUnityAdsLoadListener) obj2, (String) obj);
                break;
            case 6:
                ((BiddingBaseManager) obj2).lambda$uploadSignals$2((BiddingSignals) obj);
                break;
            case 7:
                ((BiddingBaseManager) obj2).lambda$onUnityAdsTokenReady$0((String) obj);
                break;
            case 8:
                ((ShowOperationState) obj2).lambda$onUnityAdsShowStart$2((String) obj);
                break;
            case 9:
                ((ShowOperationState) obj2).lambda$onUnityAdsShowComplete$3((UnityAds.UnityAdsShowCompletionState) obj);
                break;
            case 10:
                VungleInternal.m3601getAvailableBidTokensAsync$lambda2((BidTokenCallback) obj2, (o) obj);
                break;
            case 11:
                BaseAdLoader$assetDownloadListener$1.m3614onProgress$lambda0((BaseAdLoader) obj2, (AdAsset) obj);
                break;
            case 12:
                DefaultAdLoader.AnonymousClass1.m3616onFailure$lambda1((DefaultAdLoader) obj2, (Throwable) obj);
                break;
            case 13:
                AndroidPlatform.m3625getUserAgentLazy$lambda0((AndroidPlatform) obj2, (w3.b) obj);
                break;
            case 14:
                UnclosedAdDetector.m3643writeUnclosedAdToFile$lambda5((UnclosedAdDetector) obj2, (String) obj);
                break;
            case 15:
                VungleWebClient.m3655notifyPropertiesChange$lambda25$lambda24((VungleWebClient) obj2, (String) obj);
                break;
            case 16:
                ImageLoader.m3669displayImage$lambda0((String) obj2, (l) obj);
                break;
            case 17:
                e this$0 = (e) obj2;
                z brokenCreativeEvent = (z) obj;
                int i12 = e.f50880m;
                e0.checkNotNullParameter(this$0, "this$0");
                e0.checkNotNullParameter(brokenCreativeEvent, "$brokenCreativeEvent");
                f fVar = this$0.f50889k;
                if (fVar != null) {
                    fVar.onBrokenCreativeEvent(this$0, brokenCreativeEvent);
                    break;
                }
                break;
            case 18:
                e this$02 = (e) obj2;
                p1 privacySheetParams = (p1) obj;
                int i13 = e.f50880m;
                e0.checkNotNullParameter(this$02, "this$0");
                e0.checkNotNullParameter(privacySheetParams, "$privacySheetParams");
                f fVar2 = this$02.f50889k;
                if (fVar2 != null) {
                    fVar2.onOpenPrivacySheet(this$02, privacySheetParams);
                    break;
                }
                break;
            case 19:
                ((io.odeeo.internal.q0.v) obj2).a((v.c) obj);
                break;
            case 20:
                h hVar = (h) obj2;
                z0 z0Var = (z0) obj;
                com.google.android.exoplayer2.drm.b bVar = hVar.f52131f;
                if (bVar.f27423p != 0 && !hVar.f52130e) {
                    hVar.f52129c = bVar.a((Looper) com.google.android.exoplayer2.util.a.checkNotNull(bVar.f27427t), hVar.f52128b, z0Var, false);
                    bVar.f27421n.add(hVar);
                    break;
                }
                break;
            case 21:
                LevelPlayNativeAd.a((LevelPlayNativeAd) obj2, (IronSourceError) obj);
                break;
            case 22:
                ((c) obj2).a((MediaCodec) obj);
                break;
            case 23:
                w0 w0Var = (w0) obj2;
                Waterfall.Configuration.AdUnit adUnit = (Waterfall.Configuration.AdUnit) obj;
                String str = w0Var.f54781l;
                n nVar = w0Var.f54772b;
                d dVar = w0Var.f54777h;
                AdsFormat adsFormat = w0Var.f54775f;
                u uVarA = dVar.a(adsFormat);
                if (uVarA != null && adUnit.getPrice() <= uVarA.getAdUnit().getPrice() && dVar.b(adsFormat) >= w0Var.f54784o) {
                    nm.a.d(nVar, new s0(w0Var, i11));
                    w0Var.a(adUnit, Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, null);
                    Iterator it = w0Var.f54782m.iterator();
                    while (it.hasNext()) {
                        w0Var.a((Waterfall.Configuration.AdUnit) it.next(), Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, null);
                    }
                    w0Var.c();
                    break;
                } else {
                    try {
                        u uVarCreateAd = w0Var.f54776g.createAd(w0Var.f54774e, w0Var.f54780k, w0Var.f54775f, adUnit, new t0(w0Var));
                        if (uVarCreateAd == null) {
                            nm.a.d(nVar, new s0(w0Var, 3));
                            w0Var.a(adUnit, Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, pr.a.internal("Can't create InternalAd"));
                            w0Var.b(null);
                            break;
                        } else {
                            if (!TextUtils.isEmpty(str)) {
                                uVarCreateAd.setCustomParam("gam_waterfall_id", str);
                                uVarCreateAd.setCustomParam("gam_ad_unit_id", adUnit.getAdUnitId());
                            }
                            Context context = w0Var.f54773c;
                            u0 u0Var = new u0(w0Var);
                            nm.a.d(uVarCreateAd.f54761a, new em.b(uVarCreateAd, 4));
                            j.onUiThread(new lh(uVarCreateAd, 21, context.getApplicationContext(), u0Var));
                            w0Var.d(TrackEventType.AdUnitLoadStart, uVarCreateAd.getAdUnit(), uVarCreateAd, null);
                            break;
                        }
                    } catch (Throwable th2) {
                        nm.a.w(th2);
                        w0Var.a(adUnit, Waterfall.Result.AdUnit.Status.STATUS_SKIPPED, null, pr.a.throwable("Exception loading InternalAd object", th2));
                        w0Var.b(null);
                        return;
                    }
                }
            case 24:
                ((l.a) obj2).a((String) obj);
                break;
            case 25:
                ((l.a) obj2).a((Exception) obj);
                break;
            case 26:
                ((l.a) obj2).a((m) obj);
                break;
            case 27:
                ComponentActivity componentActivity = (ComponentActivity) obj2;
                int i14 = ComponentActivity.f4643b;
                componentActivity.getLifecycle().addObserver(new l0(i11, (d0) obj, componentActivity));
                break;
            case 28:
                ((i) obj2).a((SurfaceTexture) obj);
                break;
            default:
                g3.s0 s0Var = (g3.s0) obj2;
                View[] viewArr = (View[]) obj;
                if (s0Var.f57261p != -1) {
                    for (View view : viewArr) {
                        view.setTag(s0Var.f57261p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (s0Var.f57262q != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(s0Var.f57262q, null);
                    }
                    break;
                }
                break;
        }
    }
}
