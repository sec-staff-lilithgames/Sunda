package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@tu.f
/* loaded from: classes10.dex */
public interface BroadcastChannel<E> extends SendChannel<E> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ void cancel$default(BroadcastChannel broadcastChannel, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            broadcastChannel.cancel(cancellationException);
        }

        @tu.f
        public static <E> boolean offer(BroadcastChannel<E> broadcastChannel, E e10) {
            return SendChannel.DefaultImpls.offer(broadcastChannel, e10);
        }

        public static /* synthetic */ boolean cancel$default(BroadcastChannel broadcastChannel, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return broadcastChannel.cancel(th2);
        }
    }

    void cancel(CancellationException cancellationException);

    @tu.f
    /* synthetic */ boolean cancel(Throwable th2);

    ReceiveChannel<E> openSubscription();
}
