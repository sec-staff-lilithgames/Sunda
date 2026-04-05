package io.ktor.client.plugins.cookies;

import bv.d;
import bv.f;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kv.l;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpCookies implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final AttributeKey<HttpCookies> key = new AttributeKey<>("HttpCookies");
    private final List<p> defaults;
    private final Job initializer;
    private final CookiesStorage storage;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion implements HttpClientPlugin<Config, HttpCookies> {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<HttpCookies> getKey() {
            return HttpCookies.key;
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpCookies plugin, HttpClient scope) {
            e0.checkNotNullParameter(plugin, "plugin");
            e0.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.Phases.getState(), new HttpCookies$Companion$install$1(plugin, null));
            scope.getSendPipeline().intercept(HttpSendPipeline.Phases.getState(), new HttpCookies$Companion$install$2(plugin, null));
            scope.getReceivePipeline().intercept(HttpReceivePipeline.Phases.getState(), new HttpCookies$Companion$install$3(plugin, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpCookies prepare(l block) {
            e0.checkNotNullParameter(block, "block");
            Config config = new Config();
            block.invoke(config);
            return config.build$ktor_client_core();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @KtorDsl
    public static final class Config {
        private final List<p> defaults = new ArrayList();
        private CookiesStorage storage = new AcceptAllCookiesStorage();

        public final HttpCookies build$ktor_client_core() {
            return new HttpCookies(this.storage, this.defaults);
        }

        /* renamed from: default, reason: not valid java name */
        public final void m4280default(p block) {
            e0.checkNotNullParameter(block, "block");
            this.defaults.add(block);
        }

        public final CookiesStorage getStorage() {
            return this.storage;
        }

        public final void setStorage(CookiesStorage cookiesStorage) {
            e0.checkNotNullParameter(cookiesStorage, "<set-?>");
            this.storage = cookiesStorage;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", i = {0, 0}, l = {39, 40}, m = "get", n = {"this", IronSourceConstants.REQUEST_URL}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.plugins.cookies.HttpCookies$get$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
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
            return HttpCookies.this.get(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpCookies(CookiesStorage storage, List<? extends p> defaults) {
        e0.checkNotNullParameter(storage, "storage");
        e0.checkNotNullParameter(defaults, "defaults");
        this.storage = storage;
        this.defaults = defaults;
        this.initializer = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getUnconfined(), null, new HttpCookies$initializer$1(this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object captureHeaderCookies$ktor_client_core(io.ktor.client.request.HttpRequestBuilder r23, zu.d<? super tu.x0> r24) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookies.captureHeaderCookies$ktor_client_core(io.ktor.client.request.HttpRequestBuilder, zu.d):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.storage.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(io.ktor.http.Url r6, zu.d<? super java.util.List<io.ktor.http.Cookie>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.client.plugins.cookies.HttpCookies.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.plugins.cookies.HttpCookies$get$1 r0 = (io.ktor.client.plugins.cookies.HttpCookies.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.HttpCookies$get$1 r0 = new io.ktor.client.plugins.cookies.HttpCookies$get$1
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
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            io.ktor.http.Url r6 = (io.ktor.http.Url) r6
            java.lang.Object r2 = r0.L$0
            io.ktor.client.plugins.cookies.HttpCookies r2 = (io.ktor.client.plugins.cookies.HttpCookies) r2
            tu.a0.throwOnFailure(r7)
            goto L53
        L40:
            tu.a0.throwOnFailure(r7)
            kotlinx.coroutines.Job r7 = r5.initializer
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.join(r0)
            if (r7 != r1) goto L52
            goto L62
        L52:
            r2 = r5
        L53:
            io.ktor.client.plugins.cookies.CookiesStorage r7 = r2.storage
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r6 = r7.get(r6, r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookies.get(io.ktor.http.Url, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveCookiesFrom$ktor_client_core(io.ktor.client.statement.HttpResponse r9, zu.d<? super tu.x0> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1 r0 = (io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1 r0 = new io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.L$2
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r2 = r0.L$1
            io.ktor.http.Url r2 = (io.ktor.http.Url) r2
            java.lang.Object r4 = r0.L$0
            io.ktor.client.plugins.cookies.HttpCookies r4 = (io.ktor.client.plugins.cookies.HttpCookies) r4
            tu.a0.throwOnFailure(r10)
            goto L99
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            tu.a0.throwOnFailure(r10)
            io.ktor.client.request.HttpRequest r10 = io.ktor.client.statement.HttpResponseKt.getRequest(r9)
            io.ktor.http.Url r10 = r10.getUrl()
            io.ktor.http.Headers r2 = r9.getHeaders()
            io.ktor.http.HttpHeaders r4 = io.ktor.http.HttpHeaders.INSTANCE
            java.lang.String r4 = r4.getSetCookie()
            java.util.List r2 = r2.getAll(r4)
            if (r2 == 0) goto L8d
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L5e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L8d
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            bx.a r5 = io.ktor.client.plugins.cookies.HttpCookiesKt.access$getLOGGER$p()
            java.lang.String r6 = "Received cookie "
            java.lang.String r7 = " in response for "
            java.lang.StringBuilder r4 = e3.g.o(r6, r4, r7)
            io.ktor.client.call.HttpClientCall r6 = r9.getCall()
            io.ktor.client.request.HttpRequest r6 = r6.getRequest()
            io.ktor.http.Url r6 = r6.getUrl()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r5.trace(r4)
            goto L5e
        L8d:
            java.util.List r9 = io.ktor.http.HttpMessagePropertiesKt.setCookie(r9)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r4 = r8
            r2 = r10
        L99:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lb6
            java.lang.Object r10 = r9.next()
            io.ktor.http.Cookie r10 = (io.ktor.http.Cookie) r10
            io.ktor.client.plugins.cookies.CookiesStorage r5 = r4.storage
            r0.L$0 = r4
            r0.L$1 = r2
            r0.L$2 = r9
            r0.label = r3
            java.lang.Object r10 = r5.addCookie(r2, r10, r0)
            if (r10 != r1) goto L99
            return r1
        Lb6:
            tu.x0 r9 = tu.x0.f87415a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookies.saveCookiesFrom$ktor_client_core(io.ktor.client.statement.HttpResponse, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendCookiesWith$ktor_client_core(io.ktor.client.request.HttpRequestBuilder r5, zu.d<? super tu.x0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1 r0 = (io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1 r0 = new io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            io.ktor.client.request.HttpRequestBuilder r5 = (io.ktor.client.request.HttpRequestBuilder) r5
            tu.a0.throwOnFailure(r6)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            tu.a0.throwOnFailure(r6)
            io.ktor.http.URLBuilder r6 = r5.getUrl()
            io.ktor.http.URLBuilder r6 = io.ktor.http.URLBuilderKt.clone(r6)
            io.ktor.http.Url r6 = r6.build()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.get(r6, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            java.util.List r6 = (java.util.List) r6
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L86
            java.lang.String r6 = io.ktor.client.plugins.cookies.HttpCookiesKt.access$renderClientCookies(r6)
            io.ktor.http.HeadersBuilder r0 = r5.getHeaders()
            io.ktor.http.HttpHeaders r1 = io.ktor.http.HttpHeaders.INSTANCE
            java.lang.String r1 = r1.getCookie()
            r0.set(r1, r6)
            bx.a r0 = io.ktor.client.plugins.cookies.HttpCookiesKt.access$getLOGGER$p()
            java.lang.String r1 = "Sending cookie "
            java.lang.String r2 = " for "
            java.lang.StringBuilder r6 = e3.g.o(r1, r6, r2)
            io.ktor.http.URLBuilder r5 = r5.getUrl()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.trace(r5)
            goto L93
        L86:
            io.ktor.http.HeadersBuilder r5 = r5.getHeaders()
            io.ktor.http.HttpHeaders r6 = io.ktor.http.HttpHeaders.INSTANCE
            java.lang.String r6 = r6.getCookie()
            r5.remove(r6)
        L93:
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookies.sendCookiesWith$ktor_client_core(io.ktor.client.request.HttpRequestBuilder, zu.d):java.lang.Object");
    }

    private static /* synthetic */ void getInitializer$annotations() {
    }
}
