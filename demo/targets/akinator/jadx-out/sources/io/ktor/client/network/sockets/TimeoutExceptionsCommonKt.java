package io.ktor.client.network.sockets;

import av.e;
import bv.f;
import bv.n;
import io.ktor.client.request.HttpRequestData;
import io.ktor.util.InternalAPI;
import io.ktor.util.PlatformUtils;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.CoroutinesKt;
import io.ktor.utils.io.WriterScope;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class TimeoutExceptionsCommonKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.network.sockets.TimeoutExceptionsCommonKt$mapEngineExceptions$1", f = "TimeoutExceptionsCommon.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.network.sockets.TimeoutExceptionsCommonKt$mapEngineExceptions$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ ByteReadChannel $input;
        final /* synthetic */ ByteChannel $replacementChannel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ByteReadChannel byteReadChannel, ByteChannel byteChannel, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$input = byteReadChannel;
            this.$replacementChannel = byteChannel;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$input, this.$replacementChannel, dVar);
        }

        @Override // kv.p
        public final Object invoke(WriterScope writerScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(writerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            Throwable th2;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                try {
                    ByteReadChannel byteReadChannel = this.$input;
                    ByteChannel byteChannel = this.$replacementChannel;
                    this.label = 1;
                    anonymousClass1 = this;
                    try {
                        if (ByteReadChannelKt.copyAndClose$default(byteReadChannel, byteChannel, 0L, anonymousClass1, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        anonymousClass1.$input.cancel(th2);
                        return x0.f87415a;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass1 = this;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    a0.throwOnFailure(obj);
                } catch (Throwable th5) {
                    th2 = th5;
                    anonymousClass1 = this;
                    anonymousClass1.$input.cancel(th2);
                    return x0.f87415a;
                }
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.client.network.sockets.TimeoutExceptionsCommonKt$mapEngineExceptions$2", f = "TimeoutExceptionsCommon.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.client.network.sockets.TimeoutExceptionsCommonKt$mapEngineExceptions$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ ByteWriteChannel $output;
        final /* synthetic */ ByteChannel $replacementChannel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ByteChannel byteChannel, ByteWriteChannel byteWriteChannel, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$replacementChannel = byteChannel;
            this.$output = byteWriteChannel;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$replacementChannel, this.$output, dVar);
        }

        @Override // kv.p
        public final Object invoke(WriterScope writerScope, d<? super x0> dVar) {
            return ((AnonymousClass2) create(writerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            AnonymousClass2 anonymousClass2;
            Throwable th2;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                try {
                    ByteChannel byteChannel = this.$replacementChannel;
                    ByteWriteChannel byteWriteChannel = this.$output;
                    this.label = 1;
                    anonymousClass2 = this;
                    try {
                        if (ByteReadChannelKt.copyAndClose$default(byteChannel, byteWriteChannel, 0L, anonymousClass2, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        anonymousClass2.$replacementChannel.close(th2);
                        return x0.f87415a;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass2 = this;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    a0.throwOnFailure(obj);
                } catch (Throwable th5) {
                    th2 = th5;
                    anonymousClass2 = this;
                    anonymousClass2.$replacementChannel.close(th2);
                    return x0.f87415a;
                }
            }
            return x0.f87415a;
        }
    }

    @InternalAPI
    public static final ByteReadChannel mapEngineExceptions(CoroutineScope coroutineScope, ByteReadChannel input, HttpRequestData request) {
        e0.checkNotNullParameter(coroutineScope, "<this>");
        e0.checkNotNullParameter(input, "input");
        e0.checkNotNullParameter(request, "request");
        if (PlatformUtils.INSTANCE.getIS_NATIVE()) {
            return input;
        }
        ByteChannel byteChannelByteChannelWithMappedExceptions = TimeoutExceptionsKt.ByteChannelWithMappedExceptions(request);
        CoroutinesKt.writer$default(coroutineScope, (m) null, byteChannelByteChannelWithMappedExceptions, new AnonymousClass1(input, byteChannelByteChannelWithMappedExceptions, null), 1, (Object) null);
        return byteChannelByteChannelWithMappedExceptions;
    }

    @InternalAPI
    public static final ByteWriteChannel mapEngineExceptions(CoroutineScope coroutineScope, ByteWriteChannel output, HttpRequestData request) {
        e0.checkNotNullParameter(coroutineScope, "<this>");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(request, "request");
        if (PlatformUtils.INSTANCE.getIS_NATIVE()) {
            return output;
        }
        ByteChannel byteChannelByteChannelWithMappedExceptions = TimeoutExceptionsKt.ByteChannelWithMappedExceptions(request);
        CoroutinesKt.writer$default(coroutineScope, (m) null, byteChannelByteChannelWithMappedExceptions, new AnonymousClass2(byteChannelByteChannelWithMappedExceptions, output, null), 1, (Object) null);
        return byteChannelByteChannelWithMappedExceptions;
    }
}
