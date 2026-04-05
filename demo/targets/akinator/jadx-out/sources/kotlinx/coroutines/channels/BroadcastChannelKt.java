package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.Symbol;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BroadcastChannelKt {
    private static final Symbol NO_ELEMENT = new Symbol("NO_ELEMENT");

    @tu.f
    public static final <E> BroadcastChannel<E> BroadcastChannel(int i10) {
        if (i10 == -2) {
            return new BroadcastChannelImpl(Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core());
        }
        if (i10 == -1) {
            return new ConflatedBroadcastChannel();
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
        }
        if (i10 != Integer.MAX_VALUE) {
            return new BroadcastChannelImpl(i10);
        }
        throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
    }
}
