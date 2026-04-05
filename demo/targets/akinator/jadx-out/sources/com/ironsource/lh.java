package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.ironsource.C3497vb;
import com.ironsource.Q1;
import com.ironsource.X2;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback;
import com.moloco.sdk.internal.unity_bridge.internal.b;
import com.moloco.sdk.publisher.MolocoAdError;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import com.unity3d.services.core.webview.WebView;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.AssetDownloader;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.load.DefaultAdLoader;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.util.LogEntry;
import io.bidmachine.AdPlacementConfig;
import io.bidmachine.BidMachine;
import io.bidmachine.BidTokenCallback;
import io.odeeo.internal.a0.u;
import io.odeeo.internal.r0.l;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class lh implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37174c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f37175e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f37176f;

    public /* synthetic */ lh(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        this.f37173b = 8;
        this.f37175e = context;
        this.f37174c = levelPlayInitRequest;
        this.f37176f = levelPlayInitListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f37173b) {
            case 0:
                P9.a((InitRequest) this.f37174c, (Context) this.f37175e, (InitListener) this.f37176f);
                break;
            case 1:
                Q1.c.a((Q1) this.f37174c, (String) this.f37175e, (Q1.d) this.f37176f);
                break;
            case 2:
                X2.a.a((X2) this.f37174c, (View) this.f37175e, (View) this.f37176f);
                break;
            case 3:
                C3162cb.a((C3162cb) this.f37174c, (LevelPlayAdError) this.f37175e, (LevelPlayAdInfo) this.f37176f);
                break;
            case 4:
                C3162cb.a((Activity) this.f37174c, (C3162cb) this.f37175e, (String) this.f37176f);
                break;
            case 5:
                C3172d3.a((C3172d3) this.f37174c, (M9) this.f37175e, (C3302k8) this.f37176f);
                break;
            case 6:
                C3189e2.a((C3189e2) this.f37174c, (InterfaceC3124a9) this.f37175e, (Y8) this.f37176f);
                break;
            case 7:
                C3199ec.a((C3199ec) this.f37174c, (AdapterNativeAdData) this.f37175e, (AdapterNativeAdViewBinder) this.f37176f);
                break;
            case 8:
                C3497vb.b((Context) this.f37175e, (LevelPlayInitRequest) this.f37174c, (LevelPlayInitListener) this.f37176f);
                break;
            case 9:
                C3497vb.a.a((LevelPlayInitListener) this.f37174c, (C3317l5) this.f37175e, (C3364ne) this.f37176f);
                break;
            case 10:
                C3539y2.a((C3539y2) this.f37174c, (View) this.f37175e, (FrameLayout.LayoutParams) this.f37176f);
                break;
            case 11:
                com.moloco.sdk.internal.unity_bridge.internal.b.a((MolocoUnityLoadCallback) this.f37174c, (String) this.f37175e, (MolocoAdError.AdCreateError) this.f37176f);
                break;
            case 12:
                b.a.a((MolocoUnityLoadCallback) this.f37174c, (String) this.f37175e, (MolocoAdError) this.f37176f);
                break;
            case 13:
                ((LoadOperationState) this.f37174c).lambda$onUnityAdsFailedToLoad$0((UnityAds.UnityAdsLoadError) this.f37175e, (String) this.f37176f);
                break;
            case 14:
                ((IUnityAdsInitializationListener) this.f37174c).onInitializationFailed((UnityAds.UnityAdsInitializationError) this.f37175e, (String) this.f37176f);
                break;
            case 15:
                WebView.evaluateJavascript$lambda$1((WebView) this.f37174c, (String) this.f37175e, (ValueCallback) this.f37176f);
                break;
            case 16:
                AnalyticsClient.m3534logError$lambda2((Sdk.SDKError.Reason) this.f37174c, (String) this.f37175e, (LogEntry) this.f37176f);
                break;
            case 17:
                AssetDownloader.m3603download$lambda0((DownloadRequest) this.f37174c, (AssetDownloader) this.f37175e, (AssetDownloadListener) this.f37176f);
                break;
            case 18:
                DefaultAdLoader.AnonymousClass1.m3617onResponse$lambda0((DefaultAdLoader) this.f37174c, (Placement) this.f37175e, (Response) this.f37176f);
                break;
            case 19:
                VungleWebClient.m3662shouldOverrideUrlLoading$lambda16$lambda6$lambda5((VungleWebClient) this.f37174c, (android.webkit.WebView) this.f37175e, (String) this.f37176f);
                break;
            case 20:
                de.p pVar = (de.p) this.f37174c;
                ((de.q) this.f37175e).onDrmSessionManagerError(pVar.f52159a, pVar.f52160b, (Exception) this.f37176f);
                break;
            case 21:
                em.u uVar = (em.u) this.f37174c;
                Context context = (Context) this.f37175e;
                em.u0 u0Var = (em.u0) this.f37176f;
                try {
                    uVar.f54768h = 2;
                    uVar.loadAd(context, u0Var);
                    break;
                } catch (Throwable th2) {
                    nm.a.w(th2);
                    u0Var.onAdLoadFailed(uVar, pr.a.throwable("Exception loading InternalAd object", th2));
                    return;
                }
            case 22:
                em.c0 c0Var = (em.c0) this.f37174c;
                Activity activity = (Activity) this.f37175e;
                em.d0 d0Var = (em.d0) this.f37176f;
                try {
                    c0Var.f54768h = 4;
                    c0Var.d(activity, d0Var);
                    break;
                } catch (Throwable th3) {
                    nm.a.w(th3);
                    ((em.g) d0Var).onAdShowFailed(pr.a.throwable("Exception showing InternalAd object", th3));
                    return;
                }
            case 23:
                ((l.a) this.f37174c).a((io.odeeo.internal.b.t) this.f37175e, (io.odeeo.internal.e.i) this.f37176f);
                break;
            case 24:
                hi.z zVar = (hi.z) this.f37174c;
                Throwable th4 = (Throwable) this.f37175e;
                Map map = (Map) this.f37176f;
                hi.u uVar2 = zVar.f58920h;
                Thread threadCurrentThread = Thread.currentThread();
                uVar2.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                hi.e0 e0Var = uVar2.f58894n;
                if (e0Var == null || !e0Var.f58808e.get()) {
                    long j10 = jCurrentTimeMillis / 1000;
                    String strF = uVar2.f();
                    if (strF != null) {
                        uVar2.f58893m.persistNonFatalEvent(th4, threadCurrentThread, new ji.d(strF, j10, map));
                        break;
                    } else {
                        ei.f.getLogger().w("Tried to write a non-fatal exception while no session was open.");
                        break;
                    }
                }
                break;
            case 25:
                ((u.a) this.f37174c).a((io.odeeo.internal.a0.u) this.f37175e, (io.odeeo.internal.a0.q) this.f37176f);
                break;
            case 26:
                io.o oVar = (io.o) this.f37174c;
                io.i0 i0Var = (io.i0) this.f37175e;
                gn.k2 k2Var = (gn.k2) this.f37176f;
                oVar.getClass();
                i0Var.onVideoSizeChanged(oVar, k2Var);
                break;
            case 27:
                io.o oVar2 = (io.o) this.f37174c;
                io.i0 i0Var2 = (io.i0) this.f37175e;
                gn.f2 f2Var = (gn.f2) this.f37176f;
                oVar2.getClass();
                i0Var2.onError(oVar2, new io.k0(f2Var, (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkStateNotNull(oVar2.f62196c)));
                break;
            case 28:
                io.f0 f0Var = (io.f0) this.f37174c;
                ((io.bidmachine.media3.exoplayer.j0) ((io.g0) io.bidmachine.media3.common.util.a1.castNonNull(f0Var.f62123b))).onVideoInputFormatChanged((io.bidmachine.media3.common.b) this.f37175e, (io.bidmachine.media3.exoplayer.k) this.f37176f);
                break;
            default:
                BidMachine.lambda$getBidToken$9((BidTokenCallback) this.f37174c, (Context) this.f37175e, (AdPlacementConfig) this.f37176f);
                break;
        }
    }

    public /* synthetic */ lh(Object obj, int i10, Object obj2, Object obj3) {
        this.f37173b = i10;
        this.f37174c = obj;
        this.f37175e = obj2;
        this.f37176f = obj3;
    }
}
