package io.ktor.utils.io;

import av.e;
import bv.f;
import bv.n;
import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.a1;
import kv.p;
import qv.v;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.utils.io.ByteChannelSequentialBase$peekTo$2", f = "ByteChannelSequential.kt", i = {0}, l = {823}, m = "invokeSuspend", n = {"$this$readSuspendableSession"}, s = {"L$0"})
/* loaded from: classes10.dex */
public final class ByteChannelSequentialBase$peekTo$2 extends n implements p {
    final /* synthetic */ a1 $bytesCopied;
    final /* synthetic */ ByteBuffer $destination;
    final /* synthetic */ long $destinationOffset;
    final /* synthetic */ long $max;
    final /* synthetic */ long $min;
    final /* synthetic */ long $offset;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelSequentialBase$peekTo$2(long j10, long j11, a1 a1Var, long j12, ByteBuffer byteBuffer, long j13, d<? super ByteChannelSequentialBase$peekTo$2> dVar) {
        super(2, dVar);
        this.$min = j10;
        this.$offset = j11;
        this.$bytesCopied = a1Var;
        this.$max = j12;
        this.$destination = byteBuffer;
        this.$destinationOffset = j13;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        ByteChannelSequentialBase$peekTo$2 byteChannelSequentialBase$peekTo$2 = new ByteChannelSequentialBase$peekTo$2(this.$min, this.$offset, this.$bytesCopied, this.$max, this.$destination, this.$destinationOffset, dVar);
        byteChannelSequentialBase$peekTo$2.L$0 = obj;
        return byteChannelSequentialBase$peekTo$2;
    }

    @Override // kv.p
    public final Object invoke(SuspendableReadSession suspendableReadSession, d<? super x0> dVar) {
        return ((ByteChannelSequentialBase$peekTo$2) create(suspendableReadSession, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        SuspendableReadSession suspendableReadSession;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            SuspendableReadSession suspendableReadSession2 = (SuspendableReadSession) this.L$0;
            int iCoerceAtMost = (int) v.coerceAtMost(this.$min + this.$offset, 4088L);
            this.L$0 = suspendableReadSession2;
            this.label = 1;
            if (suspendableReadSession2.await(iCoerceAtMost, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            suspendableReadSession = suspendableReadSession2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            suspendableReadSession = (SuspendableReadSession) this.L$0;
            a0.throwOnFailure(obj);
        }
        ChunkBuffer chunkBufferRequest = suspendableReadSession.request(1);
        if (chunkBufferRequest == null) {
            chunkBufferRequest = ChunkBuffer.Companion.getEmpty();
        }
        if (chunkBufferRequest.getWritePosition() - chunkBufferRequest.getReadPosition() > this.$offset) {
            this.$bytesCopied.f71813b = Math.min((chunkBufferRequest.getWritePosition() - chunkBufferRequest.getReadPosition()) - this.$offset, Math.min(this.$max, this.$destination.limit() - this.$destinationOffset));
            Memory.m4316copyToJT6ljtQ(chunkBufferRequest.m4458getMemorySK3TCg8(), this.$destination, this.$offset, this.$bytesCopied.f71813b, this.$destinationOffset);
        }
        return x0.f87415a;
    }
}
