package com.unity3d.ads.adplayer;

import a.b;
import av.e;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.log.DeviceLog;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.AdActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.p;
import org.json.JSONArray;
import org.json.JSONException;
import qm.zMPW.GalEuEfxjome;
import tu.a0;
import tu.v;
import tu.x0;
import uu.c2;
import uu.p1;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonWebViewBridge implements WebViewBridge {
    private final MutableSharedFlow<Invocation> _onInvocation;
    private final MutableStateFlow<Set<v>> callbacks;
    private final SharedFlow<Invocation> onInvocation;
    private final CoroutineScope scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final WebViewContainer webViewContainer;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        int label;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return CommonWebViewBridge.this.new AnonymousClass1(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                WebViewContainer webViewContainer = CommonWebViewBridge.this.webViewContainer;
                CommonWebViewBridge commonWebViewBridge = CommonWebViewBridge.this;
                this.label = 1;
                if (webViewContainer.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7", f = "CommonWebViewBridge.kt", i = {0, 1}, l = {127, 129, 130, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 139}, m = "invokeSuspend", n = {"invocation", "invocation"}, s = {"L$0", "L$0"})
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7, reason: invalid class name */
    public static final class AnonymousClass7 extends n implements p {
        final /* synthetic */ String $callback;
        final /* synthetic */ String $location;
        final /* synthetic */ JSONArray $parameters;
        Object L$0;
        int label;
        final /* synthetic */ CommonWebViewBridge this$0;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @f(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1", f = "CommonWebViewBridge.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$7$1, reason: invalid class name */
        public static final class AnonymousClass1 extends n implements p {
            final /* synthetic */ Invocation $invocation;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Invocation invocation, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$invocation = invocation;
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.$invocation, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.label;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    Deferred<x0> deferredIsHandled = this.$invocation.isHandled();
                    this.label = 1;
                    if (deferredIsHandled.await(this) == coroutine_suspended) {
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
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, d<? super AnonymousClass7> dVar) {
            super(2, dVar);
            this.$location = str;
            this.$parameters = jSONArray;
            this.this$0 = commonWebViewBridge;
            this.$callback = str2;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass7(this.$location, this.$parameters, this.this$0, this.$callback, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
        
            if (r6.this$0.respond(r6.$callback, "OK", new java.lang.Object[]{r7}, r6) == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
        
            if (r1.respond(r3, "ERROR", new java.lang.Object[]{r7}, r6) != r0) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006b A[Catch: Exception -> 0x001c, PHI: r1
          0x006b: PHI (r1v14 com.unity3d.ads.adplayer.Invocation) = (r1v11 com.unity3d.ads.adplayer.Invocation), (r1v16 com.unity3d.ads.adplayer.Invocation) binds: [B:21:0x0067, B:13:0x0027] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:10:0x001f, B:26:0x0077, B:28:0x007b, B:31:0x0089, B:13:0x0027, B:23:0x006b, B:20:0x0057), top: B:46:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0077 A[Catch: Exception -> 0x001c, PHI: r7
          0x0077: PHI (r7v16 java.lang.Object) = (r7v15 java.lang.Object), (r7v0 java.lang.Object) binds: [B:24:0x0074, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:10:0x001f, B:26:0x0077, B:28:0x007b, B:31:0x0089, B:13:0x0027, B:23:0x006b, B:20:0x0057), top: B:46:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[Catch: Exception -> 0x001c, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:10:0x001f, B:26:0x0077, B:28:0x007b, B:31:0x0089, B:13:0x0027, B:23:0x006b, B:20:0x0057), top: B:46:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0089 A[Catch: Exception -> 0x001c, TRY_LEAVE, TryCatch #0 {Exception -> 0x001c, blocks: (B:7:0x0017, B:10:0x001f, B:26:0x0077, B:28:0x007b, B:31:0x0089, B:13:0x0027, B:23:0x006b, B:20:0x0057), top: B:46:0x0007 }] */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.AnonymousClass7.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass7) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", i = {0}, l = {TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.IGNITEPACKAGENAME_FIELD_NUMBER}, m = AdActivity.REQUEST_KEY_EXTRA, n = {"callback"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$request$1, reason: invalid class name and case insensitive filesystem */
    public static final class C37431 extends bv.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C37431(d<? super C37431> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonWebViewBridge.this.request(null, null, null, this);
        }
    }

    public CommonWebViewBridge(CoroutineDispatcher dispatcher, WebViewContainer webViewContainer, CoroutineScope adPlayerScope, SendDiagnosticEvent sendDiagnosticEvent) {
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        e0.checkNotNullParameter(webViewContainer, "webViewContainer");
        e0.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        CoroutineScope coroutineScopePlus = CoroutineScopeKt.plus(CoroutineScopeKt.plus(adPlayerScope, dispatcher), new CoroutineName("CommonWebViewBridge"));
        this.scope = coroutineScopePlus;
        this.callbacks = StateFlowKt.MutableStateFlow(c2.emptySet());
        MutableSharedFlow<Invocation> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 64, null, 5, null);
        this._onInvocation = mutableSharedFlowMutableSharedFlow$default;
        this.onInvocation = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        BuildersKt__Builders_commonKt.launch$default(coroutineScopePlus, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, String str, d<? super x0> dVar) {
        Object objEvaluateJavascript = this.webViewContainer.evaluateJavascript("window.nativebridge." + handlerType.getJsPath() + '(' + str + ");", dVar);
        return objEvaluateJavascript == e.getCOROUTINE_SUSPENDED() ? objEvaluateJavascript : x0.f87415a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public SharedFlow<Invocation> getOnInvocation() {
        return this.onInvocation;
    }

    public final CoroutineScope getScope() {
        return this.scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleCallback(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "callbackId"
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "callbackStatus"
            kotlin.jvm.internal.e0.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "rawParameters"
            kotlin.jvm.internal.e0.checkNotNullParameter(r3, r4)
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>(r3)
            java.lang.Object[] r3 = com.unity3d.ads.core.extensions.JSONArrayExtensionsKt.toTypedArray(r4)
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<tu.v>> r4 = r0.callbacks
            java.lang.Object r4 = r4.getValue()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L2c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r4.next()
            r6 = r5
            tu.v r6 = (tu.v) r6
            java.lang.Object r6 = r6.component1()
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = kotlin.jvm.internal.e0.areEqual(r6, r1)
            if (r6 == 0) goto L2c
            goto L47
        L46:
            r5 = 0
        L47:
            tu.v r5 = (tu.v) r5
            if (r5 != 0) goto L4d
            goto Ld6
        L4d:
            java.lang.Object r1 = r5.component2()
            kotlinx.coroutines.CompletableDeferred r1 = (kotlinx.coroutines.CompletableDeferred) r1
            java.lang.String r4 = "success"
            java.lang.String r6 = "error"
            java.lang.String[] r7 = new java.lang.String[]{r4, r6}
            java.util.Set r7 = uu.c2.setOf(r7)
            boolean r7 = r7.contains(r2)
            if (r7 == 0) goto L75
            com.unity3d.ads.core.domain.SendDiagnosticEvent r8 = r0.sendDiagnosticEvent
            r15 = 62
            r16 = 0
            java.lang.String r9 = "old_callback_status"
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L75:
            int r7 = r2.hashCode()
            r8 = -1867169789(0xffffffff90b54003, float:-7.149054E-29)
            if (r7 == r8) goto Lb9
            r4 = 2524(0x9dc, float:3.537E-42)
            if (r7 == r4) goto Lb0
            r4 = 66247144(0x3f2d9e8, float:1.42735105E-36)
            if (r7 == r4) goto L94
            r4 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r7 == r4) goto L8d
            goto Lc3
        L8d:
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L9d
            goto Lc3
        L94:
            java.lang.String r4 = "ERROR"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L9d
            goto Lc3
        L9d:
            java.lang.Exception r2 = new java.lang.Exception
            r4 = 0
            r3 = r3[r4]
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.e0.checkNotNull(r3, r4)
            java.lang.String r3 = (java.lang.String) r3
            r2.<init>(r3)
            r1.completeExceptionally(r2)
            goto Lc3
        Lb0:
            java.lang.String r4 = "OK"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lc0
            goto Lc3
        Lb9:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lc0
            goto Lc3
        Lc0:
            r1.complete(r3)
        Lc3:
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<tu.v>> r1 = r0.callbacks
        Lc5:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            java.util.Set r3 = (java.util.Set) r3
            java.util.Set r3 = uu.d2.minus(r3, r5)
            boolean r2 = r1.compareAndSet(r2, r3)
            if (r2 == 0) goto Lc5
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.handleCallback(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(String message) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        e0.checkNotNullParameter(message, "message");
        try {
            try {
                JSONArray jSONArray = new JSONArray(message);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj = jSONArray.get(i10);
                    JSONArray jSONArray2 = obj instanceof JSONArray ? (JSONArray) obj : null;
                    if (jSONArray2 == null) {
                        throw new IllegalArgumentException(("Invalid invocation passed to CommonWebViewBridge: " + message).toString());
                    }
                    if (jSONArray2.length() != 4) {
                        throw new IllegalArgumentException(("Invocation must have 4 elements: " + jSONArray2).toString());
                    }
                    Object obj2 = jSONArray2.get(0);
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str == null) {
                        throw new IllegalArgumentException(("Invalid class name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj3 = jSONArray2.get(1);
                    String str2 = obj3 instanceof String ? (String) obj3 : null;
                    if (str2 == null) {
                        throw new IllegalArgumentException(("Invalid method name passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj4 = jSONArray2.get(2);
                    JSONArray jSONArray3 = obj4 instanceof JSONArray ? (JSONArray) obj4 : null;
                    if (jSONArray3 == null) {
                        throw new IllegalArgumentException(("Invalid parameters passed to CommonWebViewBridge: " + message).toString());
                    }
                    Object obj5 = jSONArray2.get(3);
                    String str3 = obj5 instanceof String ? (String) obj5 : null;
                    if (str3 == null) {
                        throw new IllegalArgumentException(("Invalid callback id passed to CommonWebViewBridge: " + message).toString());
                    }
                    String str4 = str + '.' + str2;
                    DeviceLog.debug("Unity Ads WebView calling for: " + str4 + '(' + jSONArray3 + ')');
                    BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass7(str4, jSONArray3, this, str3, null), 3, null);
                }
            } catch (JSONException e10) {
                throw new IllegalArgumentException("Invalid JSON array passed to CommonWebViewBridge: " + message, e10);
            }
        } catch (Exception e11) {
            DeviceLog.error("Error handling invocation from webview (" + message + ')');
            SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
            String message2 = e11.getMessage();
            if (message2 == null) {
                message2 = e11.getClass().getSimpleName();
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_webview_invocation_error", null, p1.mapOf(tu.e0.to("reason_debug", message2), tu.e0.to("webview_invocation", message)), null, null, null, 58, null);
            throw new IllegalArgumentException(b.k("Invalid message passed to CommonWebViewBridge: ", message), e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object request(java.lang.String r11, java.lang.String r12, java.lang.Object[] r13, zu.d<? super java.lang.Object[]> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.adplayer.CommonWebViewBridge.C37431
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = (com.unity3d.ads.adplayer.CommonWebViewBridge.C37431) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.CommonWebViewBridge$request$1 r0 = new com.unity3d.ads.adplayer.CommonWebViewBridge$request$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            tu.a0.throwOnFailure(r14)
            return r14
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            java.lang.Object r11 = r0.L$0
            kotlinx.coroutines.CompletableDeferred r11 = (kotlinx.coroutines.CompletableDeferred) r11
            tu.a0.throwOnFailure(r14)
            goto L94
        L3d:
            tu.a0.throwOnFailure(r14)
            kotlinx.coroutines.CompletableDeferred r14 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r4, r5, r4)
            int r2 = r14.hashCode()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<tu.v>> r6 = r10.callbacks
        L4e:
            java.lang.Object r7 = r6.getValue()
            r8 = r7
            java.util.Set r8 = (java.util.Set) r8
            tu.v r9 = tu.e0.to(r2, r14)
            java.util.Set r8 = uu.d2.plus(r8, r9)
            boolean r7 = r6.compareAndSet(r7, r8)
            if (r7 == 0) goto L4e
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            r6.put(r11)
            r6.put(r12)
            r6.put(r2)
            int r11 = r13.length
            r12 = 0
        L73:
            if (r12 >= r11) goto L7d
            r2 = r13[r12]
            r6.put(r2)
            int r12 = r12 + 1
            goto L73
        L7d:
            com.unity3d.ads.adplayer.HandlerType r11 = com.unity3d.ads.adplayer.HandlerType.INVOCATION
            java.lang.String r12 = r6.toString()
            java.lang.String r13 = "arguments.toString()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r12, r13)
            r0.L$0 = r14
            r0.label = r5
            java.lang.Object r11 = r10.execute(r11, r12, r0)
            if (r11 != r1) goto L93
            goto L9e
        L93:
            r11 = r14
        L94:
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r11 = r11.await(r0)
            if (r11 != r1) goto L9f
        L9e:
            return r1
        L9f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.CommonWebViewBridge.request(java.lang.String, java.lang.String, java.lang.Object[], zu.d):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Object sendEvent(WebViewEvent webViewEvent, d<? super x0> dVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        HandlerType handlerType = HandlerType.EVENT;
        String string = jSONArray.toString();
        e0.checkNotNullExpressionValue(string, "arguments.toString()");
        Object objExecute = execute(handlerType, string, dVar);
        return objExecute == e.getCOROUTINE_SUSPENDED() ? objExecute : x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, d<? super x0> dVar) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        Object objExecute = execute(HandlerType.CALLBACK, GalEuEfxjome.FmoUvlDxEbDvQuc + jSONArray + AbstractJsonLexerKt.END_LIST, dVar);
        return objExecute == e.getCOROUTINE_SUSPENDED() ? objExecute : x0.f87415a;
    }
}
