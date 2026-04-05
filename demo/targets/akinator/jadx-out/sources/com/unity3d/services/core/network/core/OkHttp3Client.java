package com.unity3d.services.core.network.core;

import android.content.Context;
import av.e;
import bv.b;
import bv.f;
import bv.h;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gv.o;
import gv.s;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import sv.g;
import tu.a0;
import tu.x0;
import tu.z;
import xv.j;
import xv.k;
import xv.l0;
import xv.o0;
import xv.v0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OkHttp3Client implements HttpClient {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final String NETWORK_CLIENT_OKHTTP = "okhttp";
    private final CleanupDirectory cleanupDirectory;
    private final l0 client;
    private final Context context;
    private final ISDKDispatchers dispatchers;
    private final AlternativeFlowReader isAlternativeFlowReader;
    private final File okHttpCache;
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
    public static final class RequestComplete {
        private final Object body;
        private final v0 response;

        public RequestComplete(v0 response, Object obj) {
            e0.checkNotNullParameter(response, "response");
            this.response = response;
            this.body = obj;
        }

        public static /* synthetic */ RequestComplete copy$default(RequestComplete requestComplete, v0 v0Var, Object obj, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                v0Var = requestComplete.response;
            }
            if ((i10 & 2) != 0) {
                obj = requestComplete.body;
            }
            return requestComplete.copy(v0Var, obj);
        }

        public final v0 component1() {
            return this.response;
        }

        public final Object component2() {
            return this.body;
        }

        public final RequestComplete copy(v0 response, Object obj) {
            e0.checkNotNullParameter(response, "response");
            return new RequestComplete(response, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestComplete)) {
                return false;
            }
            RequestComplete requestComplete = (RequestComplete) obj;
            return e0.areEqual(this.response, requestComplete.response) && e0.areEqual(this.body, requestComplete.body);
        }

        public final Object getBody() {
            return this.body;
        }

        public final v0 getResponse() {
            return this.response;
        }

        public int hashCode() {
            int iHashCode = this.response.hashCode() * 31;
            Object obj = this.body;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "RequestComplete(response=" + this.response + ", body=" + this.body + ')';
        }

        public /* synthetic */ RequestComplete(v0 v0Var, Object obj, int i10, u uVar) {
            this(v0Var, (i10 & 2) != 0 ? null : obj);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.core.network.core.OkHttp3Client$execute$2", f = "OkHttp3Client.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.core.network.core.OkHttp3Client$execute$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HttpRequest httpRequest, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$request = httpRequest;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return OkHttp3Client.this.new AnonymousClass2(this.$request, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, UnityAdsNetworkException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Object objMakeRequest;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    OkHttp3Client okHttp3Client = OkHttp3Client.this;
                    HttpRequest httpRequest = this.$request;
                    long connectTimeout = httpRequest.getConnectTimeout();
                    long readTimeout = this.$request.getReadTimeout();
                    long writeTimeout = this.$request.getWriteTimeout();
                    this.label = 1;
                    objMakeRequest = okHttp3Client.makeRequest(httpRequest, connectTimeout, readTimeout, writeTimeout, this);
                    if (objMakeRequest == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                    objMakeRequest = obj;
                }
                RequestComplete requestComplete = (RequestComplete) objMakeRequest;
                v0 v0VarComponent1 = requestComplete.component1();
                String strComponent2 = requestComplete.component2();
                if (!OkHttp3Client.this.isAlternativeFlowReader.invoke()) {
                    strComponent2 = strComponent2 instanceof File ? o.readText$default((File) strComponent2, null, 1, null) : strComponent2 instanceof byte[] ? new String((byte[]) strComponent2, g.f86134b) : "";
                }
                int iCode = v0VarComponent1.code();
                Map<String, List<String>> multimap = v0VarComponent1.headers().toMultimap();
                String string = v0VarComponent1.request().url().toString();
                Object obj2 = strComponent2 == null ? "" : strComponent2;
                String string2 = v0VarComponent1.protocol().toString();
                e0.checkNotNullExpressionValue(multimap, "toMultimap()");
                e0.checkNotNullExpressionValue(string, "toString()");
                e0.checkNotNullExpressionValue(string2, "toString()");
                return new HttpResponse(obj2, iCode, multimap, string, string2, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 0L, 64, null);
            } catch (SocketTimeoutException unused) {
                throw new NetworkTimeoutException("Network request timeout", null, null, this.$request.getBaseURL(), null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 54, null);
            } catch (IOException unused2) {
                throw new UnityAdsNetworkException("Network request failed", null, null, this.$request.getBaseURL(), null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 54, null);
            }
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super HttpResponse> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1", f = "OkHttp3Client.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpRequest httpRequest, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$request = httpRequest;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return OkHttp3Client.this.new AnonymousClass1(this.$request, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
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
            OkHttp3Client okHttp3Client = OkHttp3Client.this;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            Object objExecute = okHttp3Client.execute(httpRequest, this);
            return objExecute == coroutine_suspended ? coroutine_suspended : objExecute;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super HttpResponse> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public OkHttp3Client(ISDKDispatchers dispatchers, l0 client, Context context, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, AlternativeFlowReader isAlternativeFlowReader) {
        e0.checkNotNullParameter(dispatchers, "dispatchers");
        e0.checkNotNullParameter(client, "client");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(sessionRepository, "sessionRepository");
        e0.checkNotNullParameter(cleanupDirectory, "cleanupDirectory");
        e0.checkNotNullParameter(isAlternativeFlowReader, "isAlternativeFlowReader");
        this.dispatchers = dispatchers;
        this.client = client;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.isAlternativeFlowReader = isAlternativeFlowReader;
        this.okHttpCache = getOkHttpCache();
    }

    private final File getOkHttpCache() {
        File filesDir = this.context.getFilesDir();
        e0.checkNotNullExpressionValue(filesDir, "context.filesDir");
        File fileResolve = s.resolve(filesDir, UnityAdsConstants.DefaultUrls.HTTP_CACHE_DIR_NAME);
        fileResolve.mkdirs();
        if (this.sessionRepository.getNativeConfiguration().hasCachedAssetsConfiguration()) {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = this.sessionRepository.getNativeConfiguration().getCachedAssetsConfiguration();
            this.cleanupDirectory.invoke(fileResolve, cachedAssetsConfiguration.getMaxCachedAssetSizeMb(), cachedAssetsConfiguration.getMaxCachedAssetAgeMs());
        }
        return fileResolve;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object makeRequest(final HttpRequest httpRequest, long j10, long j11, long j12, d<? super RequestComplete> dVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        o0 okHttpProtoRequest = httpRequest.isProtobuf() ? HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest) : HttpRequestToOkHttpRequestKt.toOkHttpRequest(httpRequest);
        l0.a aVarNewBuilder = this.client.newBuilder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l0 l0VarBuild = aVarNewBuilder.connectTimeout(j10, timeUnit).readTimeout(j11, timeUnit).writeTimeout(j12, timeUnit).build();
        final File file = new File(this.okHttpCache, StringExtensionsKt.getSHA256Hash(httpRequest.getBaseURL()));
        Long lBoxLong = b.boxLong((file.exists() && file.isFile()) ? file.length() : 0L);
        o0 o0VarBuild = null;
        if (lBoxLong.longValue() <= 0) {
            lBoxLong = null;
        }
        if (lBoxLong != null) {
            long jLongValue = lBoxLong.longValue();
            DeviceLog.debug("Resuming download for " + httpRequest.getBaseURL());
            o0VarBuild = okHttpProtoRequest.newBuilder().addHeader(Command.HTTP_HEADER_RANGE, "bytes=" + jLongValue + '-').build();
        }
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        if (o0VarBuild != null) {
            okHttpProtoRequest = o0VarBuild;
        }
        l0VarBuild.newCall(okHttpProtoRequest).enqueue(new k() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1
            @Override // xv.k
            public void onFailure(j call, IOException e10) {
                e0.checkNotNullParameter(call, "call");
                e0.checkNotNullParameter(e10, "e");
                CancellableContinuation<OkHttp3Client.RequestComplete> cancellableContinuation = cancellableContinuationImpl;
                int i10 = z.f87419c;
                cancellableContinuation.resumeWith(z.m7131constructorimpl(a0.createFailure(e10)));
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
            @Override // xv.k
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onResponse(xv.j r14, xv.v0 r15) throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 337
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1.onResponse(xv.j, xv.v0):void");
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, d<? super HttpResponse> dVar) {
        return BuildersKt.withContext(this.dispatchers.getIo(), new AnonymousClass2(httpRequest, null), dVar);
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        e0.checkNotNullParameter(request, "request");
        return (HttpResponse) BuildersKt.runBlocking(this.dispatchers.getIo(), new AnonymousClass1(request, null));
    }
}
