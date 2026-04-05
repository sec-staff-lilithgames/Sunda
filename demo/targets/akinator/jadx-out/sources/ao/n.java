package ao;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import ao.r;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.listeners.ApsInitializationListener;
import com.amazon.aps.ads.model.ApsInitConfig;
import com.amazon.aps.ads.model.ApsInitializationStatus;
import com.amazon.aps.shared.util.ApsAsyncUtil;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter;
import com.applovin.mediation.adapters.GoogleMediationAdapter;
import com.applovin.mediation.adapters.MolocoMediationAdapter;
import com.applovin.mediation.adapters.UnityAdsMediationAdapter;
import com.explorestack.protobuf.MessageOrBuilder;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import com.google.firebase.messaging.EnhancedIntentService;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoBidTokenListener;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;
import com.sfbx.appconsentv3.ui.ui.vendor.refine.RefineByVendorActivity;
import com.unity3d.ads.IUnityAdsTokenListener;
import io.bidmachine.AdRequest;
import io.bidmachine.ApiRequest;
import io.bidmachine.BidMachine;
import io.bidmachine.BidMachineAd;
import io.bidmachine.NetworkConfig;
import io.bidmachine.r3;
import io.odeeo.internal.b.l0;
import io.odeeo.internal.c.b;
import io.odeeo.internal.q0.o;
import java.net.URLConnection;
import java.util.List;
import kotlinx.coroutines.Deferred;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final /* synthetic */ class n implements ko.e0, io.bidmachine.media3.common.util.k, sj.a, ApsAsyncUtil.ApsReturnRunnable, ApsInitializationListener, OnUserEarnedRewardListener, MolocoBidTokenListener, MolocoInitializationListener, IUnityAdsTokenListener, OnCompleteListener, Continuation, com.google.android.material.tabs.e, FirebaseInAppMessagingDisplay, rr.b, w2.l, o.a, o.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7729c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7730e;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.f7728b = i10;
        this.f7729c = obj;
        this.f7730e = obj2;
    }

    @Override // io.bidmachine.media3.common.util.k, com.google.android.exoplayer2.util.h
    public void accept(Object obj) {
        r0 r0Var = (r0) this.f7729c;
        ((s0) obj).onDownstreamFormatChanged(r0Var.f7805a, r0Var.f7806b, (g0) this.f7730e);
    }

    @Override // w2.l
    public Object attachCompleter(w2.j completer) {
        Deferred this_asListenableFuture = (Deferred) this.f7729c;
        kotlin.jvm.internal.e0.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        kotlin.jvm.internal.e0.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.invokeOnCompletion(new i5.a(completer, this_asListenableFuture));
        return this.f7730e;
    }

    @Override // ko.e0
    /* renamed from: createExtractors */
    public ko.z[] mo3833createExtractors() {
        r rVar = (r) this.f7729c;
        io.bidmachine.media3.common.b bVar = (io.bidmachine.media3.common.b) this.f7730e;
        return new ko.z[]{rVar.f7786c.supportsFormat(bVar) ? new hp.m(rVar.f7786c.create(bVar), null) : new r.b(bVar)};
    }

    @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay
    public void displayMessage(rj.o oVar, bj.b1 b1Var) {
        ej.j jVar = (ej.j) this.f7729c;
        Activity activity = (Activity) this.f7730e;
        if (jVar.f54434m != null || jVar.f54424b.areMessagesSuppressed()) {
            hj.t.logd("Active FIAM exists. Skipping trigger");
            return;
        }
        jVar.f54434m = oVar;
        jVar.f54435n = b1Var;
        jVar.c(activity);
    }

    @Override // rr.b
    public Object get() {
        switch (this.f7728b) {
            case 14:
                em.r0 r0Var = (em.r0) this.f7729c;
                String str = (String) this.f7730e;
                return "(" + r0Var.f54734d + ") onWaterfallRequestFail - " + str;
            case 15:
            default:
                return String.format("[%s] %s", (String) this.f7729c, r3.b((MessageOrBuilder) this.f7730e));
            case 16:
                return AdRequest.lambda$notifyMediationLoss$2((String) this.f7729c, (Double) this.f7730e);
            case 17:
                return AdRequest.lambda$collectNetworkConfig$0((NetworkConfig) this.f7729c, (String) this.f7730e);
            case 18:
                return String.format("processClosed (%s) - %s", Boolean.valueOf(((io.bidmachine.m) this.f7729c).f60605l), (io.bidmachine.n) this.f7730e);
            case 19:
                return ApiRequest.lambda$obtainError$0((Throwable) this.f7729c, (URLConnection) this.f7730e);
            case 20:
                return BidMachine.lambda$setGPP$7((String) this.f7729c, (List) this.f7730e);
            case 21:
                return ((BidMachineAd) this.f7729c).lambda$log$0((String) this.f7730e);
        }
    }

    @Override // sj.a
    public void handle(sj.c cVar) {
        sj.a aVar = (sj.a) this.f7729c;
        sj.a aVar2 = (sj.a) this.f7730e;
        aVar.handle(cVar);
        aVar2.handle(cVar);
    }

    @Override // io.odeeo.internal.q0.o.a
    public void invoke(Object obj) {
        switch (this.f7728b) {
            case 23:
                l0.c cVar = (l0.c) obj;
                cVar.onTracksChanged(((io.odeeo.internal.b.j0) this.f7729c).f62764h, (io.odeeo.internal.n0.h) this.f7730e);
                break;
            case 24:
                ((io.odeeo.internal.c.b) obj).onAvailableCommandsChanged((b.a) this.f7729c, (l0.b) this.f7730e);
                break;
            case 25:
                ((io.odeeo.internal.c.b) obj).onAudioAttributesChanged((b.a) this.f7729c, (io.odeeo.internal.d.d) this.f7730e);
                break;
            case 26:
            default:
                ((io.odeeo.internal.c.b) obj).onPlayerError((b.a) this.f7729c, (io.odeeo.internal.b.i0) this.f7730e);
                break;
            case 27:
                ((io.odeeo.internal.c.b) obj).onTracksInfoChanged((b.a) this.f7729c, (io.odeeo.internal.b.z0) this.f7730e);
                break;
            case 28:
                io.odeeo.internal.c.a.a((b.a) this.f7729c, (io.odeeo.internal.r0.m) this.f7730e, (io.odeeo.internal.c.b) obj);
                break;
        }
    }

    @Override // com.moloco.sdk.publisher.MolocoBidTokenListener
    public void onBidTokenResult(String str, MolocoAdError.ErrorType errorType) {
        ((MolocoMediationAdapter) this.f7729c).lambda$collectSignal$1((MaxSignalCollectionListener) this.f7730e, str, errorType);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.f7729c;
        Intent intent = (Intent) this.f7730e;
        int i10 = EnhancedIntentService.f29716h;
        enhancedIntentService.a(intent);
    }

    @Override // com.google.android.material.tabs.e
    public void onConfigureTab(TabLayout.a aVar, int i10) {
        RefineByVendorActivity.initPager$lambda$4((RefineByVendorActivity) this.f7729c, (List) this.f7730e, aVar, i10);
    }

    @Override // com.amazon.aps.ads.listeners.ApsInitializationListener
    public void onInitializationCompleted(ApsInitializationStatus apsInitializationStatus) {
        Aps.lambda$initialize$2((ApsInitConfig) this.f7729c, (ApsInitializationListener) this.f7730e, apsInitializationStatus);
    }

    @Override // com.moloco.sdk.publisher.MolocoInitializationListener
    public void onMolocoInitializationStatus(MolocoInitStatus molocoInitStatus) {
        ((MolocoMediationAdapter) this.f7729c).lambda$initialize$0((MaxAdapter.OnCompletionListener) this.f7730e, molocoInitStatus);
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public void onUnityAdsTokenReady(String str) {
        ((UnityAdsMediationAdapter) this.f7729c).lambda$collectSignal$0((MaxSignalCollectionListener) this.f7730e, str);
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        switch (this.f7728b) {
            case 5:
                ((GoogleAdManagerMediationAdapter) this.f7729c).lambda$showRewardedAd$0((String) this.f7730e, rewardItem);
                break;
            default:
                ((GoogleMediationAdapter) this.f7729c).lambda$showRewardedAd$1((String) this.f7730e, rewardItem);
                break;
        }
    }

    @Override // com.amazon.aps.shared.util.ApsAsyncUtil.ApsReturnRunnable
    public Object run() {
        return Aps.lambda$initialize$0((String) this.f7729c, (Context) this.f7730e);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        androidx.localbroadcastmanager.content.b bVar = (androidx.localbroadcastmanager.content.b) this.f7729c;
        String str = (String) this.f7730e;
        synchronized (bVar) {
            ((z.f) bVar.f6757b).remove(str);
        }
        return task;
    }

    @Override // io.odeeo.internal.q0.o.b
    public void invoke(Object obj, io.odeeo.internal.q0.l lVar) {
        ((io.odeeo.internal.c.a) this.f7729c).a((io.odeeo.internal.b.l0) this.f7730e, (io.odeeo.internal.c.b) obj, lVar);
    }
}
