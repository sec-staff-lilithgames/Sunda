package kotlinx.coroutines;

import kotlinx.coroutines.internal.DispatchedContinuation;
import tu.a0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DebugStringsKt {
    public static final String getClassSimpleName(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String getHexAddress(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String toDebugString(d<?> dVar) {
        Object objM7131constructorimpl;
        if (dVar instanceof DispatchedContinuation) {
            return ((DispatchedContinuation) dVar).toString();
        }
        try {
            int i10 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(dVar + '@' + getHexAddress(dVar));
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (z.m7134exceptionOrNullimpl(objM7131constructorimpl) != null) {
            objM7131constructorimpl = dVar.getClass().getName() + '@' + getHexAddress(dVar);
        }
        return (String) objM7131constructorimpl;
    }
}
