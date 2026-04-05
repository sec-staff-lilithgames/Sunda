package io.ktor.utils.io.jvm.nio;

import bv.d;
import bv.f;
import io.ktor.utils.io.ByteReadChannel;
import java.nio.channels.Pipe;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WritingKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.jvm.nio.WritingKt", f = "Writing.kt", i = {0, 0, 0, 0}, l = {50}, m = "copyTo", n = {"$this$copyTo", "copied", "copy", "limit"}, s = {"L$0", "L$1", "L$2", "J$0"})
    /* renamed from: io.ktor.utils.io.jvm.nio.WritingKt$copyTo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        long J$0;
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
            return WritingKt.copyTo((ByteReadChannel) null, (WritableByteChannel) null, 0L, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[PHI: r2 r7 r9 r11
      0x007f: PHI (r2v2 io.ktor.utils.io.jvm.nio.WritingKt$copyTo$copy$1) = (r2v1 io.ktor.utils.io.jvm.nio.WritingKt$copyTo$copy$1), (r2v3 io.ktor.utils.io.jvm.nio.WritingKt$copyTo$copy$1) binds: [B:30:0x0075, B:37:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r7v11 io.ktor.utils.io.ByteReadChannel) = (r7v0 io.ktor.utils.io.ByteReadChannel), (r7v12 io.ktor.utils.io.ByteReadChannel) binds: [B:30:0x0075, B:37:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r9v1 long) = (r9v0 long), (r9v2 long) binds: [B:30:0x0075, B:37:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r11v10 kotlin.jvm.internal.a1) = (r11v5 kotlin.jvm.internal.a1), (r11v11 kotlin.jvm.internal.a1) binds: [B:30:0x0075, B:37:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.nio.channels.WritableByteChannel] */
    /* JADX WARN: Type inference failed for: r9v4, types: [kv.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0094 -> B:36:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyTo(io.ktor.utils.io.ByteReadChannel r7, java.nio.channels.WritableByteChannel r8, long r9, zu.d<? super java.lang.Long> r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof io.ktor.utils.io.jvm.nio.WritingKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.jvm.nio.WritingKt$copyTo$1 r0 = (io.ktor.utils.io.jvm.nio.WritingKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.jvm.nio.WritingKt$copyTo$1 r0 = new io.ktor.utils.io.jvm.nio.WritingKt$copyTo$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            long r7 = r0.J$0
            java.lang.Object r9 = r0.L$2
            kv.l r9 = (kv.l) r9
            java.lang.Object r10 = r0.L$1
            kotlin.jvm.internal.a1 r10 = (kotlin.jvm.internal.a1) r10
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r2 = (io.ktor.utils.io.ByteReadChannel) r2
            tu.a0.throwOnFailure(r11)
            r11 = r10
            r6 = r2
            r2 = r9
            r9 = r7
            r7 = r6
            goto L97
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            tu.a0.throwOnFailure(r11)
            r4 = 0
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 < 0) goto Lab
            boolean r11 = r8 instanceof java.nio.channels.SelectableChannel
            if (r11 == 0) goto L63
            r11 = r8
            java.nio.channels.SelectableChannel r11 = (java.nio.channels.SelectableChannel) r11
            boolean r11 = r11.isBlocking()
            if (r11 == 0) goto L5b
            goto L63
        L5b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Non-blocking channels are not supported"
            r7.<init>(r8)
            throw r7
        L63:
            boolean r11 = r7.isClosedForRead()
            if (r11 == 0) goto L75
            java.lang.Throwable r7 = r7.getClosedCause()
            if (r7 != 0) goto L74
            java.lang.Long r7 = bv.b.boxLong(r4)
            return r7
        L74:
            throw r7
        L75:
            kotlin.jvm.internal.a1 r11 = new kotlin.jvm.internal.a1
            r11.<init>()
            io.ktor.utils.io.jvm.nio.WritingKt$copyTo$copy$1 r2 = new io.ktor.utils.io.jvm.nio.WritingKt$copyTo$copy$1
            r2.<init>(r9, r11, r8)
        L7f:
            long r4 = r11.f71813b
            int r8 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r8 >= 0) goto L9d
            r0.L$0 = r7
            r0.L$1 = r11
            r0.L$2 = r2
            r0.J$0 = r9
            r0.label = r3
            r8 = 0
            java.lang.Object r8 = r7.read(r8, r2, r0)
            if (r8 != r1) goto L97
            return r1
        L97:
            boolean r8 = r7.isClosedForRead()
            if (r8 == 0) goto L7f
        L9d:
            java.lang.Throwable r7 = r7.getClosedCause()
            if (r7 != 0) goto Laa
            long r7 = r11.f71813b
            java.lang.Long r7 = bv.b.boxLong(r7)
            return r7
        Laa:
            throw r7
        Lab:
            java.lang.String r7 = "Limit shouldn't be negative: "
            java.lang.String r7 = p0.o2.m(r9, r7)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.nio.WritingKt.copyTo(io.ktor.utils.io.ByteReadChannel, java.nio.channels.WritableByteChannel, long, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object copyTo$default(ByteReadChannel byteReadChannel, WritableByteChannel writableByteChannel, long j10, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return copyTo(byteReadChannel, writableByteChannel, j10, (zu.d<? super Long>) dVar);
    }

    public static /* synthetic */ Object copyTo$default(ByteReadChannel byteReadChannel, Pipe pipe, long j10, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return copyTo(byteReadChannel, pipe, j10, (zu.d<? super Long>) dVar);
    }

    public static final Object copyTo(ByteReadChannel byteReadChannel, Pipe pipe, long j10, zu.d<? super Long> dVar) {
        Pipe.SinkChannel sinkChannelSink = pipe.sink();
        e0.checkNotNullExpressionValue(sinkChannelSink, "pipe.sink()");
        return copyTo(byteReadChannel, sinkChannelSink, j10, dVar);
    }
}
