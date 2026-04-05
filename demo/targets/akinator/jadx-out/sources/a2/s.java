package a2;

import a2.i0;
import a2.t;
import android.util.Log;
import android.view.MotionEvent;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.google.android.material.button.MaterialButton;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.inmobi.unifiedId.InMobiUserDataModel;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d;
import com.sfbx.appconsentv3.ui.AppConsentActivity;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.unity3d.services.banners.BannerView;
import java.util.Iterator;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3790b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3791c;

    public /* synthetic */ s(Object obj, int i10) {
        this.f3790b = i10;
        this.f3791c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e2.p unmergedConfig;
        switch (this.f3790b) {
            case 0:
                t this$0 = (t) this.f3791c;
                t.a aVar = t.f3798r0;
                kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
                this$0.f3824m0 = false;
                MotionEvent motionEvent = this$0.f3812g0;
                kotlin.jvm.internal.e0.checkNotNull(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
                }
                this$0.l(motionEvent);
                return;
            case 1:
                i0 this$02 = (i0) this.f3791c;
                int[] iArr = i0.A;
                kotlin.jvm.internal.e0.checkNotNullParameter(this$02, "this$0");
                t tVar = this$02.f3618d;
                z1.s1.measureAndLayout$default(tVar, false, 1, null);
                this$02.r(tVar.getSemanticsOwner().getUnmergedRootSemanticsNode(), this$02.f3636v);
                this$02.sendSemanticsPropertyChangeEvents$ui_release(this$02.d());
                z.g gVar = this$02.f3634t;
                Iterator<Object> it = gVar.iterator();
                while (it.hasNext()) {
                    Integer id2 = (Integer) it.next();
                    q4 q4Var = (q4) this$02.d().get(id2);
                    e2.c0 semanticsNode = q4Var != null ? q4Var.getSemanticsNode() : null;
                    if (semanticsNode == null || !semanticsNode.getConfig().contains(e2.n0.f53555a.getPaneTitle())) {
                        gVar.remove(id2);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(id2, "id");
                        int iIntValue = id2.intValue();
                        i0.d dVar = (i0.d) this$02.f3635u.get(id2);
                        this$02.p(iIntValue, 32, (dVar == null || (unmergedConfig = dVar.getUnmergedConfig()) == null) ? null : (String) e2.r.getOrNull(unmergedConfig, e2.n0.f53555a.getPaneTitle()));
                    }
                }
                this$02.f3635u.clear();
                for (Map.Entry entry : this$02.d().entrySet()) {
                    if (((q4) entry.getValue()).getSemanticsNode().getConfig().contains(e2.n0.f53555a.getPaneTitle()) && gVar.add(entry.getKey())) {
                        this$02.p(((Number) entry.getKey()).intValue(), 16, (String) ((q4) entry.getValue()).getSemanticsNode().getUnmergedConfig$ui_release().get(e2.n0.f53555a.getPaneTitle()));
                    }
                    this$02.f3635u.put(entry.getKey(), new i0.d(((q4) entry.getValue()).getSemanticsNode(), this$02.d()));
                }
                this$02.f3636v = new i0.d(tVar.getSemanticsOwner().getUnmergedRootSemanticsNode(), this$02.d());
                this$02.f3637w = false;
                return;
            case 2:
                androidx.lifecycle.b2 b2Var = (androidx.lifecycle.b2) this.f3791c;
                b2Var.dispatchPauseIfNeeded$lifecycle_process_release();
                b2Var.dispatchStopIfNeeded$lifecycle_process_release();
                return;
            case 3:
                MaterialButton.a((MaterialButton) this.f3791c);
                return;
            case 4:
                InMobiUnifiedIdService.a((InMobiUserDataModel) this.f3791c);
                return;
            case 5:
                InMobiUnifiedIdService.b((InMobiUnifiedIdInterface) this.f3791c);
                return;
            case 6:
                AkApplication akApplication = (AkApplication) this.f3791c;
                AkApplication.a aVar2 = AkApplication.f21719f;
                if (ca.m.sharedInstance().canSendAnalytics()) {
                    BuildersKt__Builders_commonKt.launch$default(AkApplication.f21719f.getAppScope(), Dispatchers.getIO(), null, new ca.e(2, null), 2, null);
                    akApplication.f21734b = null;
                } else {
                    ca.u.sharedInstance().setAnalyticsSend(true);
                }
                akApplication.deleteCache();
                return;
            case 7:
                ((ca.g) this.f3791c).f11946c.f11952c.loadAd();
                return;
            case 8:
                ((ca.h) this.f3791c).f11948c.f11953d.loadAd();
                return;
            case 9:
                ((AppLovinFullscreenActivity) this.f3791c).c();
                return;
            case 10:
                AppLovinBroadcastManager.sendBroadcastSync((CommunicatorMessageImpl) this.f3791c, null);
                return;
            case 11:
                ((MaxFullscreenAdImpl) this.f3791c).c();
                return;
            case 12:
                ((MaxFullscreenAdImpl.b) this.f3791c).a();
                return;
            case 13:
                ((com.applovin.impl.sdk.b) this.f3791c).c();
                return;
            case 14:
                ((com.applovin.impl.sdk.f) this.f3791c).i();
                return;
            case 15:
                ((com.applovin.impl.sdk.l) this.f3791c).S();
                return;
            case 16:
                ((com.applovin.impl.sdk.network.b) this.f3791c).e();
                return;
            case 17:
                ((MaxNativeAdView) this.f3791c).a();
                return;
            case 18:
                ((MaxAdPlacer) this.f3791c).b();
                return;
            case 19:
                com.google.android.exoplayer2.ui.h hVar = (com.google.android.exoplayer2.ui.h) this.f3791c;
                int i10 = com.google.android.exoplayer2.ui.h.R;
                hVar.d(false);
                return;
            case 20:
                com.google.android.exoplayer2.ui.u uVar = (com.google.android.exoplayer2.ui.u) this.f3791c;
                float[] fArr = com.google.android.exoplayer2.ui.u.f28329z0;
                uVar.i();
                return;
            case 21:
                com.google.firebase.messaging.h0 h0Var = (com.google.firebase.messaging.h0) this.f3791c;
                synchronized (h0Var.f29813d) {
                    h0Var.f29810a.edit().putString(h0Var.f29811b, h0Var.serialize()).commit();
                }
                return;
            case 22:
                com.google.firebase.messaging.s0 s0Var = (com.google.firebase.messaging.s0) this.f3791c;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + s0Var.f29877a.getAction() + " finishing.");
                s0Var.f29878b.trySetResult(null);
                return;
            case 23:
                com.moloco.sdk.acm.eventprocessing.m.b((com.moloco.sdk.acm.eventprocessing.m) this.f3791c);
                return;
            case 24:
                d.c.a.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d) this.f3791c);
                return;
            case 25:
                AppConsentActivity.onStop$lambda$0((AppConsentActivity) this.f3791c);
                return;
            case 26:
                ((IUnityAdsTokenListener) this.f3791c).onUnityAdsTokenReady(null);
                return;
            case 27:
                ((BiddingBaseManager) this.f3791c).lambda$fetchSignals$1();
                return;
            case 28:
                ((ShowOperationState) this.f3791c).lambda$onUnityAdsShowClick$1();
                return;
            default:
                ((BannerView) this.f3791c).lambda$addScarContainer$0();
                return;
        }
    }
}
