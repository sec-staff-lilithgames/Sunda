package f0;

import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import p0.j2;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f55262i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f55263j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j2 f55264k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, j2 j2Var, zu.d dVar) {
        super(2, dVar);
        this.f55263j = oVar;
        this.f55264k = j2Var;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new g(this.f55263j, this.f55264k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f55262i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            Flow<n> interactions = this.f55263j.getInteractions();
            f fVar = new f(arrayList, this.f55264k);
            this.f55262i = 1;
            if (interactions.collect(fVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((g) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
