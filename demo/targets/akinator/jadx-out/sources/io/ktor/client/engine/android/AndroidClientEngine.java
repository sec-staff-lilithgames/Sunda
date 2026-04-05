package io.ktor.client.engine.android;

import bv.d;
import bv.f;
import io.ktor.client.engine.HttpClientEngineBase;
import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.request.HttpRequestData;
import io.ktor.util.date.GMTDate;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import uu.b2;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class AndroidClientEngine extends HttpClientEngineBase {
    private final AndroidEngineConfig config;
    private final Set<HttpClientEngineCapability<?>> supportedCapabilities;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.engine.android.AndroidClientEngine", f = "AndroidClientEngine.kt", i = {0, 0, 1, 1, 1}, l = {35, 79, 82}, m = "execute", n = {"this", "data", "data", "callContext", "requestTime"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: io.ktor.client.engine.android.AndroidClientEngine$execute$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidClientEngine.this.execute(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.engine.android.AndroidClientEngine$execute$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements l {
        final /* synthetic */ m $callContext;
        final /* synthetic */ HttpRequestData $data;
        final /* synthetic */ GMTDate $requestTime;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(m mVar, HttpRequestData httpRequestData, GMTDate gMTDate) {
            super(1);
            this.$callContext = mVar;
            this.$data = httpRequestData;
            this.$requestTime = gMTDate;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
        @Override // kv.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final io.ktor.client.request.HttpResponseData invoke(java.net.HttpURLConnection r11) throws java.io.IOException {
            /*
                r10 = this;
                java.lang.String r0 = "current"
                kotlin.jvm.internal.e0.checkNotNullParameter(r11, r0)
                int r0 = r11.getResponseCode()
                java.lang.String r1 = r11.getResponseMessage()
                if (r1 == 0) goto L16
                io.ktor.http.HttpStatusCode r2 = new io.ktor.http.HttpStatusCode
                r2.<init>(r0, r1)
            L14:
                r4 = r2
                goto L1d
            L16:
                io.ktor.http.HttpStatusCode$Companion r1 = io.ktor.http.HttpStatusCode.Companion
                io.ktor.http.HttpStatusCode r2 = r1.fromValue(r0)
                goto L14
            L1d:
                zu.m r0 = r10.$callContext
                io.ktor.client.request.HttpRequestData r1 = r10.$data
                io.ktor.utils.io.ByteReadChannel r8 = io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.content(r11, r0, r1)
                java.util.Map r11 = r11.getHeaderFields()
                java.lang.String r0 = "current.headerFields"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r11, r0)
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                int r1 = r11.size()
                int r1 = uu.o1.mapCapacity(r1)
                r0.<init>(r1)
                java.util.Set r11 = r11.entrySet()
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.Iterator r11 = r11.iterator()
            L45:
                boolean r1 = r11.hasNext()
                if (r1 == 0) goto L7c
                java.lang.Object r1 = r11.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L72
                java.lang.String r3 = "key"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, r3)
                java.util.Locale r3 = java.util.Locale.getDefault()
                java.lang.String r5 = "getDefault()"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r5)
                java.lang.String r2 = r2.toLowerCase(r3)
                java.lang.String r3 = "this as java.lang.String).toLowerCase(locale)"
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, r3)
                if (r2 != 0) goto L74
            L72:
                java.lang.String r2 = ""
            L74:
                java.lang.Object r1 = r1.getValue()
                r0.put(r2, r1)
                goto L45
            L7c:
                java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
                r11.<init>()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L89:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto Lad
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = sv.n0.isBlank(r2)
                if (r2 != 0) goto L89
                java.lang.Object r2 = r1.getKey()
                java.lang.Object r1 = r1.getValue()
                r11.put(r2, r1)
                goto L89
            Lad:
                io.ktor.http.HttpProtocolVersion$Companion r0 = io.ktor.http.HttpProtocolVersion.Companion
                io.ktor.http.HttpProtocolVersion r7 = r0.getHTTP_1_1()
                io.ktor.http.HeadersImpl r6 = new io.ktor.http.HeadersImpl
                r6.<init>(r11)
                io.ktor.client.request.HttpResponseData r3 = new io.ktor.client.request.HttpResponseData
                io.ktor.util.date.GMTDate r5 = r10.$requestTime
                zu.m r9 = r10.$callContext
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.android.AndroidClientEngine.AnonymousClass2.invoke(java.net.HttpURLConnection):io.ktor.client.request.HttpResponseData");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidClientEngine(AndroidEngineConfig config) {
        super("ktor-android");
        e0.checkNotNullParameter(config, "config");
        this.config = config;
        this.supportedCapabilities = b2.setOf(HttpTimeout.Plugin);
    }

    private final HttpURLConnection getProxyAwareConnection(String str) throws IOException {
        URL url = new URL(str);
        Proxy proxy = getConfig().getProxy();
        URLConnection uRLConnectionOpenConnection = proxy != null ? url.openConnection(proxy) : null;
        if (uRLConnectionOpenConnection == null) {
            uRLConnectionOpenConnection = url.openConnection();
            e0.checkNotNullExpressionValue(uRLConnectionOpenConnection, "url.openConnection()");
        }
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0192 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // io.ktor.client.engine.HttpClientEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(io.ktor.client.request.HttpRequestData r19, zu.d<? super io.ktor.client.request.HttpResponseData> r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.android.AndroidClientEngine.execute(io.ktor.client.request.HttpRequestData, zu.d):java.lang.Object");
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, io.ktor.client.engine.HttpClientEngine
    public Set<HttpClientEngineCapability<?>> getSupportedCapabilities() {
        return this.supportedCapabilities;
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public AndroidEngineConfig getConfig() {
        return this.config;
    }
}
