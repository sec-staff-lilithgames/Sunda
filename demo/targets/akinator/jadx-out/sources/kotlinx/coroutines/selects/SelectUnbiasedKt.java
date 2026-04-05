package kotlinx.coroutines.selects;

import kotlin.jvm.internal.b0;
import kv.l;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SelectUnbiasedKt {
    public static final <R> Object selectUnbiased(l lVar, d<? super R> dVar) {
        UnbiasedSelectImplementation unbiasedSelectImplementation = new UnbiasedSelectImplementation(dVar.getContext());
        lVar.invoke(unbiasedSelectImplementation);
        return unbiasedSelectImplementation.doSelect(dVar);
    }

    private static final <R> Object selectUnbiased$$forInline(l lVar, d<? super R> dVar) {
        b0.mark(3);
        throw null;
    }
}
