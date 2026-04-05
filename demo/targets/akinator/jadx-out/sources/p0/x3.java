package p0;

import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n3 f80596i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0 f80597j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(n3 n3Var, y0 y0Var, zu.d dVar) {
        super(2, dVar);
        this.f80596i = n3Var;
        this.f80597j = y0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new x3(this.f80596i, this.f80597j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        CancellableContinuation cancellableContinuationC;
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        y0 y0VarJ = this.f80596i.j(this.f80597j, null);
        Object obj2 = this.f80596i.f80350c;
        n3 n3Var = this.f80596i;
        synchronized (obj2) {
            if (y0VarJ != null) {
                try {
                    n3Var.f80357j.add(y0VarJ);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            n3Var.f80366s--;
            cancellableContinuationC = n3Var.c();
        }
        if (cancellableContinuationC != null) {
            int i10 = tu.z.f87419c;
            cancellableContinuationC.resumeWith(tu.z.m7131constructorimpl(tu.x0.f87415a));
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((x3) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
