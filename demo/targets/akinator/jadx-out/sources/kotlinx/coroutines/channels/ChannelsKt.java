package kotlinx.coroutines.channels;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kv.l;
import kv.p;
import kv.q;
import tu.v;
import tu.x0;
import zu.m;

/* loaded from: classes10.dex */
public final class ChannelsKt {
    public static final String DEFAULT_CLOSE_MESSAGE = "Channel was closed";

    public static final void cancelConsumed(ReceiveChannel<?> receiveChannel, Throwable th2) {
        ChannelsKt__Channels_commonKt.cancelConsumed(receiveChannel, th2);
    }

    @tu.f
    public static final <E, R> R consume(BroadcastChannel<E> broadcastChannel, l lVar) {
        return (R) ChannelsKt__DeprecatedKt.consume(broadcastChannel, lVar);
    }

    @tu.f
    public static final <E> Object consumeEach(BroadcastChannel<E> broadcastChannel, l lVar, zu.d<? super x0> dVar) {
        return ChannelsKt__DeprecatedKt.consumeEach(broadcastChannel, lVar, dVar);
    }

    public static final l consumes(ReceiveChannel<?> receiveChannel) {
        return ChannelsKt__DeprecatedKt.consumes(receiveChannel);
    }

    public static final l consumesAll(ReceiveChannel<?>... receiveChannelArr) {
        return ChannelsKt__DeprecatedKt.consumesAll(receiveChannelArr);
    }

    public static final <E, K> ReceiveChannel<E> distinctBy(ReceiveChannel<? extends E> receiveChannel, m mVar, p pVar) {
        return ChannelsKt__DeprecatedKt.distinctBy(receiveChannel, mVar, pVar);
    }

    public static final <E> ReceiveChannel<E> filter(ReceiveChannel<? extends E> receiveChannel, m mVar, p pVar) {
        return ChannelsKt__DeprecatedKt.filter(receiveChannel, mVar, pVar);
    }

    public static final <E> ReceiveChannel<E> filterNotNull(ReceiveChannel<? extends E> receiveChannel) {
        return ChannelsKt__DeprecatedKt.filterNotNull(receiveChannel);
    }

    public static final <E, R> ReceiveChannel<R> map(ReceiveChannel<? extends E> receiveChannel, m mVar, p pVar) {
        return ChannelsKt__DeprecatedKt.map(receiveChannel, mVar, pVar);
    }

    public static final <E, R> ReceiveChannel<R> mapIndexed(ReceiveChannel<? extends E> receiveChannel, m mVar, q qVar) {
        return ChannelsKt__DeprecatedKt.mapIndexed(receiveChannel, mVar, qVar);
    }

    public static final <E, C extends SendChannel<? super E>> Object toChannel(ReceiveChannel<? extends E> receiveChannel, C c10, zu.d<? super C> dVar) {
        return ChannelsKt__DeprecatedKt.toChannel(receiveChannel, c10, dVar);
    }

    public static final <E, C extends Collection<? super E>> Object toCollection(ReceiveChannel<? extends E> receiveChannel, C c10, zu.d<? super C> dVar) {
        return ChannelsKt__DeprecatedKt.toCollection(receiveChannel, c10, dVar);
    }

    public static final <E> Object toList(ReceiveChannel<? extends E> receiveChannel, zu.d<? super List<? extends E>> dVar) {
        return ChannelsKt__Channels_commonKt.toList(receiveChannel, dVar);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> Object toMap(ReceiveChannel<? extends v> receiveChannel, M m9, zu.d<? super M> dVar) {
        return ChannelsKt__DeprecatedKt.toMap(receiveChannel, m9, dVar);
    }

    public static final <E> Object toMutableSet(ReceiveChannel<? extends E> receiveChannel, zu.d<? super Set<E>> dVar) {
        return ChannelsKt__DeprecatedKt.toMutableSet(receiveChannel, dVar);
    }

    public static final <E> Object trySendBlocking(SendChannel<? super E> sendChannel, E e10) {
        return ChannelsKt__ChannelsKt.trySendBlocking(sendChannel, e10);
    }

    public static final <E, R> R consume(ReceiveChannel<? extends E> receiveChannel, l lVar) {
        return (R) ChannelsKt__Channels_commonKt.consume(receiveChannel, lVar);
    }

    public static final <E> Object consumeEach(ReceiveChannel<? extends E> receiveChannel, l lVar, zu.d<? super x0> dVar) {
        return ChannelsKt__Channels_commonKt.consumeEach(receiveChannel, lVar, dVar);
    }

    public static final <E, R, V> ReceiveChannel<V> zip(ReceiveChannel<? extends E> receiveChannel, ReceiveChannel<? extends R> receiveChannel2, m mVar, p pVar) {
        return ChannelsKt__DeprecatedKt.zip(receiveChannel, receiveChannel2, mVar, pVar);
    }
}
