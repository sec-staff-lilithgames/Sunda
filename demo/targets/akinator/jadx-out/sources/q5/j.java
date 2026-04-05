package q5;

import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f82435i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kv.p f82436j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r f82437k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kv.p pVar, r rVar, zu.d dVar) {
        super(2, dVar);
        this.f82436j = pVar;
        this.f82437k = rVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new j(this.f82436j, this.f82437k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f82435i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f82435i = 1;
        Object objInvoke = this.f82436j.invoke(this.f82437k, this);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((j) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
