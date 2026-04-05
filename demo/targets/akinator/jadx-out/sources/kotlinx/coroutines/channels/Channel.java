package kotlinx.coroutines.channels;

import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.selects.SelectClause1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface Channel<E> extends SendChannel<E>, ReceiveChannel<E> {
    public static final int BUFFERED = -2;
    public static final int CONFLATED = -1;
    public static final String DEFAULT_BUFFER_PROPERTY_NAME = "kotlinx.coroutines.channels.defaultBuffer";
    public static final Factory Factory = Factory.$$INSTANCE;
    public static final int OPTIONAL_CHANNEL = -3;
    public static final int RENDEZVOUS = 0;
    public static final int UNLIMITED = Integer.MAX_VALUE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <E> SelectClause1<E> getOnReceiveOrNull(Channel<E> channel) {
            return ReceiveChannel.DefaultImpls.getOnReceiveOrNull(channel);
        }

        @tu.f
        public static <E> boolean offer(Channel<E> channel, E e10) {
            return SendChannel.DefaultImpls.offer(channel, e10);
        }

        @tu.f
        public static <E> E poll(Channel<E> channel) {
            return (E) ReceiveChannel.DefaultImpls.poll(channel);
        }

        @tu.f
        public static <E> Object receiveOrNull(Channel<E> channel, zu.d<? super E> dVar) {
            return ReceiveChannel.DefaultImpls.receiveOrNull(channel, dVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Factory {
        public static final int BUFFERED = -2;
        public static final int CONFLATED = -1;
        public static final String DEFAULT_BUFFER_PROPERTY_NAME = "kotlinx.coroutines.channels.defaultBuffer";
        public static final int OPTIONAL_CHANNEL = -3;
        public static final int RENDEZVOUS = 0;
        public static final int UNLIMITED = Integer.MAX_VALUE;
        static final /* synthetic */ Factory $$INSTANCE = new Factory();
        private static final int CHANNEL_DEFAULT_CAPACITY = SystemPropsKt.systemProp("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private Factory() {
        }

        public final int getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core() {
            return CHANNEL_DEFAULT_CAPACITY;
        }

        public static /* synthetic */ void getDEFAULT_BUFFER_PROPERTY_NAME$annotations() {
        }
    }
}
