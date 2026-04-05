package io.ktor.utils.io;

import av.e;
import bv.d;
import bv.f;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import java.io.EOFException;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import p0.o2;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteReadChannelKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteReadChannelKt", f = "ByteReadChannel.kt", i = {0}, l = {261}, m = "copyAndClose", n = {"dst"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ByteReadChannelKt$copyAndClose$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelKt.copyAndClose(null, null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteReadChannelKt", f = "ByteReadChannel.kt", i = {0}, l = {232}, m = "discardExact", n = {"n"}, s = {"J$0"})
    /* renamed from: io.ktor.utils.io.ByteReadChannelKt$discardExact$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40791 extends d {
        long J$0;
        int label;
        /* synthetic */ Object result;

        public C40791(zu.d<? super C40791> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteReadChannelKt.discardExact(null, 0L, this);
        }
    }

    public static final boolean cancel(ByteReadChannel byteReadChannel) {
        e0.checkNotNullParameter(byteReadChannel, "<this>");
        return byteReadChannel.cancel(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyAndClose(io.ktor.utils.io.ByteReadChannel r4, io.ktor.utils.io.ByteWriteChannel r5, long r6, zu.d<? super java.lang.Long> r8) {
        /*
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteReadChannelKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.ByteReadChannelKt$copyAndClose$1 r0 = (io.ktor.utils.io.ByteReadChannelKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelKt$copyAndClose$1 r0 = new io.ktor.utils.io.ByteReadChannelKt$copyAndClose$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r5 = r4
            io.ktor.utils.io.ByteWriteChannel r5 = (io.ktor.utils.io.ByteWriteChannel) r5
            tu.a0.throwOnFailure(r8)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            tu.a0.throwOnFailure(r8)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r8 = io.ktor.utils.io.ByteReadChannelJVMKt.copyTo(r4, r5, r6, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            java.lang.Number r8 = (java.lang.Number) r8
            long r6 = r8.longValue()
            io.ktor.utils.io.ByteWriteChannelKt.close(r5)
            java.lang.Long r4 = bv.b.boxLong(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelKt.copyAndClose(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, long, zu.d):java.lang.Object");
    }

    public static /* synthetic */ Object copyAndClose$default(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j10, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return copyAndClose(byteReadChannel, byteWriteChannel, j10, dVar);
    }

    public static final Object copyTo(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, zu.d<? super Long> dVar) {
        return ByteReadChannelJVMKt.copyTo(byteReadChannel, byteWriteChannel, Long.MAX_VALUE, dVar);
    }

    public static final Object discard(ByteReadChannel byteReadChannel, zu.d<? super Long> dVar) {
        return byteReadChannel.discard(Long.MAX_VALUE, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object discardExact(io.ktor.utils.io.ByteReadChannel r4, long r5, zu.d<? super tu.x0> r7) throws java.io.EOFException {
        /*
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteReadChannelKt.C40791
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteReadChannelKt$discardExact$1 r0 = (io.ktor.utils.io.ByteReadChannelKt.C40791) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteReadChannelKt$discardExact$1 r0 = new io.ktor.utils.io.ByteReadChannelKt$discardExact$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            long r5 = r0.J$0
            tu.a0.throwOnFailure(r7)
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            tu.a0.throwOnFailure(r7)
            r0.J$0 = r5
            r0.label = r3
            java.lang.Object r7 = r4.discard(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 != 0) goto L4e
            tu.x0 r4 = tu.x0.f87415a
            return r4
        L4e:
            java.io.EOFException r4 = new java.io.EOFException
            java.lang.String r7 = "Unable to discard "
            java.lang.String r0 = " bytes"
            java.lang.String r5 = p0.o2.n(r5, r7, r0)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteReadChannelKt.discardExact(io.ktor.utils.io.ByteReadChannel, long, zu.d):java.lang.Object");
    }

    private static final Object discardExact$$forInline(ByteReadChannel byteReadChannel, long j10, zu.d<? super x0> dVar) throws EOFException {
        b0.mark(0);
        Object objDiscard = byteReadChannel.discard(j10, dVar);
        b0.mark(1);
        if (((Number) objDiscard).longValue() == j10) {
            return x0.f87415a;
        }
        throw new EOFException(o2.n(j10, "Unable to discard ", " bytes"));
    }

    public static final Object readAvailable(ByteReadChannel byteReadChannel, byte[] bArr, zu.d<? super Integer> dVar) {
        return byteReadChannel.readAvailable(bArr, 0, bArr.length, dVar);
    }

    public static final Object readFully(ByteReadChannel byteReadChannel, byte[] bArr, zu.d<? super x0> dVar) {
        Object fully = byteReadChannel.readFully(bArr, 0, bArr.length, dVar);
        return fully == e.getCOROUTINE_SUSPENDED() ? fully : x0.f87415a;
    }

    public static final Object readRemaining(ByteReadChannel byteReadChannel, zu.d<? super ByteReadPacket> dVar) {
        return byteReadChannel.readRemaining(Long.MAX_VALUE, dVar);
    }

    public static final Object readUTF8Line(ByteReadChannel byteReadChannel, zu.d<? super String> dVar) {
        return byteReadChannel.readUTF8Line(Integer.MAX_VALUE, dVar);
    }

    public static final Object readUTF8LineTo(ByteReadChannel byteReadChannel, Appendable appendable, zu.d<? super Boolean> dVar) {
        return byteReadChannel.readUTF8LineTo(appendable, Integer.MAX_VALUE, dVar);
    }

    public static final Object readFully(ByteReadChannel byteReadChannel, ChunkBuffer chunkBuffer, zu.d<? super x0> dVar) {
        Object fully = byteReadChannel.readFully(chunkBuffer, chunkBuffer.getLimit() - chunkBuffer.getWritePosition(), dVar);
        return fully == e.getCOROUTINE_SUSPENDED() ? fully : x0.f87415a;
    }
}
