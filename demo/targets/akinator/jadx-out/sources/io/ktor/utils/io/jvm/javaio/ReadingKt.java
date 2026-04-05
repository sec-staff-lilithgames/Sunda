package io.ktor.utils.io.jvm.javaio;

import av.e;
import bv.d;
import bv.f;
import bv.n;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.CoroutinesKt;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.pool.ByteArrayPoolKt;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ReadingKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.jvm.javaio.ReadingKt", f = "Reading.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {29}, m = "copyTo", n = {"$this$copyTo", "channel", "buffer", "limit", "copied", "bufferSize", DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT}, s = {"L$0", "L$1", "L$2", "J$0", "J$1", "J$2", "I$0"})
    /* renamed from: io.ktor.utils.io.jvm.javaio.ReadingKt$copyTo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int I$0;
        long J$0;
        long J$1;
        long J$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadingKt.copyTo(null, null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$1", f = "Reading.kt", i = {0, 0}, l = {61}, m = "invokeSuspend", n = {"$this$writer", "buffer"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40981 extends n implements p {
        final /* synthetic */ ObjectPool<ByteBuffer> $pool;
        final /* synthetic */ InputStream $this_toByteReadChannel;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40981(ObjectPool<ByteBuffer> objectPool, InputStream inputStream, zu.d<? super C40981> dVar) {
            super(2, dVar);
            this.$pool = objectPool;
            this.$this_toByteReadChannel = inputStream;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C40981 c40981 = new C40981(this.$pool, this.$this_toByteReadChannel, dVar);
            c40981.L$0 = obj;
            return c40981;
        }

        @Override // kv.p
        public final Object invoke(WriterScope writerScope, zu.d<? super x0> dVar) {
            return ((C40981) create(writerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws IOException {
            ByteBuffer byteBufferBorrow;
            WriterScope writerScope;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                WriterScope writerScope2 = (WriterScope) this.L$0;
                byteBufferBorrow = this.$pool.borrow();
                writerScope = writerScope2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byteBufferBorrow = (ByteBuffer) this.L$1;
                writerScope = (WriterScope) this.L$0;
                try {
                    a0.throwOnFailure(obj);
                } finally {
                    try {
                        return x0.f87415a;
                    } finally {
                    }
                }
            }
            while (true) {
                byteBufferBorrow.clear();
                int i11 = this.$this_toByteReadChannel.read(byteBufferBorrow.array(), byteBufferBorrow.arrayOffset() + byteBufferBorrow.position(), byteBufferBorrow.remaining());
                if (i11 < 0) {
                    break;
                }
                if (i11 != 0) {
                    byteBufferBorrow.position(byteBufferBorrow.position() + i11);
                    byteBufferBorrow.flip();
                    ByteWriteChannel channel = writerScope.getChannel();
                    this.L$0 = writerScope;
                    this.L$1 = byteBufferBorrow;
                    this.label = 1;
                    if (channel.writeFully(byteBufferBorrow, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$2", f = "Reading.kt", i = {0, 0}, l = {90}, m = "invokeSuspend", n = {"$this$writer", "buffer"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        final /* synthetic */ ObjectPool<byte[]> $pool;
        final /* synthetic */ InputStream $this_toByteReadChannel;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ObjectPool<byte[]> objectPool, InputStream inputStream, zu.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$pool = objectPool;
            this.$this_toByteReadChannel = inputStream;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$pool, this.$this_toByteReadChannel, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kv.p
        public final Object invoke(WriterScope writerScope, zu.d<? super x0> dVar) {
            return ((AnonymousClass2) create(writerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) throws IOException {
            byte[] bArrBorrow;
            WriterScope writerScope;
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                WriterScope writerScope2 = (WriterScope) this.L$0;
                bArrBorrow = this.$pool.borrow();
                writerScope = writerScope2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bArrBorrow = (byte[]) this.L$1;
                writerScope = (WriterScope) this.L$0;
                try {
                    a0.throwOnFailure(obj);
                } catch (Throwable th2) {
                    try {
                        writerScope.getChannel().close(th2);
                        this.$pool.recycle(bArrBorrow);
                    } catch (Throwable th3) {
                        this.$pool.recycle(bArrBorrow);
                        this.$this_toByteReadChannel.close();
                        throw th3;
                    }
                }
            }
            while (true) {
                int i11 = this.$this_toByteReadChannel.read(bArrBorrow, 0, bArrBorrow.length);
                if (i11 < 0) {
                    this.$pool.recycle(bArrBorrow);
                    break;
                }
                if (i11 != 0) {
                    ByteWriteChannel channel = writerScope.getChannel();
                    this.L$0 = writerScope;
                    this.L$1 = bArrBorrow;
                    this.label = 1;
                    if (channel.writeFully(bArrBorrow, 0, i11, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            this.$this_toByteReadChannel.close();
            return x0.f87415a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[LOOP:0: B:23:0x0072->B:56:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009f -> B:46:0x00a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyTo(java.io.InputStream r18, io.ktor.utils.io.ByteWriteChannel r19, long r20, zu.d<? super java.lang.Long> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.ReadingKt.copyTo(java.io.InputStream, io.ktor.utils.io.ByteWriteChannel, long, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object copyTo$default(InputStream inputStream, ByteWriteChannel byteWriteChannel, long j10, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return copyTo(inputStream, byteWriteChannel, j10, dVar);
    }

    public static final ByteReadChannel toByteReadChannel(InputStream inputStream, m context, ObjectPool<ByteBuffer> pool) {
        e0.checkNotNullParameter(inputStream, "<this>");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(pool, "pool");
        return CoroutinesKt.writer((CoroutineScope) GlobalScope.INSTANCE, context, true, (p) new C40981(pool, inputStream, null)).getChannel();
    }

    public static /* synthetic */ ByteReadChannel toByteReadChannel$default(InputStream inputStream, m mVar, ObjectPool objectPool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = Dispatchers.getIO();
        }
        return toByteReadChannel(inputStream, mVar, objectPool);
    }

    public static final ByteReadChannel toByteReadChannelWithArrayPool(InputStream inputStream, m context, ObjectPool<byte[]> pool) {
        e0.checkNotNullParameter(inputStream, "<this>");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(pool, "pool");
        return CoroutinesKt.writer((CoroutineScope) GlobalScope.INSTANCE, context, true, (p) new AnonymousClass2(pool, inputStream, null)).getChannel();
    }

    public static /* synthetic */ ByteReadChannel toByteReadChannelWithArrayPool$default(InputStream inputStream, m mVar, ObjectPool objectPool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mVar = Dispatchers.getIO();
        }
        if ((i10 & 2) != 0) {
            objectPool = ByteArrayPoolKt.getByteArrayPool();
        }
        return toByteReadChannelWithArrayPool(inputStream, mVar, objectPool);
    }
}
