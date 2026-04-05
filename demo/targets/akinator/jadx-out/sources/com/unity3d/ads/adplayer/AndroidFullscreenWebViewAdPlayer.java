package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.Intent;
import av.e;
import bv.b;
import bv.d;
import bv.f;
import bv.n;
import com.apm.insight.b.El.rJqlArycrfkilN;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kv.p;
import org.json.JSONObject;
import tu.a0;
import tu.i;
import tu.o;
import tu.q;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {
    public static final Companion Companion = new Companion(null);
    private static final MutableSharedFlow<DisplayMessage> displayMessages = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    private final o adObject$delegate;
    private final AdRepository adRepository;
    private final Context context;
    private final DeviceInfoRepository deviceInfoRepository;
    private final OfferwallManager offerwallManager;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final OrientationRepository orientationRepository;
    private final ScarManager scarManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final MutableSharedFlow<DisplayMessage> getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {0, 1, 2}, l = {173, 178, 182, 184}, m = "destroy", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1, reason: invalid class name */
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
            return AndroidFullscreenWebViewAdPlayer.this.destroy(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {198, 199, 200, 201, 202, 204}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37331 extends n implements p {
        final /* synthetic */ DisplayMessage $displayMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37331(DisplayMessage displayMessage, zu.d<? super C37331> dVar) {
            super(2, dVar);
            this.$displayMessage = displayMessage;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return AndroidFullscreenWebViewAdPlayer.this.new C37331(this.$displayMessage, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
        
            if (r11.requestShow(r1, r10) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00bd, code lost:
        
            if (r11.emit(r1, r10) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
        
            if (r11.sendVisibilityChange(r1, r10) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00f5, code lost:
        
            if (r11.sendFocusChange(r1, r10) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0109, code lost:
        
            if (r11.sendActivityDestroyed(r10) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0119, code lost:
        
            if (r11.destroy(r10) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x011b, code lost:
        
            return r0;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 306
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.C37331.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((C37331) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37341 extends n implements p {
        final /* synthetic */ CompletableDeferred<x0> $listenerStarted;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37341(CompletableDeferred<x0> completableDeferred, zu.d<? super C37341> dVar) {
            super(2, dVar);
            this.$listenerStarted = completableDeferred;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new C37341(this.$listenerStarted, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            CompletableDeferred<x0> completableDeferred = this.$listenerStarted;
            x0 x0Var = x0.f87415a;
            completableDeferred.complete(x0Var);
            return x0Var;
        }

        @Override // kv.p
        public final Object invoke(FlowCollector<? super DisplayMessage> flowCollector, zu.d<? super x0> dVar) {
            return ((C37341) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {147, 152}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10, reason: invalid class name */
    public static final class AnonymousClass10 extends n implements p {
        final /* synthetic */ ShowOptions $showOptions;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements p {
            final /* synthetic */ ShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, zu.d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = androidFullscreenWebViewAdPlayer;
                this.$showOptions = showOptions;
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new AnonymousClass1(this.this$0, this.$showOptions, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    MutableSharedFlow<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                    this.label = 1;
                    if (displayMessages.emit(displayReady, this) == coroutine_suspended) {
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
            public final Object invoke(FlowCollector<? super OfferwallShowEvent> flowCollector, zu.d<? super x0> dVar) {
                return ((AnonymousClass1) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$4, reason: invalid class name */
        public /* synthetic */ class AnonymousClass4 implements FlowCollector, x {
            final /* synthetic */ WebViewAdPlayer $tmp0;

            public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
                this.$tmp0 = webViewAdPlayer;
            }

            public final Object emit(OfferwallEvent offerwallEvent, zu.d<? super x0> dVar) {
                Object objSendOfferwallEvent = this.$tmp0.sendOfferwallEvent(offerwallEvent, dVar);
                return objSendOfferwallEvent == e.getCOROUTINE_SUSPENDED() ? objSendOfferwallEvent : x0.f87415a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof x)) {
                    return e0.areEqual(getFunctionDelegate(), ((x) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.x
            public final i getFunctionDelegate() {
                return new kotlin.jvm.internal.a0(2, this.$tmp0, WebViewAdPlayer.class, "sendOfferwallEvent", "sendOfferwallEvent(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
                return emit((OfferwallEvent) obj, (zu.d<? super x0>) dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(ShowOptions showOptions, zu.d<? super AnonymousClass10> dVar) {
            super(2, dVar);
            this.$showOptions = showOptions;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return AndroidFullscreenWebViewAdPlayer.this.new AnonymousClass10(this.$showOptions, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
        
            if (r1.collect(r3, r7) == r0) goto L18;
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
                goto L85
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
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                kotlinx.coroutines.flow.Flow r8 = r8.getOnOfferwallEvent()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r4 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                com.unity3d.ads.adplayer.ShowOptions r5 = r7.$showOptions
                r6 = 0
                r1.<init>(r4, r5, r6)
                kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.onStart(r8, r1)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2
                r1.<init>(r6)
                r7.label = r3
                java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r8, r1, r7)
                if (r8 != r0) goto L43
                goto L84
            L43:
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                com.unity3d.ads.core.data.manager.OfferwallManager r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getOfferwallManager$p(r8)
                com.unity3d.ads.adplayer.ShowOptions r1 = r7.$showOptions
                com.unity3d.ads.adplayer.AndroidShowOptions r1 = (com.unity3d.ads.adplayer.AndroidShowOptions) r1
                java.lang.String r1 = r1.getOfferwallPlacementName()
                if (r1 != 0) goto L55
                java.lang.String r1 = ""
            L55:
                kotlinx.coroutines.flow.Flow r8 = r8.showAd(r1)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r1 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                kotlinx.coroutines.CoroutineScope r1 = r1.getScope()
                kotlinx.coroutines.flow.SharingStarted$Companion r3 = kotlinx.coroutines.flow.SharingStarted.Companion
                kotlinx.coroutines.flow.SharingStarted r3 = r3.getEagerly()
                r4 = 5
                kotlinx.coroutines.flow.SharedFlow r8 = kotlinx.coroutines.flow.FlowKt.shareIn(r8, r1, r3, r4)
                kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1
                r1.<init>()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$4 r3 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$4
                r3.<init>(r8)
                r7.label = r2
                java.lang.Object r8 = r1.collect(r3, r7)
                if (r8 != r0) goto L85
            L84:
                return r0
            L85:
                tu.x0 r8 = tu.x0.f87415a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass10.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2, reason: invalid class name */
        public static final class AnonymousClass2 extends n implements p {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass2(zu.d<? super AnonymousClass2> dVar) {
                super(2, dVar);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kv.p
            public final Object invoke(OfferwallShowEvent offerwallShowEvent, zu.d<? super Boolean> dVar) {
                return ((AnonymousClass2) create(offerwallShowEvent, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    a0.throwOnFailure(obj);
                    return b.boxBoolean(e0.areEqual((OfferwallShowEvent) this.L$0, OfferwallShowEvent.Show.INSTANCE));
                }
                throw new IllegalStateException(rJqlArycrfkilN.WGACoZJtdgRU);
            }
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass10) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$3, reason: invalid class name */
    public /* synthetic */ class AnonymousClass3 extends a implements p {
        public AnonymousClass3(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", 12);
        }

        @Override // kv.p
        public final Object invoke(DisplayMessage displayMessage, zu.d<? super x0> dVar) {
            return AndroidFullscreenWebViewAdPlayer.show$displayEventsRouter((AndroidFullscreenWebViewAdPlayer) this.receiver, displayMessage, dVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$4, reason: invalid class name */
    public /* synthetic */ class AnonymousClass4 extends kotlin.jvm.internal.a0 implements p {
        public AnonymousClass4(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleVolumeSettingsChange", "handleVolumeSettingsChange(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kv.p
        public final Object invoke(VolumeSettingsChange volumeSettingsChange, zu.d<? super x0> dVar) {
            return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleVolumeSettingsChange(volumeSettingsChange, dVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6, reason: invalid class name */
    public static final class AnonymousClass6 extends n implements p {
        int label;

        public AnonymousClass6(zu.d<? super AnonymousClass6> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return AndroidFullscreenWebViewAdPlayer.this.new AnonymousClass6(dVar);
        }

        @Override // kv.p
        public final Object invoke(ShowEvent showEvent, zu.d<? super x0> dVar) {
            return ((AnonymousClass6) create(showEvent, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = AndroidFullscreenWebViewAdPlayer.this;
                this.label = 1;
                if (androidFullscreenWebViewAdPlayer.destroy(this) == coroutine_suspended) {
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
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7, reason: invalid class name */
    public /* synthetic */ class AnonymousClass7 extends kotlin.jvm.internal.a0 implements p {
        public AnonymousClass7(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kv.p
        public final Object invoke(SessionChange sessionChange, zu.d<? super x0> dVar) {
            return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleSessionChange(sessionChange, dVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8, reason: invalid class name */
    public static final class AnonymousClass8 extends n implements p {
        final /* synthetic */ Intent $intent;
        final /* synthetic */ CompletableDeferred<x0> $listenerStarted;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(CompletableDeferred<x0> completableDeferred, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Intent intent, zu.d<? super AnonymousClass8> dVar) {
            super(2, dVar);
            this.$listenerStarted = completableDeferred;
            this.this$0 = androidFullscreenWebViewAdPlayer;
            this.$intent = intent;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new AnonymousClass8(this.$listenerStarted, this.this$0, this.$intent, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                CompletableDeferred<x0> completableDeferred = this.$listenerStarted;
                this.label = 1;
                if (completableDeferred.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            this.this$0.context.startActivity(this.$intent);
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen_intent", null, null, null, this.this$0.getAdObject(), null, 46, null);
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass8) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {134, 138}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9, reason: invalid class name */
    public static final class AnonymousClass9 extends n implements p {
        final /* synthetic */ SharedFlow<GmaEventData> $scarEvents;
        final /* synthetic */ ShowOptions $showOptions;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$1", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements p {
            final /* synthetic */ ShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, zu.d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = androidFullscreenWebViewAdPlayer;
                this.$showOptions = showOptions;
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new AnonymousClass1(this.this$0, this.$showOptions, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    MutableSharedFlow<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                    this.label = 1;
                    if (displayMessages.emit(displayReady, this) == coroutine_suspended) {
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
            public final Object invoke(FlowCollector<? super ScarEvent> flowCollector, zu.d<? super x0> dVar) {
                return ((AnonymousClass1) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$2", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$2, reason: invalid class name */
        public static final class AnonymousClass2 extends n implements p {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass2(zu.d<? super AnonymousClass2> dVar) {
                super(2, dVar);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kv.p
            public final Object invoke(ScarEvent scarEvent, zu.d<? super Boolean> dVar) {
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
        /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$4, reason: invalid class name */
        public /* synthetic */ class AnonymousClass4 implements FlowCollector, x {
            final /* synthetic */ WebViewAdPlayer $tmp0;

            public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
                this.$tmp0 = webViewAdPlayer;
            }

            public final Object emit(c cVar, zu.d<? super x0> dVar) {
                Object objSendGmaEvent = this.$tmp0.sendGmaEvent(cVar, dVar);
                return objSendGmaEvent == e.getCOROUTINE_SUSPENDED() ? objSendGmaEvent : x0.f87415a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof x)) {
                    return e0.areEqual(getFunctionDelegate(), ((x) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.x
            public final i getFunctionDelegate() {
                return new kotlin.jvm.internal.a0(2, this.$tmp0, WebViewAdPlayer.class, "sendGmaEvent", "sendGmaEvent(Lcom/unity3d/scar/adapter/common/GMAEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
                return emit((c) obj, (zu.d<? super x0>) dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(SharedFlow<GmaEventData> sharedFlow, ShowOptions showOptions, zu.d<? super AnonymousClass9> dVar) {
            super(2, dVar);
            this.$scarEvents = sharedFlow;
            this.$showOptions = showOptions;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return AndroidFullscreenWebViewAdPlayer.this.new AnonymousClass9(this.$scarEvents, this.$showOptions, dVar);
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
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                kotlinx.coroutines.flow.Flow r8 = r8.getOnScarEvent()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$1 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$1
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r4 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                com.unity3d.ads.adplayer.ShowOptions r5 = r7.$showOptions
                r6 = 0
                r1.<init>(r4, r5, r6)
                kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.onStart(r8, r1)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$2 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$2
                r1.<init>(r6)
                r7.label = r3
                java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r8, r1, r7)
                if (r8 != r0) goto L43
                goto L5f
            L43:
                kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.core.domain.scar.GmaEventData> r8 = r7.$scarEvents
                kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$invokeSuspend$$inlined$mapNotNull$1 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$invokeSuspend$$inlined$mapNotNull$1
                r1.<init>()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$4 r3 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9$4
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
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass9.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass9) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public AndroidFullscreenWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String opportunityId, AndroidWebViewContainer webViewContainer, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager, OfferwallManager offerwallManager, SendDiagnosticEvent sendDiagnosticEvent, AdRepository adRepository, OrientationRepository orientationRepository, Context context) {
        e0.checkNotNullParameter(webViewAdPlayer, "webViewAdPlayer");
        e0.checkNotNullParameter(opportunityId, "opportunityId");
        e0.checkNotNullParameter(webViewContainer, "webViewContainer");
        e0.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        e0.checkNotNullParameter(scarManager, "scarManager");
        e0.checkNotNullParameter(offerwallManager, "offerwallManager");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        e0.checkNotNullParameter(adRepository, "adRepository");
        e0.checkNotNullParameter(orientationRepository, "orientationRepository");
        e0.checkNotNullParameter(context, "context");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.adRepository = adRepository;
        this.orientationRepository = orientationRepository;
        this.context = context;
        this.adObject$delegate = q.lazy(new AndroidFullscreenWebViewAdPlayer$adObject$2(this));
    }

    private final Job displayEventsRouter(DisplayMessage displayMessage) {
        return BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new C37331(displayMessage, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getAdObject() {
        return (AdObject) this.adObject$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSessionChange(SessionChange sessionChange, zu.d<? super x0> dVar) {
        boolean z10 = sessionChange instanceof SessionChange.UserConsentChange;
        x0 x0Var = x0.f87415a;
        if (z10) {
            WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            e0.checkNotNullExpressionValue(byteArray, "change.value.toByteArray()");
            Object objSendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, dVar);
            return objSendUserConsentChange == e.getCOROUTINE_SUSPENDED() ? objSendUserConsentChange : x0Var;
        }
        if (sessionChange instanceof SessionChange.PrivacyFsmChange) {
            WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
            byte[] byteArray2 = ((SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
            e0.checkNotNullExpressionValue(byteArray2, "change.value.toByteArray()");
            Object objSendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, dVar);
            if (objSendPrivacyFsmChange == e.getCOROUTINE_SUSPENDED()) {
                return objSendPrivacyFsmChange;
            }
        }
        return x0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, zu.d<? super x0> dVar) {
        Object objSendVolumeChange;
        boolean z10 = volumeSettingsChange instanceof VolumeSettingsChange.MuteChange;
        x0 x0Var = x0.f87415a;
        if (!z10) {
            return ((volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange) && (objSendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), dVar)) == e.getCOROUTINE_SUSPENDED()) ? objSendVolumeChange : x0Var;
        }
        Object objSendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), dVar);
        return objSendMuteChange == e.getCOROUTINE_SUSPENDED() ? objSendMuteChange : x0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, zu.d dVar) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return x0.f87415a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[PHI: r2
      0x0095: PHI (r2v5 com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) = 
      (r2v4 com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer)
      (r2v11 com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer)
     binds: [B:30:0x0092, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object destroy(zu.d<? super tu.x0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L53
            if (r2 == r6) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            tu.a0.throwOnFailure(r9)
            goto La1
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            tu.a0.throwOnFailure(r9)
            goto L95
        L43:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            tu.a0.throwOnFailure(r9)
            goto L86
        L4b:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            tu.a0.throwOnFailure(r9)
            goto L6b
        L53:
            tu.a0.throwOnFailure(r9)
            kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.adplayer.DisplayMessage> r9 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.displayMessages
            com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest r2 = new com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest
            java.lang.String r7 = r8.opportunityId
            r2.<init>(r7)
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r9.emit(r2, r0)
            if (r9 != r1) goto L6a
            goto La0
        L6a:
            r2 = r8
        L6b:
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r9 = r2.openMeasurementRepository
            java.lang.String r6 = r2.opportunityId
            com.google.protobuf.ByteString r6 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r6)
            boolean r9 = r9.hasSessionFinished(r6)
            if (r9 == 0) goto L86
            r0.L$0 = r2
            r0.label = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r5, r0)
            if (r9 != r1) goto L86
            goto La0
        L86:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r9 = r2.getWebViewContainer()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r9 = r9.destroy(r0)
            if (r9 != r1) goto L95
            goto La0
        L95:
            r9 = 0
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r9 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0)
            if (r9 != r1) goto La1
        La0:
            return r1
        La1:
            tu.x0 r9 = tu.x0.f87415a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.destroy(zu.d):java.lang.Object");
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
    public void show(ShowOptions showOptions) {
        e0.checkNotNullParameter(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        boolean zIsScarAd = androidShowOptions.isScarAd();
        boolean zIsOfferwallAd = androidShowOptions.isOfferwallAd();
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        final SharedFlow sharedFlowOnSubscription = FlowKt.onSubscription(displayMessages, new C37341(completableDeferredCompletableDeferred$default, null));
        FlowKt.launchIn(FlowKt.onEach(new Flow<DisplayMessage>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(zu.d dVar) {
                        super(dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = androidFullscreenWebViewAdPlayer;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, zu.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r7)
                        goto L52
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        tu.a0.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.DisplayMessage r2 = (com.unity3d.ads.adplayer.DisplayMessage) r2
                        java.lang.String r2 = r2.getOpportunityId()
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r4 = r5.this$0
                        java.lang.String r4 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getOpportunityId$p(r4)
                        boolean r2 = kotlin.jvm.internal.e0.areEqual(r2, r4)
                        if (r2 == 0) goto L52
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L52
                        return r1
                    L52:
                        tu.x0 r6 = tu.x0.f87415a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super DisplayMessage> flowCollector, zu.d dVar) {
                Object objCollect = sharedFlowOnSubscription.collect(new AnonymousClass2(flowCollector, this), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, new AnonymousClass3(this)), getScope());
        FlowKt.launchIn(FlowKt.onEach(this.deviceInfoRepository.getVolumeSettingsChange(), new AnonymousClass4(this)), getScope());
        final Flow<ShowEvent> onShowEvent = this.webViewAdPlayer.getOnShowEvent();
        FlowKt.launchIn(FlowKt.onEach(new Flow<ShowEvent>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", f = "AndroidFullscreenWebViewAdPlayer.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(zu.d dVar) {
                        super(dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, zu.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r7)
                        goto L4a
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        tu.a0.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.core.data.model.ShowEvent r2 = (com.unity3d.ads.core.data.model.ShowEvent) r2
                        boolean r4 = r2 instanceof com.unity3d.ads.core.data.model.ShowEvent.Completed
                        if (r4 != 0) goto L41
                        boolean r2 = r2 instanceof com.unity3d.ads.core.data.model.ShowEvent.Error
                        if (r2 == 0) goto L4a
                    L41:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4a
                        return r1
                    L4a:
                        tu.x0 r6 = tu.x0.f87415a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ShowEvent> flowCollector, zu.d dVar) {
                Object objCollect = onShowEvent.collect(new AnonymousClass2(flowCollector), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }, new AnonymousClass6(null)), getScope());
        FlowKt.launchIn(FlowKt.onEach(this.sessionRepository.getOnChange(), new AnonymousClass7(this)), getScope());
        if (zIsScarAd || zIsOfferwallAd) {
            if (!zIsScarAd) {
                BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new AnonymousClass10(showOptions, null), 3, null);
                return;
            }
            ScarManager scarManager = this.scarManager;
            String placementId = androidShowOptions.getPlacementId();
            if (placementId == null) {
                placementId = "";
            }
            String scarQueryId = androidShowOptions.getScarQueryId();
            BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new AnonymousClass9(FlowKt.shareIn(scarManager.show(placementId, scarQueryId != null ? scarQueryId : ""), getScope(), SharingStarted.Companion.getEagerly(), 10), showOptions, null), 3, null);
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen", null, null, null, getAdObject(), null, 46, null);
        Intent intent = new Intent(this.context, (Class<?>) FullScreenWebViewDisplay.class);
        intent.putExtra("opportunityId", this.opportunityId);
        Map<String, Object> unityAdsShowOptions = androidShowOptions.getUnityAdsShowOptions();
        if (unityAdsShowOptions != null) {
            intent.putExtra("showOptions", new JSONObject(unityAdsShowOptions).toString());
        }
        intent.addFlags(268500992);
        intent.putExtra("orientation", this.orientationRepository.getResumedActivityOrientation().getValue().intValue());
        BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new AnonymousClass8(completableDeferredCompletableDeferred$default, this, intent, null), 3, null);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
