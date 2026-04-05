package kotlinx.coroutines.channels;

import kotlinx.coroutines.channels.ChannelResult;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ChannelKt {
    public static final <E> Channel<E> Channel(int i10, BufferOverflow bufferOverflow, l lVar) {
        if (i10 == -2) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core(), lVar) : new ConflatedBufferedChannel(1, bufferOverflow, lVar);
        }
        if (i10 != -1) {
            return i10 != 0 ? i10 != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(i10, lVar) : new ConflatedBufferedChannel(i10, bufferOverflow, lVar) : new BufferedChannel(Integer.MAX_VALUE, lVar) : bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(0, lVar) : new ConflatedBufferedChannel(1, bufferOverflow, lVar);
        }
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            return new ConflatedBufferedChannel(1, BufferOverflow.DROP_OLDEST, lVar);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ Channel Channel$default(int i10, BufferOverflow bufferOverflow, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return Channel(i10, bufferOverflow, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrElse-WpGqRn0, reason: not valid java name */
    public static final <T> T m5149getOrElseWpGqRn0(Object obj, l lVar) {
        return obj instanceof ChannelResult.Failed ? (T) lVar.invoke(ChannelResult.m5157exceptionOrNullimpl(obj)) : obj;
    }

    /* renamed from: onClosed-WpGqRn0, reason: not valid java name */
    public static final <T> Object m5150onClosedWpGqRn0(Object obj, l lVar) {
        if (obj instanceof ChannelResult.Closed) {
            lVar.invoke(ChannelResult.m5157exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* renamed from: onFailure-WpGqRn0, reason: not valid java name */
    public static final <T> Object m5151onFailureWpGqRn0(Object obj, l lVar) {
        if (obj instanceof ChannelResult.Failed) {
            lVar.invoke(ChannelResult.m5157exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* renamed from: onSuccess-WpGqRn0, reason: not valid java name */
    public static final <T> Object m5152onSuccessWpGqRn0(Object obj, l lVar) {
        if (!(obj instanceof ChannelResult.Failed)) {
            lVar.invoke(obj);
        }
        return obj;
    }

    public static /* synthetic */ Channel Channel$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return Channel(i10);
    }

    @tu.f
    public static final /* synthetic */ Channel Channel(int i10) {
        return Channel$default(i10, null, null, 6, null);
    }
}
