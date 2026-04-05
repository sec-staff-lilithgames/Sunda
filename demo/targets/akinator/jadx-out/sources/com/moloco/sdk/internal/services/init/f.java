package com.moloco.sdk.internal.services.init;

import android.net.Uri;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.h0;
import com.moloco.sdk.internal.services.i0;
import com.moloco.sdk.internal.services.init.j;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.internal.services.v;
import com.moloco.sdk.internal.w;
import com.moloco.sdk.publisher.MediationInfo;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.HeadersBuilder;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.util.reflect.TypeInfoJvmKt;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f47079a;

    /* renamed from: b, reason: collision with root package name */
    public final v f47080b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.usertracker.e f47081c;

    /* renamed from: d, reason: collision with root package name */
    public final String f47082d;

    /* renamed from: e, reason: collision with root package name */
    public final long f47083e;

    /* renamed from: f, reason: collision with root package name */
    public final HttpClient f47084f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f47085g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public f f47086i;

        /* renamed from: j, reason: collision with root package name */
        public Object f47087j;

        /* renamed from: k, reason: collision with root package name */
        public Object f47088k;

        /* renamed from: l, reason: collision with root package name */
        public com.moloco.sdk.acm.recorder.c f47089l;

        /* renamed from: m, reason: collision with root package name */
        public com.moloco.sdk.acm.g f47090m;

        /* renamed from: n, reason: collision with root package name */
        public h0 f47091n;

        /* renamed from: o, reason: collision with root package name */
        public u f47092o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f47093p;

        /* renamed from: r, reason: collision with root package name */
        public int f47095r;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f47093p = obj;
            this.f47095r |= Integer.MIN_VALUE;
            return f.this.a(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f47096i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ HttpResponse f47097j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HttpResponse httpResponse, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f47097j = httpResponse;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Init$SDKInitResponse> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new b(this.f47097j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f47096i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitApi", "Successful Init", null, false, 12, null);
                HttpClientCall call = this.f47097j.getCall();
                KType kTypeTypeOf = c1.typeOf(byte[].class);
                TypeInfo typeInfoTypeInfoImpl = TypeInfoJvmKt.typeInfoImpl(TypesJVMKt.getJavaType(kTypeTypeOf), c1.getOrCreateKotlinClass(byte[].class), kTypeTypeOf);
                this.f47096i = 1;
                obj = call.bodyNullable(typeInfoTypeInfoImpl, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            if (obj != null) {
                return Init$SDKInitResponse.parseFrom((byte[]) obj);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
        }
    }

    public f(i0 deviceInfoService, v appInfoService, com.moloco.sdk.internal.services.usertracker.e userTrackerService, String sdkVersion, String endpoint, long j10, HttpClient httpClient) {
        e0.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        e0.checkNotNullParameter(appInfoService, "appInfoService");
        e0.checkNotNullParameter(userTrackerService, "userTrackerService");
        e0.checkNotNullParameter(sdkVersion, "sdkVersion");
        e0.checkNotNullParameter(endpoint, "endpoint");
        e0.checkNotNullParameter(httpClient, "httpClient");
        this.f47079a = deviceInfoService;
        this.f47080b = appInfoService;
        this.f47081c = userTrackerService;
        this.f47082d = sdkVersion;
        this.f47083e = j10;
        this.f47084f = httpClient;
        this.f47085g = Uri.parse(endpoint);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0168 A[Catch: Exception -> 0x0062, TRY_LEAVE, TryCatch #5 {Exception -> 0x0062, blocks: (B:21:0x005d, B:42:0x0156, B:44:0x0168, B:52:0x01a2, B:55:0x01ae, B:57:0x01fa), top: B:76:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a2 A[Catch: Exception -> 0x0062, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0062, blocks: (B:21:0x005d, B:42:0x0156, B:44:0x0168, B:52:0x01a2, B:55:0x01ae, B:57:0x01fa), top: B:76:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // com.moloco.sdk.internal.services.init.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r28, com.moloco.sdk.publisher.MediationInfo r29, com.moloco.sdk.acm.recorder.c r30, zu.d<? super com.moloco.sdk.internal.w> r31) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.f.a(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.acm.recorder.c, zu.d):java.lang.Object");
    }

    public static final x0 a(f fVar, h0 h0Var, MediationInfo mediationInfo, u uVar, HeadersBuilder headers) {
        e0.checkNotNullParameter(headers, "$this$headers");
        com.moloco.sdk.internal.o.a(headers, fVar.f47082d, h0Var.x(), mediationInfo);
        headers.append("X-Moloco-App-Bundle", uVar.b());
        return x0.f87415a;
    }

    public final w a(Exception exc, com.moloco.sdk.acm.g gVar, com.moloco.sdk.acm.recorder.c cVar) {
        com.moloco.sdk.internal.services.init.b bVar;
        if (exc instanceof HttpRequestTimeoutException) {
            bVar = com.moloco.sdk.internal.services.init.b.f47064b;
        } else if (exc instanceof SSLHandshakeException) {
            bVar = com.moloco.sdk.internal.services.init.b.f47067f;
        } else if (exc instanceof SocketException) {
            bVar = com.moloco.sdk.internal.services.init.b.f47066e;
        } else {
            bVar = exc instanceof UnknownHostException ? com.moloco.sdk.internal.services.init.b.f47065c : com.moloco.sdk.internal.services.init.b.f47069h;
        }
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitApi", "SDK Init failed with client exception", exc, false, 8, null);
        cVar.recordTimerEvent(gVar.withTag(com.moloco.sdk.internal.client_metrics_data.b.f45865f.c(), "failure").withTag(com.moloco.sdk.internal.client_metrics_data.b.f45863c.c(), bVar.name()));
        return new w.a(new j.a(bVar));
    }
}
