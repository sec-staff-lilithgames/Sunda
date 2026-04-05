package com.unity3d.ads.core.domain;

import androidx.core.app.NotificationCompat;
import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.e0;
import tu.x0;
import uu.o1;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidShow implements Show {
    private final AdRepository adRepository;
    private final GameServerIdReader gameServerIdReader;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$2", f = "AndroidShow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends n implements p {
            final /* synthetic */ AdObject $ad;
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ UnityAdsShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AdObject adObject, AndroidShow androidShow, AdObject adObject2, UnityAdsShowOptions unityAdsShowOptions, d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.$ad = adObject;
                this.this$0 = androidShow;
                this.$adObject = adObject2;
                this.$showOptions = unityAdsShowOptions;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass2(this.$ad, this.this$0, this.$adObject, this.$showOptions, dVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
            @Override // bv.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    av.e.getCOROUTINE_SUSPENDED()
                    int r0 = r13.label
                    if (r0 != 0) goto Lb9
                    tu.a0.throwOnFailure(r14)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$ad
                    com.unity3d.ads.core.domain.AndroidShow r0 = r13.this$0
                    com.unity3d.ads.core.configuration.GameServerIdReader r0 = com.unity3d.ads.core.domain.AndroidShow.access$getGameServerIdReader$p(r0)
                    com.unity3d.services.core.misc.JsonStorage r1 = r0.getJsonStorage()
                    java.lang.String r2 = r0.getKey()
                    java.lang.Object r1 = r1.get(r2)
                    java.lang.String r2 = "get(key)"
                    r3 = 0
                    if (r1 == 0) goto L2e
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
                    boolean r4 = r1 instanceof java.lang.String
                    if (r4 == 0) goto L2b
                    goto L2c
                L2b:
                    r1 = r3
                L2c:
                    if (r1 != 0) goto L2f
                L2e:
                    r1 = r3
                L2f:
                    com.unity3d.services.core.misc.JsonStorage r4 = r0.getJsonStorage()
                    java.lang.String r5 = r0.getKey()
                    java.lang.Object r4 = r4.get(r5)
                    if (r4 == 0) goto L4b
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(r4, r2)
                    com.unity3d.services.core.misc.JsonStorage r2 = r0.getJsonStorage()
                    java.lang.String r0 = r0.getKey()
                    r2.delete(r0)
                L4b:
                    java.lang.String r1 = (java.lang.String) r1
                    r14.setPlayerServerId(r1)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$adObject
                    kotlinx.coroutines.flow.MutableStateFlow r14 = r14.getState()
                    com.unity3d.ads.core.data.model.AdObjectState r0 = com.unity3d.ads.core.data.model.AdObjectState.SHOWING
                    r14.setValue(r0)
                    com.unity3d.ads.core.domain.AndroidShow r14 = r13.this$0
                    com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = com.unity3d.ads.core.domain.AndroidShow.access$getSendDiagnosticEvent$p(r14)
                    com.unity3d.ads.core.data.model.AdObject r9 = r13.$adObject
                    r11 = 46
                    r12 = 0
                    java.lang.String r5 = "native_show_event_flow_started"
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r10 = 0
                    com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$ad
                    com.unity3d.ads.adplayer.AdPlayer r14 = r14.getAdPlayer()
                    com.unity3d.ads.UnityAdsShowOptions r0 = r13.$showOptions
                    if (r0 == 0) goto L83
                    org.json.JSONObject r0 = r0.getData()
                    if (r0 == 0) goto L83
                    java.util.Map r3 = com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(r0)
                L83:
                    r5 = r3
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    boolean r7 = r0.isScarAd()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r9 = r0.getScarAdString()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r8 = r0.getScarQueryId()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r10 = r0.getScarAdUnitId()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    boolean r11 = r0.isOfferwallAd()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r12 = r0.getOfferwallPlacementName()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r6 = r0.getPlacementId()
                    com.unity3d.ads.adplayer.AndroidShowOptions r4 = new com.unity3d.ads.adplayer.AndroidShowOptions
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                    r14.show(r4)
                    tu.x0 r14 = tu.x0.f87415a
                    return r14
                Lb9:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kv.p
            public final Object invoke(FlowCollector<? super ShowEvent> flowCollector, d<? super x0> dVar) {
                return ((AnonymousClass2) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$3", f = "AndroidShow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends n implements q {
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ ByteString $opportunityId;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(AndroidShow androidShow, AdObject adObject, ByteString byteString, d<? super AnonymousClass3> dVar) {
                super(3, dVar);
                this.this$0 = androidShow;
                this.$adObject = adObject;
                this.$opportunityId = byteString;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_event_flow_completed", null, null, null, this.$adObject, null, 46, null);
                this.$adObject.getState().setValue(AdObjectState.COMPLETED);
                this.this$0.adRepository.removeAd(this.$opportunityId);
                return x0.f87415a;
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super ShowEvent> flowCollector, Throwable th2, d<? super x0> dVar) {
                return new AnonymousClass3(this.this$0, this.$adObject, this.$opportunityId, dVar).invokeSuspend(x0.f87415a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", i = {0}, l = {58}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
        /* renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends n implements q {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            public AnonymousClass4(d<? super AnonymousClass4> dVar) {
                super(3, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                ShowEvent showEvent;
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    ShowEvent showEvent2 = (ShowEvent) this.L$1;
                    this.L$0 = showEvent2;
                    this.label = 1;
                    if (flowCollector.emit(showEvent2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    showEvent = showEvent2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    showEvent = (ShowEvent) this.L$0;
                    a0.throwOnFailure(obj);
                }
                return b.boxBoolean(((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) ? false : true);
            }

            @Override // kv.q
            public final Object invoke(FlowCollector<? super ShowEvent> flowCollector, ShowEvent showEvent, d<? super Boolean> dVar) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(dVar);
                anonymousClass4.L$0 = flowCollector;
                anonymousClass4.L$1 = showEvent;
                return anonymousClass4.invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, AndroidShow androidShow, UnityAdsShowOptions unityAdsShowOptions, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, this.this$0, this.$showOptions, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                final FlowCollector flowCollector = (FlowCollector) this.L$0;
                if (this.$adObject.getOpportunityId().isEmpty()) {
                    throw new IllegalArgumentException("No opportunityId");
                }
                ByteString opportunityId = this.$adObject.getOpportunityId();
                AdObject ad2 = this.this$0.adRepository.getAd(opportunityId);
                if (ad2 == null) {
                    throw new IllegalStateException("No ad associated with opportunityId");
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_started_ad_viewer", null, null, null, this.$adObject, null, 46, null);
                AdPlayer adPlayer = ad2.getAdPlayer();
                if (adPlayer == null) {
                    throw new IllegalStateException("No adPlayer associated with ad");
                }
                Flow flowTransformWhile = FlowKt.transformWhile(FlowKt.onCompletion(FlowKt.onStart(adPlayer.getOnShowEvent(), new AnonymousClass2(ad2, this.this$0, this.$adObject, this.$showOptions, null)), new AnonymousClass3(this.this$0, this.$adObject, opportunityId, null)), new AnonymousClass4(null));
                final AndroidShow androidShow = this.this$0;
                final AdObject adObject = this.$adObject;
                FlowCollector flowCollector2 = new FlowCollector() { // from class: com.unity3d.ads.core.domain.AndroidShow.invoke.1.5
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((ShowEvent) obj2, (d<? super x0>) dVar);
                    }

                    public final Object emit(ShowEvent showEvent, d<? super x0> dVar) {
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidShow.sendDiagnosticEvent, "native_show_event_flow_collected", null, o1.mapOf(e0.to(NotificationCompat.CATEGORY_EVENT, showEvent.getClass().getSimpleName())), null, adObject, null, 42, null);
                        Object objEmit = flowCollector.emit(showEvent, dVar);
                        return objEmit == e.getCOROUTINE_SUSPENDED() ? objEmit : x0.f87415a;
                    }
                };
                this.label = 1;
                if (flowTransformWhile.collect(flowCollector2, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super ShowEvent> flowCollector, d<? super x0> dVar) {
            return ((AnonymousClass1) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public AndroidShow(AdRepository adRepository, GameServerIdReader gameServerIdReader, SendDiagnosticEvent sendDiagnosticEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adRepository, "adRepository");
        kotlin.jvm.internal.e0.checkNotNullParameter(gameServerIdReader, "gameServerIdReader");
        kotlin.jvm.internal.e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.Show
    public Flow<ShowEvent> invoke(AdObject adObject, UnityAdsShowOptions unityAdsShowOptions) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adObject, "adObject");
        return FlowKt.flow(new AnonymousClass1(adObject, this, unityAdsShowOptions, null));
    }

    @Override // com.unity3d.ads.core.domain.Show
    public Object terminate(AdObject adObject, d<? super x0> dVar) {
        Object objDestroy;
        AdPlayer adPlayer = adObject.getAdPlayer();
        return (adPlayer == null || (objDestroy = adPlayer.destroy(dVar)) != e.getCOROUTINE_SUSPENDED()) ? x0.f87415a : objDestroy;
    }
}
