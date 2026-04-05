package kotlinx.coroutines.channels;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface ProducerScope<E> extends CoroutineScope, SendChannel<E> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        @tu.f
        public static <E> boolean offer(ProducerScope<? super E> producerScope, E e10) {
            return SendChannel.DefaultImpls.offer(producerScope, e10);
        }
    }

    SendChannel<E> getChannel();
}
