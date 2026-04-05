package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.selects.SelectClause2;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@tu.f
/* loaded from: classes10.dex */
public final class ConflatedBroadcastChannel<E> implements BroadcastChannel<E> {
    private final BroadcastChannelImpl<E> broadcast;

    private ConflatedBroadcastChannel(BroadcastChannelImpl<E> broadcastChannelImpl) {
        this.broadcast = broadcastChannelImpl;
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public void cancel(CancellationException cancellationException) {
        this.broadcast.cancel(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th2) {
        return this.broadcast.close(th2);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, SendChannel<E>> getOnSend() {
        return this.broadcast.getOnSend();
    }

    public final E getValue() {
        return this.broadcast.getValue();
    }

    public final E getValueOrNull() {
        return this.broadcast.getValueOrNull();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(l lVar) {
        this.broadcast.invokeOnClose(lVar);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.broadcast.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @tu.f
    public boolean offer(E e10) {
        return this.broadcast.offer(e10);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        return this.broadcast.openSubscription();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e10, zu.d<? super x0> dVar) {
        return this.broadcast.send(e10, dVar);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public Object mo5139trySendJP2dKIU(E e10) {
        return this.broadcast.mo5139trySendJP2dKIU(e10);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @tu.f
    public /* synthetic */ boolean cancel(Throwable th2) {
        return this.broadcast.cancel(th2);
    }

    public ConflatedBroadcastChannel() {
        this(new BroadcastChannelImpl(-1));
    }

    public ConflatedBroadcastChannel(E e10) {
        this();
        mo5139trySendJP2dKIU(e10);
    }
}
