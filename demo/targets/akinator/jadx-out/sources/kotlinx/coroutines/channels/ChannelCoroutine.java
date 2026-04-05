package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause2;
import kv.l;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class ChannelCoroutine<E> extends AbstractCoroutine<x0> implements Channel<E> {
    private final Channel<E> _channel;

    public ChannelCoroutine(m mVar, Channel<E> channel, boolean z10, boolean z11) {
        super(mVar, z10, z11);
        this._channel = channel;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void cancelInternal(Throwable th2) {
        CancellationException cancellationException$default = JobSupport.toCancellationException$default(this, th2, null, 1, null);
        this._channel.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th2) {
        return this._channel.close(th2);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceive() {
        return this._channel.getOnReceive();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<ChannelResult<E>> getOnReceiveCatching() {
        return this._channel.getOnReceiveCatching();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceiveOrNull() {
        return this._channel.getOnReceiveOrNull();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        return this._channel.getOnSend();
    }

    public final Channel<E> get_channel() {
        return this._channel;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(l lVar) {
        this._channel.invokeOnClose(lVar);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return this._channel.isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this._channel.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        return this._channel.isEmpty();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return this._channel.iterator();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @tu.f
    public boolean offer(E e10) {
        return this._channel.offer(e10);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @tu.f
    public E poll() {
        return this._channel.poll();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(zu.d<? super E> dVar) {
        return this._channel.receive(dVar);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: receiveCatching-JP2dKIU */
    public Object mo5145receiveCatchingJP2dKIU(zu.d<? super ChannelResult<? extends E>> dVar) {
        Object objMo5145receiveCatchingJP2dKIU = this._channel.mo5145receiveCatchingJP2dKIU(dVar);
        av.e.getCOROUTINE_SUSPENDED();
        return objMo5145receiveCatchingJP2dKIU;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @tu.f
    public Object receiveOrNull(zu.d<? super E> dVar) {
        return this._channel.receiveOrNull(dVar);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e10, zu.d<? super x0> dVar) {
        return this._channel.send(e10, dVar);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: tryReceive-PtdJZtk */
    public Object mo5146tryReceivePtdJZtk() {
        return this._channel.mo5146tryReceivePtdJZtk();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public Object mo5139trySendJP2dKIU(E e10) {
        return this._channel.mo5139trySendJP2dKIU(e10);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @tu.f
    public /* synthetic */ void cancel() {
        cancelInternal(new JobCancellationException(cancellationExceptionMessage(), null, this));
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @tu.f
    public final /* synthetic */ boolean cancel(Throwable th2) {
        cancelInternal(new JobCancellationException(cancellationExceptionMessage(), null, this));
        return true;
    }

    public final Channel<E> getChannel() {
        return this;
    }
}
