package kotlinx.coroutines.channels;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.selects.SelectClause1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface ActorScope<E> extends CoroutineScope, ReceiveChannel<E> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <E> SelectClause1<E> getOnReceiveOrNull(ActorScope<E> actorScope) {
            return ReceiveChannel.DefaultImpls.getOnReceiveOrNull(actorScope);
        }

        @tu.f
        public static <E> E poll(ActorScope<E> actorScope) {
            return (E) ReceiveChannel.DefaultImpls.poll(actorScope);
        }

        @tu.f
        public static <E> Object receiveOrNull(ActorScope<E> actorScope, zu.d<? super E> dVar) {
            return ReceiveChannel.DefaultImpls.receiveOrNull(actorScope, dVar);
        }
    }

    Channel<E> getChannel();
}
