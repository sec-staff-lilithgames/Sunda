package io.ktor.utils.io;

import a.b;
import av.e;
import bv.d;
import bv.f;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.Buffer;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import kotlin.jvm.internal.b0;
import kv.q;
import qv.v;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ReadSessionKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ReadSessionKt", f = "ReadSession.kt", i = {0, 0, 1, 1, 1, 2}, l = {24, 28, 31}, m = "read", n = {"$this$read", "block", "$this$read", "buffer", "bytesRead", "cause"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "L$0"})
    /* renamed from: io.ktor.utils.io.ReadSessionKt$read$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int I$0;
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
            return ReadSessionKt.read(null, 0, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ReadSessionKt", f = "ReadSession.kt", i = {0}, l = {Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "requestBufferFallback", n = {"chunk"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ReadSessionKt$requestBufferFallback$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40911 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40911(zu.d<? super C40911> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadSessionKt.requestBufferFallback(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ReadSessionKt", f = "ReadSession.kt", i = {0}, l = {Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE}, m = "requestBufferSuspend", n = {"$this$requestBufferSuspend"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.ReadSessionKt$requestBufferSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40921 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C40921(zu.d<? super C40921> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadSessionKt.requestBufferSuspend(null, 0, this);
        }
    }

    public static final Object completeReadingFromBuffer(ByteReadChannel byteReadChannel, Buffer buffer, int i10, zu.d<? super x0> dVar) {
        if (i10 < 0) {
            throw new IllegalStateException(b.e(i10, "bytesRead shouldn't be negative: ").toString());
        }
        SuspendableReadSession sessionFor = readSessionFor(byteReadChannel);
        x0 x0Var = x0.f87415a;
        if (sessionFor != null) {
            sessionFor.discard(i10);
            if (byteReadChannel instanceof HasReadSession) {
                ((HasReadSession) byteReadChannel).endReadSession();
            }
            return x0Var;
        }
        if (buffer instanceof ChunkBuffer) {
            ChunkBuffer.Companion companion = ChunkBuffer.Companion;
            if (buffer != companion.getEmpty()) {
                ((ChunkBuffer) buffer).release(companion.getPool());
                Object objDiscard = byteReadChannel.discard(i10, dVar);
                if (objDiscard == e.getCOROUTINE_SUSPENDED()) {
                    return objDiscard;
                }
            }
        }
        return x0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(2:13|14)(2:15|40))(5:16|43|17|33|34))(1:21))(3:22|(0)|39)|25|(1:27)(1:28)|41|29|(3:32|33|34)|39) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        r10 = r8;
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        throw r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object read(io.ktor.utils.io.ByteReadChannel r8, int r9, kv.q r10, zu.d<? super java.lang.Integer> r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof io.ktor.utils.io.ReadSessionKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.ReadSessionKt$read$1 r0 = (io.ktor.utils.io.ReadSessionKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ReadSessionKt$read$1 r0 = new io.ktor.utils.io.ReadSessionKt$read$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L5a
            if (r2 == r5) goto L4d
            if (r2 == r4) goto L3c
            if (r2 == r3) goto L33
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r8 = r0.L$0
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            tu.a0.throwOnFailure(r11)
            goto Lc4
        L3c:
            int r8 = r0.I$0
            java.lang.Object r9 = r0.L$1
            io.ktor.utils.io.core.Buffer r9 = (io.ktor.utils.io.core.Buffer) r9
            java.lang.Object r10 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r10 = (io.ktor.utils.io.ByteReadChannel) r10
            tu.a0.throwOnFailure(r11)     // Catch: java.lang.Throwable -> L4a
            goto Lac
        L4a:
            r8 = move-exception
            goto Lb5
        L4d:
            java.lang.Object r8 = r0.L$1
            r10 = r8
            kv.q r10 = (kv.q) r10
            java.lang.Object r8 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r8 = (io.ktor.utils.io.ByteReadChannel) r8
            tu.a0.throwOnFailure(r11)
            goto L6a
        L5a:
            tu.a0.throwOnFailure(r11)
            r0.L$0 = r8
            r0.L$1 = r10
            r0.label = r5
            java.lang.Object r11 = requestBuffer(r8, r9, r0)
            if (r11 != r1) goto L6a
            goto Lc3
        L6a:
            io.ktor.utils.io.core.Buffer r11 = (io.ktor.utils.io.core.Buffer) r11
            if (r11 != 0) goto L75
            io.ktor.utils.io.core.Buffer$Companion r9 = io.ktor.utils.io.core.Buffer.Companion
            io.ktor.utils.io.core.Buffer r9 = r9.getEmpty()
            goto L76
        L75:
            r9 = r11
        L76:
            java.nio.ByteBuffer r11 = r9.m4458getMemorySK3TCg8()     // Catch: java.lang.Throwable -> Lb1
            io.ktor.utils.io.bits.Memory r11 = io.ktor.utils.io.bits.Memory.m4313boximpl(r11)     // Catch: java.lang.Throwable -> Lb1
            int r2 = r9.getReadPosition()     // Catch: java.lang.Throwable -> Lb1
            long r5 = (long) r2     // Catch: java.lang.Throwable -> Lb1
            java.lang.Long r2 = bv.b.boxLong(r5)     // Catch: java.lang.Throwable -> Lb1
            int r5 = r9.getWritePosition()     // Catch: java.lang.Throwable -> Lb1
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lb1
            java.lang.Long r5 = bv.b.boxLong(r5)     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r10 = r10.invoke(r11, r2, r5)     // Catch: java.lang.Throwable -> Lb1
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> Lb1
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> Lb1
            r0.L$0 = r8     // Catch: java.lang.Throwable -> Lb1
            r0.L$1 = r9     // Catch: java.lang.Throwable -> Lb1
            r0.I$0 = r10     // Catch: java.lang.Throwable -> Lb1
            r0.label = r4     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r11 = completeReadingFromBuffer(r8, r9, r10, r0)     // Catch: java.lang.Throwable -> Lb1
            if (r11 != r1) goto La9
            goto Lc3
        La9:
            r7 = r10
            r10 = r8
            r8 = r7
        Lac:
            java.lang.Integer r8 = bv.b.boxInt(r8)     // Catch: java.lang.Throwable -> L4a
            return r8
        Lb1:
            r10 = move-exception
            r7 = r10
            r10 = r8
            r8 = r7
        Lb5:
            r0.L$0 = r8
            r11 = 0
            r0.L$1 = r11
            r0.label = r3
            r11 = 0
            java.lang.Object r9 = completeReadingFromBuffer(r10, r9, r11, r0)
            if (r9 != r1) goto Lc4
        Lc3:
            return r1
        Lc4:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ReadSessionKt.read(io.ktor.utils.io.ByteReadChannel, int, kv.q, zu.d):java.lang.Object");
    }

    private static final Object read$$forInline(ByteReadChannel byteReadChannel, int i10, q qVar, zu.d<? super Integer> dVar) {
        b0.mark(0);
        Object objRequestBuffer = requestBuffer(byteReadChannel, i10, dVar);
        b0.mark(1);
        Buffer empty = (Buffer) objRequestBuffer;
        if (empty == null) {
            empty = Buffer.Companion.getEmpty();
        }
        try {
            int iIntValue = ((Number) qVar.invoke(Memory.m4313boximpl(empty.m4458getMemorySK3TCg8()), Long.valueOf(empty.getReadPosition()), Long.valueOf(empty.getWritePosition()))).intValue();
            b0.mark(0);
            completeReadingFromBuffer(byteReadChannel, empty, iIntValue, dVar);
            b0.mark(1);
            return Integer.valueOf(iIntValue);
        } catch (Throwable th2) {
            b0.mark(0);
            completeReadingFromBuffer(byteReadChannel, empty, 0, dVar);
            b0.mark(1);
            throw th2;
        }
    }

    public static /* synthetic */ Object read$default(ByteReadChannel byteReadChannel, int i10, q qVar, zu.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        b0.mark(0);
        Object objRequestBuffer = requestBuffer(byteReadChannel, i10, dVar);
        b0.mark(1);
        Buffer empty = (Buffer) objRequestBuffer;
        if (empty == null) {
            empty = Buffer.Companion.getEmpty();
        }
        try {
            int iIntValue = ((Number) qVar.invoke(Memory.m4313boximpl(empty.m4458getMemorySK3TCg8()), Long.valueOf(empty.getReadPosition()), Long.valueOf(empty.getWritePosition()))).intValue();
            b0.mark(0);
            completeReadingFromBuffer(byteReadChannel, empty, iIntValue, dVar);
            b0.mark(1);
            return Integer.valueOf(iIntValue);
        } catch (Throwable th2) {
            b0.mark(0);
            completeReadingFromBuffer(byteReadChannel, empty, 0, dVar);
            b0.mark(1);
            throw th2;
        }
    }

    private static final SuspendableReadSession readSessionFor(ByteReadChannel byteReadChannel) {
        if (byteReadChannel instanceof HasReadSession) {
            return ((HasReadSession) byteReadChannel).startReadSession();
        }
        return null;
    }

    public static final Object requestBuffer(ByteReadChannel byteReadChannel, int i10, zu.d<? super Buffer> dVar) {
        SuspendableReadSession suspendableReadSessionStartReadSession = byteReadChannel instanceof SuspendableReadSession ? (SuspendableReadSession) byteReadChannel : byteReadChannel instanceof HasReadSession ? ((HasReadSession) byteReadChannel).startReadSession() : null;
        if (suspendableReadSessionStartReadSession == null) {
            return requestBufferFallback(byteReadChannel, i10, dVar);
        }
        ChunkBuffer chunkBufferRequest = suspendableReadSessionStartReadSession.request(v.coerceAtMost(i10, 8));
        return chunkBufferRequest != null ? chunkBufferRequest : requestBufferSuspend(suspendableReadSessionStartReadSession, i10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object requestBufferFallback(io.ktor.utils.io.ByteReadChannel r13, int r14, zu.d<? super io.ktor.utils.io.core.internal.ChunkBuffer> r15) {
        /*
            boolean r0 = r15 instanceof io.ktor.utils.io.ReadSessionKt.C40911
            if (r0 == 0) goto L14
            r0 = r15
            io.ktor.utils.io.ReadSessionKt$requestBufferFallback$1 r0 = (io.ktor.utils.io.ReadSessionKt.C40911) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r11 = r0
            goto L1a
        L14:
            io.ktor.utils.io.ReadSessionKt$requestBufferFallback$1 r0 = new io.ktor.utils.io.ReadSessionKt$requestBufferFallback$1
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r11.result
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r11.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r13 = r11.L$0
            io.ktor.utils.io.core.internal.ChunkBuffer r13 = (io.ktor.utils.io.core.internal.ChunkBuffer) r13
            tu.a0.throwOnFailure(r15)
            goto L6c
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            tu.a0.throwOnFailure(r15)
            io.ktor.utils.io.core.internal.ChunkBuffer$Companion r15 = io.ktor.utils.io.core.internal.ChunkBuffer.Companion
            io.ktor.utils.io.pool.ObjectPool r15 = r15.getPool()
            java.lang.Object r15 = r15.borrow()
            io.ktor.utils.io.core.internal.ChunkBuffer r15 = (io.ktor.utils.io.core.internal.ChunkBuffer) r15
            r1 = r2
            java.nio.ByteBuffer r2 = r15.m4458getMemorySK3TCg8()
            int r3 = r15.getWritePosition()
            long r3 = (long) r3
            long r7 = (long) r14
            int r14 = r15.getLimit()
            int r5 = r15.getWritePosition()
            int r14 = r14 - r5
            long r9 = (long) r14
            r11.L$0 = r15
            r11.label = r1
            r5 = 0
            r1 = r13
            java.lang.Object r13 = r1.mo4303peekTolBXzO7A(r2, r3, r5, r7, r9, r11)
            if (r13 != r0) goto L69
            return r0
        L69:
            r12 = r15
            r15 = r13
            r13 = r12
        L6c:
            java.lang.Number r15 = (java.lang.Number) r15
            long r14 = r15.longValue()
            int r14 = (int) r14
            r13.commitWritten(r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ReadSessionKt.requestBufferFallback(io.ktor.utils.io.ByteReadChannel, int, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object requestBufferSuspend(io.ktor.utils.io.SuspendableReadSession r4, int r5, zu.d<? super io.ktor.utils.io.core.Buffer> r6) {
        /*
            boolean r0 = r6 instanceof io.ktor.utils.io.ReadSessionKt.C40921
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ReadSessionKt$requestBufferSuspend$1 r0 = (io.ktor.utils.io.ReadSessionKt.C40921) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ReadSessionKt$requestBufferSuspend$1 r0 = new io.ktor.utils.io.ReadSessionKt$requestBufferSuspend$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.SuspendableReadSession r4 = (io.ktor.utils.io.SuspendableReadSession) r4
            tu.a0.throwOnFailure(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.await(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            io.ktor.utils.io.core.internal.ChunkBuffer r4 = r4.request(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ReadSessionKt.requestBufferSuspend(io.ktor.utils.io.SuspendableReadSession, int, zu.d):java.lang.Object");
    }
}
