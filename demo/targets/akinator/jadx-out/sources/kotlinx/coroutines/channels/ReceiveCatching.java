package kotlinx.coroutines.channels;

import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ReceiveCatching<E> implements Waiter {
    public final CancellableContinuationImpl<ChannelResult<? extends E>> cont;

    /* JADX WARN: Multi-variable type inference failed */
    public ReceiveCatching(CancellableContinuationImpl<? super ChannelResult<? extends E>> cancellableContinuationImpl) {
        this.cont = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(Segment<?> segment, int i10) {
        this.cont.invokeOnCancellation(segment, i10);
    }
}
