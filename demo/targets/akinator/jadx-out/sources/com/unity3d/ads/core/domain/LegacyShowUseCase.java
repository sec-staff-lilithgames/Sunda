package com.unity3d.ads.core.domain;

import av.e;
import bv.b;
import bv.d;
import bv.f;
import bv.n;
import com.google.protobuf.ByteString;
import com.ironsource.C3191e4;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import kv.q;
import kv.t;
import org.json.JSONObject;
import tu.a0;
import tu.x0;
import tv.w;
import uu.o1;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LegacyShowUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_OBJECT_ID = "objectId";
    public static final String MESSAGE_AD_OBJECT_EXPIRED = "The ad has expired";
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";
    public static final String MESSAGE_PLACEMENT_NOT_LOADED = "Placement %s must be Loaded before calling Show";
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;
    private AdObject adObject;
    private final AdRepository adRepository;
    private final GetInitializationState getInitializationState;
    private final GetOperativeEventApi getOperativeEventApi;
    private final MutableStateFlow<Boolean> hasStarted;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final Show show;
    private final MutableStateFlow<Boolean> timeoutCancellationRequested;
    private UnityAdsShowOptions unityAdsShowOptions;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", i = {5, 5, 9}, l = {Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 128, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 141, 146, 152, 159, 164, 195}, m = "invoke", n = {"this", "opportunityIdByteString", C3191e4.f36360v}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyShowUseCase.this.invoke(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", i = {0, 1, 2}, l = {178, 184, 185}, m = "invokeSuspend", n = {"close", "close", "close"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ boolean $isBanner;
        final /* synthetic */ String $placement;
        final /* synthetic */ t $reportShowError;
        final /* synthetic */ boolean $useTimeout;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z10, AdObject adObject, boolean z11, t tVar, String str, zu.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$isBanner = z10;
            this.$adObject = adObject;
            this.$useTimeout = z11;
            this.$reportShowError = tVar;
            this.$placement = str;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = LegacyShowUseCase.this.new AnonymousClass2(this.$isBanner, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kv.p
        public final Object invoke(kv.a aVar, zu.d<? super x0> dVar) {
            return ((AnonymousClass2) create(aVar, dVar)).invokeSuspend(x0.f87415a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                tu.x0 r2 = tu.x0.f87415a
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L34
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L24
                if (r1 != r3) goto L1c
                java.lang.Object r0 = r11.L$0
                kv.a r0 = (kv.a) r0
                tu.a0.throwOnFailure(r12)
                goto Lb5
            L1c:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L24:
                java.lang.Object r1 = r11.L$0
                kv.a r1 = (kv.a) r1
                tu.a0.throwOnFailure(r12)
                goto L8f
            L2c:
                java.lang.Object r1 = r11.L$0
                kv.a r1 = (kv.a) r1
                tu.a0.throwOnFailure(r12)
                goto L78
            L34:
                tu.a0.throwOnFailure(r12)
                java.lang.Object r12 = r11.L$0
                r1 = r12
                kv.a r1 = (kv.a) r1
                com.unity3d.ads.core.domain.LegacyShowUseCase r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                kotlinx.coroutines.flow.MutableStateFlow r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getHasStarted$p(r12)
                java.lang.Object r12 = r12.getValue()
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 != 0) goto Lb8
                com.unity3d.ads.core.domain.LegacyShowUseCase r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                kotlinx.coroutines.flow.MutableStateFlow r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getTimeoutCancellationRequested$p(r12)
                java.lang.Object r12 = r12.getValue()
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 != 0) goto Lb8
                boolean r12 = r11.$isBanner
                if (r12 == 0) goto L65
                goto Lb8
            L65:
                com.unity3d.ads.core.domain.LegacyShowUseCase r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                gatewayprotocol.v1.OperativeEventRequestOuterClass$OperativeEventErrorType r6 = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT
                com.unity3d.ads.core.data.model.AdObject r7 = r11.$adObject
                r11.L$0 = r1
                r11.label = r5
                java.lang.String r5 = "timeout"
                java.lang.Object r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$sendOperativeError(r12, r6, r5, r7, r11)
                if (r12 != r0) goto L78
                goto Lb3
            L78:
                boolean r12 = r11.$useTimeout
                if (r12 == 0) goto Lb8
                com.unity3d.ads.core.domain.LegacyShowUseCase r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.this
                com.unity3d.ads.core.domain.Show r12 = com.unity3d.ads.core.domain.LegacyShowUseCase.access$getShow$p(r12)
                com.unity3d.ads.core.data.model.AdObject r5 = r11.$adObject
                r11.L$0 = r1
                r11.label = r4
                java.lang.Object r12 = r12.terminate(r5, r11)
                if (r12 != r0) goto L8f
                goto Lb3
            L8f:
                kv.t r4 = r11.$reportShowError
                com.unity3d.ads.UnityAds$UnityAdsShowError r6 = com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r5 = 0
                java.lang.String r5 = be.nVUQ.UupKET.hkmBMmSSovjh
                r12.<init>(r5)
                java.lang.String r5 = r11.$placement
                r12.append(r5)
                java.lang.String r7 = r12.toString()
                r11.L$0 = r1
                r11.label = r3
                java.lang.String r5 = "timeout"
                r8 = 0
                r9 = 0
                r10 = r11
                java.lang.Object r12 = r4.invoke(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto Lb4
            Lb3:
                return r0
            Lb4:
                r0 = r1
            Lb5:
                r0.invoke()
            Lb8:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3, reason: invalid class name */
    public static final class AnonymousClass3 extends n implements q {
        final /* synthetic */ boolean $isBanner;
        final /* synthetic */ t $reportShowError;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(t tVar, boolean z10, zu.d<? super AnonymousClass3> dVar) {
            super(3, dVar);
            this.$reportShowError = tVar;
            this.$isBanner = z10;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            AnonymousClass3 anonymousClass3;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                Throwable th2 = (Throwable) this.L$0;
                t tVar = this.$reportShowError;
                UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th2, 0, 1, null);
                this.label = 1;
                anonymousClass3 = this;
                if (tVar.invoke("uncaught_exception", unityAdsShowError, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, anonymousClass3) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                anonymousClass3 = this;
            }
            if (!anonymousClass3.$isBanner) {
                LegacyShowUseCase.isFullscreenAdShowing = false;
            }
            return x0.f87415a;
        }

        @Override // kv.q
        public final Object invoke(FlowCollector<? super ShowEvent> flowCollector, Throwable th2, zu.d<? super x0> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$reportShowError, this.$isBanner, dVar);
            anonymousClass3.L$0 = th2;
            return anonymousClass3.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showClicked$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37941 extends f0 implements kv.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37941(Listeners listeners, String str) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3503invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3503invoke() {
            this.$listeners.onClick(this.$placement);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showCompleted$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37951 extends f0 implements kv.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        final /* synthetic */ ShowStatus $status;
        final /* synthetic */ LegacyShowUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37951(Listeners listeners, String str, ShowStatus showStatus, LegacyShowUseCase legacyShowUseCase) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
            this.$status = showStatus;
            this.this$0 = legacyShowUseCase;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3504invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3504invoke() {
            Listeners listeners = this.$listeners;
            String str = this.$placement;
            ShowStatus showStatus = this.$status;
            NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = this.this$0.sessionRepository.getNativeConfiguration().getDefaultShowCompletionState();
            e0.checkNotNullExpressionValue(defaultShowCompletionState, "sessionRepository.native…efaultShowCompletionState");
            listeners.onComplete(str, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(showStatus, defaultShowCompletionState));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37961 extends n implements t {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $opportunityId;
        final /* synthetic */ String $placement;
        final /* synthetic */ w $startTime;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        /* synthetic */ Object L$4;
        int label;
        final /* synthetic */ LegacyShowUseCase this$0;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05421 extends f0 implements kv.a {
            final /* synthetic */ Listeners $listeners;
            final /* synthetic */ String $message;
            final /* synthetic */ String $placement;
            final /* synthetic */ UnityAds.UnityAdsShowError $reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05421(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
                super(0);
                this.$listeners = listeners;
                this.$placement = str;
                this.$reason = unityAdsShowError;
                this.$message = str2;
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m3505invoke();
                return x0.f87415a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m3505invoke() {
                this.$listeners.onError(this.$placement, this.$reason, this.$message);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37961(String str, LegacyShowUseCase legacyShowUseCase, String str2, w wVar, Listeners listeners, zu.d<? super C37961> dVar) {
            super(6, dVar);
            this.$placement = str;
            this.this$0 = legacyShowUseCase;
            this.$opportunityId = str2;
            this.$startTime = wVar;
            this.$listeners = listeners;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            e.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            String str = (String) this.L$0;
            UnityAds.UnityAdsShowError unityAdsShowError = (UnityAds.UnityAdsShowError) this.L$1;
            String str2 = (String) this.L$2;
            Integer num = (Integer) this.L$3;
            String str3 = (String) this.L$4;
            DeviceLog.debug("Unity Ads Show Failed for placement " + this.$placement);
            AdObject tmpAdObject = this.this$0.adObject;
            if (tmpAdObject == null) {
                tmpAdObject = this.this$0.getTmpAdObject(this.$opportunityId);
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_failure_time", b.boxDouble(TimeExtensionsKt.elapsedMillis(this.$startTime)), this.this$0.getTags(str, num, str3), null, tmpAdObject, null, 40, null);
            this.this$0.safeCallbackInvoke.invoke(new C05421(this.$listeners, this.$placement, unityAdsShowError, str2));
            return x0.f87415a;
        }

        @Override // kv.t
        public final Object invoke(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2, Integer num, String str3, zu.d<? super x0> dVar) {
            C37961 c37961 = new C37961(this.$placement, this.this$0, this.$opportunityId, this.$startTime, this.$listeners, dVar);
            c37961.L$0 = str;
            c37961.L$1 = unityAdsShowError;
            c37961.L$2 = str2;
            c37961.L$3 = num;
            c37961.L$4 = str3;
            return c37961.invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showStarted$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37971 extends f0 implements kv.a {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37971(Listeners listeners, String str) {
            super(0);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3506invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3506invoke() {
            this.$listeners.onStart(this.$placement);
        }
    }

    public LegacyShowUseCase(Show show, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetInitializationState getInitializationState, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke) {
        e0.checkNotNullParameter(show, "show");
        e0.checkNotNullParameter(adRepository, "adRepository");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        e0.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        e0.checkNotNullParameter(getInitializationState, "getInitializationState");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(safeCallbackInvoke, "safeCallbackInvoke");
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        Boolean bool = Boolean.FALSE;
        this.hasStarted = StateFlowKt.MutableStateFlow(bool);
        this.timeoutCancellationRequested = StateFlowKt.MutableStateFlow(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerLeftApplication(w wVar, String str, Listeners listeners) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Show Left Application for placement " + str);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_left_app", Double.valueOf(TimeExtensionsKt.elapsedMillis(wVar)), null, null, this.adObject, null, 44, null);
        listeners.onLeftApplication(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeout(w wVar) {
        this.timeoutCancellationRequested.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(wVar)), null, null, this.adObject, null, 44, null);
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions) throws IllegalArgumentException {
        Object objOpt;
        String string;
        JSONObject data = unityAdsShowOptions.getData();
        if (data == null || (objOpt = data.opt("objectId")) == null || (string = objOpt.toString()) == null) {
            return null;
        }
        return UUID.fromString(string).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(String str, Integer num, String str2) {
        Map<String, String> mapMutableMapOf = p1.mutableMapOf(tu.e0.to("operation", OperationType.SHOW.toString()), tu.e0.to("reason", str));
        if (num != null) {
            mapMutableMapOf.put("reason_code", String.valueOf(num.intValue()));
        }
        if (str2 != null) {
            mapMutableMapOf.put("reason_debug", str2);
        }
        return mapMutableMapOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(String str) {
        UUID uuidFromString = UUID.fromString(str);
        e0.checkNotNullExpressionValue(uuidFromString, "fromString(opportunityId)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(uuidFromString);
        AdObject ad2 = this.adRepository.getAd(byteString);
        if (ad2 != null) {
            return ad2;
        }
        String str2 = this.placement;
        if (str2 == null) {
            str2 = "";
        }
        ByteString EMPTY = ByteString.EMPTY;
        e0.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return new AdObject(byteString, str2, EMPTY, false, null, null, null, false, null, null, null, new UnityAdsLoadOptions(), false, DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_UNSPECIFIED, null, null, 50680, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendOperativeError(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, zu.d<? super x0> dVar) {
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setErrorType(operativeEventErrorType);
        dsl_create.setMessage(str);
        OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData_build = dsl_create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        ByteString byteString = operativeEventErrorData_build.toByteString();
        e0.checkNotNullExpressionValue(byteString, "errorData.toByteString()");
        Object objInvoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, dVar);
        return objInvoke == e.getCOROUTINE_SUSPENDED() ? objInvoke : x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showClicked(w wVar, String str, Listeners listeners) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Show Clicked for placement " + str);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_clicked", Double.valueOf(TimeExtensionsKt.elapsedMillis(wVar)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new C37941(listeners, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCompleted(w wVar, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Show Completed for placement " + str);
        Map mapCreateMapBuilder = o1.createMapBuilder();
        if (str2 != null) {
        }
        if (str3 != null) {
            mapCreateMapBuilder.put("reason_debug", str3);
        }
        Map mapBuild = o1.build(mapCreateMapBuilder);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(wVar)), mapBuild, null, this.adObject, null, 40, null);
        this.safeCallbackInvoke.invoke(new C37951(listeners, str, showStatus, this));
    }

    public static /* synthetic */ void showCompleted$default(LegacyShowUseCase legacyShowUseCase, w wVar, String str, ShowStatus showStatus, Listeners listeners, String str2, String str3, int i10, Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        if ((i10 & 32) != 0) {
            str3 = null;
        }
        legacyShowUseCase.showCompleted(wVar, str, showStatus, listeners, str2, str3);
    }

    private final t showError(w wVar, String str, String str2, Listeners listeners) {
        return new C37961(str, this, str2, wVar, listeners, null);
    }

    private final void showStart(String str) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_started", null, null, null, getTmpAdObject(str), null, 46, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStarted(w wVar, String str, Listeners listeners) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Show WV Start for placement " + str);
        this.hasStarted.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_wv_started", Double.valueOf(TimeExtensionsKt.elapsedMillis(wVar)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new C37971(listeners, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x021c, code lost:
    
        if (r7.invoke("ad_player_scope_not_active", r11, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, r15) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023f, code lost:
    
        if (r7.invoke("already_showing", r11, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_ALREADY_SHOWING, null, null, r15) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0270, code lost:
    
        if (r7.invoke("placement_validation", r11, com.unity3d.ads.core.domain.LegacyShowUseCase.MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING, null, null, r15) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
    
        if (r7.invoke("not_initialized", r11, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, null, r15) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0147, code lost:
    
        if (r7.invoke("placement_null", r11, com.unity3d.ads.core.data.model.LoadResult.MSG_PLACEMENT_NULL, null, null, r15) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0174, code lost:
    
        if (r7.invoke("no_opportunity_id", r11, com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_OPPORTUNITY_ID, null, r12, r15) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0197, code lost:
    
        if (r7.invoke("placement_not_loaded", r11, r12, null, null, r15) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c7, code lost:
    
        if (r7.invoke("ad_object_not_found", r11, r12, null, null, r15) == r3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.String r26, com.unity3d.ads.UnityAdsShowOptions r27, com.unity3d.ads.core.data.model.Listeners r28, zu.d<? super tu.x0> r29) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.invoke(java.lang.String, com.unity3d.ads.UnityAdsShowOptions, com.unity3d.ads.core.data.model.Listeners, zu.d):java.lang.Object");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4, reason: invalid class name */
    public static final class AnonymousClass4<T> implements FlowCollector {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        final /* synthetic */ t $reportShowError;
        final /* synthetic */ long $startTime;

        public AnonymousClass4(long j10, String str, Listeners listeners, AdObject adObject, t tVar) {
            this.$startTime = j10;
            this.$placement = str;
            this.$listeners = listeners;
            this.$adObject = adObject;
            this.$reportShowError = tVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(com.unity3d.ads.core.data.model.ShowEvent r20, zu.d<? super tu.x0> r21) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
            /*
                Method dump skipped, instructions count: 315
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass4.emit(com.unity3d.ads.core.data.model.ShowEvent, zu.d):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
            return emit((ShowEvent) obj, (zu.d<? super x0>) dVar);
        }
    }
}
