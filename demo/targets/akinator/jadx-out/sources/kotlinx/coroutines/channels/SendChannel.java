package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.selects.SelectClause2;
import kv.l;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface SendChannel<E> {
    boolean close(Throwable th2);

    SelectClause2<E, SendChannel<E>> getOnSend();

    void invokeOnClose(l lVar);

    boolean isClosedForSend();

    @tu.f
    boolean offer(E e10);

    Object send(E e10, zu.d<? super x0> dVar);

    /* renamed from: trySend-JP2dKIU */
    Object mo5139trySendJP2dKIU(E e10);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean close$default(SendChannel sendChannel, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return sendChannel.close(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @tu.f
        public static <E> boolean offer(SendChannel<? super E> sendChannel, E e10) throws Throwable {
            Object objMo5139trySendJP2dKIU = sendChannel.mo5139trySendJP2dKIU(e10);
            if (ChannelResult.m5163isSuccessimpl(objMo5139trySendJP2dKIU)) {
                return true;
            }
            Throwable thM5157exceptionOrNullimpl = ChannelResult.m5157exceptionOrNullimpl(objMo5139trySendJP2dKIU);
            if (thM5157exceptionOrNullimpl == null) {
                return false;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(thM5157exceptionOrNullimpl);
        }

        public static /* synthetic */ void isClosedForSend$annotations() {
        }
    }
}
