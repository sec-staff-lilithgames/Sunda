package androidx.lifecycle;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y1 {
    @tu.f
    public static final <T> Object whenCreated(b1 b1Var, kv.p pVar, zu.d<? super T> dVar) {
        return whenCreated(b1Var.getLifecycle(), pVar, dVar);
    }

    @tu.f
    public static final <T> Object whenResumed(b1 b1Var, kv.p pVar, zu.d<? super T> dVar) {
        return whenResumed(b1Var.getLifecycle(), pVar, dVar);
    }

    @tu.f
    public static final <T> Object whenStarted(b1 b1Var, kv.p pVar, zu.d<? super T> dVar) {
        return whenStarted(b1Var.getLifecycle(), pVar, dVar);
    }

    @tu.f
    public static final <T> Object whenStateAtLeast(k0 k0Var, j0 j0Var, kv.p pVar, zu.d<? super T> dVar) {
        return BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new x1(k0Var, j0Var, pVar, null), dVar);
    }

    @tu.f
    public static final <T> Object whenCreated(k0 k0Var, kv.p pVar, zu.d<? super T> dVar) {
        return whenStateAtLeast(k0Var, j0.f6616e, pVar, dVar);
    }

    @tu.f
    public static final <T> Object whenResumed(k0 k0Var, kv.p pVar, zu.d<? super T> dVar) {
        return whenStateAtLeast(k0Var, j0.f6618g, pVar, dVar);
    }

    @tu.f
    public static final <T> Object whenStarted(k0 k0Var, kv.p pVar, zu.d<? super T> dVar) {
        return whenStateAtLeast(k0Var, j0.f6617f, pVar, dVar);
    }
}
