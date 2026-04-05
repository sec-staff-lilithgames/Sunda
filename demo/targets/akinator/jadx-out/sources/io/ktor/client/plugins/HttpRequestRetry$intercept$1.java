package io.ktor.client.plugins;

import bv.f;
import bv.n;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.AdActivity;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import kv.q;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.client.plugins.HttpRequestRetry$intercept$1", f = "HttpRequestRetry.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {298, Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE}, m = "invokeSuspend", n = {"$this$intercept", AdActivity.REQUEST_KEY_EXTRA, "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "subRequest", "retryCount", "maxRetries", "$this$intercept", AdActivity.REQUEST_KEY_EXTRA, "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "lastRetryData", "retryCount", "maxRetries"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"})
/* loaded from: classes7.dex */
public final class HttpRequestRetry$intercept$1 extends n implements q {
    final /* synthetic */ HttpClient $client;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ HttpRequestRetry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestRetry$intercept$1(HttpRequestRetry httpRequestRetry, HttpClient httpClient, d<? super HttpRequestRetry$intercept$1> dVar) {
        super(3, dVar);
        this.this$0 = httpRequestRetry;
        this.$client = httpClient;
    }

    @Override // kv.q
    public final Object invoke(Sender sender, HttpRequestBuilder httpRequestBuilder, d<? super HttpClientCall> dVar) {
        HttpRequestRetry$intercept$1 httpRequestRetry$intercept$1 = new HttpRequestRetry$intercept$1(this.this$0, this.$client, dVar);
        httpRequestRetry$intercept$1.L$0 = sender;
        httpRequestRetry$intercept$1.L$1 = httpRequestBuilder;
        return httpRequestRetry$intercept$1.invokeSuspend(x0.f87415a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0113 A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:34:0x0113, B:35:0x0127, B:38:0x0143, B:41:0x014e, B:11:0x006f), top: B:53:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014e A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #0 {all -> 0x0076, blocks: (B:34:0x0113, B:35:0x0127, B:38:0x0143, B:41:0x014e, B:11:0x006f), top: B:53:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01cd -> B:7:0x0038). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpRequestRetry$intercept$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
