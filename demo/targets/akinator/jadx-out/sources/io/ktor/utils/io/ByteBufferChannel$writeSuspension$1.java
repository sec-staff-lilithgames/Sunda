package io.ktor.utils.io;

import av.b;
import av.e;
import io.ktor.utils.io.internal.ClosedElement;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.k;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteBufferChannel$writeSuspension$1 extends f0 implements l {
    final /* synthetic */ ByteBufferChannel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteBufferChannel$writeSuspension$1(ByteBufferChannel byteBufferChannel) {
        super(1);
        this.this$0 = byteBufferChannel;
    }

    @Override // kv.l
    public final Object invoke(d<? super x0> ucont) throws Throwable {
        Throwable sendException;
        e0.checkNotNullParameter(ucont, "ucont");
        int i10 = this.this$0.writeSuspensionSize;
        loop0: while (true) {
            ClosedElement closed = this.this$0.getClosed();
            if (closed != null && (sendException = closed.getSendException()) != null) {
                ByteBufferChannelKt.rethrowClosed(sendException);
                throw new k();
            }
            if (!this.this$0.writeSuspendPredicate(i10)) {
                int i11 = z.f87419c;
                ucont.resumeWith(z.m7131constructorimpl(x0.f87415a));
                break;
            }
            ByteBufferChannel byteBufferChannel = this.this$0;
            d dVarIntercepted = b.intercepted(ucont);
            ByteBufferChannel byteBufferChannel2 = this.this$0;
            while (byteBufferChannel.getWriteOp() == null) {
                if (!byteBufferChannel2.writeSuspendPredicate(i10)) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ByteBufferChannel._writeOp$FU;
                while (!atomicReferenceFieldUpdater.compareAndSet(byteBufferChannel, null, dVarIntercepted)) {
                    if (atomicReferenceFieldUpdater.get(byteBufferChannel) != null) {
                        break;
                    }
                }
                if (byteBufferChannel2.writeSuspendPredicate(i10)) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ByteBufferChannel._writeOp$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(byteBufferChannel, dVarIntercepted, null)) {
                    if (atomicReferenceFieldUpdater2.get(byteBufferChannel) != dVarIntercepted) {
                        break loop0;
                    }
                }
            }
            throw new IllegalStateException("Operation is already in progress");
        }
        this.this$0.flushImpl(i10);
        if (this.this$0.shouldResumeReadOp()) {
            this.this$0.resumeReadOp();
        }
        return e.getCOROUTINE_SUSPENDED();
    }
}
