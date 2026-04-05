package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause2;
import kv.l;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
class BroadcastCoroutine<E> extends AbstractCoroutine<x0> implements ProducerScope<E>, BroadcastChannel<E> {
    private final BroadcastChannel<E> _channel;

    public BroadcastCoroutine(m mVar, BroadcastChannel<E> broadcastChannel, boolean z10) {
        super(mVar, false, z10);
        this._channel = broadcastChannel;
        initParentJob((Job) mVar.get(Job.Key));
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    @tu.f
    public final /* synthetic */ boolean cancel(Throwable th2) {
        if (th2 == null) {
            th2 = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(th2);
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void cancelInternal(Throwable th2) {
        CancellationException cancellationException$default = JobSupport.toCancellationException$default(this, th2, null, 1, null);
        this._channel.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th2) {
        boolean zClose = this._channel.close(th2);
        start();
        return zClose;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        return this._channel.getOnSend();
    }

    public final BroadcastChannel<E> get_channel() {
        return this._channel;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(l lVar) {
        this._channel.invokeOnClose(lVar);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this._channel.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @tu.f
    public boolean offer(E e10) {
        return this._channel.offer(e10);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCancelled(Throwable th2, boolean z10) {
        if (this._channel.close(th2) || z10) {
            return;
        }
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th2);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        return this._channel.openSubscription();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e10, zu.d<? super x0> dVar) {
        return this._channel.send(e10, dVar);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public Object mo5139trySendJP2dKIU(E e10) {
        return this._channel.mo5139trySendJP2dKIU(e10);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(x0 x0Var) {
        SendChannel.DefaultImpls.close$default(this._channel, null, 1, null);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public SendChannel<E> getChannel() {
        return this;
    }
}
