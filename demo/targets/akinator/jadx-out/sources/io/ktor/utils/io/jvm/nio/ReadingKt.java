package io.ktor.utils.io.jvm.nio;

import bv.d;
import bv.f;
import com.ironsource.Q6;
import io.ktor.utils.io.ByteWriteChannel;
import java.nio.channels.Pipe;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ReadingKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.jvm.nio.ReadingKt", f = "Reading.kt", i = {0, 0, 0, 0, 0, 0}, l = {42}, m = "copyTo", n = {"ch", "copied", Q6.f35310w1, "copy", "limit", "needFlush"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "I$0"})
    /* renamed from: io.ktor.utils.io.jvm.nio.ReadingKt$copyTo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadingKt.copyTo((ReadableByteChannel) null, (ByteWriteChannel) null, 0L, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.nio.channels.ReadableByteChannel] */
    /* JADX WARN: Type inference failed for: r13v1, types: [kv.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009b -> B:31:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyTo(java.nio.channels.ReadableByteChannel r10, io.ktor.utils.io.ByteWriteChannel r11, long r12, zu.d<? super java.lang.Long> r14) {
        /*
            boolean r0 = r14 instanceof io.ktor.utils.io.jvm.nio.ReadingKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r14
            io.ktor.utils.io.jvm.nio.ReadingKt$copyTo$1 r0 = (io.ktor.utils.io.jvm.nio.ReadingKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.jvm.nio.ReadingKt$copyTo$1 r0 = new io.ktor.utils.io.jvm.nio.ReadingKt$copyTo$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L49
            if (r2 != r3) goto L41
            int r10 = r0.I$0
            long r11 = r0.J$0
            java.lang.Object r13 = r0.L$3
            kv.l r13 = (kv.l) r13
            java.lang.Object r2 = r0.L$2
            kotlin.jvm.internal.w0 r2 = (kotlin.jvm.internal.w0) r2
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.internal.a1 r4 = (kotlin.jvm.internal.a1) r4
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.ByteWriteChannel r5 = (io.ktor.utils.io.ByteWriteChannel) r5
            tu.a0.throwOnFailure(r14)
            r7 = r4
            r4 = r13
            r12 = r11
            r11 = r5
            goto L9e
        L41:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L49:
            tu.a0.throwOnFailure(r14)
            r4 = 0
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 < 0) goto La9
            boolean r14 = r10 instanceof java.nio.channels.SelectableChannel
            if (r14 == 0) goto L68
            r14 = r10
            java.nio.channels.SelectableChannel r14 = (java.nio.channels.SelectableChannel) r14
            boolean r14 = r14.isBlocking()
            if (r14 == 0) goto L60
            goto L68
        L60:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Non-blocking channels are not supported"
            r10.<init>(r11)
            throw r10
        L68:
            kotlin.jvm.internal.a1 r7 = new kotlin.jvm.internal.a1
            r7.<init>()
            kotlin.jvm.internal.w0 r9 = new kotlin.jvm.internal.w0
            r9.<init>()
            io.ktor.utils.io.jvm.nio.ReadingKt$copyTo$copy$1 r4 = new io.ktor.utils.io.jvm.nio.ReadingKt$copyTo$copy$1
            r8 = r10
            r5 = r12
            r4.<init>(r5, r7, r8, r9)
            boolean r10 = r11.getAutoFlush()
            r10 = r10 ^ r3
            r2 = r9
        L7f:
            long r5 = r7.f71813b
            int r14 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r14 >= 0) goto La4
            boolean r14 = r2.f71863b
            if (r14 != 0) goto La4
            r0.L$0 = r11
            r0.L$1 = r7
            r0.L$2 = r2
            r0.L$3 = r4
            r0.J$0 = r12
            r0.I$0 = r10
            r0.label = r3
            java.lang.Object r14 = r11.write(r3, r4, r0)
            if (r14 != r1) goto L9e
            return r1
        L9e:
            if (r10 == 0) goto L7f
            r11.flush()
            goto L7f
        La4:
            java.lang.Long r10 = bv.b.boxLong(r5)
            return r10
        La9:
            r5 = r12
            java.lang.String r10 = "Limit shouldn't be negative: "
            java.lang.String r10 = p0.o2.m(r5, r10)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.nio.ReadingKt.copyTo(java.nio.channels.ReadableByteChannel, io.ktor.utils.io.ByteWriteChannel, long, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object copyTo$default(ReadableByteChannel readableByteChannel, ByteWriteChannel byteWriteChannel, long j10, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return copyTo(readableByteChannel, byteWriteChannel, j10, (zu.d<? super Long>) dVar);
    }

    public static /* synthetic */ Object copyTo$default(Pipe pipe, ByteWriteChannel byteWriteChannel, long j10, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return copyTo(pipe, byteWriteChannel, j10, (zu.d<? super Long>) dVar);
    }

    public static final Object copyTo(Pipe pipe, ByteWriteChannel byteWriteChannel, long j10, zu.d<? super Long> dVar) {
        Pipe.SourceChannel sourceChannelSource = pipe.source();
        e0.checkNotNullExpressionValue(sourceChannelSource, "source()");
        return copyTo(sourceChannelSource, byteWriteChannel, j10, dVar);
    }
}
