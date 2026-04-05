package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.util.Patterns;
import com.moloco.sdk.internal.MolocoLogger;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.ContentType;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.reflect.TypeInfoJvmKt;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import sv.n0;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class f {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f50279i;

        /* renamed from: j, reason: collision with root package name */
        public int f50280j;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f50279i = obj;
            this.f50280j |= Integer.MIN_VALUE;
            return f.a(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f50281i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ HttpClient f50282j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f50283k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HttpClient httpClient, String str, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f50282j = httpClient;
            this.f50283k = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Boolean> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new b(this.f50282j, this.f50283k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f50281i;
            boolean z10 = true;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                HttpRequestKt.url(httpRequestBuilder, this.f50283k);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.b.a(httpRequestBuilder, 5000L);
                httpRequestBuilder.setMethod(HttpMethod.Companion.getGet());
                HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, this.f50282j);
                this.f50281i = 1;
                obj = httpStatement.execute(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            HttpStatusCode status = ((HttpResponse) obj).getStatus();
            HttpStatusCode.Companion companion = HttpStatusCode.Companion;
            if (!e0.areEqual(status, companion.getOK()) && !e0.areEqual(status, companion.getNoContent())) {
                z10 = false;
            }
            return bv.b.boxBoolean(z10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f50284i;

        /* renamed from: j, reason: collision with root package name */
        public int f50285j;

        public c(zu.d<? super c> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f50284i = obj;
            this.f50285j |= Integer.MIN_VALUE;
            return f.a(null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f50286i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ HttpClient f50287j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f50288k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f50289l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ byte[] f50290m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ContentType f50291n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HttpClient httpClient, String str, String str2, byte[] bArr, ContentType contentType, zu.d<? super d> dVar) {
            super(2, dVar);
            this.f50287j = httpClient;
            this.f50288k = str;
            this.f50289l = str2;
            this.f50290m = bArr;
            this.f50291n = contentType;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Boolean> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new d(this.f50287j, this.f50288k, this.f50289l, this.f50290m, this.f50291n, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f50286i;
            String str = this.f50288k;
            boolean z10 = true;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                HttpRequestKt.url(httpRequestBuilder, str);
                String str2 = this.f50289l;
                if (str2 != null && (!n0.isBlank(str2))) {
                    HttpRequestKt.headers(httpRequestBuilder, new ba.d(str2, 8));
                }
                byte[] bArr = this.f50290m;
                if (bArr == null) {
                    httpRequestBuilder.setBody(NullBody.INSTANCE);
                    KType kTypeTypeOf = c1.typeOf(byte[].class);
                    httpRequestBuilder.setBodyType(TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(kTypeTypeOf), c1.getOrCreateKotlinClass(byte[].class), kTypeTypeOf));
                } else if (bArr instanceof OutgoingContent) {
                    httpRequestBuilder.setBody(bArr);
                    httpRequestBuilder.setBodyType(null);
                } else {
                    httpRequestBuilder.setBody(bArr);
                    KType kTypeTypeOf2 = c1.typeOf(byte[].class);
                    httpRequestBuilder.setBodyType(TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(kTypeTypeOf2), c1.getOrCreateKotlinClass(byte[].class), kTypeTypeOf2));
                }
                HttpMessagePropertiesKt.contentType(httpRequestBuilder, this.f50291n);
                com.moloco.sdk.xenoss.sdkdevkit.android.core.b.a(httpRequestBuilder, 5000L);
                httpRequestBuilder.setMethod(HttpMethod.Companion.getPost());
                HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, this.f50287j);
                this.f50286i = 1;
                obj = httpStatement.execute(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            HttpStatusCode status = ((HttpResponse) obj).getStatus();
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "HttpClient", "Response status: " + status + " for url: " + str, false, 4, null);
            HttpStatusCode.Companion companion = HttpStatusCode.Companion;
            if (!e0.areEqual(status, companion.getOK()) && !e0.areEqual(status, companion.getNoContent())) {
                z10 = false;
            }
            return bv.b.boxBoolean(z10);
        }

        public static final x0 a(String str, HeadersBuilder headersBuilder) {
            headersBuilder.append(HttpHeaders.INSTANCE.getContentEncoding(), str);
            return x0.f87415a;
        }
    }

    public static final boolean a(String str) {
        e0.checkNotNullParameter(str, "<this>");
        boolean zMatches = Patterns.WEB_URL.matcher(str).matches();
        if (!zMatches) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "HttpRequestClient", a.b.k("URL is invalid. ", str), null, false, 12, null);
        }
        return zMatches;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(io.ktor.client.HttpClient r5, java.lang.String r6, zu.d<? super java.lang.Boolean> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.a
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.a) r0
            int r1 = r0.f50280j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50280j = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f50279i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f50280j
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r7)     // Catch: java.lang.Exception -> L52
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tu.a0.throwOnFailure(r7)
            com.moloco.sdk.internal.scheduling.a r7 = com.moloco.sdk.internal.scheduling.c.a()     // Catch: java.lang.Exception -> L52
            zu.m r7 = r7.getIo()     // Catch: java.lang.Exception -> L52
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$b r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$b     // Catch: java.lang.Exception -> L52
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L52
            r0.f50280j = r3     // Catch: java.lang.Exception -> L52
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)     // Catch: java.lang.Exception -> L52
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L52
            boolean r5 = r7.booleanValue()     // Catch: java.lang.Exception -> L52
            goto L53
        L52:
            r5 = 0
        L53:
            java.lang.Boolean r5 = bv.b.boxBoolean(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.a(io.ktor.client.HttpClient, java.lang.String, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(io.ktor.client.HttpClient r12, java.lang.String r13, byte[] r14, io.ktor.http.ContentType r15, java.lang.String r16, zu.d<? super java.lang.Boolean> r17) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.c
            if (r1 == 0) goto L15
            r1 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$c r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.c) r1
            int r2 = r1.f50285j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f50285j = r2
            goto L1a
        L15:
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$c r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$c
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f50284i
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r1.f50285j
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            tu.a0.throwOnFailure(r0)     // Catch: java.lang.Exception -> L5a
            goto L53
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            tu.a0.throwOnFailure(r0)
            com.moloco.sdk.internal.scheduling.a r0 = com.moloco.sdk.internal.scheduling.c.a()     // Catch: java.lang.Exception -> L5a
            zu.m r0 = r0.getIo()     // Catch: java.lang.Exception -> L5a
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$d r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f$d     // Catch: java.lang.Exception -> L5a
            r11 = 0
            r6 = r12
            r7 = r13
            r9 = r14
            r10 = r15
            r8 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L5a
            r1.f50285j = r4     // Catch: java.lang.Exception -> L5a
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r5, r1)     // Catch: java.lang.Exception -> L5a
            if (r0 != r2) goto L53
            return r2
        L53:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L5a
            boolean r12 = r0.booleanValue()     // Catch: java.lang.Exception -> L5a
            goto L5b
        L5a:
            r12 = 0
        L5b:
            java.lang.Boolean r12 = bv.b.boxBoolean(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.a(io.ktor.client.HttpClient, java.lang.String, byte[], io.ktor.http.ContentType, java.lang.String, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object a(HttpClient httpClient, String str, byte[] bArr, ContentType contentType, String str2, zu.d dVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return a(httpClient, str, bArr, contentType, str2, dVar);
    }
}
