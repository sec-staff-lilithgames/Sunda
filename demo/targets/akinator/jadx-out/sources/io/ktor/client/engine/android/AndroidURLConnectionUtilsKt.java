package io.ktor.client.engine.android;

import bv.d;
import bv.f;
import com.applovin.shadow.okio.Segment;
import com.vungle.ads.internal.ui.AdActivity;
import io.ktor.client.network.sockets.TimeoutExceptionsCommonKt;
import io.ktor.client.plugins.HttpTimeout;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.request.HttpRequestData;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.ReadingKt;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScopeKt;
import sv.n0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class AndroidURLConnectionUtilsKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.engine.android.AndroidURLConnectionUtilsKt", f = "AndroidURLConnectionUtils.kt", i = {0, 0}, l = {60}, m = "timeoutAwareConnection", n = {AdActivity.REQUEST_KEY_EXTRA, "cause"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1, reason: invalid class name */
    public static final class AnonymousClass1<T> extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidURLConnectionUtilsKt.timeoutAwareConnection(null, null, null, this);
        }
    }

    public static final ByteReadChannel content(HttpURLConnection httpURLConnection, m callContext, HttpRequestData request) {
        ByteReadChannel byteReadChannel;
        ByteReadChannel byteReadChannelMapEngineExceptions;
        e0.checkNotNullParameter(httpURLConnection, "<this>");
        e0.checkNotNullParameter(callContext, "callContext");
        e0.checkNotNullParameter(request, "request");
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            bufferedInputStream = inputStream != null ? inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, Segment.SIZE) : null;
        } catch (IOException unused) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                bufferedInputStream = errorStream instanceof BufferedInputStream ? (BufferedInputStream) errorStream : new BufferedInputStream(errorStream, Segment.SIZE);
            }
        }
        return (bufferedInputStream == null || (byteReadChannel = ReadingKt.toByteReadChannel(bufferedInputStream, callContext, ByteBufferPoolKt.getKtorDefaultPool())) == null || (byteReadChannelMapEngineExceptions = TimeoutExceptionsCommonKt.mapEngineExceptions(CoroutineScopeKt.CoroutineScope(callContext), byteReadChannel, request)) == null) ? ByteReadChannel.Companion.getEmpty() : byteReadChannelMapEngineExceptions;
    }

    private static final boolean isTimeoutException(Throwable th2) {
        if (th2 instanceof SocketTimeoutException) {
            return true;
        }
        if (th2 instanceof ConnectException) {
            String message = th2.getMessage();
            if (message != null ? n0.contains$default((CharSequence) message, (CharSequence) "timed out", false, 2, (Object) null) : false) {
                return true;
            }
        }
        return false;
    }

    private static final void setupRequestTimeoutAttributes(HttpURLConnection httpURLConnection, HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration) {
        Long requestTimeoutMillis = httpTimeoutCapabilityConfiguration.getRequestTimeoutMillis();
        if (requestTimeoutMillis != null) {
            long jLongValue = requestTimeoutMillis.longValue();
            if (jLongValue != Long.MAX_VALUE) {
                if (httpURLConnection.getConnectTimeout() == 0 || httpURLConnection.getConnectTimeout() > jLongValue) {
                    httpURLConnection.setConnectTimeout(HttpTimeoutKt.convertLongTimeoutToIntWithInfiniteAsZero(jLongValue));
                }
            }
        }
    }

    public static final void setupTimeoutAttributes(HttpURLConnection httpURLConnection, HttpRequestData requestData) {
        e0.checkNotNullParameter(httpURLConnection, "<this>");
        e0.checkNotNullParameter(requestData, "requestData");
        HttpTimeout.HttpTimeoutCapabilityConfiguration httpTimeoutCapabilityConfiguration = (HttpTimeout.HttpTimeoutCapabilityConfiguration) requestData.getCapabilityOrNull(HttpTimeout.Plugin);
        if (httpTimeoutCapabilityConfiguration != null) {
            Long connectTimeoutMillis = httpTimeoutCapabilityConfiguration.getConnectTimeoutMillis();
            if (connectTimeoutMillis != null) {
                httpURLConnection.setConnectTimeout(HttpTimeoutKt.convertLongTimeoutToIntWithInfiniteAsZero(connectTimeoutMillis.longValue()));
            }
            Long socketTimeoutMillis = httpTimeoutCapabilityConfiguration.getSocketTimeoutMillis();
            if (socketTimeoutMillis != null) {
                httpURLConnection.setReadTimeout(HttpTimeoutKt.convertLongTimeoutToIntWithInfiniteAsZero(socketTimeoutMillis.longValue()));
            }
            setupRequestTimeoutAttributes(httpURLConnection, httpTimeoutCapabilityConfiguration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object timeoutAwareConnection(java.net.HttpURLConnection r4, io.ktor.client.request.HttpRequestData r5, kv.l r6, zu.d<? super T> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1 r0 = (io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1 r0 = new io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.L$1
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r5 = r0.L$0
            io.ktor.client.request.HttpRequestData r5 = (io.ktor.client.request.HttpRequestData) r5
            tu.a0.throwOnFailure(r7)
            goto L4f
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            tu.a0.throwOnFailure(r7)
            java.lang.Object r4 = r6.invoke(r4)     // Catch: java.lang.Throwable -> L41
            return r4
        L41:
            r4 = move-exception
            r0.L$0 = r5
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.YieldKt.yield(r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            boolean r6 = isTimeoutException(r4)
            if (r6 == 0) goto L59
            io.ktor.client.network.sockets.ConnectTimeoutException r4 = io.ktor.client.plugins.HttpTimeoutKt.ConnectTimeoutException(r5, r4)
        L59:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.timeoutAwareConnection(java.net.HttpURLConnection, io.ktor.client.request.HttpRequestData, kv.l, zu.d):java.lang.Object");
    }
}
