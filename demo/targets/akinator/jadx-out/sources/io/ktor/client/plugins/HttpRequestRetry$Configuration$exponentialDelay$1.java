package io.ktor.client.plugins;

import io.ktor.client.plugins.HttpRequestRetry;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class HttpRequestRetry$Configuration$exponentialDelay$1 extends f0 implements p {
    final /* synthetic */ double $base;
    final /* synthetic */ long $maxDelayMs;
    final /* synthetic */ long $randomizationMs;
    final /* synthetic */ HttpRequestRetry.Configuration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequestRetry$Configuration$exponentialDelay$1(double d10, long j10, HttpRequestRetry.Configuration configuration, long j11) {
        super(2);
        this.$base = d10;
        this.$maxDelayMs = j10;
        this.this$0 = configuration;
        this.$randomizationMs = j11;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((HttpRequestRetry.DelayContext) obj, ((Number) obj2).intValue());
    }

    public final Long invoke(HttpRequestRetry.DelayContext delayMillis, int i10) {
        e0.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return Long.valueOf(this.this$0.randomMs(this.$randomizationMs) + Math.min(((long) Math.pow(this.$base, i10)) * 1000, this.$maxDelayMs));
    }
}
