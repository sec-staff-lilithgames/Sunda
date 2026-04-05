package io.ktor.util.cio;

import av.e;
import bv.f;
import bv.n;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.CoroutinesKt;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.pool.ObjectPool;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InputStreamAdaptersKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.cio.InputStreamAdaptersKt$toByteReadChannel$1", f = "InputStreamAdapters.kt", i = {0, 0}, l = {34}, m = "invokeSuspend", n = {"$this$writer", "buffer"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.util.cio.InputStreamAdaptersKt$toByteReadChannel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        final /* synthetic */ ObjectPool<ByteBuffer> $pool;
        final /* synthetic */ InputStream $this_toByteReadChannel;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ObjectPool<ByteBuffer> objectPool, InputStream inputStream, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$pool = objectPool;
            this.$this_toByteReadChannel = inputStream;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pool, this.$this_toByteReadChannel, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kv.p
        public final Object invoke(WriterScope writerScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(writerScope, dVar)).invokeSuspend(x0.f87415a);
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

    public static final ByteReadChannel toByteReadChannel(InputStream inputStream, ObjectPool<ByteBuffer> pool, m context, Job parent) {
        e0.checkNotNullParameter(inputStream, "<this>");
        e0.checkNotNullParameter(pool, "pool");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(parent, "parent");
        return CoroutinesKt.writer(CoroutineScopeKt.CoroutineScope(context), (m) parent, true, (p) new AnonymousClass1(pool, inputStream, null)).getChannel();
    }

    public static /* synthetic */ ByteReadChannel toByteReadChannel$default(InputStream inputStream, ObjectPool objectPool, m mVar, Job job, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        if ((i10 & 2) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        if ((i10 & 4) != 0) {
            job = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
        return toByteReadChannel(inputStream, objectPool, mVar, job);
    }
}
