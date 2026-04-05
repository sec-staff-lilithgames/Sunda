package kotlinx.coroutines.channels;

import kotlinx.coroutines.intrinsics.CancellableKt;
import kv.p;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class LazyBroadcastCoroutine<E> extends BroadcastCoroutine<E> {
    private final zu.d<x0> continuation;

    public LazyBroadcastCoroutine(m mVar, BroadcastChannel<E> broadcastChannel, p pVar) {
        super(mVar, broadcastChannel, false);
        this.continuation = av.b.createCoroutineUnintercepted(pVar, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onStart() throws Throwable {
        CancellableKt.startCoroutineCancellable(this.continuation, this);
    }

    @Override // kotlinx.coroutines.channels.BroadcastCoroutine, kotlinx.coroutines.channels.BroadcastChannel
    public ReceiveChannel<E> openSubscription() {
        ReceiveChannel<E> receiveChannelOpenSubscription = get_channel().openSubscription();
        start();
        return receiveChannelOpenSubscription;
    }
}
