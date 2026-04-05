package io.ktor.util;

import av.e;
import bv.d;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.CoroutinesKt;
import io.ktor.utils.io.ReaderScope;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.util.zip.Checksum;
import java.util.zip.Deflater;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kv.a;
import kv.p;
import tu.a0;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DeflaterKt {
    private static final byte[] GZIP_HEADER_PADDING = new byte[7];
    public static final short GZIP_MAGIC = -29921;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER, 77, 82, 88, 91}, m = "deflateTo", n = {"$this$deflateTo", "destination", "pool", "crc", "deflater", "input", "compressed", "gzip", "$this$deflateTo", "destination", "pool", "crc", "deflater", "input", "compressed", "gzip", "$this$deflateTo", "destination", "pool", "crc", "deflater", "input", "compressed", "gzip", "destination", "pool", "crc", "deflater", "input", "compressed", "gzip", "pool", "deflater", "input", "compressed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: io.ktor.util.DeflaterKt$deflateTo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeflaterKt.deflateTo(null, null, false, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.DeflaterKt$deflateTo$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements a {
        final /* synthetic */ Deflater $deflater;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Deflater deflater) {
            super(0);
            this.$deflater = deflater;
        }

        @Override // kv.a
        public final Boolean invoke() {
            return Boolean.valueOf(!this.$deflater.needsInput());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.DeflaterKt$deflateTo$4, reason: invalid class name */
    public static final class AnonymousClass4 extends f0 implements a {
        final /* synthetic */ Deflater $deflater;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Deflater deflater) {
            super(0);
            this.$deflater = deflater;
        }

        @Override // kv.a
        public final Boolean invoke() {
            return Boolean.valueOf(!this.$deflater.finished());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 0, 0, 0}, l = {52}, m = "deflateWhile", n = {"$this$deflateWhile", "deflater", "buffer", "predicate"}, s = {"L$0", "L$1", "L$2", "L$3"})
    /* renamed from: io.ktor.util.DeflaterKt$deflateWhile$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39901 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C39901(zu.d<? super C39901> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeflaterKt.deflateWhile(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.DeflaterKt$deflated$1", f = "Deflater.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.util.DeflaterKt$deflated$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39911 extends n implements p {
        final /* synthetic */ boolean $gzip;
        final /* synthetic */ ObjectPool<ByteBuffer> $pool;
        final /* synthetic */ ByteReadChannel $this_deflated;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39911(ByteReadChannel byteReadChannel, boolean z10, ObjectPool<ByteBuffer> objectPool, zu.d<? super C39911> dVar) {
            super(2, dVar);
            this.$this_deflated = byteReadChannel;
            this.$gzip = z10;
            this.$pool = objectPool;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C39911 c39911 = new C39911(this.$this_deflated, this.$gzip, this.$pool, dVar);
            c39911.L$0 = obj;
            return c39911;
        }

        @Override // kv.p
        public final Object invoke(WriterScope writerScope, zu.d<? super x0> dVar) {
            return ((C39911) create(writerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                WriterScope writerScope = (WriterScope) this.L$0;
                ByteReadChannel byteReadChannel = this.$this_deflated;
                ByteWriteChannel channel = writerScope.getChannel();
                boolean z10 = this.$gzip;
                ObjectPool<ByteBuffer> objectPool = this.$pool;
                this.label = 1;
                if (DeflaterKt.deflateTo(byteReadChannel, channel, z10, objectPool, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.DeflaterKt$deflated$2", f = "Deflater.kt", i = {}, l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.util.DeflaterKt$deflated$2, reason: invalid class name and case insensitive filesystem */
    public static final class C39922 extends n implements p {
        final /* synthetic */ boolean $gzip;
        final /* synthetic */ ObjectPool<ByteBuffer> $pool;
        final /* synthetic */ ByteWriteChannel $this_deflated;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39922(ByteWriteChannel byteWriteChannel, boolean z10, ObjectPool<ByteBuffer> objectPool, zu.d<? super C39922> dVar) {
            super(2, dVar);
            this.$this_deflated = byteWriteChannel;
            this.$gzip = z10;
            this.$pool = objectPool;
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C39922 c39922 = new C39922(this.$this_deflated, this.$gzip, this.$pool, dVar);
            c39922.L$0 = obj;
            return c39922;
        }

        @Override // kv.p
        public final Object invoke(ReaderScope readerScope, zu.d<? super x0> dVar) {
            return ((C39922) create(readerScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                ByteReadChannel channel = ((ReaderScope) this.L$0).getChannel();
                ByteWriteChannel byteWriteChannel = this.$this_deflated;
                boolean z10 = this.$gzip;
                ObjectPool<ByteBuffer> objectPool = this.$pool;
                this.label = 1;
                if (DeflaterKt.deflateTo(channel, byteWriteChannel, z10, objectPool, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 1}, l = {37, 38, 39}, m = "putGzipHeader", n = {"$this$putGzipHeader", "$this$putGzipHeader"}, s = {"L$0", "L$0"})
    /* renamed from: io.ktor.util.DeflaterKt$putGzipHeader$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39931 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C39931(zu.d<? super C39931> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeflaterKt.putGzipHeader(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", i = {0, 0}, l = {43, 44}, m = "putGzipTrailer", n = {"$this$putGzipTrailer", "deflater"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.util.DeflaterKt$putGzipTrailer$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39941 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C39941(zu.d<? super C39941> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeflaterKt.putGzipTrailer(null, null, null, this);
        }
    }

    private static final void deflateTo(Deflater deflater, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byteBuffer.position(byteBuffer.position() + deflater.deflate(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining()));
        }
    }

    public static /* synthetic */ Object deflateTo$default(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, boolean z10, ObjectPool objectPool, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        return deflateTo(byteReadChannel, byteWriteChannel, z10, objectPool, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object deflateWhile(io.ktor.utils.io.ByteWriteChannel r5, java.util.zip.Deflater r6, java.nio.ByteBuffer r7, kv.a r8, zu.d<? super tu.x0> r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.util.DeflaterKt.C39901
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.util.DeflaterKt$deflateWhile$1 r0 = (io.ktor.util.DeflaterKt.C39901) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.DeflaterKt$deflateWhile$1 r0 = new io.ktor.util.DeflaterKt$deflateWhile$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r5 = r0.L$3
            kv.a r5 = (kv.a) r5
            java.lang.Object r6 = r0.L$2
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r7 = r0.L$1
            java.util.zip.Deflater r7 = (java.util.zip.Deflater) r7
            java.lang.Object r8 = r0.L$0
            io.ktor.utils.io.ByteWriteChannel r8 = (io.ktor.utils.io.ByteWriteChannel) r8
            tu.a0.throwOnFailure(r9)
            r4 = r8
            r8 = r5
            r5 = r4
            r4 = r7
            r7 = r6
            r6 = r4
            goto L4a
        L3f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L47:
            tu.a0.throwOnFailure(r9)
        L4a:
            java.lang.Object r9 = r8.invoke()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L70
            r7.clear()
            deflateTo(r6, r7)
            r7.flip()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.L$3 = r8
            r0.label = r3
            java.lang.Object r9 = r5.writeFully(r7, r0)
            if (r9 != r1) goto L4a
            return r1
        L70:
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.DeflaterKt.deflateWhile(io.ktor.utils.io.ByteWriteChannel, java.util.zip.Deflater, java.nio.ByteBuffer, kv.a, zu.d):java.lang.Object");
    }

    public static final ByteReadChannel deflated(ByteReadChannel byteReadChannel, boolean z10, ObjectPool<ByteBuffer> pool, m coroutineContext) {
        e0.checkNotNullParameter(byteReadChannel, "<this>");
        e0.checkNotNullParameter(pool, "pool");
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        return CoroutinesKt.writer((CoroutineScope) GlobalScope.INSTANCE, coroutineContext, true, (p) new C39911(byteReadChannel, z10, pool, null)).getChannel();
    }

    public static /* synthetic */ ByteReadChannel deflated$default(ByteReadChannel byteReadChannel, boolean z10, ObjectPool objectPool, m mVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        if ((i10 & 4) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return deflated(byteReadChannel, z10, (ObjectPool<ByteBuffer>) objectPool, mVar);
    }

    public static final byte[] getGZIP_HEADER_PADDING() {
        return GZIP_HEADER_PADDING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelKt.writeFully(r6, r7, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object putGzipHeader(io.ktor.utils.io.ByteWriteChannel r6, zu.d<? super tu.x0> r7) {
        /*
            boolean r0 = r7 instanceof io.ktor.util.DeflaterKt.C39931
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.util.DeflaterKt$putGzipHeader$1 r0 = (io.ktor.util.DeflaterKt.C39931) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.DeflaterKt$putGzipHeader$1 r0 = new io.ktor.util.DeflaterKt$putGzipHeader$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            tu.a0.throwOnFailure(r7)
            goto L77
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            java.lang.Object r6 = r0.L$0
            io.ktor.utils.io.ByteWriteChannel r6 = (io.ktor.utils.io.ByteWriteChannel) r6
            tu.a0.throwOnFailure(r7)
            goto L69
        L3f:
            java.lang.Object r6 = r0.L$0
            io.ktor.utils.io.ByteWriteChannel r6 = (io.ktor.utils.io.ByteWriteChannel) r6
            tu.a0.throwOnFailure(r7)
            goto L5c
        L47:
            tu.a0.throwOnFailure(r7)
            r7 = -29921(0xffffffffffff8b1f, float:NaN)
            short r7 = (short) r7
            short r7 = java.lang.Short.reverseBytes(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.writeShort(r7, r0)
            if (r7 != r1) goto L5c
            goto L76
        L5c:
            r0.L$0 = r6
            r0.label = r4
            r7 = 8
            java.lang.Object r7 = r6.writeByte(r7, r0)
            if (r7 != r1) goto L69
            goto L76
        L69:
            byte[] r7 = io.ktor.util.DeflaterKt.GZIP_HEADER_PADDING
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = io.ktor.utils.io.ByteWriteChannelKt.writeFully(r6, r7, r0)
            if (r6 != r1) goto L77
        L76:
            return r1
        L77:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.DeflaterKt.putGzipHeader(io.ktor.utils.io.ByteWriteChannel, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r7.writeInt(r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object putGzipTrailer(io.ktor.utils.io.ByteWriteChannel r7, java.util.zip.Checksum r8, java.util.zip.Deflater r9, zu.d<? super tu.x0> r10) {
        /*
            boolean r0 = r10 instanceof io.ktor.util.DeflaterKt.C39941
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.util.DeflaterKt$putGzipTrailer$1 r0 = (io.ktor.util.DeflaterKt.C39941) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.DeflaterKt$putGzipTrailer$1 r0 = new io.ktor.util.DeflaterKt$putGzipTrailer$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r10)
            goto L70
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.L$1
            r9 = r7
            java.util.zip.Deflater r9 = (java.util.zip.Deflater) r9
            java.lang.Object r7 = r0.L$0
            io.ktor.utils.io.ByteWriteChannel r7 = (io.ktor.utils.io.ByteWriteChannel) r7
            tu.a0.throwOnFailure(r10)
            goto L5a
        L41:
            tu.a0.throwOnFailure(r10)
            long r5 = r8.getValue()
            int r8 = (int) r5
            int r8 = java.lang.Integer.reverseBytes(r8)
            r0.L$0 = r7
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r8 = r7.writeInt(r8, r0)
            if (r8 != r1) goto L5a
            goto L6f
        L5a:
            int r8 = r9.getTotalIn()
            int r8 = java.lang.Integer.reverseBytes(r8)
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r7 = r7.writeInt(r8, r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            tu.x0 r7 = tu.x0.f87415a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.DeflaterKt.putGzipTrailer(io.ktor.utils.io.ByteWriteChannel, java.util.zip.Checksum, java.util.zip.Deflater, zu.d):java.lang.Object");
    }

    private static final void setInputBuffer(Deflater deflater, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            throw new IllegalArgumentException("buffer need to be array-backed");
        }
        deflater.setInput(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    public static final void updateKeepPosition(Checksum checksum, ByteBuffer buffer) {
        e0.checkNotNullParameter(checksum, "<this>");
        e0.checkNotNullParameter(buffer, "buffer");
        if (!buffer.hasArray()) {
            throw new IllegalArgumentException("buffer need to be array-backed");
        }
        checksum.update(buffer.array(), buffer.position() + buffer.arrayOffset(), buffer.remaining());
    }

    public static final ByteWriteChannel deflated(ByteWriteChannel byteWriteChannel, boolean z10, ObjectPool<ByteBuffer> pool, m coroutineContext) {
        e0.checkNotNullParameter(byteWriteChannel, "<this>");
        e0.checkNotNullParameter(pool, "pool");
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        return CoroutinesKt.reader((CoroutineScope) GlobalScope.INSTANCE, coroutineContext, true, (p) new C39922(byteWriteChannel, z10, pool, null)).getChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0134, code lost:
    
        if (putGzipHeader(r0, r3) == r4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b5, code lost:
    
        r2 = r3;
        r3 = r5;
        r5 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0150 A[Catch: all -> 0x01b7, TRY_LEAVE, TryCatch #1 {all -> 0x01b7, blocks: (B:51:0x014a, B:53:0x0150, B:68:0x01bb, B:70:0x01c1, B:82:0x0210), top: B:87:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0180 A[Catch: all -> 0x01a8, TRY_LEAVE, TryCatch #4 {all -> 0x01a8, blocks: (B:57:0x0178, B:59:0x0180), top: B:92:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb A[Catch: all -> 0x01b7, TRY_ENTER, TryCatch #1 {all -> 0x01b7, blocks: (B:51:0x014a, B:53:0x0150, B:68:0x01bb, B:70:0x01c1, B:82:0x0210), top: B:87:0x014a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e9 A[Catch: all -> 0x00a7, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00a7, blocks: (B:75:0x01e9, B:28:0x00a3, B:33:0x00ca), top: B:88:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v4, types: [io.ktor.utils.io.ByteReadChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object deflateTo(io.ktor.utils.io.ByteReadChannel r17, io.ktor.utils.io.ByteWriteChannel r18, boolean r19, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> r20, zu.d<? super tu.x0> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.DeflaterKt.deflateTo(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, boolean, io.ktor.utils.io.pool.ObjectPool, zu.d):java.lang.Object");
    }

    public static /* synthetic */ ByteWriteChannel deflated$default(ByteWriteChannel byteWriteChannel, boolean z10, ObjectPool objectPool, m mVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        if ((i10 & 4) != 0) {
            mVar = Dispatchers.getUnconfined();
        }
        return deflated(byteWriteChannel, z10, (ObjectPool<ByteBuffer>) objectPool, mVar);
    }
}
