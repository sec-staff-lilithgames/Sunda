package kotlinx.coroutines.internal;

import j1.o2;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kv.l;
import tu.h;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class OnUndeliveredElementKt {
    public static final <E> void callUndeliveredElement(l lVar, E e10, m mVar) {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException = callUndeliveredElementCatchingException(lVar, e10, null);
        if (undeliveredElementExceptionCallUndeliveredElementCatchingException != null) {
            CoroutineExceptionHandlerKt.handleCoroutineException(mVar, undeliveredElementExceptionCallUndeliveredElementCatchingException);
        }
    }

    public static final <E> UndeliveredElementException callUndeliveredElementCatchingException(l lVar, E e10, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e10);
            return undeliveredElementException;
        } catch (Throwable th2) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th2) {
                return new UndeliveredElementException(o2.j(e10, "Exception in undelivered element handler for "), th2);
            }
            h.addSuppressed(undeliveredElementException, th2);
            return undeliveredElementException;
        }
    }

    public static /* synthetic */ UndeliveredElementException callUndeliveredElementCatchingException$default(l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            undeliveredElementException = null;
        }
        return callUndeliveredElementCatchingException(lVar, obj, undeliveredElementException);
    }
}
