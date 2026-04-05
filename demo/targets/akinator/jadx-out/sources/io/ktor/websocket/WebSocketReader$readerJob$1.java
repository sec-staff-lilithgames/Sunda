package io.ktor.websocket;

import av.e;
import bv.f;
import bv.n;
import io.ktor.util.cio.ChannelIOException;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.websocket.WebSocketReader$readerJob$1", f = "WebSocketReader.kt", i = {0}, l = {40}, m = "invokeSuspend", n = {"buffer"}, s = {"L$0"})
/* loaded from: classes10.dex */
public final class WebSocketReader$readerJob$1 extends n implements p {
    final /* synthetic */ ObjectPool<ByteBuffer> $pool;
    Object L$0;
    int label;
    final /* synthetic */ WebSocketReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketReader$readerJob$1(ObjectPool<ByteBuffer> objectPool, WebSocketReader webSocketReader, d<? super WebSocketReader$readerJob$1> dVar) {
        super(2, dVar);
        this.$pool = objectPool;
        this.this$0 = webSocketReader;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new WebSocketReader$readerJob$1(this.$pool, this.this$0, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        ByteBuffer byteBuffer;
        ProtocolViolationException e10;
        FrameTooBigException e11;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                ByteBuffer byteBufferBorrow = this.$pool.borrow();
                try {
                    WebSocketReader webSocketReader = this.this$0;
                    this.L$0 = byteBufferBorrow;
                    this.label = 1;
                    if (webSocketReader.readLoop(byteBufferBorrow, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (ChannelIOException unused) {
                    byteBuffer = byteBufferBorrow;
                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) this.this$0.queue, (CancellationException) null, 1, (Object) null);
                    this.$pool.recycle(byteBuffer);
                    SendChannel.DefaultImpls.close$default(this.this$0.queue, null, 1, null);
                    return x0.f87415a;
                } catch (FrameTooBigException e12) {
                    byteBuffer = byteBufferBorrow;
                    e11 = e12;
                    this.this$0.queue.close(e11);
                    this.$pool.recycle(byteBuffer);
                    SendChannel.DefaultImpls.close$default(this.this$0.queue, null, 1, null);
                    return x0.f87415a;
                } catch (ProtocolViolationException e13) {
                    byteBuffer = byteBufferBorrow;
                    e10 = e13;
                    this.this$0.queue.close(e10);
                    this.$pool.recycle(byteBuffer);
                    SendChannel.DefaultImpls.close$default(this.this$0.queue, null, 1, null);
                    return x0.f87415a;
                } catch (ClosedChannelException | CancellationException unused2) {
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
                byteBuffer = byteBufferBorrow;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byteBuffer = (ByteBuffer) this.L$0;
                try {
                    a0.throwOnFailure(obj);
                } catch (ChannelIOException unused3) {
                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) this.this$0.queue, (CancellationException) null, 1, (Object) null);
                } catch (FrameTooBigException e14) {
                    e11 = e14;
                    this.this$0.queue.close(e11);
                } catch (ProtocolViolationException e15) {
                    e10 = e15;
                    this.this$0.queue.close(e10);
                } catch (ClosedChannelException | CancellationException unused4) {
                } catch (Throwable th4) {
                    th2 = th4;
                    throw th2;
                }
            }
            this.$pool.recycle(byteBuffer);
            SendChannel.DefaultImpls.close$default(this.this$0.queue, null, 1, null);
            return x0.f87415a;
        } catch (Throwable th5) {
            this.$pool.recycle(coroutine_suspended);
            SendChannel.DefaultImpls.close$default(this.this$0.queue, null, 1, null);
            throw th5;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((WebSocketReader$readerJob$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
