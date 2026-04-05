package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
class ActorCoroutine<E> extends ChannelCoroutine<E> implements ActorScope<E> {
    public ActorCoroutine(m mVar, Channel<E> channel, boolean z10) {
        super(mVar, channel, false, z10);
        initParentJob((Job) mVar.get(Job.Key));
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean handleJobException(Throwable th2) {
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th2);
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void onCancelling(Throwable th2) {
        Channel<E> channel = get_channel();
        if (th2 != null) {
            CancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (CancellationException == null) {
                CancellationException = ExceptionsKt.CancellationException(DebugStringsKt.getClassSimpleName(this) + " was cancelled", th2);
            }
        }
        channel.cancel(CancellationException);
    }
}
