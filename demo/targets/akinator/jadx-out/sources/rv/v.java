package rv;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class v {
    public abstract Object yield(Object obj, zu.d<? super tu.x0> dVar);

    public final Object yieldAll(Iterable<Object> iterable, zu.d<? super tu.x0> dVar) {
        Object objYieldAll;
        boolean z10 = iterable instanceof Collection;
        tu.x0 x0Var = tu.x0.f87415a;
        return (!(z10 && ((Collection) iterable).isEmpty()) && (objYieldAll = yieldAll(iterable.iterator(), dVar)) == av.e.getCOROUTINE_SUSPENDED()) ? objYieldAll : x0Var;
    }

    public abstract Object yieldAll(Iterator<Object> it, zu.d<? super tu.x0> dVar);

    public final Object yieldAll(t tVar, zu.d<? super tu.x0> dVar) {
        Object objYieldAll = yieldAll(tVar.iterator(), dVar);
        return objYieldAll == av.e.getCOROUTINE_SUSPENDED() ? objYieldAll : tu.x0.f87415a;
    }
}
