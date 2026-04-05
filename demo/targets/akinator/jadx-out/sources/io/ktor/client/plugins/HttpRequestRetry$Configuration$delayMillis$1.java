package io.ktor.client.plugins;

import io.ktor.client.plugins.HttpRequestRetry;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.p;
import sv.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestRetry$Configuration$delayMillis$1 extends f0 implements p {
    final /* synthetic */ p $block;
    final /* synthetic */ boolean $respectRetryAfterHeader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestRetry$Configuration$delayMillis$1(boolean z10, p pVar) {
        super(2);
        this.$respectRetryAfterHeader = z10;
        this.$block = pVar;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((HttpRequestRetry.DelayContext) obj, ((Number) obj2).intValue());
    }

    public final Long invoke(HttpRequestRetry.DelayContext delayContext, int i10) {
        long jLongValue;
        Headers headers;
        String str;
        Long longOrNull;
        e0.checkNotNullParameter(delayContext, "$this$null");
        if (this.$respectRetryAfterHeader) {
            HttpResponse response = delayContext.getResponse();
            Long lValueOf = (response == null || (headers = response.getHeaders()) == null || (str = headers.get(HttpHeaders.INSTANCE.getRetryAfter())) == null || (longOrNull = j0.toLongOrNull(str)) == null) ? null : Long.valueOf(longOrNull.longValue() * 1000);
            jLongValue = Math.max(((Number) this.$block.invoke(delayContext, Integer.valueOf(i10))).longValue(), lValueOf != null ? lValueOf.longValue() : 0L);
        } else {
            jLongValue = ((Number) this.$block.invoke(delayContext, Integer.valueOf(i10))).longValue();
        }
        return Long.valueOf(jLongValue);
    }
}
