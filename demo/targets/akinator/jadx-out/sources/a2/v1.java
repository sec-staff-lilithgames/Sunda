package a2;

import android.view.Choreographer;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v1 implements p0.d2 {

    /* renamed from: b, reason: collision with root package name */
    public final Choreographer f3863b;

    public v1(Choreographer choreographer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(choreographer, "choreographer");
        this.f3863b = choreographer;
    }

    @Override // p0.d2, zu.k, zu.m
    public <R> R fold(R r10, kv.p pVar) {
        return (R) p0.b2.fold(this, r10, pVar);
    }

    @Override // p0.d2, zu.k, zu.m
    public <E extends zu.k> E get(zu.l lVar) {
        return (E) p0.b2.get(this, lVar);
    }

    public final Choreographer getChoreographer() {
        return this.f3863b;
    }

    @Override // p0.d2, zu.k
    public /* bridge */ /* synthetic */ zu.l getKey() {
        return super.getKey();
    }

    @Override // p0.d2, zu.k, zu.m
    public zu.m minusKey(zu.l lVar) {
        return p0.b2.minusKey(this, lVar);
    }

    @Override // p0.d2, zu.k, zu.m
    public zu.m plus(zu.m mVar) {
        return p0.b2.plus(this, mVar);
    }

    @Override // p0.d2
    public <R> Object withFrameNanos(kv.l lVar, zu.d<? super R> dVar) {
        zu.k kVar = dVar.getContext().get(zu.f.f98853b);
        p1 p1Var = kVar instanceof p1 ? (p1) kVar : null;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        u1 u1Var = new u1(cancellableContinuationImpl, this, lVar);
        if (p1Var == null || !kotlin.jvm.internal.e0.areEqual(p1Var.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(u1Var);
            cancellableContinuationImpl.invokeOnCancellation(new t1(this, u1Var));
        } else {
            p1Var.postFrameCallback$ui_release(u1Var);
            cancellableContinuationImpl.invokeOnCancellation(new s1(p1Var, u1Var));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }
}
