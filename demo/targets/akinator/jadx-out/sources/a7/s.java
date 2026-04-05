package a7;

import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f4136i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f4137j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l7.i f4138k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar, l7.i iVar, zu.d dVar) {
        super(2, dVar);
        this.f4137j = qVar;
        this.f4138k = iVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new s(this.f4137j, this.f4138k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f4136i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        this.f4136i = 1;
        Object objAccess$executeMain = q.access$executeMain(this.f4137j, this.f4138k, 1, this);
        return objAccess$executeMain == coroutine_suspended ? coroutine_suspended : objAccess$executeMain;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super l7.k> dVar) {
        return ((s) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
