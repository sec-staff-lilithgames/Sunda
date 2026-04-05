package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.e0;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpRequestRetry;
import io.ktor.client.plugins.HttpRequestRetryKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import java.io.File;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f47915a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.error.c f47916b;

    /* renamed from: c, reason: collision with root package name */
    public final HttpClient f47917c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f47918i;

        /* renamed from: j, reason: collision with root package name */
        public HttpResponse f47919j;

        /* renamed from: k, reason: collision with root package name */
        public int f47920k;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f47922m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ File f47923n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, File file, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f47922m = str;
            this.f47923n = file;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super g> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return d.this.new a(this.f47922m, this.f47923n, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a2 A[Catch: Exception -> 0x0032, TimeoutCancellationException -> 0x01c5, TRY_ENTER, TRY_LEAVE, TryCatch #6 {TimeoutCancellationException -> 0x01c5, blocks: (B:39:0x00cd, B:29:0x009a, B:31:0x00a2, B:33:0x00a5, B:35:0x00ab, B:36:0x00c1), top: B:93:0x009a }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a5 A[Catch: Exception -> 0x01c0, TimeoutCancellationException -> 0x01c5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x01c0, blocks: (B:56:0x0152, B:39:0x00cd, B:40:0x00cf, B:46:0x010b, B:52:0x0143, B:29:0x009a, B:33:0x00a5, B:36:0x00c1, B:25:0x0068), top: B:85:0x0068 }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0209  */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v3 */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v27, types: [int] */
        /* JADX WARN: Type inference failed for: r1v29 */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) throws com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n {
            /*
                Method dump skipped, instructions count: 547
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public d(e0 connectivityService, com.moloco.sdk.internal.error.c errorReportingService, HttpClient httpClient) {
        kotlin.jvm.internal.e0.checkNotNullParameter(connectivityService, "connectivityService");
        kotlin.jvm.internal.e0.checkNotNullParameter(errorReportingService, "errorReportingService");
        kotlin.jvm.internal.e0.checkNotNullParameter(httpClient, "httpClient");
        this.f47915a = connectivityService;
        this.f47916b = errorReportingService;
        this.f47917c = httpClient;
    }

    public static final long a(HttpRequestRetry.DelayContext delayMillis, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return 100L;
    }

    public static final /* synthetic */ String c(d dVar) {
        dVar.getClass();
        return "LegacyMediaDownloader";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l
    public Object a(String str, File file, zu.d<? super g> dVar) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.c.a().getIo(), new a(str, file, null), dVar);
    }

    public final Object a(String str, zu.d<? super HttpResponse> dVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        HttpRequestRetryKt.retry(httpRequestBuilder, new aw.f(this, 8));
        httpRequestBuilder.setMethod(HttpMethod.Companion.getGet());
        return new HttpStatement(httpRequestBuilder, this.f47917c).execute(dVar);
    }

    public static final x0 a(d dVar, HttpRequestRetry.Configuration retry) {
        kotlin.jvm.internal.e0.checkNotNullParameter(retry, "$this$retry");
        retry.setMaxRetries(10);
        HttpRequestRetry.Configuration.delayMillis$default(retry, false, new a1.n(5), 1, null);
        retry.retryOnException(10, true);
        retry.retryOnServerErrors(10);
        retry.modifyRequest(new a1.a(dVar, 3));
        return x0.f87415a;
    }

    public static final x0 a(d dVar, HttpRequestRetry.ModifyRequestContext modifyRequest, HttpRequestBuilder it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(modifyRequest, "$this$modifyRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        dVar.getClass();
        MolocoLogger.info$default(molocoLogger, "LegacyMediaDownloader", "Retry attempt #" + modifyRequest.getRetryCount() + " for " + modifyRequest.getRequest().getUrl(), null, false, 12, null);
        return x0.f87415a;
    }

    public final String a(boolean z10) {
        if (z10) {
            return "HTTP_REQUEST_COMPLETE_TIMEOUT";
        }
        return "HTTP_REQUEST_NOT_COMPLETE_TIMEOUT";
    }
}
