package com.unity3d.ads.core.domain;

import a.b;
import av.e;
import bv.d;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.mbridge.msdk.video.dynview.error.GlX.PcrIk;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.log.DeviceLog;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kv.p;
import sv.j0;
import tu.a0;
import tu.m;
import tu.x0;
import tv.w;
import tv.x;
import tv.y;
import uu.o1;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";
    public static final String MSG_NETWORK = "Network";
    public static final String MSG_TIMEOUT = "Timeout";
    public static final String MSG_UNKNOWN = "Initialization failure";
    private final CleanAssets cleanAssets;
    private final CoroutineDispatcher defaultDispatcher;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final EventObservers eventObservers;
    private final GatewayClient gatewayClient;
    private final GetGameId getGameId;
    private final GetInitializationRequest getInitializeRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final AndroidHandleFocusCounters handleFocusCounters;
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    private final InitializeOMSDK initializeOM;
    private final ConfigurationReader legacyConfigurationReader;
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final StorageManager storageManager;
    private final TriggerInitializeListener triggerInitializeListener;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK", f = "AndroidInitializeBoldSDK.kt", i = {0, 1, 2}, l = {Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 126, 129}, m = "initializationSuccess", n = {"this", "this", "this"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1, reason: invalid class name */
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
            return AndroidInitializeBoldSDK.this.initializationSuccess(null, null, false, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", f = "AndroidInitializeBoldSDK.kt", i = {0, 0}, l = {TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER, 83}, m = "invokeSuspend", n = {"startTime", "isRetry"}, s = {"J$0", "I$0"})
    /* renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ String $source;
        int I$0;
        long J$0;
        int label;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", f = "AndroidInitializeBoldSDK.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.CHILDMODE_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ODT_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements p {
            final /* synthetic */ boolean $isRetry;
            final /* synthetic */ String $source;
            int label;
            final /* synthetic */ AndroidInitializeBoldSDK this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, boolean z10, zu.d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.this$0 = androidInitializeBoldSDK;
                this.$source = str;
                this.$isRetry = z10;
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new AnonymousClass1(this.this$0, this.$source, this.$isRetry, dVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
            
                if (r1.handleResponse((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13, r12) != r0) goto L26;
             */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[PHI: r9 r13
              0x0078: PHI (r9v2 com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1) = 
              (r9v1 com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1)
              (r9v3 com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1)
             binds: [B:21:0x0075, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]
              0x0078: PHI (r13v12 java.lang.Object) = (r13v11 java.lang.Object), (r13v0 java.lang.Object) binds: [B:21:0x0075, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // bv.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) throws com.unity3d.ads.core.data.model.exception.InitializationException {
                /*
                    r12 = this;
                    java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                    int r1 = r12.label
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L2f
                    if (r1 == r5) goto L2b
                    if (r1 == r4) goto L27
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    tu.a0.throwOnFailure(r13)
                    r9 = r12
                    goto L85
                L1a:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L22:
                    tu.a0.throwOnFailure(r13)
                    r9 = r12
                    goto L78
                L27:
                    tu.a0.throwOnFailure(r13)
                    goto L56
                L2b:
                    tu.a0.throwOnFailure(r13)
                    goto L42
                L2f:
                    tu.a0.throwOnFailure(r13)
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    java.lang.String r1 = r12.$source
                    boolean r6 = r12.$isRetry
                    r12.label = r5
                    java.lang.Object r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$initializationStart(r13, r1, r6, r12)
                    if (r13 != r0) goto L42
                L40:
                    r9 = r12
                    goto L84
                L42:
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$checkCanInitialize(r13)
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.core.domain.GetInitializationRequest r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetInitializeRequest$p(r13)
                    r12.label = r4
                    java.lang.Object r13 = r13.invoke(r12)
                    if (r13 != r0) goto L56
                    goto L40
                L56:
                    r6 = r13
                    gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest r6 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) r6
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.core.domain.GetRequestPolicy r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGetRequestPolicy$p(r13)
                    com.unity3d.ads.gatewayclient.RequestPolicy r7 = r13.invoke()
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r13 = r12.this$0
                    com.unity3d.ads.gatewayclient.GatewayClient r4 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$getGatewayClient$p(r13)
                    com.unity3d.ads.core.data.model.OperationType r8 = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION
                    r12.label = r3
                    r5 = 0
                    r10 = 1
                    r11 = 0
                    r9 = r12
                    java.lang.Object r13 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r4, r5, r6, r7, r8, r9, r10, r11)
                    if (r13 != r0) goto L78
                    goto L84
                L78:
                    gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r13 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r13
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r1 = r9.this$0
                    r9.label = r2
                    java.lang.Object r13 = com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.access$handleResponse(r1, r13, r12)
                    if (r13 != r0) goto L85
                L84:
                    return r0
                L85:
                    tu.x0 r13 = tu.x0.f87415a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kv.p
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, zu.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$source = str;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return AndroidInitializeBoldSDK.this.new AnonymousClass2(this.$source, dVar);
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v4, types: [long, tv.w, tv.x] */
        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            long jM7254markNowz9LOYto;
            ?? M7236boximpl;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            x0 x0Var = x0.f87415a;
            try {
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    jM7254markNowz9LOYto = y.f87465a.m7254markNowz9LOYto();
                    ?? r12 = !AndroidInitializeBoldSDK.this.sessionRepository.isFirstInitAttempt();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(AndroidInitializeBoldSDK.this, this.$source, r12, null);
                    this.J$0 = jM7254markNowz9LOYto;
                    this.I$0 = r12;
                    this.label = 1;
                    i10 = r12;
                    if (TimeoutKt.withTimeout(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, anonymousClass1, this) != coroutine_suspended) {
                    }
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        a0.throwOnFailure(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i11 = this.I$0;
                jM7254markNowz9LOYto = this.J$0;
                a0.throwOnFailure(obj);
                i10 = i11;
                AndroidInitializeBoldSDK androidInitializeBoldSDK = AndroidInitializeBoldSDK.this;
                M7236boximpl = x.m7236boximpl(jM7254markNowz9LOYto);
                String str = this.$source;
                boolean z10 = i10 != 0;
                this.label = 2;
                return androidInitializeBoldSDK.initializationSuccess(M7236boximpl, str, z10, this) == coroutine_suspended ? coroutine_suspended : x0Var;
            } catch (Exception e10) {
                InitializationException from = InitializationException.Companion.parseFrom(e10);
                if (e10 instanceof GatewayException) {
                    AndroidInitializeBoldSDK.this.sessionRepository.setShouldInitialize(false);
                }
                AndroidInitializeBoldSDK.this.initializationFailure(x.m7236boximpl(M7236boximpl), from, this.$source, i10 != 0);
                return x0Var;
            }
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanInitialize() throws InitializationException {
        if (!this.sessionRepository.getShouldInitialize()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "!sessionRepository.shouldInitialize", 2, null);
        }
        String strInvoke = this.getGameId.invoke();
        if ((strInvoke != null ? j0.toIntOrNull(strInvoke) : null) == null) {
            throw new InitializationException(b.l("gameId \"", strInvoke, "\" should be a number."), null, "invalid_game_id", strInvoke, 2, null);
        }
    }

    private final Map<String, String> getTags(InitializationException initializationException, String str, boolean z10) {
        Map mapCreateMapBuilder = o1.createMapBuilder();
        mapCreateMapBuilder.put("operation", OperationType.INITIALIZATION.toString());
        mapCreateMapBuilder.put("reason", initializationException.getReason());
        mapCreateMapBuilder.put("source", str);
        mapCreateMapBuilder.put("is_retry", String.valueOf(z10));
        if (initializationException.getReasonDebug() != null) {
            mapCreateMapBuilder.put("reason_debug", initializationException.getReasonDebug());
        }
        return o1.build(mapCreateMapBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleResponse(UniversalResponseOuterClass.UniversalResponse universalResponse, zu.d<? super x0> dVar) throws InitializationException {
        if (universalResponse.hasError()) {
            this.sessionRepository.setShouldInitialize(false);
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", universalResponse.getError().getErrorText(), 2, null);
        }
        if (!universalResponse.hasPayload()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No payload", 2, null);
        }
        if (!universalResponse.getPayload().hasInitializationResponse()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No initialization response", 2, null);
        }
        HandleGatewayInitializationResponse handleGatewayInitializationResponse = this.handleGatewayInitializationResponse;
        InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
        e0.checkNotNullExpressionValue(initializationResponse, "response.payload.initializationResponse");
        Object objInvoke = handleGatewayInitializationResponse.invoke(initializationResponse, dVar);
        return objInvoke == e.getCOROUTINE_SUSPENDED() ? objInvoke : x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(w wVar, InitializationException initializationException, String str, boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Initialization Failure: " + initializationException.getMessage());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(wVar)), getTags(initializationException, str, z10), null, null, null, 56, null);
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, initializationException.getMessage());
        setupDiagnosticEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializationStart(String str, boolean z10, zu.d<? super x0> dVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Initialization Start");
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_started", null, p1.mapOf(tu.e0.to("source", str), tu.e0.to("is_retry", String.valueOf(z10)), tu.e0.to("kotlin_version", m.f87391g.toString())), null, null, null, 58, null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object objInvoke = this.eventObservers.invoke(dVar);
        return objInvoke == e.getCOROUTINE_SUSPENDED() ? objInvoke : x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initializationSuccess(tv.w r18, java.lang.String r19, boolean r20, zu.d<? super tu.x0> r21) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r17 = this;
            r0 = r17
            r1 = r21
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass1
            if (r2 == 0) goto L17
            r2 = r1
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1 r2 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1 r2 = new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = av.e.getCOROUTINE_SUSPENDED()
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L50
            if (r4 == r7) goto L48
            if (r4 == r6) goto L40
            if (r4 != r5) goto L38
            java.lang.Object r2 = r2.L$0
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r2 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK) r2
            tu.a0.throwOnFailure(r1)
            goto Lbb
        L38:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L40:
            java.lang.Object r4 = r2.L$0
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r4 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK) r4
            tu.a0.throwOnFailure(r1)
            goto La8
        L48:
            java.lang.Object r4 = r2.L$0
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK r4 = (com.unity3d.ads.core.domain.AndroidInitializeBoldSDK) r4
            tu.a0.throwOnFailure(r1)
            goto L9b
        L50:
            tu.a0.throwOnFailure(r1)
            java.lang.String r1 = "Unity Ads Initialization Success"
            com.unity3d.services.core.log.DeviceLog.debug(r1)
            com.unity3d.ads.core.domain.SendDiagnosticEvent r8 = r0.sendDiagnosticEvent
            double r9 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r18)
            java.lang.Double r10 = bv.b.boxDouble(r9)
            java.lang.String r1 = "source"
            r4 = r19
            tu.v r1 = tu.e0.to(r1, r4)
            java.lang.String r4 = "is_retry"
            java.lang.String r9 = java.lang.String.valueOf(r20)
            tu.v r4 = tu.e0.to(r4, r9)
            tu.v[] r1 = new tu.v[]{r1, r4}
            java.util.Map r11 = uu.p1.mapOf(r1)
            r15 = 56
            r16 = 0
            java.lang.String r9 = "native_initialize_task_success_time"
            r12 = 0
            r13 = 0
            r14 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.unity3d.ads.core.data.manager.StorageManager r1 = r0.storageManager
            r1.hasInitialized()
            com.unity3d.ads.core.domain.om.InitializeOMSDK r1 = r0.initializeOM
            r2.L$0 = r0
            r2.label = r7
            java.lang.Object r1 = r1.invoke(r2)
            if (r1 != r3) goto L9a
            goto Lb9
        L9a:
            r4 = r0
        L9b:
            com.unity3d.ads.core.domain.CleanAssets r1 = r4.cleanAssets
            r2.L$0 = r4
            r2.label = r6
            java.lang.Object r1 = r1.invoke(r2)
            if (r1 != r3) goto La8
            goto Lb9
        La8:
            com.unity3d.ads.core.domain.AndroidHandleFocusCounters r1 = r4.handleFocusCounters
            r1.invoke()
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r4.sessionRepository
            r2.L$0 = r4
            r2.label = r5
            java.lang.Object r1 = r1.persistNativeConfiguration(r2)
            if (r1 != r3) goto Lba
        Lb9:
            return r3
        Lba:
            r2 = r4
        Lbb:
            com.unity3d.services.core.configuration.ConfigurationReader r1 = r2.legacyConfigurationReader
            com.unity3d.services.core.configuration.Configuration r1 = r1.getCurrentConfiguration()
            r1.deleteFromDisk()
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r2.sessionRepository
            com.unity3d.ads.core.data.model.InitializationState r3 = com.unity3d.ads.core.data.model.InitializationState.INITIALIZED
            r1.setInitializationState(r3)
            com.unity3d.ads.core.data.manager.SDKPropertiesManager r1 = r2.sdkPropertiesManager
            r1.setInitialized(r7)
            com.unity3d.ads.core.domain.TriggerInitializeListener r1 = r2.triggerInitializeListener
            r1.success()
            r2.setupDiagnosticEvents()
            tu.x0 r1 = tu.x0.f87415a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.initializationSuccess(tv.w, java.lang.String, boolean, zu.d):java.lang.Object");
    }

    private final void setupDiagnosticEvents() {
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration config = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        DiagnosticEventRepository diagnosticEventRepository = this.diagnosticEventRepository;
        e0.checkNotNullExpressionValue(config, "config");
        diagnosticEventRepository.configure(config);
    }

    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    public Object invoke(String str, zu.d<? super x0> dVar) {
        Object objWithContext = BuildersKt.withContext(this.defaultDispatcher, new AnonymousClass2(str, null), dVar);
        return objWithContext == e.getCOROUTINE_SUSPENDED() ? objWithContext : x0.f87415a;
    }

    public AndroidInitializeBoldSDK(CoroutineDispatcher defaultDispatcher, InitializeOMSDK initializeOM, GetInitializationRequest getInitializeRequest, GetRequestPolicy getRequestPolicy, CleanAssets cleanAssets, HandleGatewayInitializationResponse handleGatewayInitializationResponse, GatewayClient gatewayClient, SessionRepository sessionRepository, EventObservers eventObservers, TriggerInitializeListener triggerInitializeListener, SendDiagnosticEvent sendDiagnosticEvent, DiagnosticEventRepository diagnosticEventRepository, StorageManager storageManager, ConfigurationReader legacyConfigurationReader, SDKPropertiesManager sDKPropertiesManager, GetGameId getGameId, AndroidHandleFocusCounters handleFocusCounters) {
        e0.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        e0.checkNotNullParameter(initializeOM, "initializeOM");
        e0.checkNotNullParameter(getInitializeRequest, "getInitializeRequest");
        e0.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        e0.checkNotNullParameter(cleanAssets, "cleanAssets");
        e0.checkNotNullParameter(handleGatewayInitializationResponse, "handleGatewayInitializationResponse");
        e0.checkNotNullParameter(gatewayClient, "gatewayClient");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(eventObservers, "eventObservers");
        e0.checkNotNullParameter(triggerInitializeListener, "triggerInitializeListener");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        e0.checkNotNullParameter(diagnosticEventRepository, "diagnosticEventRepository");
        e0.checkNotNullParameter(storageManager, "storageManager");
        e0.checkNotNullParameter(legacyConfigurationReader, "legacyConfigurationReader");
        e0.checkNotNullParameter(sDKPropertiesManager, PcrIk.fnVXOXlrCSM);
        e0.checkNotNullParameter(getGameId, "getGameId");
        e0.checkNotNullParameter(handleFocusCounters, "handleFocusCounters");
        this.defaultDispatcher = defaultDispatcher;
        this.initializeOM = initializeOM;
        this.getInitializeRequest = getInitializeRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.cleanAssets = cleanAssets;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse;
        this.gatewayClient = gatewayClient;
        this.sessionRepository = sessionRepository;
        this.eventObservers = eventObservers;
        this.triggerInitializeListener = triggerInitializeListener;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.storageManager = storageManager;
        this.legacyConfigurationReader = legacyConfigurationReader;
        this.sdkPropertiesManager = sDKPropertiesManager;
        this.getGameId = getGameId;
        this.handleFocusCounters = handleFocusCounters;
    }
}
