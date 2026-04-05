package io.ktor.utils.io;

import av.e;
import bv.b;
import bv.f;
import e3.g;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.ByteBuffersKt;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kv.l;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteChannelSequentialJVM extends ByteChannelSequentialBase {
    private volatile Job attachedJob;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Session implements LookAheadSuspendSession {
        private final ByteChannelSequentialJVM channel;

        public Session(ByteChannelSequentialJVM channel) {
            e0.checkNotNullParameter(channel, "channel");
            this.channel = channel;
        }

        @Override // io.ktor.utils.io.LookAheadSuspendSession
        public Object awaitAtLeast(int i10, d<? super Boolean> dVar) throws Throwable {
            Throwable closedCause = this.channel.getClosedCause();
            if (closedCause == null) {
                return this.channel.await(i10, dVar);
            }
            throw closedCause;
        }

        @Override // io.ktor.utils.io.LookAheadSession
        /* renamed from: consumed */
        public void mo4580consumed(int i10) throws Throwable {
            Throwable closedCause = this.channel.getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            this.channel.discard(i10);
        }

        @Override // io.ktor.utils.io.LookAheadSession
        public ByteBuffer request(int i10, int i11) throws Throwable {
            Throwable closedCause = this.channel.getClosedCause();
            if (closedCause != null) {
                throw closedCause;
            }
            if (this.channel.isClosedForRead()) {
                return null;
            }
            if (this.channel.getReadable().getEndOfInput()) {
                this.channel.prepareFlushedBytes();
            }
            ChunkBuffer head = this.channel.getReadable().getHead();
            if (head.getWritePosition() - head.getReadPosition() < i11 + i10) {
                return null;
            }
            ByteBuffer byteBufferSlice = head.m4458getMemorySK3TCg8().slice();
            byteBufferSlice.position(head.getReadPosition() + i10);
            byteBufferSlice.limit(head.getWritePosition());
            return byteBufferSlice;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialJVM$attachJob$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return x0.f87415a;
        }

        public final void invoke(Throwable th2) {
            ByteChannelSequentialJVM.this.attachedJob = null;
            if (th2 != null) {
                ByteChannelSequentialJVM.this.cancel(ExceptionUtilsKt.unwrapCancellationException(th2));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialJVM", f = "ByteChannelSequentialJVM.kt", i = {0, 0, 0}, l = {196}, m = "read", n = {"this", "consumer", "min"}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialJVM$read$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40711 extends bv.d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40711(d<? super C40711> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialJVM.this.read(0, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialJVM", f = "ByteChannelSequentialJVM.kt", i = {0, 0}, l = {112, 113}, m = "readAvailableSuspend", n = {"this", "dst"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialJVM$readAvailableSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40721 extends bv.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40721(d<? super C40721> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialJVM.this.readAvailableSuspend(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialJVM", f = "ByteChannelSequentialJVM.kt", i = {0, 0, 0}, l = {128}, m = "readFullySuspend", n = {"this", "dst", "count"}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialJVM$readFullySuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40731 extends bv.d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40731(d<? super C40731> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialJVM.this.readFullySuspend((ByteBuffer) null, 0, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialJVM", f = "ByteChannelSequentialJVM.kt", i = {0, 0, 0}, l = {234}, m = "write", n = {"this", "block", "min"}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialJVM$write$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40741 extends bv.d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40741(d<? super C40741> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialJVM.this.write(0, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialJVM", f = "ByteChannelSequentialJVM.kt", i = {0, 0}, l = {41, 42}, m = "writeAvailableSuspend", n = {"this", "src"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialJVM$writeAvailableSuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40751 extends bv.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40751(d<? super C40751> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialJVM.this.writeAvailableSuspend((ByteBuffer) null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialJVM", f = "ByteChannelSequentialJVM.kt", i = {0, 0}, l = {54}, m = "writeFullySuspend", n = {"this", "src"}, s = {"L$0", "L$1"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialJVM$writeFullySuspend$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40761 extends bv.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C40761(d<? super C40761> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialJVM.this.writeFullySuspend(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.ByteChannelSequentialJVM", f = "ByteChannelSequentialJVM.kt", i = {0, 0, 0}, l = {246}, m = "writeWhile", n = {"this", "block", "shouldContinue"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: io.ktor.utils.io.ByteChannelSequentialJVM$writeWhile$1, reason: invalid class name and case insensitive filesystem */
    public static final class C40771 extends bv.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C40771(d<? super C40771> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ByteChannelSequentialJVM.this.writeWhile(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelSequentialJVM(ChunkBuffer initial, boolean z10) {
        super(initial, z10, null, 4, null);
        e0.checkNotNullParameter(initial, "initial");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readAvailableSuspend(java.nio.ByteBuffer r6, zu.d<? super java.lang.Integer> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteChannelSequentialJVM.C40721
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteChannelSequentialJVM$readAvailableSuspend$1 r0 = (io.ktor.utils.io.ByteChannelSequentialJVM.C40721) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialJVM$readAvailableSuspend$1 r0 = new io.ktor.utils.io.ByteChannelSequentialJVM$readAvailableSuspend$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialJVM r2 = (io.ktor.utils.io.ByteChannelSequentialJVM) r2
            tu.a0.throwOnFailure(r7)
            goto L51
        L40:
            tu.a0.throwOnFailure(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.await(r4, r0)
            if (r7 != r1) goto L50
            goto L6c
        L50:
            r2 = r5
        L51:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5f
            r6 = -1
            java.lang.Integer r6 = bv.b.boxInt(r6)
            return r6
        L5f:
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r6 = r2.readAvailable(r6, r0)
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialJVM.readAvailableSuspend(java.nio.ByteBuffer, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0054 -> B:20:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readFullySuspend(java.nio.ByteBuffer r8, int r9, zu.d<? super java.lang.Integer> r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.ByteChannelSequentialJVM.C40731
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.ByteChannelSequentialJVM$readFullySuspend$1 r0 = (io.ktor.utils.io.ByteChannelSequentialJVM.C40731) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialJVM$readFullySuspend$1 r0 = new io.ktor.utils.io.ByteChannelSequentialJVM$readFullySuspend$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r8 = r0.I$0
            java.lang.Object r9 = r0.L$1
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialJVM r2 = (io.ktor.utils.io.ByteChannelSequentialJVM) r2
            tu.a0.throwOnFailure(r10)
            r6 = r9
            r9 = r8
            r8 = r6
            goto L57
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            tu.a0.throwOnFailure(r10)
            r2 = r7
        L42:
            boolean r10 = r8.hasRemaining()
            if (r10 == 0) goto L76
            r0.L$0 = r2
            r0.L$1 = r8
            r0.I$0 = r9
            r0.label = r3
            java.lang.Object r10 = r2.await(r3, r0)
            if (r10 != r1) goto L57
            return r1
        L57:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            java.lang.String r4 = "Channel closed"
            if (r10 == 0) goto L70
            int r10 = r2.tryReadAvailable(r8)
            r5 = -1
            if (r10 == r5) goto L6a
            int r9 = r9 + r10
            goto L42
        L6a:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>(r4)
            throw r8
        L70:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>(r4)
            throw r8
        L76:
            java.lang.Integer r8 = bv.b.boxInt(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialJVM.readFullySuspend(java.nio.ByteBuffer, int, zu.d):java.lang.Object");
    }

    private final int tryReadAvailable(ByteBuffer byteBuffer) throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        if (getClosed() && getAvailableForRead() == 0) {
            return -1;
        }
        if (!getReadable().canRead()) {
            prepareFlushedBytes();
        }
        int available = ByteBuffersKt.readAvailable(getReadable(), byteBuffer);
        afterRead(available);
        return available;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int tryWriteAvailable(java.nio.ByteBuffer r4) throws java.lang.Throwable {
        /*
            r3 = this;
            int r0 = r4.remaining()
            int r1 = r3.getAvailableForWrite()
            boolean r2 = r3.getClosed()
            if (r2 == 0) goto L1c
            java.lang.Throwable r4 = r3.getClosedCause()
            if (r4 != 0) goto L1b
            kotlinx.coroutines.channels.ClosedSendChannelException r4 = new kotlinx.coroutines.channels.ClosedSendChannelException
            java.lang.String r0 = "Channel closed for write"
            r4.<init>(r0)
        L1b:
            throw r4
        L1c:
            r2 = 0
            if (r0 != 0) goto L21
        L1f:
            r0 = r2
            goto L45
        L21:
            if (r0 > r1) goto L2b
            io.ktor.utils.io.core.BytePacketBuilder r1 = r3.getWritable()
            io.ktor.utils.io.core.OutputArraysJVMKt.writeFully(r1, r4)
            goto L45
        L2b:
            if (r1 != 0) goto L2e
            goto L1f
        L2e:
            int r0 = r4.limit()
            int r2 = r4.position()
            int r2 = r2 + r1
            r4.limit(r2)
            io.ktor.utils.io.core.BytePacketBuilder r2 = r3.getWritable()
            io.ktor.utils.io.core.OutputArraysJVMKt.writeFully(r2, r4)
            r4.limit(r0)
            r0 = r1
        L45:
            r3.afterWrite(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialJVM.tryWriteAvailable(java.nio.ByteBuffer):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeAvailableSuspend(java.nio.ByteBuffer r6, zu.d<? super java.lang.Integer> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteChannelSequentialJVM.C40751
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteChannelSequentialJVM$writeAvailableSuspend$1 r0 = (io.ktor.utils.io.ByteChannelSequentialJVM.C40751) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialJVM$writeAvailableSuspend$1 r0 = new io.ktor.utils.io.ByteChannelSequentialJVM$writeAvailableSuspend$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialJVM r2 = (io.ktor.utils.io.ByteChannelSequentialJVM) r2
            tu.a0.throwOnFailure(r7)
            goto L51
        L40:
            tu.a0.throwOnFailure(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.awaitAtLeastNBytesAvailableForWrite$ktor_io(r4, r0)
            if (r7 != r1) goto L50
            goto L5e
        L50:
            r2 = r5
        L51:
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r6 = r2.writeAvailable(r6, r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialJVM.writeAvailableSuspend(java.nio.ByteBuffer, zu.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004d -> B:20:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeFullySuspend(java.nio.ByteBuffer r5, zu.d<? super tu.x0> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.ByteChannelSequentialJVM.C40761
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.ByteChannelSequentialJVM$writeFullySuspend$1 r0 = (io.ktor.utils.io.ByteChannelSequentialJVM.C40761) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialJVM$writeFullySuspend$1 r0 = new io.ktor.utils.io.ByteChannelSequentialJVM$writeFullySuspend$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            java.lang.Object r2 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialJVM r2 = (io.ktor.utils.io.ByteChannelSequentialJVM) r2
            tu.a0.throwOnFailure(r6)
            goto L50
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            tu.a0.throwOnFailure(r6)
            r2 = r4
        L3d:
            boolean r6 = r5.hasRemaining()
            if (r6 == 0) goto L58
            r0.L$0 = r2
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r2.awaitAtLeastNBytesAvailableForWrite$ktor_io(r3, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            int r6 = r2.tryWriteAvailable(r5)
            r2.afterWrite(r6)
            goto L3d
        L58:
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialJVM.writeFullySuspend(java.nio.ByteBuffer, zu.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteChannel
    @tu.f
    public void attachJob(Job job) {
        e0.checkNotNullParameter(job, "job");
        Job job2 = this.attachedJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.attachedJob = job;
        Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new AnonymousClass1(), 2, null);
    }

    @Override // io.ktor.utils.io.ByteChannelSequentialBase, io.ktor.utils.io.ByteReadChannel
    public Object awaitContent(d<? super x0> dVar) {
        Object objAwait = await(1, dVar);
        return objAwait == e.getCOROUTINE_SUSPENDED() ? objAwait : x0.f87415a;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    @tu.f
    public <R> R lookAhead(l visitor) {
        e0.checkNotNullParameter(visitor, "visitor");
        return (R) visitor.invoke(new Session(this));
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    @tu.f
    public <R> Object lookAheadSuspend(p pVar, d<? super R> dVar) {
        return pVar.invoke(new Session(this), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object read(int r6, kv.l r7, zu.d<? super tu.x0> r8) throws java.io.EOFException {
        /*
            r5 = this;
            java.lang.String r0 = "Buffer's position shouldn't be rewinded"
            boolean r1 = r8 instanceof io.ktor.utils.io.ByteChannelSequentialJVM.C40711
            if (r1 == 0) goto L15
            r1 = r8
            io.ktor.utils.io.ByteChannelSequentialJVM$read$1 r1 = (io.ktor.utils.io.ByteChannelSequentialJVM.C40711) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.ktor.utils.io.ByteChannelSequentialJVM$read$1 r1 = new io.ktor.utils.io.ByteChannelSequentialJVM$read$1
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.result
            java.lang.Object r2 = av.e.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L3d
            if (r3 != r4) goto L35
            int r6 = r1.I$0
            java.lang.Object r7 = r1.L$1
            kv.l r7 = (kv.l) r7
            java.lang.Object r1 = r1.L$0
            io.ktor.utils.io.ByteChannelSequentialJVM r1 = (io.ktor.utils.io.ByteChannelSequentialJVM) r1
            tu.a0.throwOnFailure(r8)
            goto L52
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            tu.a0.throwOnFailure(r8)
            if (r6 < 0) goto Ldc
            r1.L$0 = r5
            r1.L$1 = r7
            r1.I$0 = r6
            r1.label = r4
            java.lang.Object r8 = r5.await(r6, r1)
            if (r8 != r2) goto L51
            return r2
        L51:
            r1 = r5
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lce
            io.ktor.utils.io.core.ByteReadPacket r8 = r1.getReadable()
            io.ktor.utils.io.core.internal.ChunkBuffer r1 = r8.prepareRead(r6)
            if (r1 == 0) goto Lc9
            int r6 = r1.getReadPosition()
            java.nio.ByteBuffer r2 = r1.m4458getMemorySK3TCg8()     // Catch: java.lang.Throwable -> La5
            int r3 = r1.getReadPosition()     // Catch: java.lang.Throwable -> La5
            int r4 = r1.getWritePosition()     // Catch: java.lang.Throwable -> La5
            int r4 = r4 - r3
            java.nio.ByteBuffer r2 = io.ktor.utils.io.bits.Memory.m4324slice87lwejk(r2, r3, r4)     // Catch: java.lang.Throwable -> La5
            r7.invoke(r2)     // Catch: java.lang.Throwable -> La5
            int r7 = r2.limit()     // Catch: java.lang.Throwable -> La5
            if (r7 != r4) goto La7
            int r7 = r2.position()     // Catch: java.lang.Throwable -> La5
            r1.discardExact(r7)     // Catch: java.lang.Throwable -> La5
            int r7 = r1.getReadPosition()
            if (r7 < r6) goto L9f
            int r6 = r1.getWritePosition()
            if (r7 != r6) goto L99
            r8.ensureNext(r1)
            goto L9c
        L99:
            r8.setHeadPosition(r7)
        L9c:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        L9f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r0)
            throw r6
        La5:
            r7 = move-exception
            goto Laf
        La7:
            java.lang.String r7 = "Buffer's limit change is not allowed"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La5
            r2.<init>(r7)     // Catch: java.lang.Throwable -> La5
            throw r2     // Catch: java.lang.Throwable -> La5
        Laf:
            int r2 = r1.getReadPosition()
            if (r2 < r6) goto Lc3
            int r6 = r1.getWritePosition()
            if (r2 != r6) goto Lbf
            r8.ensureNext(r1)
            goto Lc2
        Lbf:
            r8.setHeadPosition(r2)
        Lc2:
            throw r7
        Lc3:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r0)
            throw r6
        Lc9:
            tu.k r6 = e3.g.q(r6)
            throw r6
        Lce:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r8 = "Channel closed while "
            java.lang.String r0 = " bytes expected"
            java.lang.String r6 = p0.o2.k(r6, r8, r0)
            r7.<init>(r6)
            throw r7
        Ldc:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Failed requirement."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialJVM.read(int, kv.l, zu.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readAvailable(ByteBuffer byteBuffer, d<? super Integer> dVar) throws Throwable {
        int iTryReadAvailable = tryReadAvailable(byteBuffer);
        return iTryReadAvailable != 0 ? b.boxInt(iTryReadAvailable) : !byteBuffer.hasRemaining() ? b.boxInt(0) : readAvailableSuspend(byteBuffer, dVar);
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Object readFully(ByteBuffer byteBuffer, d<? super Integer> dVar) throws Throwable {
        int iTryReadAvailable = tryReadAvailable(byteBuffer);
        if (iTryReadAvailable != -1) {
            return !byteBuffer.hasRemaining() ? b.boxInt(iTryReadAvailable) : readFullySuspend(byteBuffer, iTryReadAvailable, dVar);
        }
        throw new EOFException("Channel closed");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object write(int r5, kv.l r6, zu.d<? super tu.x0> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteChannelSequentialJVM.C40741
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.ByteChannelSequentialJVM$write$1 r0 = (io.ktor.utils.io.ByteChannelSequentialJVM.C40741) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialJVM$write$1 r0 = new io.ktor.utils.io.ByteChannelSequentialJVM$write$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            int r5 = r0.I$0
            java.lang.Object r6 = r0.L$1
            kv.l r6 = (kv.l) r6
            java.lang.Object r0 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialJVM r0 = (io.ktor.utils.io.ByteChannelSequentialJVM) r0
            tu.a0.throwOnFailure(r7)
            goto L62
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            tu.a0.throwOnFailure(r7)
            boolean r7 = r4.getClosed()
            if (r7 == 0) goto L52
            java.lang.Throwable r5 = r4.getClosedCause()
            if (r5 != 0) goto L51
            kotlinx.coroutines.channels.ClosedSendChannelException r5 = new kotlinx.coroutines.channels.ClosedSendChannelException
            java.lang.String r6 = "Channel closed for write"
            r5.<init>(r6)
        L51:
            throw r5
        L52:
            r0.L$0 = r4
            r0.L$1 = r6
            r0.I$0 = r5
            r0.label = r3
            java.lang.Object r7 = r4.awaitAtLeastNBytesAvailableForWrite$ktor_io(r5, r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            r0 = r4
        L62:
            io.ktor.utils.io.core.BytePacketBuilder r7 = r0.getWritable()
            io.ktor.utils.io.core.internal.ChunkBuffer r5 = r7.prepareWriteHead(r5)
            java.nio.ByteBuffer r1 = r5.m4458getMemorySK3TCg8()     // Catch: java.lang.Throwable -> L9e
            int r2 = r5.getWritePosition()     // Catch: java.lang.Throwable -> L9e
            int r3 = r5.getLimit()     // Catch: java.lang.Throwable -> L9e
            int r3 = r3 - r2
            java.nio.ByteBuffer r1 = io.ktor.utils.io.bits.Memory.m4324slice87lwejk(r1, r2, r3)     // Catch: java.lang.Throwable -> L9e
            r6.invoke(r1)     // Catch: java.lang.Throwable -> L9e
            int r6 = r1.limit()     // Catch: java.lang.Throwable -> L9e
            if (r6 != r3) goto La0
            int r6 = r1.position()     // Catch: java.lang.Throwable -> L9e
            r5.commitWritten(r6)     // Catch: java.lang.Throwable -> L9e
            if (r6 < 0) goto L96
            r7.afterHeadWrite()
            r0.afterWrite(r6)
            tu.x0 r5 = tu.x0.f87415a
            return r5
        L96:
            java.lang.String r5 = "The returned value shouldn't be negative"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L9e
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r5 = move-exception
            goto La8
        La0:
            java.lang.String r5 = "Buffer's limit change is not allowed"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L9e
            throw r6     // Catch: java.lang.Throwable -> L9e
        La8:
            r7.afterHeadWrite()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialJVM.write(int, kv.l, zu.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeAvailable(ByteBuffer byteBuffer, d<? super Integer> dVar) throws Throwable {
        int iTryWriteAvailable = tryWriteAvailable(byteBuffer);
        if (iTryWriteAvailable <= 0) {
            if (byteBuffer.hasRemaining()) {
                return writeAvailableSuspend(byteBuffer, dVar);
            }
            iTryWriteAvailable = 0;
        }
        return b.boxInt(iTryWriteAvailable);
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public Object writeFully(ByteBuffer byteBuffer, d<? super x0> dVar) throws Throwable {
        Object objWriteFullySuspend;
        tryWriteAvailable(byteBuffer);
        boolean zHasRemaining = byteBuffer.hasRemaining();
        x0 x0Var = x0.f87415a;
        return (zHasRemaining && (objWriteFullySuspend = writeFullySuspend(byteBuffer, dVar)) == e.getCOROUTINE_SUSPENDED()) ? objWriteFullySuspend : x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #0 {all -> 0x00b6, blocks: (B:26:0x0073, B:28:0x0096, B:35:0x00ae, B:36:0x00b5, B:39:0x00b8, B:40:0x00bf), top: B:43:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8 A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:26:0x0073, B:28:0x0096, B:35:0x00ae, B:36:0x00b5, B:39:0x00b8, B:40:0x00bf), top: B:43:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0069 -> B:25:0x006b). Please report as a decompilation issue!!! */
    @Override // io.ktor.utils.io.ByteWriteChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeWhile(kv.l r10, zu.d<? super tu.x0> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof io.ktor.utils.io.ByteChannelSequentialJVM.C40771
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.utils.io.ByteChannelSequentialJVM$writeWhile$1 r0 = (io.ktor.utils.io.ByteChannelSequentialJVM.C40771) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannelSequentialJVM$writeWhile$1 r0 = new io.ktor.utils.io.ByteChannelSequentialJVM$writeWhile$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r10 = r0.L$2
            kotlin.jvm.internal.w0 r10 = (kotlin.jvm.internal.w0) r10
            java.lang.Object r2 = r0.L$1
            kv.l r2 = (kv.l) r2
            java.lang.Object r4 = r0.L$0
            io.ktor.utils.io.ByteChannelSequentialJVM r4 = (io.ktor.utils.io.ByteChannelSequentialJVM) r4
            tu.a0.throwOnFailure(r11)
            goto L6b
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            tu.a0.throwOnFailure(r11)
            r4 = r9
        L41:
            boolean r11 = r4.getClosed()
            if (r11 == 0) goto L55
            java.lang.Throwable r10 = r4.getClosedCause()
            if (r10 != 0) goto L54
            kotlinx.coroutines.channels.ClosedSendChannelException r10 = new kotlinx.coroutines.channels.ClosedSendChannelException
            java.lang.String r11 = "Channel closed for write"
            r10.<init>(r11)
        L54:
            throw r10
        L55:
            kotlin.jvm.internal.w0 r11 = new kotlin.jvm.internal.w0
            r11.<init>()
            r0.L$0 = r4
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r3
            java.lang.Object r2 = r4.awaitAtLeastNBytesAvailableForWrite$ktor_io(r3, r0)
            if (r2 != r1) goto L69
            return r1
        L69:
            r2 = r10
            r10 = r11
        L6b:
            io.ktor.utils.io.core.BytePacketBuilder r11 = r4.getWritable()
            io.ktor.utils.io.core.internal.ChunkBuffer r5 = r11.prepareWriteHead(r3)
            java.nio.ByteBuffer r6 = r5.m4458getMemorySK3TCg8()     // Catch: java.lang.Throwable -> Lb6
            int r7 = r5.getWritePosition()     // Catch: java.lang.Throwable -> Lb6
            int r8 = r5.getLimit()     // Catch: java.lang.Throwable -> Lb6
            int r8 = r8 - r7
            java.nio.ByteBuffer r6 = io.ktor.utils.io.bits.Memory.m4324slice87lwejk(r6, r7, r8)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Object r7 = r2.invoke(r6)     // Catch: java.lang.Throwable -> Lb6
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> Lb6
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> Lb6
            r10.f71863b = r7     // Catch: java.lang.Throwable -> Lb6
            int r7 = r6.limit()     // Catch: java.lang.Throwable -> Lb6
            if (r7 != r8) goto Lb8
            int r6 = r6.position()     // Catch: java.lang.Throwable -> Lb6
            r5.commitWritten(r6)     // Catch: java.lang.Throwable -> Lb6
            if (r6 < 0) goto Lae
            r11.afterHeadWrite()
            r4.afterWrite(r6)
            boolean r10 = r10.f71863b
            if (r10 != 0) goto Lac
            tu.x0 r10 = tu.x0.f87415a
            return r10
        Lac:
            r10 = r2
            goto L41
        Lae:
            java.lang.String r10 = "The returned value shouldn't be negative"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb6
            r0.<init>(r10)     // Catch: java.lang.Throwable -> Lb6
            throw r0     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r10 = move-exception
            goto Lc0
        Lb8:
            java.lang.String r10 = "Buffer's limit change is not allowed"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb6
            r0.<init>(r10)     // Catch: java.lang.Throwable -> Lb6
            throw r0     // Catch: java.lang.Throwable -> Lb6
        Lc0:
            r11.afterHeadWrite()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteChannelSequentialJVM.writeWhile(kv.l, zu.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public int readAvailable(int i10, l block) throws Throwable {
        e0.checkNotNullParameter(block, "block");
        Throwable closedCause = getClosedCause();
        if (closedCause == null) {
            if (getAvailableForRead() < i10) {
                return -1;
            }
            prepareFlushedBytes();
            ByteReadPacket readable = getReadable();
            ChunkBuffer chunkBufferPrepareRead = readable.prepareRead(i10);
            if (chunkBufferPrepareRead != null) {
                int readPosition = chunkBufferPrepareRead.getReadPosition();
                try {
                    ByteBuffer byteBufferM4458getMemorySK3TCg8 = chunkBufferPrepareRead.m4458getMemorySK3TCg8();
                    int readPosition2 = chunkBufferPrepareRead.getReadPosition();
                    int writePosition = chunkBufferPrepareRead.getWritePosition() - readPosition2;
                    ByteBuffer byteBufferM4324slice87lwejk = Memory.m4324slice87lwejk(byteBufferM4458getMemorySK3TCg8, readPosition2, writePosition);
                    int iPosition = byteBufferM4324slice87lwejk.position();
                    block.invoke(byteBufferM4324slice87lwejk);
                    int iPosition2 = byteBufferM4324slice87lwejk.position() - iPosition;
                    if (byteBufferM4324slice87lwejk.limit() == writePosition) {
                        chunkBufferPrepareRead.discardExact(byteBufferM4324slice87lwejk.position());
                        int readPosition3 = chunkBufferPrepareRead.getReadPosition();
                        if (readPosition3 >= readPosition) {
                            if (readPosition3 == chunkBufferPrepareRead.getWritePosition()) {
                                readable.ensureNext(chunkBufferPrepareRead);
                                return iPosition2;
                            }
                            readable.setHeadPosition(readPosition3);
                            return iPosition2;
                        }
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                    throw new IllegalStateException("Buffer's limit change is not allowed");
                } catch (Throwable th2) {
                    int readPosition4 = chunkBufferPrepareRead.getReadPosition();
                    if (readPosition4 >= readPosition) {
                        if (readPosition4 == chunkBufferPrepareRead.getWritePosition()) {
                            readable.ensureNext(chunkBufferPrepareRead);
                        } else {
                            readable.setHeadPosition(readPosition4);
                        }
                        throw th2;
                    }
                    throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                }
            }
            throw g.q(i10);
        }
        throw closedCause;
    }

    @Override // io.ktor.utils.io.ByteWriteChannel
    public int writeAvailable(int i10, l block) throws Throwable {
        e0.checkNotNullParameter(block, "block");
        if (getClosed()) {
            Throwable closedCause = getClosedCause();
            if (closedCause == null) {
                throw new ClosedSendChannelException("Channel closed for write");
            }
            throw closedCause;
        }
        if (getAvailableForWrite() < i10) {
            return 0;
        }
        BytePacketBuilder writable = getWritable();
        ChunkBuffer chunkBufferPrepareWriteHead = writable.prepareWriteHead(i10);
        try {
            ByteBuffer byteBufferM4458getMemorySK3TCg8 = chunkBufferPrepareWriteHead.m4458getMemorySK3TCg8();
            int writePosition = chunkBufferPrepareWriteHead.getWritePosition();
            int limit = chunkBufferPrepareWriteHead.getLimit() - writePosition;
            ByteBuffer byteBufferM4324slice87lwejk = Memory.m4324slice87lwejk(byteBufferM4458getMemorySK3TCg8, writePosition, limit);
            int iPosition = byteBufferM4324slice87lwejk.position();
            block.invoke(byteBufferM4324slice87lwejk);
            int iPosition2 = byteBufferM4324slice87lwejk.position() - iPosition;
            if (byteBufferM4324slice87lwejk.limit() == limit) {
                int iPosition3 = byteBufferM4324slice87lwejk.position();
                chunkBufferPrepareWriteHead.commitWritten(iPosition3);
                if (iPosition3 >= 0) {
                    writable.afterHeadWrite();
                    return iPosition2;
                }
                throw new IllegalStateException("The returned value shouldn't be negative");
            }
            throw new IllegalStateException("Buffer's limit change is not allowed");
        } catch (Throwable th2) {
            writable.afterHeadWrite();
            throw th2;
        }
    }
}
