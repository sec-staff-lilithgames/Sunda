package io.ktor.utils.io.internal;

import a.b;
import av.e;
import bv.d;
import bv.f;
import io.ktor.utils.io.ByteBufferChannel;
import io.ktor.utils.io.WriterSuspendSession;
import io.ktor.utils.io.core.BufferUtilsJvmKt;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import p0.o2;
import tu.k;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class WriteSessionImpl implements WriterSuspendSession {
    private ByteBuffer byteBuffer;
    private ByteBufferChannel current;
    private int locked;
    private RingBufferCapacity ringBufferCapacity;
    private ChunkBuffer view;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.internal.WriteSessionImpl", f = "WriteSessionImpl.kt", i = {0}, l = {86}, m = "tryAwaitJoinSwitch", n = {"this"}, s = {"L$0"})
    /* renamed from: io.ktor.utils.io.internal.WriteSessionImpl$tryAwaitJoinSwitch$1, reason: invalid class name */
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
            return WriteSessionImpl.this.tryAwaitJoinSwitch(0, this);
        }
    }

    public WriteSessionImpl(ByteBufferChannel channel) {
        e0.checkNotNullParameter(channel, "channel");
        this.current = channel.resolveChannelInstance$ktor_io();
        ChunkBuffer.Companion companion = ChunkBuffer.Companion;
        this.byteBuffer = companion.getEmpty().m4458getMemorySK3TCg8();
        this.view = companion.getEmpty();
        this.ringBufferCapacity = this.current.currentState$ktor_io().capacity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object tryAwaitJoinSwitch(int r5, zu.d<? super tu.x0> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.utils.io.internal.WriteSessionImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.utils.io.internal.WriteSessionImpl$tryAwaitJoinSwitch$1 r0 = (io.ktor.utils.io.internal.WriteSessionImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.internal.WriteSessionImpl$tryAwaitJoinSwitch$1 r0 = new io.ktor.utils.io.internal.WriteSessionImpl$tryAwaitJoinSwitch$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            io.ktor.utils.io.internal.WriteSessionImpl r5 = (io.ktor.utils.io.internal.WriteSessionImpl) r5
            tu.a0.throwOnFailure(r6)
            goto L5f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            tu.a0.throwOnFailure(r6)
            int r6 = r4.locked
            if (r6 <= 0) goto L44
            io.ktor.utils.io.internal.RingBufferCapacity r2 = r4.ringBufferCapacity
            r2.completeRead(r6)
            r6 = 0
            r4.locked = r6
        L44:
            r4.flush()
            io.ktor.utils.io.ByteBufferChannel r6 = r4.current
            r6.restoreStateAfterWrite$ktor_io()
            io.ktor.utils.io.ByteBufferChannel r6 = r4.current
            r6.tryTerminate$ktor_io()
            io.ktor.utils.io.ByteBufferChannel r6 = r4.current
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r6.tryWriteSuspend$ktor_io(r5, r0)
            if (r5 != r1) goto L5e
            return r1
        L5e:
            r5 = r4
        L5f:
            io.ktor.utils.io.ByteBufferChannel r6 = r5.current
            io.ktor.utils.io.ByteBufferChannel r6 = r6.resolveChannelInstance$ktor_io()
            r5.current = r6
            java.nio.ByteBuffer r6 = r6.setupStateForWrite$ktor_io()
            if (r6 != 0) goto L6e
            goto L8f
        L6e:
            r5.byteBuffer = r6
            io.ktor.utils.io.ByteBufferChannel r6 = r5.current
            io.ktor.utils.io.internal.ReadWriteBufferState r6 = r6.currentState$ktor_io()
            java.nio.ByteBuffer r6 = r6.backingBuffer
            r0 = 2
            r1 = 0
            io.ktor.utils.io.core.internal.ChunkBuffer r6 = io.ktor.utils.io.core.BufferUtilsJvmKt.ChunkBuffer$default(r6, r1, r0, r1)
            r5.view = r6
            java.nio.ByteBuffer r0 = r5.byteBuffer
            io.ktor.utils.io.core.BufferUtilsJvmKt.resetFromContentToWrite(r6, r0)
            io.ktor.utils.io.ByteBufferChannel r6 = r5.current
            io.ktor.utils.io.internal.ReadWriteBufferState r6 = r6.currentState$ktor_io()
            io.ktor.utils.io.internal.RingBufferCapacity r6 = r6.capacity
            r5.ringBufferCapacity = r6
        L8f:
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.internal.WriteSessionImpl.tryAwaitJoinSwitch(int, zu.d):java.lang.Object");
    }

    private final Void writtenFailed(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(i10, "Written bytes count shouldn't be negative: "));
        }
        throw new IllegalStateException(b.f(this.locked, " were pre-locked.", o2.t(i10, "Unable to mark ", " bytes as written: only ")));
    }

    public final void begin() {
        ByteBufferChannel byteBufferChannelResolveChannelInstance$ktor_io = this.current.resolveChannelInstance$ktor_io();
        this.current = byteBufferChannelResolveChannelInstance$ktor_io;
        ByteBuffer byteBuffer = byteBufferChannelResolveChannelInstance$ktor_io.setupStateForWrite$ktor_io();
        if (byteBuffer == null) {
            return;
        }
        this.byteBuffer = byteBuffer;
        ChunkBuffer chunkBufferChunkBuffer$default = BufferUtilsJvmKt.ChunkBuffer$default(this.current.currentState$ktor_io().backingBuffer, null, 2, null);
        this.view = chunkBufferChunkBuffer$default;
        BufferUtilsJvmKt.resetFromContentToWrite(chunkBufferChunkBuffer$default, this.byteBuffer);
        this.ringBufferCapacity = this.current.currentState$ktor_io().capacity;
    }

    public final void complete() {
        int i10 = this.locked;
        if (i10 > 0) {
            this.ringBufferCapacity.completeRead(i10);
            this.locked = 0;
        }
        this.current.restoreStateAfterWrite$ktor_io();
        this.current.tryTerminate$ktor_io();
    }

    @Override // io.ktor.utils.io.WriterSession
    public void flush() {
        this.current.flush();
    }

    @Override // io.ktor.utils.io.WriterSession
    public ChunkBuffer request(int i10) {
        int iTryWriteAtLeast = this.ringBufferCapacity.tryWriteAtLeast(0) + this.locked;
        this.locked = iTryWriteAtLeast;
        if (iTryWriteAtLeast < i10) {
            return null;
        }
        this.current.prepareWriteBuffer$ktor_io(this.byteBuffer, iTryWriteAtLeast);
        if (this.byteBuffer.remaining() < i10) {
            return null;
        }
        BufferUtilsJvmKt.resetFromContentToWrite(this.view, this.byteBuffer);
        return this.view;
    }

    @Override // io.ktor.utils.io.WriterSuspendSession
    public Object tryAwait(int i10, zu.d<? super x0> dVar) throws Throwable {
        JoiningState joining$ktor_io = this.current.getJoining$ktor_io();
        x0 x0Var = x0.f87415a;
        if (joining$ktor_io != null) {
            Object objTryAwaitJoinSwitch = tryAwaitJoinSwitch(i10, dVar);
            return objTryAwaitJoinSwitch == e.getCOROUTINE_SUSPENDED() ? objTryAwaitJoinSwitch : x0Var;
        }
        int i11 = this.locked;
        if (i11 >= i10) {
            return x0Var;
        }
        if (i11 > 0) {
            this.ringBufferCapacity.completeRead(i11);
            this.locked = 0;
        }
        Object objTryWriteSuspend$ktor_io = this.current.tryWriteSuspend$ktor_io(i10, dVar);
        return objTryWriteSuspend$ktor_io == e.getCOROUTINE_SUSPENDED() ? objTryWriteSuspend$ktor_io : x0Var;
    }

    @Override // io.ktor.utils.io.WriterSession
    public void written(int i10) {
        int i11;
        if (i10 < 0 || i10 > (i11 = this.locked)) {
            writtenFailed(i10);
            throw new k();
        }
        this.locked = i11 - i10;
        this.current.bytesWrittenFromSession$ktor_io(this.byteBuffer, this.ringBufferCapacity, i10);
    }
}
