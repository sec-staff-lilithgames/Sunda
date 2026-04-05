package io.ktor.client.statement;

import av.e;
import bv.d;
import bv.f;
import bv.n;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.Me;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.call.SavedCallKt;
import io.ktor.client.engine.HttpClientEngineCapabilityKt;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpStatement {
    private final HttpRequestBuilder builder;
    private final HttpClient client;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {}, l = {126}, m = "cleanup", n = {}, s = {})
    /* renamed from: io.ktor.client.statement.HttpStatement$cleanup$1, reason: invalid class name */
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
            return HttpStatement.this.cleanup(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {0, 0, 1, 1}, l = {47, 50, 52, 52}, m = "execute", n = {"this", "block", "this", Me.f34938n}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: io.ktor.client.statement.HttpStatement$execute$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39801<T> extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C39801(zu.d<? super C39801> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpStatement.this.execute(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.statement.HttpStatement$execute$4", f = "HttpStatement.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.statement.HttpStatement$execute$4, reason: invalid class name */
    public static final class AnonymousClass4 extends n implements p {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass4(zu.d<? super AnonymousClass4> dVar) {
            super(2, dVar);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(dVar);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kv.p
        public final Object invoke(HttpResponse httpResponse, zu.d<? super HttpResponse> dVar) {
            return ((AnonymousClass4) create(httpResponse, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                HttpClientCall call = ((HttpResponse) this.L$0).getCall();
                this.label = 1;
                obj = SavedCallKt.save(call, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return ((HttpClientCall) obj).getResponse();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {}, l = {108}, m = "executeUnsafe", n = {}, s = {})
    /* renamed from: io.ktor.client.statement.HttpStatement$executeUnsafe$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39811 extends d {
        int label;
        /* synthetic */ Object result;

        public C39811(zu.d<? super C39811> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpStatement.this.executeUnsafe(this);
        }
    }

    public HttpStatement(HttpRequestBuilder builder, HttpClient client) {
        e0.checkNotNullParameter(builder, "builder");
        e0.checkNotNullParameter(client, "client");
        this.builder = builder;
        this.client = client;
        checkCapabilities();
    }

    private final void checkCapabilities() {
        Set setKeySet;
        Map map = (Map) this.builder.getAttributes().getOrNull(HttpClientEngineCapabilityKt.getENGINE_CAPABILITIES_KEY());
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        ArrayList<HttpClientPlugin> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (obj instanceof HttpClientPlugin) {
                arrayList.add(obj);
            }
        }
        for (HttpClientPlugin httpClientPlugin : arrayList) {
            if (HttpClientPluginKt.pluginOrNull(this.client, httpClientPlugin) == null) {
                throw new IllegalArgumentException(("Consider installing " + httpClientPlugin + " plugin because the request requires it to be installed").toString());
            }
        }
    }

    public final /* synthetic */ <T> Object body(zu.d<? super T> dVar) throws Throwable {
        try {
            b0.mark(3);
            b0.mark(0);
            Object objExecuteUnsafe = executeUnsafe(null);
            b0.mark(1);
            HttpResponse httpResponse = (HttpResponse) objExecuteUnsafe;
            try {
                b0.mark(3);
                HttpClientCall call = httpResponse.getCall();
                e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
                Type javaType = TypesJVMKt.getJavaType((KType) null);
                e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
                TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, c1.getOrCreateKotlinClass(Object.class), null);
                b0.mark(0);
                Object objBodyNullable = call.bodyNullable(typeInfoTypeInfoImpl, null);
                b0.mark(1);
                e0.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
                return objBodyNullable;
            } finally {
                b0.finallyStart(1);
                HttpResponseKt.complete(httpResponse);
                b0.finallyEnd(1);
            }
        } catch (CancellationException e10) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cleanup(io.ktor.client.statement.HttpResponse r5, zu.d<? super tu.x0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.statement.HttpStatement.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.statement.HttpStatement$cleanup$1 r0 = (io.ktor.client.statement.HttpStatement.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpStatement$cleanup$1 r0 = new io.ktor.client.statement.HttpStatement$cleanup$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.CompletableJob r5 = (kotlinx.coroutines.CompletableJob) r5
            tu.a0.throwOnFailure(r6)
            goto L5c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            tu.a0.throwOnFailure(r6)
            zu.m r6 = r5.getCoroutineContext()
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key
            zu.k r6 = r6.get(r2)
            kotlin.jvm.internal.e0.checkNotNull(r6)
            kotlinx.coroutines.CompletableJob r6 = (kotlinx.coroutines.CompletableJob) r6
            r6.complete()
            io.ktor.utils.io.ByteReadChannel r5 = r5.getContent()     // Catch: java.lang.Throwable -> L51
            io.ktor.utils.io.ByteReadChannelKt.cancel(r5)     // Catch: java.lang.Throwable -> L51
        L51:
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = r6.join(r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpStatement.cleanup(io.ktor.client.statement.HttpResponse, zu.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|53|(1:(1:(1:(1:(2:14|15)(3:16|17|50))(3:21|22|23))(5:24|54|25|42|(2:44|49)(1:45)))(2:29|30))(3:32|33|(2:35|49)(1:36))|37|56|38|(3:41|42|(0)(0))|49|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0097, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        if (r2.cleanup(r11, r0) == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object execute(kv.p r10, zu.d<? super T> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof io.ktor.client.statement.HttpStatement.C39801
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.client.statement.HttpStatement$execute$1 r0 = (io.ktor.client.statement.HttpStatement.C39801) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpStatement$execute$1 r0 = new io.ktor.client.statement.HttpStatement$execute$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L66
            if (r2 == r7) goto L5a
            if (r2 == r6) goto L49
            if (r2 == r5) goto L43
            if (r2 == r4) goto L37
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            java.lang.Object r10 = r0.L$0
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            tu.a0.throwOnFailure(r11)     // Catch: java.util.concurrent.CancellationException -> L40
            goto La5
        L40:
            r10 = move-exception
            goto La6
        L43:
            java.lang.Object r10 = r0.L$0
            tu.a0.throwOnFailure(r11)     // Catch: java.util.concurrent.CancellationException -> L40
            return r10
        L49:
            java.lang.Object r10 = r0.L$1
            io.ktor.client.statement.HttpResponse r10 = (io.ktor.client.statement.HttpResponse) r10
            java.lang.Object r2 = r0.L$0
            io.ktor.client.statement.HttpStatement r2 = (io.ktor.client.statement.HttpStatement) r2
            tu.a0.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L55
            goto L89
        L55:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto L98
        L5a:
            java.lang.Object r10 = r0.L$1
            kv.p r10 = (kv.p) r10
            java.lang.Object r2 = r0.L$0
            io.ktor.client.statement.HttpStatement r2 = (io.ktor.client.statement.HttpStatement) r2
            tu.a0.throwOnFailure(r11)     // Catch: java.util.concurrent.CancellationException -> L40
            goto L77
        L66:
            tu.a0.throwOnFailure(r11)
            r0.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> L40
            r0.L$1 = r10     // Catch: java.util.concurrent.CancellationException -> L40
            r0.label = r7     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r11 = r9.executeUnsafe(r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r11 != r1) goto L76
            goto La4
        L76:
            r2 = r9
        L77:
            io.ktor.client.statement.HttpResponse r11 = (io.ktor.client.statement.HttpResponse) r11     // Catch: java.util.concurrent.CancellationException -> L40
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L97
            r0.L$1 = r11     // Catch: java.lang.Throwable -> L97
            r0.label = r6     // Catch: java.lang.Throwable -> L97
            java.lang.Object r10 = r10.invoke(r11, r0)     // Catch: java.lang.Throwable -> L97
            if (r10 != r1) goto L86
            goto La4
        L86:
            r8 = r11
            r11 = r10
            r10 = r8
        L89:
            r0.L$0 = r11     // Catch: java.util.concurrent.CancellationException -> L40
            r0.L$1 = r3     // Catch: java.util.concurrent.CancellationException -> L40
            r0.label = r5     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r10 = r2.cleanup(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r10 != r1) goto L96
            goto La4
        L96:
            return r11
        L97:
            r10 = move-exception
        L98:
            r0.L$0 = r10     // Catch: java.util.concurrent.CancellationException -> L40
            r0.L$1 = r3     // Catch: java.util.concurrent.CancellationException -> L40
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r11 = r2.cleanup(r11, r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r11 != r1) goto La5
        La4:
            return r1
        La5:
            throw r10     // Catch: java.util.concurrent.CancellationException -> L40
        La6:
            java.lang.Throwable r10 = io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpStatement.execute(kv.p, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeUnsafe(zu.d<? super io.ktor.client.statement.HttpResponse> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.client.statement.HttpStatement.C39811
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.client.statement.HttpStatement$executeUnsafe$1 r0 = (io.ktor.client.statement.HttpStatement.C39811) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.statement.HttpStatement$executeUnsafe$1 r0 = new io.ktor.client.statement.HttpStatement$executeUnsafe$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            tu.a0.throwOnFailure(r5)     // Catch: java.util.concurrent.CancellationException -> L29
            goto L4c
        L29:
            r5 = move-exception
            goto L53
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            tu.a0.throwOnFailure(r5)
            io.ktor.client.request.HttpRequestBuilder r5 = new io.ktor.client.request.HttpRequestBuilder     // Catch: java.util.concurrent.CancellationException -> L29
            r5.<init>()     // Catch: java.util.concurrent.CancellationException -> L29
            io.ktor.client.request.HttpRequestBuilder r2 = r4.builder     // Catch: java.util.concurrent.CancellationException -> L29
            io.ktor.client.request.HttpRequestBuilder r5 = r5.takeFromWithExecutionContext(r2)     // Catch: java.util.concurrent.CancellationException -> L29
            io.ktor.client.HttpClient r2 = r4.client     // Catch: java.util.concurrent.CancellationException -> L29
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r2.execute$ktor_client_core(r5, r0)     // Catch: java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L4c
            return r1
        L4c:
            io.ktor.client.call.HttpClientCall r5 = (io.ktor.client.call.HttpClientCall) r5     // Catch: java.util.concurrent.CancellationException -> L29
            io.ktor.client.statement.HttpResponse r5 = r5.getResponse()     // Catch: java.util.concurrent.CancellationException -> L29
            return r5
        L53:
            java.lang.Throwable r5 = io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.statement.HttpStatement.executeUnsafe(zu.d):java.lang.Object");
    }

    public final HttpClient getClient() {
        return this.client;
    }

    public String toString() {
        return "HttpStatement[" + this.builder.getUrl() + AbstractJsonLexerKt.END_LIST;
    }

    public final Object execute(zu.d<? super HttpResponse> dVar) {
        return execute(new AnonymousClass4(null), dVar);
    }

    public final /* synthetic */ <T, R> Object body(p pVar, zu.d<? super R> dVar) throws Throwable {
        try {
            b0.mark(3);
            b0.mark(0);
            Object objExecuteUnsafe = executeUnsafe(null);
            b0.mark(1);
            HttpResponse httpResponse = (HttpResponse) objExecuteUnsafe;
            try {
                b0.mark(3);
                HttpClientCall call = httpResponse.getCall();
                e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
                Type javaType = TypesJVMKt.getJavaType((KType) null);
                e0.reifiedOperationMarker(4, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
                TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(javaType, c1.getOrCreateKotlinClass(Object.class), null);
                b0.mark(0);
                Object objBodyNullable = call.bodyNullable(typeInfoTypeInfoImpl, null);
                b0.mark(1);
                e0.reifiedOperationMarker(1, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
                b0.mark(3);
                return pVar.invoke(objBodyNullable, null);
            } finally {
                b0.finallyStart(1);
                b0.mark(3);
                b0.mark(0);
                cleanup(httpResponse, null);
                b0.mark(1);
                b0.finallyEnd(1);
            }
        } catch (CancellationException e10) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e10);
        }
    }

    public static /* synthetic */ void getClient$annotations() {
    }
}
