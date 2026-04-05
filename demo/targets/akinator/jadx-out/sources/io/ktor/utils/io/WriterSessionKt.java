package io.ktor.utils.io;

import av.e;
import bv.d;
import bv.f;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.Buffer;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import kotlin.jvm.internal.b0;
import kv.q;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WriterSessionKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.WriterSessionKt", f = "WriterSession.kt", i = {0}, l = {83}, m = "completeWritingFallback", n = {"buffer"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.WriterSessionKt$completeWritingFallback$1, reason: invalid class name */
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
            return WriterSessionKt.completeWritingFallback(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.WriterSessionKt", f = "WriterSession.kt", i = {0, 0}, l = {22, 29, 29}, m = "write", n = {"$this$write", "block"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.WriterSessionKt$write$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40931 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40931(zu.d<? super C40931> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WriterSessionKt.write(null, 0, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.WriterSessionKt", f = "WriterSession.kt", i = {0, 0}, l = {93}, m = "writeBufferSuspend", n = {"session", "desiredSpace"}, s = {"L$0", "I$0"})
    /* renamed from: io.ktor.utils.io.WriterSessionKt$writeBufferSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40941 extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40941(zu.d<? super C40941> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WriterSessionKt.writeBufferSuspend(null, 0, this);
        }
    }

    public static final Object completeWriting(ByteWriteChannel byteWriteChannel, Buffer buffer, int i10, zu.d<? super x0> dVar) {
        boolean z10 = byteWriteChannel instanceof HasWriteSession;
        x0 x0Var = x0.f87415a;
        if (z10) {
            ((HasWriteSession) byteWriteChannel).endWriteSession(i10);
            return x0Var;
        }
        Object objCompleteWritingFallback = completeWritingFallback(byteWriteChannel, buffer, dVar);
        return objCompleteWritingFallback == e.getCOROUTINE_SUSPENDED() ? objCompleteWritingFallback : x0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object completeWritingFallback(io.ktor.utils.io.ByteWriteChannel r4, io.ktor.utils.io.core.Buffer r5, zu.d<? super tu.x0> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.WriterSessionKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.WriterSessionKt$completeWritingFallback$1 r0 = (io.ktor.utils.io.WriterSessionKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.WriterSessionKt$completeWritingFallback$1 r0 = new io.ktor.utils.io.WriterSessionKt$completeWritingFallback$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r5 = r4
            io.ktor.utils.io.core.Buffer r5 = (io.ktor.utils.io.core.Buffer) r5
            tu.a0.throwOnFailure(r6)
            goto L48
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            tu.a0.throwOnFailure(r6)
            boolean r6 = r5 instanceof io.ktor.utils.io.core.internal.ChunkBuffer
            if (r6 == 0) goto L56
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.writeFully(r5, r0)
            if (r4 != r1) goto L48
            return r1
        L48:
            io.ktor.utils.io.core.internal.ChunkBuffer r5 = (io.ktor.utils.io.core.internal.ChunkBuffer) r5
            io.ktor.utils.io.core.internal.ChunkBuffer$Companion r4 = io.ktor.utils.io.core.internal.ChunkBuffer.Companion
            io.ktor.utils.io.pool.ObjectPool r4 = r4.getPool()
            r5.release(r4)
            tu.x0 r4 = tu.x0.f87415a
            return r4
        L56:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "Only ChunkBuffer instance is supported."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.WriterSessionKt.completeWritingFallback(io.ktor.utils.io.ByteWriteChannel, io.ktor.utils.io.core.Buffer, zu.d):java.lang.Object");
    }

    public static final Object requestWriteBuffer(ByteWriteChannel byteWriteChannel, int i10, zu.d<? super Buffer> dVar) {
        WriterSuspendSession writerSuspendSessionWriteSessionFor = writeSessionFor(byteWriteChannel);
        if (writerSuspendSessionWriteSessionFor == null) {
            return writeBufferFallback();
        }
        ChunkBuffer chunkBufferRequest = writerSuspendSessionWriteSessionFor.request(i10);
        return chunkBufferRequest != null ? chunkBufferRequest : writeBufferSuspend(writerSuspendSessionWriteSessionFor, i10, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(2:13|14)(3:15|37|38))(3:16|30|31))(1:17))(3:18|(0)|35)|21|(1:23)|24|39|25|26|(3:29|30|31)|35) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        kotlin.jvm.internal.b0.finallyStart(1);
        r0.L$0 = r12;
        r0.L$1 = null;
        r0.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (completeWriting(r10, r13, r2, r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        r10 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object write(io.ktor.utils.io.ByteWriteChannel r10, int r11, kv.q r12, zu.d<? super java.lang.Integer> r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof io.ktor.utils.io.WriterSessionKt.C40931
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.WriterSessionKt$write$1 r0 = (io.ktor.utils.io.WriterSessionKt.C40931) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.WriterSessionKt$write$1 r0 = new io.ktor.utils.io.WriterSessionKt$write$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L51
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 == r3) goto L33
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            java.lang.Object r10 = r0.L$0
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            tu.a0.throwOnFailure(r13)
            goto Lbf
        L3c:
            java.lang.Object r10 = r0.L$0
            java.lang.Integer r10 = (java.lang.Integer) r10
            tu.a0.throwOnFailure(r13)
            goto La9
        L44:
            java.lang.Object r10 = r0.L$1
            r12 = r10
            kv.q r12 = (kv.q) r12
            java.lang.Object r10 = r0.L$0
            io.ktor.utils.io.ByteWriteChannel r10 = (io.ktor.utils.io.ByteWriteChannel) r10
            tu.a0.throwOnFailure(r13)
            goto L61
        L51:
            tu.a0.throwOnFailure(r13)
            r0.L$0 = r10
            r0.L$1 = r12
            r0.label = r5
            java.lang.Object r13 = requestWriteBuffer(r10, r11, r0)
            if (r13 != r1) goto L61
            goto Lbd
        L61:
            io.ktor.utils.io.core.Buffer r13 = (io.ktor.utils.io.core.Buffer) r13
            if (r13 != 0) goto L6b
            io.ktor.utils.io.core.Buffer$Companion r11 = io.ktor.utils.io.core.Buffer.Companion
            io.ktor.utils.io.core.Buffer r13 = r11.getEmpty()
        L6b:
            r11 = 0
            r2 = 0
            java.nio.ByteBuffer r6 = r13.m4458getMemorySK3TCg8()     // Catch: java.lang.Throwable -> Lad
            io.ktor.utils.io.bits.Memory r6 = io.ktor.utils.io.bits.Memory.m4313boximpl(r6)     // Catch: java.lang.Throwable -> Lad
            int r7 = r13.getWritePosition()     // Catch: java.lang.Throwable -> Lad
            long r7 = (long) r7     // Catch: java.lang.Throwable -> Lad
            java.lang.Long r7 = bv.b.boxLong(r7)     // Catch: java.lang.Throwable -> Lad
            int r8 = r13.getLimit()     // Catch: java.lang.Throwable -> Lad
            long r8 = (long) r8     // Catch: java.lang.Throwable -> Lad
            java.lang.Long r8 = bv.b.boxLong(r8)     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r12 = r12.invoke(r6, r7, r8)     // Catch: java.lang.Throwable -> Lad
            java.lang.Number r12 = (java.lang.Number) r12     // Catch: java.lang.Throwable -> Lad
            int r2 = r12.intValue()     // Catch: java.lang.Throwable -> Lad
            r13.commitWritten(r2)     // Catch: java.lang.Throwable -> Lad
            java.lang.Integer r12 = bv.b.boxInt(r2)     // Catch: java.lang.Throwable -> Lad
            kotlin.jvm.internal.b0.finallyStart(r5)
            r0.L$0 = r12
            r0.L$1 = r11
            r0.label = r4
            java.lang.Object r10 = completeWriting(r10, r13, r2, r0)
            if (r10 != r1) goto La8
            goto Lbd
        La8:
            r10 = r12
        La9:
            kotlin.jvm.internal.b0.finallyEnd(r5)
            return r10
        Lad:
            r12 = move-exception
            kotlin.jvm.internal.b0.finallyStart(r5)
            r0.L$0 = r12
            r0.L$1 = r11
            r0.label = r3
            java.lang.Object r10 = completeWriting(r10, r13, r2, r0)
            if (r10 != r1) goto Lbe
        Lbd:
            return r1
        Lbe:
            r10 = r12
        Lbf:
            kotlin.jvm.internal.b0.finallyEnd(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.WriterSessionKt.write(io.ktor.utils.io.ByteWriteChannel, int, kv.q, zu.d):java.lang.Object");
    }

    private static final Object write$$forInline(ByteWriteChannel byteWriteChannel, int i10, q qVar, zu.d<? super Integer> dVar) throws Throwable {
        int iIntValue;
        b0.mark(0);
        Object objRequestWriteBuffer = requestWriteBuffer(byteWriteChannel, i10, dVar);
        b0.mark(1);
        Buffer empty = (Buffer) objRequestWriteBuffer;
        if (empty == null) {
            empty = Buffer.Companion.getEmpty();
        }
        try {
            iIntValue = ((Number) qVar.invoke(Memory.m4313boximpl(empty.m4458getMemorySK3TCg8()), Long.valueOf(empty.getWritePosition()), Long.valueOf(empty.getLimit()))).intValue();
            try {
                empty.commitWritten(iIntValue);
                Integer numValueOf = Integer.valueOf(iIntValue);
                b0.finallyStart(1);
                b0.mark(0);
                completeWriting(byteWriteChannel, empty, iIntValue, dVar);
                b0.mark(1);
                b0.finallyEnd(1);
                return numValueOf;
            } catch (Throwable th2) {
                th = th2;
                b0.finallyStart(1);
                b0.mark(0);
                completeWriting(byteWriteChannel, empty, iIntValue, dVar);
                b0.mark(1);
                b0.finallyEnd(1);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            iIntValue = 0;
        }
    }

    public static /* synthetic */ Object write$default(ByteWriteChannel byteWriteChannel, int i10, q qVar, zu.d dVar, int i11, Object obj) throws Throwable {
        int iIntValue;
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        b0.mark(0);
        Object objRequestWriteBuffer = requestWriteBuffer(byteWriteChannel, i10, dVar);
        b0.mark(1);
        Buffer empty = (Buffer) objRequestWriteBuffer;
        if (empty == null) {
            empty = Buffer.Companion.getEmpty();
        }
        try {
            iIntValue = ((Number) qVar.invoke(Memory.m4313boximpl(empty.m4458getMemorySK3TCg8()), Long.valueOf(empty.getWritePosition()), Long.valueOf(empty.getLimit()))).intValue();
            try {
                empty.commitWritten(iIntValue);
                Integer numValueOf = Integer.valueOf(iIntValue);
                b0.finallyStart(1);
                b0.mark(0);
                completeWriting(byteWriteChannel, empty, iIntValue, dVar);
                b0.mark(1);
                b0.finallyEnd(1);
                return numValueOf;
            } catch (Throwable th2) {
                th = th2;
                b0.finallyStart(1);
                b0.mark(0);
                completeWriting(byteWriteChannel, empty, iIntValue, dVar);
                b0.mark(1);
                b0.finallyEnd(1);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            iIntValue = 0;
        }
    }

    private static final Buffer writeBufferFallback() {
        ChunkBuffer chunkBufferBorrow = ChunkBuffer.Companion.getPool().borrow();
        ChunkBuffer chunkBuffer = chunkBufferBorrow;
        chunkBuffer.resetForWrite();
        chunkBuffer.reserveEndGap(8);
        return chunkBufferBorrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object writeBufferSuspend(io.ktor.utils.io.WriterSuspendSession r4, int r5, zu.d<? super io.ktor.utils.io.core.Buffer> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.WriterSessionKt.C40941
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.WriterSessionKt$writeBufferSuspend$1 r0 = (io.ktor.utils.io.WriterSessionKt.C40941) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.WriterSessionKt$writeBufferSuspend$1 r0 = new io.ktor.utils.io.WriterSessionKt$writeBufferSuspend$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r5 = r0.I$0
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.WriterSuspendSession r4 = (io.ktor.utils.io.WriterSuspendSession) r4
            tu.a0.throwOnFailure(r6)
            goto L47
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r4
            r0.I$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.tryAwait(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            io.ktor.utils.io.core.internal.ChunkBuffer r5 = r4.request(r5)
            if (r5 == 0) goto L4e
            return r5
        L4e:
            io.ktor.utils.io.core.internal.ChunkBuffer r4 = r4.request(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.WriterSessionKt.writeBufferSuspend(io.ktor.utils.io.WriterSuspendSession, int, zu.d):java.lang.Object");
    }

    private static final WriterSuspendSession writeSessionFor(ByteWriteChannel byteWriteChannel) {
        if (byteWriteChannel instanceof HasWriteSession) {
            return ((HasWriteSession) byteWriteChannel).beginWriteSession();
        }
        return null;
    }
}
