package com.moloco.sdk.acm.http;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.MetricsRequest$PostMetricsRequest;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.http.HttpStatusCode;
import kotlin.jvm.internal.e0;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final HttpClient f45630a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45631b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f45632i;

        /* renamed from: k, reason: collision with root package name */
        public int f45634k;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f45632i = obj;
            this.f45634k |= Integer.MIN_VALUE;
            Object objA = h.this.a(null, null, this);
            return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : z.m7130boximpl(objA);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public h f45635i;

        /* renamed from: j, reason: collision with root package name */
        public HttpStatusCode f45636j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f45637k;

        /* renamed from: m, reason: collision with root package name */
        public int f45639m;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f45637k = obj;
            this.f45639m |= Integer.MIN_VALUE;
            Object objA = h.this.a(0L, null, null, this);
            return objA == av.e.getCOROUTINE_SUSPENDED() ? objA : z.m7130boximpl(objA);
        }
    }

    public h(HttpClient httpClient, String apiUrl) {
        e0.checkNotNullParameter(httpClient, "httpClient");
        e0.checkNotNullParameter(apiUrl, "apiUrl");
        this.f45630a = httpClient;
        this.f45631b = apiUrl;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.moloco.sdk.acm.http.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.moloco.sdk.acm.http.e r8, kv.l r9, zu.d<? super tu.z> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.moloco.sdk.acm.http.h.a
            if (r0 == 0) goto L14
            r0 = r10
            com.moloco.sdk.acm.http.h$a r0 = (com.moloco.sdk.acm.http.h.a) r0
            int r1 = r0.f45634k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f45634k = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.moloco.sdk.acm.http.h$a r0 = new com.moloco.sdk.acm.http.h$a
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f45632i
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.f45634k
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            tu.a0.throwOnFailure(r10)
            tu.z r10 = (tu.z) r10
            java.lang.Object r8 = r10.m7139unboximpl()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            tu.a0.throwOnFailure(r10)
            r6.f45634k = r2
            r2 = 5000(0x1388, double:2.4703E-320)
            r1 = r7
            r4 = r8
            r5 = r9
            java.lang.Object r8 = r1.a(r2, r4, r5, r6)
            if (r8 != r0) goto L4a
            return r0
        L4a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.http.h.a(com.moloco.sdk.acm.http.e, kv.l, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb A[Catch: Exception -> 0x003a, TryCatch #1 {Exception -> 0x003a, blocks: (B:13:0x0035, B:43:0x00ed, B:45:0x00fb, B:47:0x0119), top: B:55:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119 A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #1 {Exception -> 0x003a, blocks: (B:13:0x0035, B:43:0x00ed, B:45:0x00fb, B:47:0x0119), top: B:55:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r15, com.moloco.sdk.acm.http.e r17, kv.l r18, zu.d<? super tu.z> r19) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.http.h.a(long, com.moloco.sdk.acm.http.e, kv.l, zu.d):java.lang.Object");
    }

    public static final x0 a(long j10, HttpTimeout.HttpTimeoutCapabilityConfiguration timeout) {
        e0.checkNotNullParameter(timeout, "$this$timeout");
        timeout.setRequestTimeoutMillis(Long.valueOf(j10));
        return x0.f87415a;
    }

    public final byte[] a(e eVar) {
        GeneratedMessageLite generatedMessageLiteBuild = MetricsRequest$PostMetricsRequest.newBuilder().addAllCounts(eVar.a()).addAllDurations(eVar.b()).build();
        e0.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
        byte[] byteArray = ((MetricsRequest$PostMetricsRequest) generatedMessageLiteBuild).toByteArray();
        e0.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
