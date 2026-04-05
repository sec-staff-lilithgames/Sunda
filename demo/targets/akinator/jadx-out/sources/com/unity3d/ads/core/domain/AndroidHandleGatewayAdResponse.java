package com.unity3d.ads.core.domain;

import av.e;
import bv.d;
import bv.f;
import bv.n;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.protobuf.ByteString;
import com.ironsource.Me;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kv.l;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {
    private final AdPlayerScope adPlayerScope;
    private final AdRepository adRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdPlayer getAdPlayer;
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetOperativeEventApi getOperativeEventApi;
    private final GetWebViewBridgeUseCase getWebViewBridge;
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", i = {0}, l = {236, 242}, m = "cleanup", n = {"adPlayer"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1, reason: invalid class name */
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
            return AndroidHandleGatewayAdResponse.this.cleanup(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5}, l = {97, 114, 145, 188, PsExtractor.AUDIO_STREAM, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE}, m = "invoke", n = {"this", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", Me.f34938n, "placementId", "adType", "adPlayer", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "this", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", Me.f34938n, "placementId", "adPlayer", "webviewConfiguration", "tmpAdObject", "this", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", Me.f34938n, "placementId", "adPlayer", "tmpAdObject", "webViewUrl", "base64ImpressionConfiguration", "mark$iv$iv", "this", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", Me.f34938n, "placementId", "adPlayer", "adObject", "loadAdViewerStartedTime", "this", "opportunityId", Me.f34938n, "adPlayer", "adObject", "loadEvent", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37881 extends d {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C37881(zu.d<? super C37881> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayAdResponse.this.invoke(null, null, null, null, null, null, false, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2", f = "AndroidHandleGatewayAdResponse.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ b1 $adPlayer;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b1 b1Var, zu.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$adPlayer = b1Var;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$adPlayer, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kv.p
        public final Object invoke(AllowedPiiOuterClass.AllowedPii allowedPii, zu.d<? super x0> dVar) {
            return ((AnonymousClass2) create(allowedPii, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                AllowedPiiOuterClass.AllowedPii allowedPii = (AllowedPiiOuterClass.AllowedPii) this.L$0;
                AdPlayer adPlayer = (AdPlayer) this.$adPlayer.f71816b;
                byte[] byteArray = allowedPii.toByteArray();
                e0.checkNotNullExpressionValue(byteArray, "it.toByteArray()");
                this.label = 1;
                if (adPlayer.onAllowedPiiChange(byteArray, this) == coroutine_suspended) {
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
    @f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3", f = "AndroidHandleGatewayAdResponse.kt", i = {0}, l = {176}, m = "invokeSuspend", n = {"mark$iv$iv"}, s = {"J$0"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements l {
        final /* synthetic */ AdObject $tmpAdObject;
        final /* synthetic */ String $webViewUrl;
        final /* synthetic */ AndroidWebViewContainer $webviewContainer;
        long J$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AndroidWebViewContainer androidWebViewContainer, String str, AdObject adObject, zu.d<? super AnonymousClass3> dVar) {
            super(1, dVar);
            this.$webviewContainer = androidWebViewContainer;
            this.$webViewUrl = str;
            this.$tmpAdObject = adObject;
        }

        @Override // bv.a
        public final zu.d<x0> create(zu.d<?> dVar) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass3(this.$webviewContainer, this.$webViewUrl, this.$tmpAdObject, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                tu.x0 r2 = tu.x0.f87415a
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 != r3) goto L16
                long r3 = r12.J$0
                tu.a0.throwOnFailure(r13)     // Catch: java.lang.Throwable -> L13
                goto L39
            L13:
                r0 = move-exception
                r13 = r0
                goto L41
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                tu.a0.throwOnFailure(r13)
                com.unity3d.ads.adplayer.AndroidWebViewContainer r13 = r12.$webviewContainer
                java.lang.String r1 = r12.$webViewUrl
                tv.y r4 = tv.y.f87465a
                long r4 = r4.m7254markNowz9LOYto()
                int r6 = tu.z.f87419c     // Catch: java.lang.Throwable -> L3e
                r12.J$0 = r4     // Catch: java.lang.Throwable -> L3e
                r12.label = r3     // Catch: java.lang.Throwable -> L3e
                java.lang.Object r13 = r13.loadUrl(r1, r12)     // Catch: java.lang.Throwable -> L3e
                if (r13 != r0) goto L38
                return r0
            L38:
                r3 = r4
            L39:
                java.lang.Object r13 = tu.z.m7131constructorimpl(r2)     // Catch: java.lang.Throwable -> L13
                goto L4b
            L3e:
                r0 = move-exception
                r13 = r0
                r3 = r4
            L41:
                int r0 = tu.z.f87419c
                java.lang.Object r13 = tu.a0.createFailure(r13)
                java.lang.Object r13 = tu.z.m7131constructorimpl(r13)
            L4b:
                tu.z r13 = tu.z.m7130boximpl(r13)
                tv.b0 r0 = new tv.b0
                long r3 = tv.x.m7240elapsedNowUwyO8pc(r3)
                r1 = 0
                r0.<init>(r13, r3, r1)
                com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse r13 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.this
                com.unity3d.ads.core.data.model.AdObject r8 = r12.$tmpAdObject
                java.lang.Object r1 = r0.component1()
                tu.z r1 = (tu.z) r1
                java.lang.Object r1 = r1.m7139unboximpl()
                long r3 = r0.m7149component2UwyO8pc()
                com.unity3d.ads.core.domain.SendDiagnosticEvent r13 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.access$getSendDiagnosticEvent$p(r13)
                boolean r0 = tu.z.m7137isSuccessimpl(r1)
                if (r0 == 0) goto L78
                java.lang.String r0 = "native_load_file_task_success_time"
                goto L7a
            L78:
                java.lang.String r0 = "native_load_file_task_failure_time"
            L7a:
                tv.i r5 = tv.i.f87441f
                double r3 = tv.f.m7215toDoubleimpl(r3, r5)
                java.lang.Double r5 = bv.b.boxDouble(r3)
                r10 = 44
                r11 = 0
                r6 = 0
                r7 = 0
                r9 = 0
                r3 = r13
                r4 = r0
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                tu.a0.throwOnFailure(r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.l
        public final Object invoke(zu.d<? super x0> dVar) {
            return ((AnonymousClass3) create(dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4", f = "AndroidHandleGatewayAdResponse.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4, reason: invalid class name */
    public static final class AnonymousClass4 extends n implements p {
        final /* synthetic */ b1 $adPlayer;
        final /* synthetic */ LoadEvent $loadEvent;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(LoadEvent loadEvent, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, b1 b1Var, zu.d<? super AnonymousClass4> dVar) {
            super(2, dVar);
            this.$loadEvent = loadEvent;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = b1Var;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass4(this.$loadEvent, this.$opportunityId, this.$response, this.$adPlayer, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
                Error error = new Error(((LoadEvent.Error) this.$loadEvent).getMessage());
                ByteString byteString = this.$opportunityId;
                AdResponseOuterClass.AdResponse adResponse = this.$response;
                AdPlayer adPlayer = (AdPlayer) this.$adPlayer.f71816b;
                this.label = 1;
                if (androidHandleGatewayAdResponse.cleanup(error, byteString, adResponse, adPlayer, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass4) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5", f = "AndroidHandleGatewayAdResponse.kt", i = {}, l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5, reason: invalid class name */
    public static final class AnonymousClass5 extends n implements p {
        final /* synthetic */ b1 $adPlayer;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        final /* synthetic */ CancellationException $t;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(CancellationException cancellationException, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, b1 b1Var, zu.d<? super AnonymousClass5> dVar) {
            super(2, dVar);
            this.$t = cancellationException;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = b1Var;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass5(this.$t, this.$opportunityId, this.$response, this.$adPlayer, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
                CancellationException cancellationException = this.$t;
                ByteString byteString = this.$opportunityId;
                AdResponseOuterClass.AdResponse adResponse = this.$response;
                AdPlayer adPlayer = (AdPlayer) this.$adPlayer.f71816b;
                this.label = 1;
                if (androidHandleGatewayAdResponse.cleanup(cancellationException, byteString, adResponse, adPlayer, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass5) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public AndroidHandleGatewayAdResponse(AdRepository adRepository, AndroidGetWebViewContainerUseCase getWebViewContainerUseCase, GetWebViewBridgeUseCase getWebViewBridge, DeviceInfoRepository deviceInfoRepository, HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer, CampaignRepository campaignRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetLatestWebViewConfiguration getLatestWebViewConfiguration, AdPlayerScope adPlayerScope, GetAdPlayer getAdPlayer, CacheWebViewAssets cacheWebViewAssets) {
        e0.checkNotNullParameter(adRepository, "adRepository");
        e0.checkNotNullParameter(getWebViewContainerUseCase, "getWebViewContainerUseCase");
        e0.checkNotNullParameter(getWebViewBridge, "getWebViewBridge");
        e0.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        e0.checkNotNullParameter(getHandleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        e0.checkNotNullParameter(campaignRepository, "campaignRepository");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        e0.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        e0.checkNotNullParameter(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        e0.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        e0.checkNotNullParameter(getAdPlayer, "getAdPlayer");
        e0.checkNotNullParameter(cacheWebViewAssets, "cacheWebViewAssets");
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = getWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = getHandleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cleanup(java.lang.Throwable r15, com.google.protobuf.ByteString r16, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r17, com.unity3d.ads.adplayer.AdPlayer r18, zu.d<? super tu.x0> r19) {
        /*
            r14 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass1
            if (r1 == 0) goto L16
            r1 = r0
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 r1 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.label = r2
        L14:
            r9 = r1
            goto L1c
        L16:
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1 r1 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            tu.x0 r12 = tu.x0.f87415a
            r13 = 2
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 == r3) goto L3b
            if (r2 != r13) goto L33
            tu.a0.throwOnFailure(r0)
            goto Lae
        L33:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L3b:
            java.lang.Object r15 = r9.L$0
            com.unity3d.ads.adplayer.AdPlayer r15 = (com.unity3d.ads.adplayer.AdPlayer) r15
            tu.a0.throwOnFailure(r0)
            goto La0
        L43:
            tu.a0.throwOnFailure(r0)
            gatewayprotocol.v1.OperativeEventErrorDataKt$Dsl$Companion r0 = gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl.Companion
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData$Builder r2 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder()
            java.lang.String r4 = "newBuilder()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, r4)
            gatewayprotocol.v1.OperativeEventErrorDataKt$Dsl r0 = r0._create(r2)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r2 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED
            r0.setErrorType(r2)
            java.lang.Throwable r2 = r15.getCause()
            if (r2 == 0) goto L66
            java.lang.String r2 = r2.getMessage()
            if (r2 != 0) goto L6e
        L66:
            java.lang.String r2 = r15.getMessage()
            if (r2 != 0) goto L6e
            java.lang.String r2 = ""
        L6e:
            r0.setMessage(r2)
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorData r15 = r0._build()
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r2 = r14.getOperativeEventApi
            gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventType r0 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR
            com.google.protobuf.ByteString r5 = r17.getTrackingToken()
            java.lang.String r4 = "response.trackingToken"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r4)
            com.google.protobuf.ByteString r6 = r15.toByteString()
            java.lang.String r15 = "operativeEventErrorData.toByteString()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r15)
            r15 = r18
            r9.L$0 = r15
            r9.label = r3
            r7 = 0
            r8 = 0
            r10 = 48
            r11 = 0
            r4 = r16
            r3 = r0
            java.lang.Object r0 = com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r1) goto La0
            goto Lad
        La0:
            if (r15 == 0) goto Lae
            r0 = 0
            r9.L$0 = r0
            r9.label = r13
            java.lang.Object r15 = r15.destroy(r9)
            if (r15 != r1) goto Lae
        Lad:
            return r1
        Lae:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.cleanup(java.lang.Throwable, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, com.unity3d.ads.adplayer.AdPlayer, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x05a5, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r1, r2, r9) == r3) goto L166;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0453 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0226 A[Catch: CancellationException -> 0x00e9, TryCatch #18 {CancellationException -> 0x00e9, blocks: (B:94:0x02ea, B:31:0x00e2, B:66:0x021c, B:68:0x0226, B:70:0x023c, B:75:0x0256, B:77:0x025f, B:80:0x0278, B:154:0x0547, B:76:0x025a), top: B:208:0x00e2, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023c A[Catch: CancellationException -> 0x00e9, TryCatch #18 {CancellationException -> 0x00e9, blocks: (B:94:0x02ea, B:31:0x00e2, B:66:0x021c, B:68:0x0226, B:70:0x023c, B:75:0x0256, B:77:0x025f, B:80:0x0278, B:154:0x0547, B:76:0x025a), top: B:208:0x00e2, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0320  */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(com.unity3d.ads.UnityAdsLoadOptions r51, com.google.protobuf.ByteString r52, gatewayprotocol.v1.AdResponseOuterClass.AdResponse r53, android.content.Context r54, java.lang.String r55, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r56, boolean r57, zu.d<? super com.unity3d.ads.core.data.model.LoadResult> r58) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.invoke(com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.ByteString, gatewayprotocol.v1.AdResponseOuterClass$AdResponse, android.content.Context, java.lang.String, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, boolean, zu.d):java.lang.Object");
    }
}
