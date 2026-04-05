package kotlinx.coroutines.channels;

import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectInstance;
import kv.l;
import p0.o2;
import tu.h;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class ConflatedBufferedChannel<E> extends BufferedChannel<E> {
    private final int capacity;
    private final BufferOverflow onBufferOverflow;

    public /* synthetic */ ConflatedBufferedChannel(int i10, BufferOverflow bufferOverflow, l lVar, int i11, u uVar) {
        this(i10, bufferOverflow, (i11 & 4) != 0 ? null : lVar);
    }

    public static /* synthetic */ <E> Object send$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e10, zu.d<? super x0> dVar) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        Object objM5170trySendImplMj0NB7M = conflatedBufferedChannel.m5170trySendImplMj0NB7M(e10, true);
        if (!(objM5170trySendImplMj0NB7M instanceof ChannelResult.Closed)) {
            return x0.f87415a;
        }
        ChannelResult.m5157exceptionOrNullimpl(objM5170trySendImplMj0NB7M);
        l lVar = conflatedBufferedChannel.onUndeliveredElement;
        if (lVar == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lVar, e10, null, 2, null)) == null) {
            throw conflatedBufferedChannel.getSendException();
        }
        h.addSuppressed(undeliveredElementExceptionCallUndeliveredElementCatchingException$default, conflatedBufferedChannel.getSendException());
        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
    }

    public static /* synthetic */ <E> Object sendBroadcast$suspendImpl(ConflatedBufferedChannel<E> conflatedBufferedChannel, E e10, zu.d<? super Boolean> dVar) {
        Object objM5170trySendImplMj0NB7M = conflatedBufferedChannel.m5170trySendImplMj0NB7M(e10, true);
        if (objM5170trySendImplMj0NB7M instanceof ChannelResult.Failed) {
            return bv.b.boxBoolean(false);
        }
        return bv.b.boxBoolean(true);
    }

    /* renamed from: trySendDropLatest-Mj0NB7M, reason: not valid java name */
    private final Object m5169trySendDropLatestMj0NB7M(E e10, boolean z10) {
        l lVar;
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        Object objMo5139trySendJP2dKIU = super.mo5139trySendJP2dKIU(e10);
        if (ChannelResult.m5163isSuccessimpl(objMo5139trySendJP2dKIU) || ChannelResult.m5161isClosedimpl(objMo5139trySendJP2dKIU)) {
            return objMo5139trySendJP2dKIU;
        }
        if (!z10 || (lVar = this.onUndeliveredElement) == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lVar, e10, null, 2, null)) == null) {
            return ChannelResult.Companion.m5168successJP2dKIU(x0.f87415a);
        }
        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
    }

    /* renamed from: trySendImpl-Mj0NB7M, reason: not valid java name */
    private final Object m5170trySendImplMj0NB7M(E e10, boolean z10) {
        return this.onBufferOverflow == BufferOverflow.DROP_LATEST ? m5169trySendDropLatestMj0NB7M(e10, z10) : m5147trySendDropOldestJP2dKIU(e10);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean isConflatedDropOldest() {
        return this.onBufferOverflow == BufferOverflow.DROP_OLDEST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void registerSelectForSend(SelectInstance<?> selectInstance, Object obj) {
        Object objMo5139trySendJP2dKIU = mo5139trySendJP2dKIU(obj);
        if (!(objMo5139trySendJP2dKIU instanceof ChannelResult.Failed)) {
            selectInstance.selectInRegistrationPhase(x0.f87415a);
        } else {
            if (!(objMo5139trySendJP2dKIU instanceof ChannelResult.Closed)) {
                throw new IllegalStateException("unreachable");
            }
            ChannelResult.m5157exceptionOrNullimpl(objMo5139trySendJP2dKIU);
            selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public Object send(E e10, zu.d<? super x0> dVar) {
        return send$suspendImpl((ConflatedBufferedChannel) this, (Object) e10, dVar);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public Object sendBroadcast$kotlinx_coroutines_core(E e10, zu.d<? super Boolean> dVar) {
        return sendBroadcast$suspendImpl((ConflatedBufferedChannel) this, (Object) e10, dVar);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    public Object mo5139trySendJP2dKIU(E e10) {
        return m5170trySendImplMj0NB7M(e10, false);
    }

    public ConflatedBufferedChannel(int i10, BufferOverflow bufferOverflow, l lVar) {
        super(i10, lVar);
        this.capacity = i10;
        this.onBufferOverflow = bufferOverflow;
        if (bufferOverflow != BufferOverflow.SUSPEND) {
            if (i10 < 1) {
                throw new IllegalArgumentException(o2.k(i10, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + c1.getOrCreateKotlinClass(BufferedChannel.class).getSimpleName() + " instead").toString());
        }
    }
}
