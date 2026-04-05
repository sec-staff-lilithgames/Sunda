package com.unity3d.ads.core.domain;

import av.e;
import bv.d;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import tv.x;
import tv.y;
import uu.k0;
import uu.o1;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {
    private final AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;
    private final GetHeaderBiddingToken getHeaderBiddingToken;
    private final GetInitializationState getInitializationState;
    private IUnityAdsTokenListener listener;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private InitializationState startState;
    private final long startTime;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", i = {0, 0}, l = {TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "fetchToken", n = {"this", "tokenNumber"}, s = {"L$0", "I$0"})
    /* renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int I$0;
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
            return CommonInitAwaitingGetHeaderBiddingToken.this.fetchToken(0, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", i = {0, 0, 0}, l = {54, TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER}, m = "invoke", n = {"this", "tokenConfiguration", "tokenNumber"}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37891 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C37891(zu.d<? super C37891> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonInitAwaitingGetHeaderBiddingToken.this.invoke(0, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        int label;

        public AnonymousClass2(zu.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return CommonInitAwaitingGetHeaderBiddingToken.this.new AnonymousClass2(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                if (k0.contains(new InitializationState[]{InitializationState.NOT_INITIALIZED, InitializationState.INITIALIZING}, GetInitializationState.DefaultImpls.invoke$default(CommonInitAwaitingGetHeaderBiddingToken.this.getGetInitializationState(), false, 1, null))) {
                    CommonInitAwaitingGetHeaderBiddingToken.this.didAwaitInit = true;
                    AwaitInitialization awaitInitialization = CommonInitAwaitingGetHeaderBiddingToken.this.getAwaitInitialization();
                    this.label = 1;
                    if (AwaitInitialization.DefaultImpls.invoke$default(awaitInitialization, 0L, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$tokenFailure$2, reason: invalid class name and case insensitive filesystem */
    public static final class C37902 extends f0 implements kv.a {
        public C37902() {
            super(0);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3499invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3499invoke() {
            IUnityAdsTokenListener listener = CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
            if (listener != null) {
                listener.onUnityAdsTokenReady(null);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$tokenSuccess$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37911 extends f0 implements kv.a {
        final /* synthetic */ String $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37911(String str) {
            super(0);
            this.$token = str;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3500invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3500invoke() {
            IUnityAdsTokenListener listener = CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
            if (listener != null) {
                listener.onUnityAdsTokenReady(this.$token);
            }
        }
    }

    public CommonInitAwaitingGetHeaderBiddingToken(GetHeaderBiddingToken getHeaderBiddingToken, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke) {
        e0.checkNotNullParameter(getHeaderBiddingToken, "getHeaderBiddingToken");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        e0.checkNotNullParameter(getInitializationState, "getInitializationState");
        e0.checkNotNullParameter(awaitInitialization, "awaitInitialization");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(safeCallbackInvoke, "safeCallbackInvoke");
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.startTime = y.f87465a.m7254markNowz9LOYto();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchToken(int r6, com.unity3d.ads.TokenConfiguration r7, zu.d<? super tu.x0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$0
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken r7 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) r7
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Exception -> L30
            goto L4d
        L30:
            r8 = move-exception
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            tu.a0.throwOnFailure(r8)
            com.unity3d.ads.core.domain.GetHeaderBiddingToken r8 = r5.getHeaderBiddingToken     // Catch: java.lang.Exception -> L53
            r0.L$0 = r5     // Catch: java.lang.Exception -> L53
            r0.I$0 = r6     // Catch: java.lang.Exception -> L53
            r0.label = r3     // Catch: java.lang.Exception -> L53
            java.lang.Object r8 = r8.invoke(r6, r7, r0)     // Catch: java.lang.Exception -> L53
            if (r8 != r1) goto L4c
            return r1
        L4c:
            r7 = r5
        L4d:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L30
            r0 = r4
            r4 = r8
            r8 = r0
            goto L5c
        L53:
            r8 = move-exception
            r7 = r5
        L55:
            r0 = 0
            java.lang.String r8 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r8, r0, r3, r4)
            java.lang.String r0 = "uncaught_exception"
        L5c:
            if (r4 != 0) goto L62
            r7.tokenFailure(r6, r0, r8)
            goto L65
        L62:
            r7.tokenSuccess(r6, r4)
        L65:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.fetchToken(int, com.unity3d.ads.TokenConfiguration, zu.d):java.lang.Object");
    }

    private final void tokenFailure(int i10, String str, String str2) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Double dValueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(x.m7236boximpl(this.startTime)));
        Map mapCreateMapBuilder = o1.createMapBuilder();
        mapCreateMapBuilder.put("sync", "false");
        mapCreateMapBuilder.put("state", String.valueOf(this.startState));
        mapCreateMapBuilder.put("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        mapCreateMapBuilder.put("awaited_init", String.valueOf(this.didAwaitInit));
        if (str != null) {
        }
        if (str2 != null) {
            mapCreateMapBuilder.put("reason_debug", str2);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_failure_time", dValueOf, o1.build(mapCreateMapBuilder), null, null, Integer.valueOf(i10), 24, null);
        this.safeCallbackInvoke.invoke(new C37902());
    }

    public static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i10, str, str2);
    }

    private final void tokenStart(int i10) {
        this.startState = GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_started", null, p1.mapOf(tu.e0.to("sync", "false"), tu.e0.to("state", String.valueOf(this.startState))), null, null, Integer.valueOf(i10), 26, null);
    }

    private final void tokenSuccess(int i10, String str) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(x.m7236boximpl(this.startTime))), p1.mapOf(tu.e0.to("sync", "false"), tu.e0.to("state", String.valueOf(this.startState)), tu.e0.to("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), tu.e0.to("awaited_init", String.valueOf(this.didAwaitInit))), null, null, Integer.valueOf(i10), 24, null);
        this.safeCallbackInvoke.invoke(new C37911(str));
    }

    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    public final SafeCallbackInvoke getSafeCallbackInvoke() {
        return this.safeCallbackInvoke;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    /* renamed from: getStartTime-z9LOYto, reason: not valid java name */
    public final long m3498getStartTimez9LOYto() {
        return this.startTime;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(int r10, com.unity3d.ads.TokenConfiguration r11, com.unity3d.ads.IUnityAdsTokenListener r12, zu.d<? super tu.x0> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.C37891
            if (r0 == 0) goto L13
            r0 = r13
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.C37891) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = "!sessionRepository.shouldInitialize"
            java.lang.String r4 = "gateway"
            r5 = 2
            r6 = 1
            r7 = 0
            tu.x0 r8 = tu.x0.f87415a
            if (r2 == 0) goto L49
            if (r2 == r6) goto L3b
            if (r2 != r5) goto L33
            tu.a0.throwOnFailure(r13)
            goto La4
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$1
            com.unity3d.ads.TokenConfiguration r11 = (com.unity3d.ads.TokenConfiguration) r11
            java.lang.Object r12 = r0.L$0
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken r12 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) r12
            tu.a0.throwOnFailure(r13)
            goto L8b
        L49:
            tu.a0.throwOnFailure(r13)
            r9.listener = r12
            r9.tokenStart(r10)
            if (r12 != 0) goto L5b
            java.lang.String r11 = "listener_null"
            java.lang.String r12 = "IUnityAdsTokenListener is null"
            r9.tokenFailure(r10, r11, r12)
            return r8
        L5b:
            com.unity3d.ads.core.data.repository.SessionRepository r12 = r9.sessionRepository
            boolean r12 = r12.getShouldInitialize()
            if (r12 != 0) goto L67
            r9.tokenFailure(r10, r4, r3)
            return r8
        L67:
            com.unity3d.ads.core.data.repository.SessionRepository r12 = r9.sessionRepository
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r12 = r12.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfiguration r12 = r12.getAdOperations()
            int r12 = r12.getGetTokenTimeoutMs()
            long r12 = (long) r12
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2 r2 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2
            r2.<init>(r7)
            r0.L$0 = r9
            r0.L$1 = r11
            r0.I$0 = r10
            r0.label = r6
            java.lang.Object r12 = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(r12, r2, r0)
            if (r12 != r1) goto L8a
            goto La3
        L8a:
            r12 = r9
        L8b:
            com.unity3d.ads.core.data.repository.SessionRepository r13 = r12.sessionRepository
            boolean r13 = r13.getShouldInitialize()
            if (r13 != 0) goto L97
            r12.tokenFailure(r10, r4, r3)
            return r8
        L97:
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r10 = r12.fetchToken(r10, r11, r0)
            if (r10 != r1) goto La4
        La3:
            return r1
        La4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke(int, com.unity3d.ads.TokenConfiguration, com.unity3d.ads.IUnityAdsTokenListener, zu.d):java.lang.Object");
    }

    public final void setListener(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }
}
