package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.BidToken$BidTokenRequestV3;
import io.ktor.client.HttpClient;
import io.ktor.http.HeadersBuilder;
import kotlin.jvm.internal.b1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f46794a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpClient f46795b;

    /* renamed from: c, reason: collision with root package name */
    public final k f46796c;

    /* renamed from: d, reason: collision with root package name */
    public final h f46797d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public b1 f46798i;

        /* renamed from: j, reason: collision with root package name */
        public e f46799j;

        /* renamed from: k, reason: collision with root package name */
        public com.moloco.sdk.acm.recorder.c f46800k;

        /* renamed from: l, reason: collision with root package name */
        public com.moloco.sdk.acm.g f46801l;

        /* renamed from: m, reason: collision with root package name */
        public int f46802m;

        /* renamed from: n, reason: collision with root package name */
        public int f46803n;

        /* renamed from: o, reason: collision with root package name */
        public int f46804o;

        /* renamed from: p, reason: collision with root package name */
        public int f46805p;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.c f46807r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.acm.recorder.c cVar, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f46807r = cVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return e.this.new a(this.f46807r, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0209  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x01b1 -> B:30:0x01b6). Please report as a decompilation issue!!! */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 524
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public e f46808i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f46809j;

        /* renamed from: l, reason: collision with root package name */
        public int f46811l;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46809j = obj;
            this.f46811l |= Integer.MIN_VALUE;
            return e.this.a((String) null, this);
        }
    }

    public e(String sdkVersion, HttpClient httpClient, k httpRequestInfo, h deviceRequestInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkVersion, "sdkVersion");
        kotlin.jvm.internal.e0.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.e0.checkNotNullParameter(httpRequestInfo, "httpRequestInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(deviceRequestInfo, "deviceRequestInfo");
        this.f46794a = sdkVersion;
        this.f46795b = httpClient;
        this.f46796c = httpRequestInfo;
        this.f46797d = deviceRequestInfo;
    }

    public static final /* synthetic */ String b(e eVar) {
        eVar.getClass();
        return "BidTokenApi";
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.c
    public Object a(com.moloco.sdk.acm.recorder.c cVar, zu.d<? super com.moloco.sdk.internal.w> dVar) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getIo(), new a(cVar, null), dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x010e, code lost:
    
        if (r11 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r10, zu.d<? super com.moloco.sdk.internal.w> r11) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.e.a(java.lang.String, zu.d):java.lang.Object");
    }

    public static final x0 a(e eVar, HeadersBuilder headers) {
        kotlin.jvm.internal.e0.checkNotNullParameter(headers, "$this$headers");
        com.moloco.sdk.internal.o.a(headers, eVar.f46794a, eVar.f46797d.j(), null, 4, null);
        return x0.f87415a;
    }

    public final byte[] a() {
        byte[] byteArray = ((BidToken$BidTokenRequestV3) BidToken$BidTokenRequestV3.newBuilder().build()).toByteArray();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
