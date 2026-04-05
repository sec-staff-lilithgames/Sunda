package com.unity3d.ads.gatewayclient;

import av.e;
import bv.d;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.AdActivity;
import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseKt;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import ov.g;
import tu.a0;
import tu.x0;
import tv.w;
import uu.o0;
import uu.o1;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class CommonGatewayClient implements GatewayClient {
    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    public static final int CODE_TOO_MANY_REQUESTS = 429;
    public static final Companion Companion = new Companion(null);
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_PROTOBUF = "application/x-protobuf";
    public static final String HEADER_RETRY_AFTER = "Retry-After";
    public static final String HEADER_RETRY_ATTEMPT = "X-RETRY-ATTEMPT";
    private final HandleGatewayUniversalResponse handleGatewayUniversalResponse;
    private final HttpClient httpClient;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", i = {0, 0, 0, 0}, l = {Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "executeRequest", n = {"this", "operationType", "retryCount", "startTime"}, s = {"L$0", "L$1", "I$0", "J$0"})
    /* renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$executeRequest$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int I$0;
        long J$0;
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
            return CommonGatewayClient.this.executeRequest(null, 0, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2}, l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER, 81, 105}, m = "executeWithRetry", n = {"this", AdActivity.REQUEST_KEY_EXTRA, "requestPolicy", "operationType", "gatewayUrl", "retryCount", "timer", "delayTime", "this", AdActivity.REQUEST_KEY_EXTRA, "requestPolicy", "operationType", "gatewayUrl", "retryCount", "timer", "delayTime"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "J$1"})
    /* renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$executeWithRetry$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38461 extends d {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C38461(zu.d<? super C38461> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.this.executeWithRetry(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", i = {0}, l = {59}, m = AdActivity.REQUEST_KEY_EXTRA, n = {"requestPolicy"}, s = {"L$0"})
    /* renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38471 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C38471(zu.d<? super C38471> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.this.request(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2", f = "CommonGatewayClient.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ OperationType $operationType;
        final /* synthetic */ UniversalRequestOuterClass.UniversalRequest $request;
        final /* synthetic */ RequestPolicy $requestPolicy;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, zu.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$url = str;
            this.$request = universalRequest;
            this.$requestPolicy = requestPolicy;
            this.$operationType = operationType;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return CommonGatewayClient.this.new AnonymousClass2(this.$url, this.$request, this.$requestPolicy, this.$operationType, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws InvalidProtocolBufferException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, NetworkTimeoutException, InvocationTargetException {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return obj;
            }
            a0.throwOnFailure(obj);
            CommonGatewayClient commonGatewayClient = CommonGatewayClient.this;
            String str = this.$url;
            UniversalRequestOuterClass.UniversalRequest universalRequest = this.$request;
            RequestPolicy requestPolicy = this.$requestPolicy;
            OperationType operationType = this.$operationType;
            this.label = 1;
            Object objExecuteWithRetry = commonGatewayClient.executeWithRetry(str, universalRequest, requestPolicy, operationType, this);
            return objExecuteWithRetry == coroutine_suspended ? coroutine_suspended : objExecuteWithRetry;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super UniversalResponseOuterClass.UniversalResponse> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public CommonGatewayClient(HttpClient httpClient, HandleGatewayUniversalResponse handleGatewayUniversalResponse, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository) {
        e0.checkNotNullParameter(httpClient, "httpClient");
        e0.checkNotNullParameter(handleGatewayUniversalResponse, "handleGatewayUniversalResponse");
        e0.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.httpClient = httpClient;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
    }

    private final HttpRequest buildHttpRequest(String str, Map<String, ? extends List<String>> map, RequestPolicy requestPolicy, UniversalRequestOuterClass.UniversalRequest universalRequest) {
        return new HttpRequest(str, null, RequestType.POST, universalRequest.toByteArray(), map, null, null, null, null, requestPolicy.getConnectTimeout(), requestPolicy.getReadTimeout(), requestPolicy.getWriteTimeout(), requestPolicy.getOverallTimeout(), true, null, null, 0, 115170, null);
    }

    private final long calculateDelayTime(long j10, RequestPolicy requestPolicy, int i10) {
        return Math.min(calculateExponentialBackoff(j10, requestPolicy, i10) + calculateJitter(requestPolicy.getRetryWaitBase(), requestPolicy.getRetryJitterPct()), requestPolicy.getRetryMaxInterval());
    }

    private final long calculateExponentialBackoff(long j10, RequestPolicy requestPolicy, int i10) {
        if (i10 == 0) {
            return j10;
        }
        return (long) (requestPolicy.getRetryScalingFactor() * j10);
    }

    private final long calculateJitter(int i10, float f10) {
        if (f10 == 0.0f) {
            return 0L;
        }
        long j10 = (long) (i10 * f10);
        return g.f79860b.nextLong(-j10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeRequest(com.unity3d.services.core.network.model.HttpRequest r22, int r23, com.unity3d.ads.core.data.model.OperationType r24, zu.d<? super com.unity3d.services.core.network.model.HttpResponse> r25) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.executeRequest(com.unity3d.services.core.network.model.HttpRequest, int, com.unity3d.ads.core.data.model.OperationType, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0186 -> B:50:0x018c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeWithRetry(java.lang.String r31, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r32, com.unity3d.ads.gatewayclient.RequestPolicy r33, com.unity3d.ads.core.data.model.OperationType r34, zu.d<? super gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> r35) throws com.google.protobuf.InvalidProtocolBufferException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, com.unity3d.ads.core.data.model.exception.NetworkTimeoutException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.executeWithRetry(java.lang.String, gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, com.unity3d.ads.core.data.model.OperationType, zu.d):java.lang.Object");
    }

    private final String getGatewayUrl(String str) {
        return !e0.areEqual(str, UnityAdsConstants.DefaultUrls.GATEWAY_URL) ? str : this.sessionRepository.getGatewayUrl();
    }

    private final Map<String, List<String>> getHeaders(int i10) {
        Map mapCreateMapBuilder = o1.createMapBuilder();
        mapCreateMapBuilder.put("Content-Type", o0.listOf(HEADER_PROTOBUF));
        if (i10 > 0) {
            mapCreateMapBuilder.put(HEADER_RETRY_ATTEMPT, o0.listOf(String.valueOf(i10)));
        }
        return o1.build(mapCreateMapBuilder);
    }

    private final UniversalResponseOuterClass.UniversalResponse getUniversalResponse(HttpResponse httpResponse, OperationType operationType) throws InvalidProtocolBufferException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Object body = httpResponse.getBody();
            if (body instanceof byte[]) {
                UniversalResponseOuterClass.UniversalResponse from = UniversalResponseOuterClass.UniversalResponse.parseFrom((byte[]) body);
                e0.checkNotNullExpressionValue(from, "parseFrom(responseBody)");
                return from;
            }
            if (!(body instanceof String)) {
                throw new InvalidProtocolBufferException("Could not parse response from gateway service");
            }
            byte[] bytes = ((String) body).getBytes(sv.g.f86134b);
            e0.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            UniversalResponseOuterClass.UniversalResponse from2 = UniversalResponseOuterClass.UniversalResponse.parseFrom(bytes);
            e0.checkNotNullExpressionValue(from2, "parseFrom(\n             ….UTF_8)\n                )");
            return from2;
        } catch (InvalidProtocolBufferException e10) {
            DeviceLog.debug("Failed to parse response from gateway service with exception: %s", e10.getLocalizedMessage());
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_parse_failure", null, p1.mapOf(tu.e0.to("operation", operationType.toString()), tu.e0.to("reason", "protobuf_parsing"), tu.e0.to("reason_debug", httpResponse.getBody().toString())), null, null, null, 58, null);
            UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.Companion;
            UniversalResponseOuterClass.UniversalResponse.Builder builderNewBuilder = UniversalResponseOuterClass.UniversalResponse.newBuilder();
            e0.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
            UniversalResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
            ErrorKt.Dsl.Companion companion2 = ErrorKt.Dsl.Companion;
            ErrorOuterClass.Error.Builder builderNewBuilder2 = ErrorOuterClass.Error.newBuilder();
            e0.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
            ErrorKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
            dsl_create2.setErrorText("ERROR: Could not parse response from gateway service");
            dsl_create.setError(dsl_create2._build());
            return dsl_create._build();
        }
    }

    private final void sendNetworkErrorDiagnosticEvent(UnityAdsNetworkException unityAdsNetworkException, int i10, OperationType operationType, w wVar) {
        if (operationType == OperationType.UNIVERSAL_EVENT) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(wVar)), p1.mutableMapOf(tu.e0.to("operation", operationType.toString()), tu.e0.to("retries", String.valueOf(i10)), tu.e0.to("protocol", String.valueOf(unityAdsNetworkException.getProtocol())), tu.e0.to("network_client", String.valueOf(unityAdsNetworkException.getClient())), tu.e0.to("reason_code", String.valueOf(unityAdsNetworkException.getCode())), tu.e0.to("reason_debug", unityAdsNetworkException.getMessage())), null, null, null, 56, null);
    }

    private final void sendNetworkSuccessDiagnosticEvent(HttpResponse httpResponse, int i10, OperationType operationType, w wVar) {
        if (operationType == OperationType.UNIVERSAL_EVENT) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(wVar)), p1.mutableMapOf(tu.e0.to("operation", operationType.toString()), tu.e0.to("retries", String.valueOf(i10)), tu.e0.to("protocol", httpResponse.getProtocol()), tu.e0.to("network_client", httpResponse.getClient()), tu.e0.to("reason_code", String.valueOf(httpResponse.getStatusCode()))), null, null, null, 56, null);
    }

    private final boolean shouldRetry(int i10, long j10, int i11) {
        return 400 <= i10 && i10 < 600 && j10 < ((long) i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.unity3d.ads.gatewayclient.GatewayClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object request(java.lang.String r14, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r15, com.unity3d.ads.gatewayclient.RequestPolicy r16, com.unity3d.ads.core.data.model.OperationType r17, zu.d<? super gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> r18) throws com.unity3d.ads.core.data.model.exception.NetworkTimeoutException {
        /*
            r13 = this;
            r0 = r18
            boolean r1 = r0 instanceof com.unity3d.ads.gatewayclient.CommonGatewayClient.C38471
            if (r1 == 0) goto L15
            r1 = r0
            com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1 r1 = (com.unity3d.ads.gatewayclient.CommonGatewayClient.C38471) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1 r1 = new com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.result
            java.lang.Object r9 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r1.label
            r10 = 1
            if (r2 == 0) goto L37
            if (r2 != r10) goto L2f
            java.lang.Object r1 = r1.L$0
            com.unity3d.ads.gatewayclient.RequestPolicy r1 = (com.unity3d.ads.gatewayclient.RequestPolicy) r1
            tu.a0.throwOnFailure(r0)
            goto L5f
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            tu.a0.throwOnFailure(r0)
            tv.e r0 = tv.f.f87433c
            int r0 = r16.getMaxDuration()
            tv.i r2 = tv.i.f87441f
            long r11 = tv.h.toDuration(r0, r2)
            com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2 r2 = new com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2
            r8 = 0
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2.<init>(r4, r5, r6, r7, r8)
            r1.L$0 = r6
            r1.label = r10
            java.lang.Object r0 = kotlinx.coroutines.TimeoutKt.m5138withTimeoutOrNullKLykuaI(r11, r2, r1)
            if (r0 != r9) goto L5e
            return r9
        L5e:
            r1 = r6
        L5f:
            gatewayprotocol.v1.UniversalResponseOuterClass$UniversalResponse r0 = (gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) r0
            if (r0 == 0) goto L64
            return r0
        L64:
            com.unity3d.ads.core.data.model.exception.NetworkTimeoutException r2 = new com.unity3d.ads.core.data.model.exception.NetworkTimeoutException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Gateway request timed out after "
            r0.<init>(r3)
            int r1 = r1.getMaxDuration()
            r0.append(r1)
            java.lang.String r1 = "ms"
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            r10 = 126(0x7e, float:1.77E-43)
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.request(java.lang.String, gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, com.unity3d.ads.core.data.model.OperationType, zu.d):java.lang.Object");
    }
}
