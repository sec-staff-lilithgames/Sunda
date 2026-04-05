package io.ktor.client.network.sockets;

import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestData;
import io.ktor.util.ThrowableKt;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteChannelKt;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class TimeoutExceptionsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.client.network.sockets.TimeoutExceptionsKt$ByteChannelWithMappedExceptions$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        final /* synthetic */ HttpRequestData $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpRequestData httpRequestData) {
            super(1);
            this.$request = httpRequestData;
        }

        @Override // kv.l
        public final Throwable invoke(Throwable th2) {
            return (th2 != null ? ThrowableKt.getRootCause(th2) : null) instanceof java.net.SocketTimeoutException ? HttpTimeoutKt.SocketTimeoutException(this.$request, th2) : th2;
        }
    }

    public static final ByteChannel ByteChannelWithMappedExceptions(HttpRequestData request) {
        e0.checkNotNullParameter(request, "request");
        return ByteChannelKt.ByteChannel$default(false, new AnonymousClass1(request), 1, null);
    }
}
