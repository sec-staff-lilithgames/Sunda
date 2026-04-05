package o9;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class z1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78708i;

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new z1(2, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78708i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            y1 y1Var = new y1(2, null);
            this.f78708i = 1;
            if (BuildersKt.withContext(io2, y1Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((z1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
