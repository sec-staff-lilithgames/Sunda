package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import io.ktor.client.HttpClient;
import io.ktor.http.ContentType;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kv.p;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    public final HttpClient f50292b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f50293c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f50294i;

        /* renamed from: j, reason: collision with root package name */
        public int f50295j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f50297l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f50297l = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return h.this.new a(this.f50297l, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
        
            if (r14 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(10000, r13) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007c -> B:25:0x007f). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r13.f50295j
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                int r1 = r13.f50294i
                tu.a0.throwOnFailure(r14)
                goto L7f
            L15:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1d:
                int r1 = r13.f50294i
                tu.a0.throwOnFailure(r14)
                goto L67
            L23:
                tu.a0.throwOnFailure(r14)
                r1 = r2
            L27:
                r14 = 5
                if (r1 >= r14) goto L81
                r14 = 0
                android.content.Context r14 = com.moloco.sdk.internal.android_context.b.a(r14, r4, r14)
                com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h r5 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h.this
                boolean r14 = r5.a(r14)
                com.moloco.sdk.internal.MolocoLogger r6 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                java.lang.String r8 = "Network available: "
                r7.<init>(r8)
                r7.append(r14)
                java.lang.String r8 = " for non persistent request"
                r7.append(r8)
                java.lang.String r8 = r7.toString()
                r11 = 12
                r12 = 0
                java.lang.String r7 = "NonPersistentRequest"
                r9 = 0
                r10 = 0
                com.moloco.sdk.internal.MolocoLogger.info$default(r6, r7, r8, r9, r10, r11, r12)
                if (r14 == 0) goto L6e
                io.ktor.client.HttpClient r14 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h.a(r5)
                r13.f50294i = r1
                r13.f50295j = r4
                java.lang.String r5 = r13.f50297l
                java.lang.Object r14 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.a(r14, r5, r13)
                if (r14 != r0) goto L67
                goto L7e
            L67:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                goto L6f
            L6e:
                r14 = r2
            L6f:
                if (r14 == 0) goto L72
                goto L81
            L72:
                r13.f50294i = r1
                r13.f50295j = r3
                r5 = 10000(0x2710, double:4.9407E-320)
                java.lang.Object r14 = kotlinx.coroutines.DelayKt.delay(r5, r13)
                if (r14 != r0) goto L7f
            L7e:
                return r0
            L7f:
                int r1 = r1 + r4
                goto L27
            L81:
                tu.x0 r14 = tu.x0.f87415a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f50298i;

        /* renamed from: j, reason: collision with root package name */
        public int f50299j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f50301l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ byte[] f50302m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ContentType f50303n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, byte[] bArr, ContentType contentType, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f50301l = str;
            this.f50302m = bArr;
            this.f50303n = contentType;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return h.this.new b(this.f50301l, this.f50302m, this.f50303n, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
        
            if (r0 == r8) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0090 -> B:26:0x0091). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r5 = r20
                java.lang.Object r8 = av.e.getCOROUTINE_SUSPENDED()
                int r0 = r5.f50299j
                r9 = 0
                r10 = 2
                r11 = 1
                if (r0 == 0) goto L29
                if (r0 == r11) goto L20
                if (r0 != r10) goto L18
                int r0 = r5.f50298i
                tu.a0.throwOnFailure(r21)
                goto L91
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                int r0 = r5.f50298i
                tu.a0.throwOnFailure(r21)
                r12 = r0
                r0 = r21
                goto L78
            L29:
                tu.a0.throwOnFailure(r21)
                r12 = r9
            L2d:
                r0 = 5
                if (r12 >= r0) goto L94
                r0 = 0
                android.content.Context r0 = com.moloco.sdk.internal.android_context.b.a(r0, r11, r0)
                com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h r1 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h.this
                boolean r0 = r1.a(r0)
                com.moloco.sdk.internal.MolocoLogger r13 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Network available: "
                r2.<init>(r3)
                r2.append(r0)
                java.lang.String r3 = " for non persistent request"
                r2.append(r3)
                java.lang.String r15 = r2.toString()
                r18 = 12
                r19 = 0
                java.lang.String r14 = "NonPersistentRequest"
                r16 = 0
                r17 = 0
                com.moloco.sdk.internal.MolocoLogger.info$default(r13, r14, r15, r16, r17, r18, r19)
                if (r0 == 0) goto L7f
                io.ktor.client.HttpClient r0 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h.a(r1)
                r5.f50298i = r12
                r5.f50299j = r11
                r6 = 8
                r7 = 0
                java.lang.String r1 = r5.f50301l
                byte[] r2 = r5.f50302m
                io.ktor.http.ContentType r3 = r5.f50303n
                r4 = 0
                java.lang.Object r0 = com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f.a(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r8) goto L78
                goto L8f
            L78:
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                goto L80
            L7f:
                r0 = r9
            L80:
                if (r0 == 0) goto L83
                goto L94
            L83:
                r5.f50298i = r12
                r5.f50299j = r10
                r0 = 10000(0x2710, double:4.9407E-320)
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r5)
                if (r0 != r8) goto L90
            L8f:
                return r8
            L90:
                r0 = r12
            L91:
                int r12 = r0 + 1
                goto L2d
            L94:
                tu.x0 r0 = tu.x0.f87415a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h(HttpClient httpClient) {
        e0.checkNotNullParameter(httpClient, "httpClient");
        this.f50292b = httpClient;
        this.f50293c = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.c.a().getDefault());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public void a(String url) {
        e0.checkNotNullParameter(url, "url");
        BuildersKt__Builders_commonKt.launch$default(this.f50293c, null, null, new a(url, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e
    public void a(String url, byte[] body, ContentType contentType, String str) {
        e0.checkNotNullParameter(url, "url");
        e0.checkNotNullParameter(body, "body");
        e0.checkNotNullParameter(contentType, "contentType");
        BuildersKt__Builders_commonKt.launch$default(this.f50293c, null, null, new b(url, body, contentType, null), 3, null);
    }

    public final boolean a(Context context) {
        e0.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        e0.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null) {
            return false;
        }
        return networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3);
    }
}
