package androidx.lifecycle;

import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j2 {
    public static final Object repeatOnLifecycle(k0 k0Var, j0 j0Var, kv.p pVar, zu.d<? super tu.x0> dVar) {
        Object objCoroutineScope;
        if (j0Var == j0.f6615c) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        j0 currentState = k0Var.getCurrentState();
        j0 j0Var2 = j0.f6614b;
        tu.x0 x0Var = tu.x0.f87415a;
        return (currentState != j0Var2 && (objCoroutineScope = CoroutineScopeKt.coroutineScope(new i2(k0Var, j0Var, pVar, null), dVar)) == av.e.getCOROUTINE_SUSPENDED()) ? objCoroutineScope : x0Var;
    }

    public static final Object repeatOnLifecycle(b1 b1Var, j0 j0Var, kv.p pVar, zu.d<? super tu.x0> dVar) {
        Object objRepeatOnLifecycle = repeatOnLifecycle(b1Var.getLifecycle(), j0Var, pVar, dVar);
        return objRepeatOnLifecycle == av.e.getCOROUTINE_SUSPENDED() ? objRepeatOnLifecycle : tu.x0.f87415a;
    }
}
