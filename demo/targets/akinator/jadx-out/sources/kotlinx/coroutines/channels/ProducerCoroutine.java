package kotlinx.coroutines.channels;

import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.channels.SendChannel;
import tu.x0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ProducerCoroutine<E> extends ChannelCoroutine<E> implements ProducerScope<E> {
    public ProducerCoroutine(m mVar, Channel<E> channel) {
        super(mVar, channel, true, true);
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public /* bridge */ /* synthetic */ SendChannel getChannel() {
        return getChannel();
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCancelled(Throwable th2, boolean z10) {
        if (get_channel().close(th2) || z10) {
            return;
        }
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th2);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(x0 x0Var) {
        SendChannel.DefaultImpls.close$default(get_channel(), null, 1, null);
    }
}
