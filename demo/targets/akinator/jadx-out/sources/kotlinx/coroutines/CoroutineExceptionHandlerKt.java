package kotlinx.coroutines;

import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;
import kv.p;
import tu.h;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CoroutineExceptionHandlerKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1, reason: invalid class name */
    public static final class AnonymousClass1 extends zu.a implements CoroutineExceptionHandler {
        final /* synthetic */ p $handler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar, CoroutineExceptionHandler.Key key) {
            super(key);
            this.$handler = pVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(m mVar, Throwable th2) {
            this.$handler.invoke(mVar, th2);
        }
    }

    public static final CoroutineExceptionHandler CoroutineExceptionHandler(p pVar) {
        return new AnonymousClass1(pVar, CoroutineExceptionHandler.Key);
    }

    public static final void handleCoroutineException(m mVar, Throwable th2) {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) mVar.get(CoroutineExceptionHandler.Key);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(mVar, th2);
            } else {
                CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(mVar, th2);
            }
        } catch (Throwable th3) {
            CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(mVar, handlerException(th2, th3));
        }
    }

    public static final Throwable handlerException(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        h.addSuppressed(runtimeException, th2);
        return runtimeException;
    }
}
