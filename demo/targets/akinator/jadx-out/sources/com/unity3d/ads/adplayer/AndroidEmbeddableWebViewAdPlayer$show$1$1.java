package com.unity3d.ads.adplayer;

import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.services.banners.bridge.BannerBridge;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kv.p;
import tu.a0;
import tu.i;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER, 79}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$1$1 extends n implements p {
    final /* synthetic */ SharedFlow<GmaEventData> $scarEvents;
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ ShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = androidEmbeddableWebViewAdPlayer;
            this.$showOptions = showOptions;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$showOptions, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                WebViewAdPlayer webViewAdPlayer = this.this$0.webViewAdPlayer;
                Map<String, Object> unityAdsShowOptions = ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions();
                this.label = 1;
                if (webViewAdPlayer.requestShow(unityAdsShowOptions, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super ScarEvent> flowCollector, d<? super x0> dVar) {
            return ((AnonymousClass1) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2", f = "AndroidEmbeddableWebViewAdPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kv.p
        public final Object invoke(ScarEvent scarEvent, d<? super Boolean> dVar) {
            return ((AnonymousClass2) create(scarEvent, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return b.boxBoolean(e0.areEqual((ScarEvent) this.L$0, ScarEvent.Show.INSTANCE));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$4, reason: invalid class name */
    public /* synthetic */ class AnonymousClass4 implements FlowCollector, x {
        final /* synthetic */ WebViewAdPlayer $tmp0;

        public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
            this.$tmp0 = webViewAdPlayer;
        }

        public final Object emit(BannerBridge.BannerEvent bannerEvent, d<? super x0> dVar) {
            Object objSendScarBannerEvent = this.$tmp0.sendScarBannerEvent(bannerEvent, dVar);
            return objSendScarBannerEvent == e.getCOROUTINE_SUSPENDED() ? objSendScarBannerEvent : x0.f87415a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof x)) {
                return e0.areEqual(getFunctionDelegate(), ((x) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.x
        public final i getFunctionDelegate() {
            return new kotlin.jvm.internal.a0(2, this.$tmp0, WebViewAdPlayer.class, "sendScarBannerEvent", "sendScarBannerEvent(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
            return emit((BannerBridge.BannerEvent) obj, (d<? super x0>) dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEmbeddableWebViewAdPlayer$show$1$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, SharedFlow<GmaEventData> sharedFlow, ShowOptions showOptions, d<? super AndroidEmbeddableWebViewAdPlayer$show$1$1> dVar) {
        super(2, dVar);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$scarEvents = sharedFlow;
        this.$showOptions = showOptions;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new AndroidEmbeddableWebViewAdPlayer$show$1$1(this.this$0, this.$scarEvents, this.$showOptions, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r1.collect(r3, r7) == r0) goto L15;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            tu.a0.throwOnFailure(r8)
            goto L60
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            tu.a0.throwOnFailure(r8)
            goto L43
        L1e:
            tu.a0.throwOnFailure(r8)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r8 = r7.this$0
            kotlinx.coroutines.flow.Flow r8 = r8.getOnScarEvent()
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1 r1 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r4 = r7.this$0
            com.unity3d.ads.adplayer.ShowOptions r5 = r7.$showOptions
            r6 = 0
            r1.<init>(r4, r5, r6)
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.onStart(r8, r1)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2 r1 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2
            r1.<init>(r6)
            r7.label = r3
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r8, r1, r7)
            if (r8 != r0) goto L43
            goto L5f
        L43:
            kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.core.domain.scar.GmaEventData> r8 = r7.$scarEvents
            kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1 r1 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1
            r1.<init>()
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r8 = r7.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$4 r3 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$4
            r3.<init>(r8)
            r7.label = r2
            java.lang.Object r8 = r1.collect(r3, r7)
            if (r8 != r0) goto L60
        L5f:
            return r0
        L60:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$1$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
