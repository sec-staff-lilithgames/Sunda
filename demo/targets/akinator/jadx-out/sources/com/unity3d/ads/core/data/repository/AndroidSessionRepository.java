package com.unity3d.ads.core.data.repository;

import av.e;
import bv.b;
import bv.f;
import bv.n;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import tu.a0;
import tu.v;
import tu.x0;
import uu.o1;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidSessionRepository implements SessionRepository {
    private final MutableStateFlow<ByteString> _currentState;
    private MutableStateFlow<String> _gameId;
    private final MutableStateFlow<String> _gatewayUrl;
    private final MutableStateFlow<Integer> _headerBiddingTokenCounter;
    private final MutableStateFlow<InitializationState> _initializationState;
    private final MutableStateFlow<Boolean> _isFirstInitAttempt;
    private final MutableStateFlow<Boolean> _isTestModeEnabled;
    private MutableSharedFlow<SessionChange> _onChange;
    private final MutableStateFlow<NativeConfigurationOuterClass.NativeConfiguration> _sdkConfiguration;
    private final MutableStateFlow<SessionCountersOuterClass.SessionCounters> _sessionCounters;
    private final MutableStateFlow<ByteString> _sessionId;
    private final MutableStateFlow<ByteString> _sessionToken;
    private final MutableStateFlow<Boolean> _shouldInitialize;
    private final MutableStateFlow<TokenCounters> _tokenCounters;
    private final ByteStringDataSource fsmDataSource;
    private final ByteStringDataSource gatewayCacheDataSource;
    private final MutableStateFlow<Boolean> isInit;
    private final ByteStringDataSource nativeConfigDataSource;
    private final SharedFlow<SessionChange> onChange;
    private final Flow<NativeConfigurationOuterClass.NativeConfiguration> persistedNativeConfiguration;
    private final ByteStringDataSource privacyDataSource;
    private final List<AdFormatOuterClass.AdFormat> scarEligibleFormats;
    private final AndroidUnityInfoDataSource unityInfoDataSource;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$1", f = "AndroidSessionRepository.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SendDiagnosticEvent sendDiagnosticEvent, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return AndroidSessionRepository.this.new AnonymousClass1(this.$sendDiagnosticEvent, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    ByteStringDataSource byteStringDataSource = AndroidSessionRepository.this.nativeConfigDataSource;
                    this.label = 1;
                    obj = byteStringDataSource.get(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                if (!data.isEmpty()) {
                    MutableStateFlow mutableStateFlow = AndroidSessionRepository.this._sdkConfiguration;
                    NativeConfigurationOuterClass.NativeConfiguration from = NativeConfigurationOuterClass.NativeConfiguration.parseFrom(data);
                    e0.checkNotNullExpressionValue(from, "parseFrom(data)");
                    mutableStateFlow.setValue(from);
                }
            } catch (Exception e10) {
                SendDiagnosticEvent sendDiagnosticEvent = this.$sendDiagnosticEvent;
                String message = e10.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_missed_native_parsing", null, o1.mapOf(tu.e0.to("debugReason", message)), null, null, null, 58, null);
            }
            AndroidSessionRepository.this.isInit.setValue(b.boxBoolean(true));
            return x0.f87415a;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", i = {}, l = {210}, m = "getGatewayCache", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37831 extends bv.d {
        int label;
        /* synthetic */ Object result;

        public C37831(d<? super C37831> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getGatewayCache(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE}, m = "getPrivacy", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37841 extends bv.d {
        int label;
        /* synthetic */ Object result;

        public C37841(d<? super C37841> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacy(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", i = {}, l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE}, m = "getPrivacyFsm", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37851 extends bv.d {
        int label;
        /* synthetic */ Object result;

        public C37851(d<? super C37851> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacyFsm(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", i = {0, 0}, l = {Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE}, m = "setPrivacy", n = {"this", "value"}, s = {"L$0", "L$1"})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37861 extends bv.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C37861(d<? super C37861> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.setPrivacy(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", i = {0, 0}, l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE}, m = "setPrivacyFsm", n = {"this", "value"}, s = {"L$0", "L$1"})
    /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37871 extends bv.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C37871(d<? super C37871> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.setPrivacyFsm(null, this);
        }
    }

    public AndroidSessionRepository(ByteStringDataSource gatewayCacheDataSource, ByteStringDataSource privacyDataSource, ByteStringDataSource fsmDataSource, ByteStringDataSource nativeConfigDataSource, AndroidUnityInfoDataSource unityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration defaultNativeConfiguration, CoroutineDispatcher dispatcher, SendDiagnosticEvent sendDiagnosticEvent) {
        e0.checkNotNullParameter(gatewayCacheDataSource, "gatewayCacheDataSource");
        e0.checkNotNullParameter(privacyDataSource, "privacyDataSource");
        e0.checkNotNullParameter(fsmDataSource, "fsmDataSource");
        e0.checkNotNullParameter(nativeConfigDataSource, "nativeConfigDataSource");
        e0.checkNotNullParameter(unityInfoDataSource, "unityInfoDataSource");
        e0.checkNotNullParameter(defaultNativeConfiguration, "defaultNativeConfiguration");
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.gatewayCacheDataSource = gatewayCacheDataSource;
        this.privacyDataSource = privacyDataSource;
        this.fsmDataSource = fsmDataSource;
        this.nativeConfigDataSource = nativeConfigDataSource;
        this.unityInfoDataSource = unityInfoDataSource;
        MutableStateFlow<NativeConfigurationOuterClass.NativeConfiguration> MutableStateFlow = StateFlowKt.MutableStateFlow(defaultNativeConfiguration);
        this._sdkConfiguration = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.isInit = MutableStateFlow2;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(dispatcher), null, null, new AnonymousClass1(sendDiagnosticEvent, null), 3, null);
        final Flow flowFlowCombine = FlowKt.flowCombine(MutableStateFlow, MutableStateFlow2, new AndroidSessionRepository$persistedNativeConfiguration$1(null));
        final Flow<v> flow = new Flow<v>() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2", f = "AndroidSessionRepository.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends bv.d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
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
                public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L4e
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        r2 = r5
                        tu.v r2 = (tu.v) r2
                        java.lang.Object r2 = r2.getSecond()
                        java.lang.Boolean r2 = (java.lang.Boolean) r2
                        boolean r2 = r2.booleanValue()
                        if (r2 == 0) goto L4e
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4e
                        return r1
                    L4e:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super v> flowCollector, d dVar) {
                Object objCollect = flowFlowCombine.collect(new AnonymousClass2(flowCollector), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        };
        this.persistedNativeConfiguration = new Flow<NativeConfigurationOuterClass.NativeConfiguration>() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                @f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2", f = "AndroidSessionRepository.kt", i = {}, l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends bv.d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
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

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L45
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        tu.v r5 = (tu.v) r5
                        java.lang.Object r5 = r5.getFirst()
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L45
                        return r1
                    L45:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super NativeConfigurationOuterClass.NativeConfiguration> flowCollector, d dVar) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), dVar);
                return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        };
        this.scarEligibleFormats = new ArrayList();
        MutableSharedFlow<SessionChange> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._onChange = mutableSharedFlowMutableSharedFlow$default;
        this.onChange = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        String gameId = ClientProperties.getGameId();
        this._gameId = StateFlowKt.MutableStateFlow(gameId != null ? gameId : null);
        UUID uuidRandomUUID = UUID.randomUUID();
        e0.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
        this._sessionId = StateFlowKt.MutableStateFlow(ProtobufExtensionsKt.toByteString(uuidRandomUUID));
        this._isTestModeEnabled = StateFlowKt.MutableStateFlow(Boolean.valueOf(SdkProperties.isTestMode()));
        SessionCountersOuterClass.SessionCounters sessionCountersBuild = SessionCountersOuterClass.SessionCounters.newBuilder().build();
        e0.checkNotNullExpressionValue(sessionCountersBuild, "newBuilder().build()");
        this._sessionCounters = StateFlowKt.MutableStateFlow(sessionCountersBuild);
        this._tokenCounters = StateFlowKt.MutableStateFlow(new TokenCounters(0, 0, 0));
        ByteString EMPTY = ByteString.EMPTY;
        e0.checkNotNullExpressionValue(EMPTY, "EMPTY");
        this._sessionToken = StateFlowKt.MutableStateFlow(EMPTY);
        e0.checkNotNullExpressionValue(EMPTY, "EMPTY");
        this._currentState = StateFlowKt.MutableStateFlow(EMPTY);
        this._gatewayUrl = StateFlowKt.MutableStateFlow(UnityAdsConstants.DefaultUrls.GATEWAY_URL);
        this._initializationState = StateFlowKt.MutableStateFlow(InitializationState.NOT_INITIALIZED);
        this._headerBiddingTokenCounter = StateFlowKt.MutableStateFlow(0);
        Boolean bool = Boolean.TRUE;
        this._shouldInitialize = StateFlowKt.MutableStateFlow(bool);
        this._isFirstInitAttempt = StateFlowKt.MutableStateFlow(bool);
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void addTimeToGlobalAdsFocusTime(int i10) {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow<SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setGlobalAdsFocusTime(dsl_create.getGlobalAdsFocusTime() + i10);
        } while (!mutableStateFlow.compareAndSet(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
        NativeConfigurationOuterClass.FeatureFlags featureFlags = getNativeConfiguration().getFeatureFlags();
        e0.checkNotNullExpressionValue(featureFlags, "nativeConfiguration.featureFlags");
        return featureFlags;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getGameId() {
        String value;
        String gameId;
        MutableStateFlow<String> mutableStateFlow = this._gameId;
        do {
            value = mutableStateFlow.getValue();
            gameId = ClientProperties.getGameId();
            if (gameId == null) {
                gameId = null;
            }
        } while (!mutableStateFlow.compareAndSet(value, gameId));
        return gameId;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getGatewayCache(zu.d<? super com.google.protobuf.ByteString> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C37831
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C37831) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            tu.a0.throwOnFailure(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.gatewayCacheDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "gatewayCacheDataSource.get().data"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getGatewayCache(zu.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getGatewayState() {
        return this._currentState.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getGatewayUrl() {
        return this._gatewayUrl.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public int getHeaderBiddingTokenCounter() {
        Integer value;
        Integer num;
        MutableStateFlow<Integer> mutableStateFlow = this._headerBiddingTokenCounter;
        do {
            value = mutableStateFlow.getValue();
            num = value;
        } while (!mutableStateFlow.compareAndSet(value, Integer.valueOf(num.intValue() + 1)));
        return num.intValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public InitializationState getInitializationState() {
        return this._initializationState.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
        return !this.isInit.getValue().booleanValue() ? (NativeConfigurationOuterClass.NativeConfiguration) BuildersKt__BuildersKt.runBlocking$default(null, new AndroidSessionRepository$nativeConfiguration$1(this, null), 1, null) : this._sdkConfiguration.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Flow<InitializationState> getObserveInitializationState() {
        return this._initializationState;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public SharedFlow<SessionChange> getOnChange() {
        return this.onChange;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getPrivacy(zu.d<? super com.google.protobuf.ByteString> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C37841
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C37841) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            tu.a0.throwOnFailure(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.privacyDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "privacyDataSource.get().data"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacy(zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getPrivacyFsm(zu.d<? super com.google.protobuf.ByteString> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C37851
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C37851) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            tu.a0.throwOnFailure(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.fsmDataSource
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.lang.String r0 = "fsmDataSource.get().data"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.getPrivacyFsm(zu.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public List<AdFormatOuterClass.AdFormat> getScarEligibleFormats() {
        return this.scarEligibleFormats;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public SessionCountersOuterClass.SessionCounters getSessionCounters() {
        return this._sessionCounters.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getSessionId() {
        return this._sessionId.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getSessionToken() {
        return this._sessionToken.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean getShouldInitialize() {
        return this._shouldInitialize.getValue().booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public TokenCounters getTokenCounters() {
        return this._tokenCounters.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getUnityInstallationId() {
        return this.unityInfoDataSource.getUnityInstallationId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getUnityMegaSessionId() {
        return this.unityInfoDataSource.getUnityMegaSessionId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerImpressionCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow<SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerImpressions(dsl_create.getBannerImpressions() + 1);
        } while (!mutableStateFlow.compareAndSet(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestAdmCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow<SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerRequestsAdm(dsl_create.getBannerRequestsAdm() + 1);
        } while (!mutableStateFlow.compareAndSet(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow<SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerLoadRequests(dsl_create.getBannerLoadRequests() + 1);
        } while (!mutableStateFlow.compareAndSet(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementFocusChangeCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow<SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setFocusChangeCount(dsl_create.getFocusChangeCount() + 1);
        } while (!mutableStateFlow.compareAndSet(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementGlobalAdsFocusChangeCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow<SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setGlobalAdsFocusChangeCount(dsl_create.getGlobalAdsFocusChangeCount() + 1);
        } while (!mutableStateFlow.compareAndSet(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestAdmCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow<SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequestsAdm(dsl_create.getLoadRequestsAdm() + 1);
        } while (!mutableStateFlow.compareAndSet(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        MutableStateFlow<SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        do {
            value = mutableStateFlow.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            e0.checkNotNullExpressionValue(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequests(dsl_create.getLoadRequests() + 1);
        } while (!mutableStateFlow.compareAndSet(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenSequenceNumber() {
        TokenCounters value;
        TokenCounters tokenCounters;
        MutableStateFlow<TokenCounters> mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
            tokenCounters = value;
        } while (!mutableStateFlow.compareAndSet(value, TokenCounters.copy$default(tokenCounters, tokenCounters.getSeq() + 1, 0, 0, 6, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenStartsCount() {
        TokenCounters value;
        TokenCounters tokenCounters;
        MutableStateFlow<TokenCounters> mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
            tokenCounters = value;
        } while (!mutableStateFlow.compareAndSet(value, TokenCounters.copy$default(tokenCounters, 0, 0, tokenCounters.getStarts() + 1, 3, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenWinsCount() {
        TokenCounters value;
        TokenCounters tokenCounters;
        MutableStateFlow<TokenCounters> mutableStateFlow = this._tokenCounters;
        do {
            value = mutableStateFlow.getValue();
            tokenCounters = value;
        } while (!mutableStateFlow.compareAndSet(value, TokenCounters.copy$default(tokenCounters, 0, tokenCounters.getWins() + 1, 0, 5, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isDiagnosticsEnabled() {
        return getNativeConfiguration().getDiagnosticEvents().getEnabled();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isFirstInitAttempt() {
        Boolean value;
        Boolean bool;
        MutableStateFlow<Boolean> mutableStateFlow = this._isFirstInitAttempt;
        do {
            value = mutableStateFlow.getValue();
            bool = value;
            bool.getClass();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.FALSE));
        return bool.booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isOmEnabled() {
        return getNativeConfiguration().getEnableOm();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isSdkInitialized() {
        return getInitializationState() == InitializationState.INITIALIZED;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isTestModeEnabled() {
        Boolean value;
        boolean zIsTestMode;
        MutableStateFlow<Boolean> mutableStateFlow = this._isTestModeEnabled;
        do {
            value = mutableStateFlow.getValue();
            value.getClass();
            zIsTestMode = SdkProperties.isTestMode();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.valueOf(zIsTestMode)));
        return zIsTestMode;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object persistNativeConfiguration(d<? super x0> dVar) {
        ByteStringDataSource byteStringDataSource = this.nativeConfigDataSource;
        ByteString byteString = getNativeConfiguration().toByteString();
        e0.checkNotNullExpressionValue(byteString, "nativeConfiguration.toByteString()");
        Object obj = byteStringDataSource.set(byteString, dVar);
        return obj == e.getCOROUTINE_SUSPENDED() ? obj : x0.f87415a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void resetTokenCounters() {
        MutableStateFlow<TokenCounters> mutableStateFlow = this._tokenCounters;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new TokenCounters(0, 0, 0))) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGameId(String str) {
        String value;
        MutableStateFlow<String> mutableStateFlow = this._gameId;
        do {
            value = mutableStateFlow.getValue();
            ClientProperties.setGameId(str);
        } while (!mutableStateFlow.compareAndSet(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object setGatewayCache(ByteString byteString, d<? super x0> dVar) {
        Object obj = this.gatewayCacheDataSource.set(byteString, dVar);
        return obj == e.getCOROUTINE_SUSPENDED() ? obj : x0.f87415a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayState(ByteString value) {
        e0.checkNotNullParameter(value, "value");
        MutableStateFlow<ByteString> mutableStateFlow = this._currentState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayUrl(String value) {
        e0.checkNotNullParameter(value, "value");
        MutableStateFlow<String> mutableStateFlow = this._gatewayUrl;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationState(InitializationState value) {
        e0.checkNotNullParameter(value, "value");
        MutableStateFlow<InitializationState> mutableStateFlow = this._initializationState;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration value) {
        e0.checkNotNullParameter(value, "value");
        MutableStateFlow<NativeConfigurationOuterClass.NativeConfiguration> mutableStateFlow = this._sdkConfiguration;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r7.emit(r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object setPrivacy(com.google.protobuf.ByteString r6, zu.d<? super tu.x0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C37861
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C37861) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r7)
            goto L68
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.data.repository.AndroidSessionRepository r2 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) r2
            tu.a0.throwOnFailure(r7)
            goto L53
        L40:
            tu.a0.throwOnFailure(r7)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r7 = r5.privacyDataSource
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.set(r6, r0)
            if (r7 != r1) goto L52
            goto L67
        L52:
            r2 = r5
        L53:
            kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.core.data.model.SessionChange> r7 = r2._onChange
            com.unity3d.ads.core.data.model.SessionChange$UserConsentChange r2 = new com.unity3d.ads.core.data.model.SessionChange$UserConsentChange
            r2.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r7.emit(r2, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacy(com.google.protobuf.ByteString, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r7.emit(r2, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object setPrivacyFsm(com.google.protobuf.ByteString r6, zu.d<? super tu.x0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.AndroidSessionRepository.C37871
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository.C37871) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1 r0 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r7)
            goto L68
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.data.repository.AndroidSessionRepository r2 = (com.unity3d.ads.core.data.repository.AndroidSessionRepository) r2
            tu.a0.throwOnFailure(r7)
            goto L53
        L40:
            tu.a0.throwOnFailure(r7)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r7 = r5.fsmDataSource
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.set(r6, r0)
            if (r7 != r1) goto L52
            goto L67
        L52:
            r2 = r5
        L53:
            kotlinx.coroutines.flow.MutableSharedFlow<com.unity3d.ads.core.data.model.SessionChange> r7 = r2._onChange
            com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange r2 = new com.unity3d.ads.core.data.model.SessionChange$PrivacyFsmChange
            r2.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r7.emit(r2, r0)
            if (r6 != r1) goto L68
        L67:
            return r1
        L68:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidSessionRepository.setPrivacyFsm(com.google.protobuf.ByteString, zu.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionCounters(SessionCountersOuterClass.SessionCounters value) {
        e0.checkNotNullParameter(value, "value");
        MutableStateFlow<SessionCountersOuterClass.SessionCounters> mutableStateFlow = this._sessionCounters;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionToken(ByteString value) {
        e0.checkNotNullParameter(value, "value");
        MutableStateFlow<ByteString> mutableStateFlow = this._sessionToken;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setShouldInitialize(boolean z10) {
        Boolean value;
        MutableStateFlow<Boolean> mutableStateFlow = this._shouldInitialize;
        do {
            value = mutableStateFlow.getValue();
            value.getClass();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.valueOf(z10)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setTokenCounters(TokenCounters value) {
        e0.checkNotNullParameter(value, "value");
        MutableStateFlow<TokenCounters> mutableStateFlow = this._tokenCounters;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
    }
}
