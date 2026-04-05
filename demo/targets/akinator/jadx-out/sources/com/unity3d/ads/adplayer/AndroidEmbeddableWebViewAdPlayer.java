package com.unity3d.ads.adplayer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import av.e;
import bv.d;
import bv.f;
import bv.n;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.ViewUtilities;
import com.vungle.ads.internal.protos.Sdk;
import hr.kNq.ikJMrW;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kv.p;
import tu.a0;
import tu.x0;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidEmbeddableWebViewAdPlayer implements AdPlayer, EmbeddableAdPlayer {
    private final Context context;
    private final LifecycleDataSource lifecycleDataSource;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final ScarManager scarManager;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer", f = "AndroidEmbeddableWebViewAdPlayer.kt", i = {0, 1}, l = {Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 128, 130}, m = "destroy", n = {"this", "this"}, s = {"L$0", "L$0"})
    /* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidEmbeddableWebViewAdPlayer.this.destroy(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2", f = "AndroidEmbeddableWebViewAdPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ BannerView $bannerView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BannerView bannerView, zu.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$bannerView = bannerView;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return AndroidEmbeddableWebViewAdPlayer.this.new AnonymousClass2(this.$bannerView, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            AndroidEmbeddableWebViewAdPlayer.this.getWebViewContainer().getWebView().setLayoutParams(new ViewGroup.LayoutParams((int) ViewUtilities.pxFromDp(AndroidEmbeddableWebViewAdPlayer.this.context, this.$bannerView.getSize().getWidth()), (int) ViewUtilities.pxFromDp(AndroidEmbeddableWebViewAdPlayer.this.context, this.$bannerView.getSize().getHeight())));
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$4", f = "AndroidEmbeddableWebViewAdPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$4, reason: invalid class name */
    public static final class AnonymousClass4 extends n implements p {
        final /* synthetic */ BannerView $bannerView;
        int label;
        final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BannerView bannerView, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, zu.d<? super AnonymousClass4> dVar) {
            super(2, dVar);
            this.$bannerView = bannerView;
            this.this$0 = androidEmbeddableWebViewAdPlayer;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new AnonymousClass4(this.$bannerView, this.this$0, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            this.$bannerView.addView(this.this$0.getWebViewContainer().getWebView());
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass4) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public AndroidEmbeddableWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String opportunityId, AndroidWebViewContainer webViewContainer, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, LifecycleDataSource lifecycleDataSource, Context context) {
        e0.checkNotNullParameter(webViewAdPlayer, "webViewAdPlayer");
        e0.checkNotNullParameter(opportunityId, "opportunityId");
        e0.checkNotNullParameter(webViewContainer, "webViewContainer");
        e0.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        e0.checkNotNullParameter(scarManager, "scarManager");
        e0.checkNotNullParameter(lifecycleDataSource, "lifecycleDataSource");
        e0.checkNotNullParameter(context, "context");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.lifecycleDataSource = lifecycleDataSource;
        this.context = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object destroy(zu.d<? super tu.x0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            tu.a0.throwOnFailure(r8)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r2
            tu.a0.throwOnFailure(r8)
            goto L7a
        L3f:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r2
            tu.a0.throwOnFailure(r8)
            goto L6b
        L47:
            tu.a0.throwOnFailure(r8)
            com.unity3d.ads.adplayer.WebViewAdPlayer r8 = r7.webViewAdPlayer
            r8.dispatchShowCompleted()
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r8 = r7.openMeasurementRepository
            java.lang.String r2 = r7.opportunityId
            com.google.protobuf.ByteString r2 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r2)
            boolean r8 = r8.hasSessionFinished(r2)
            if (r8 == 0) goto L6a
            r0.L$0 = r7
            r0.label = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r8 != r1) goto L6a
            goto L85
        L6a:
            r2 = r7
        L6b:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r8 = r2.getWebViewContainer()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r8 = r8.destroy(r0)
            if (r8 != r1) goto L7a
            goto L85
        L7a:
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r8 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0)
            if (r8 != r1) goto L86
        L85:
            return r1
        L86:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.destroy(zu.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Flow<LoadEvent> getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Flow<OfferwallShowEvent> getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Flow<ScarEvent> getOnScarEvent() {
        return this.webViewAdPlayer.getOnScarEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Flow<ShowEvent> getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public CoroutineScope getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, zu.d<? super x0> dVar) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, zu.d<? super x0> dVar) {
        return this.webViewAdPlayer.onBroadcastEvent(str, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, zu.d<? super x0> dVar) {
        return this.webViewAdPlayer.requestShow(map, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(zu.d<? super x0> dVar) {
        return this.webViewAdPlayer.sendActivityDestroyed(dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z10, zu.d<? super x0> dVar) {
        return this.webViewAdPlayer.sendFocusChange(z10, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendGmaEvent(c cVar, zu.d<? super x0> dVar) {
        return this.webViewAdPlayer.sendGmaEvent(cVar, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z10, zu.d<? super x0> dVar) {
        return this.webViewAdPlayer.sendMuteChange(z10, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, zu.d<? super x0> dVar) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, zu.d<? super x0> dVar) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, zu.d<? super x0> dVar) {
        return this.webViewAdPlayer.sendScarBannerEvent(bannerEvent, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, zu.d<? super x0> dVar) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z10, zu.d<? super x0> dVar) {
        return this.webViewAdPlayer.sendVisibilityChange(z10, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d10, zu.d<? super x0> dVar) {
        return this.webViewAdPlayer.sendVolumeChange(d10, dVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(final ShowOptions showOptions) {
        e0.checkNotNullParameter(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        BannerViewCache bannerViewCache = BannerViewCache.getInstance();
        final BannerView bannerView = bannerViewCache.getBannerView(this.opportunityId);
        if (bannerView == null) {
            throw new IllegalStateException((bannerViewCache.isBannerViewDeleted(this.opportunityId) ? "BannerView has been deleted" : "BannerView not found").toString());
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        if (!androidShowOptions.isScarAd()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass2(bannerView, null), 3, null);
            final WebView webView = getWebViewContainer().getWebView();
            if (z1.isAttachedToWindow(webView)) {
                BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3, null);
                if (z1.isAttachedToWindow(webView)) {
                    webView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(webView, this));
                } else {
                    BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3, null);
                }
            } else {
                webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$2
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        e0.checkNotNullParameter(view, "view");
                        webView.removeOnAttachStateChangeListener(this);
                        BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3, null);
                        if (z1.isAttachedToWindow(view)) {
                            view.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(view, this));
                        } else {
                            BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3, null);
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                        e0.checkNotNullParameter(view, "view");
                    }
                });
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new AnonymousClass4(bannerView, this, null), 3, null);
            return;
        }
        String placementId = androidShowOptions.getPlacementId();
        if (placementId == null) {
            placementId = "";
        }
        String scarQueryId = androidShowOptions.getScarQueryId();
        if (scarQueryId == null) {
            scarQueryId = "";
        }
        String scarAdUnitId = androidShowOptions.getScarAdUnitId();
        if (scarAdUnitId == null) {
            scarAdUnitId = "";
        }
        String scarAdString = androidShowOptions.getScarAdString();
        kl.d dVar = new kl.d(placementId, scarQueryId, scarAdUnitId, scarAdString == null ? "" : scarAdString, 0);
        ScarManager scarManager = this.scarManager;
        Context context = this.context;
        UnityBannerSize size = bannerView.getSize();
        e0.checkNotNullExpressionValue(size, "bannerView.size");
        final SharedFlow sharedFlowShareIn = FlowKt.shareIn(scarManager.loadBannerAd(context, bannerView, dVar, size, this.opportunityId), getScope(), SharingStarted.Companion.getEagerly(), 10);
        if (!z1.isAttachedToWindow(bannerView)) {
            bannerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    e0.checkNotNullParameter(view, "view");
                    bannerView.removeOnAttachStateChangeListener(this);
                    BuildersKt__Builders_commonKt.launch$default(this.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$1(this, sharedFlowShareIn, showOptions, null), 3, null);
                    BannerView bannerView2 = bannerView;
                    if (z1.isAttachedToWindow(bannerView2)) {
                        bannerView2.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(bannerView2, this));
                    } else {
                        BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this, null), 3, null);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    e0.checkNotNullParameter(view, ikJMrW.RNBdelWmjxzPf);
                }
            });
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$1(this, sharedFlowShareIn, showOptions, null), 3, null);
        if (z1.isAttachedToWindow(bannerView)) {
            bannerView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(bannerView, this));
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this, null), 3, null);
        }
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
