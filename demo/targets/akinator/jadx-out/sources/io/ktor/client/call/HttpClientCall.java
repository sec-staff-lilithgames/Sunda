package io.ktor.client.call;

import bv.d;
import com.ironsource.Me;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.vungle.ads.internal.ui.AdActivity;
import io.ktor.client.HttpClient;
import io.ktor.client.request.DefaultHttpRequest;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.statement.DefaultHttpResponse;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.InternalAPI;
import io.ktor.utils.io.ByteReadChannel;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import tu.f;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class HttpClientCall implements CoroutineScope {
    public static final Companion Companion = new Companion(null);
    private static final AttributeKey<Object> CustomResponse = new AttributeKey<>("CustomResponse");
    private static final /* synthetic */ AtomicIntegerFieldUpdater received$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientCall.class, "received");
    private final boolean allowDoubleReceive;
    private final HttpClient client;
    private volatile /* synthetic */ int received;
    protected HttpRequest request;
    protected HttpResponse response;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final AttributeKey<Object> getCustomResponse() {
            return HttpClientCall.CustomResponse;
        }

        private Companion() {
        }

        @f
        public static /* synthetic */ void getCustomResponse$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", i = {}, l = {115}, m = "body", n = {}, s = {})
    /* renamed from: io.ktor.client.call.HttpClientCall$body$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientCall.this.body(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @bv.f(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", i = {0, 0, 1, 1}, l = {86, TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "bodyNullable", n = {"this", "info", "this", "info"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.client.call.HttpClientCall$bodyNullable$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38941 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C38941(zu.d<? super C38941> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientCall.this.bodyNullable(null, this);
        }
    }

    public HttpClientCall(HttpClient client) {
        e0.checkNotNullParameter(client, "client");
        this.client = client;
        this.received = 0;
    }

    public static /* synthetic */ Object getResponseContent$suspendImpl(HttpClientCall httpClientCall, zu.d<? super ByteReadChannel> dVar) {
        return httpClientCall.getResponse().getContent();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object body(io.ktor.util.reflect.TypeInfo r5, zu.d<java.lang.Object> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.call.HttpClientCall.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.call.HttpClientCall$body$1 r0 = (io.ktor.client.call.HttpClientCall.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.call.HttpClientCall$body$1 r0 = new io.ktor.client.call.HttpClientCall$body$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tu.a0.throwOnFailure(r6)
            r0.label = r3
            java.lang.Object r6 = r4.bodyNullable(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            kotlin.jvm.internal.e0.checkNotNull(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.call.HttpClientCall.body(io.ktor.util.reflect.TypeInfo, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        if (r7 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bodyNullable(io.ktor.util.reflect.TypeInfo r6, zu.d<java.lang.Object> r7) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.call.HttpClientCall.bodyNullable(io.ktor.util.reflect.TypeInfo, zu.d):java.lang.Object");
    }

    public boolean getAllowDoubleReceive() {
        return this.allowDoubleReceive;
    }

    public final Attributes getAttributes() {
        return getRequest().getAttributes();
    }

    public final HttpClient getClient() {
        return this.client;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public m getCoroutineContext() {
        return getResponse().getCoroutineContext();
    }

    public final HttpRequest getRequest() {
        HttpRequest httpRequest = this.request;
        if (httpRequest != null) {
            return httpRequest;
        }
        e0.throwUninitializedPropertyAccessException(AdActivity.REQUEST_KEY_EXTRA);
        return null;
    }

    public final HttpResponse getResponse() {
        HttpResponse httpResponse = this.response;
        if (httpResponse != null) {
            return httpResponse;
        }
        e0.throwUninitializedPropertyAccessException(Me.f34938n);
        return null;
    }

    public Object getResponseContent(zu.d<? super ByteReadChannel> dVar) {
        return getResponseContent$suspendImpl(this, dVar);
    }

    public final void setRequest(HttpRequest httpRequest) {
        e0.checkNotNullParameter(httpRequest, "<set-?>");
        this.request = httpRequest;
    }

    public final void setRequest$ktor_client_core(HttpRequest request) {
        e0.checkNotNullParameter(request, "request");
        setRequest(request);
    }

    public final void setResponse(HttpResponse httpResponse) {
        e0.checkNotNullParameter(httpResponse, "<set-?>");
        this.response = httpResponse;
    }

    public final void setResponse$ktor_client_core(HttpResponse response) {
        e0.checkNotNullParameter(response, "response");
        setResponse(response);
    }

    public String toString() {
        return "HttpClientCall[" + getRequest().getUrl() + ", " + getResponse().getStatus() + AbstractJsonLexerKt.END_LIST;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InternalAPI
    public HttpClientCall(HttpClient client, HttpRequestData requestData, HttpResponseData responseData) {
        this(client);
        e0.checkNotNullParameter(client, "client");
        e0.checkNotNullParameter(requestData, "requestData");
        e0.checkNotNullParameter(responseData, "responseData");
        setRequest(new DefaultHttpRequest(this, requestData));
        setResponse(new DefaultHttpResponse(this, responseData));
        if (responseData.getBody() instanceof ByteReadChannel) {
            return;
        }
        getAttributes().put(CustomResponse, responseData.getBody());
    }
}
