package q5;

import kotlin.jvm.internal.b1;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f82438i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kv.p f82439j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1 f82440k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kv.p pVar, b1 b1Var, zu.d dVar) {
        super(2, dVar);
        this.f82439j = pVar;
        this.f82440k = b1Var;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new k(this.f82439j, this.f82440k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f82438i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        Object obj2 = this.f82440k.f71816b;
        this.f82438i = 1;
        Object objInvoke = this.f82439j.invoke(obj2, this);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((k) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
