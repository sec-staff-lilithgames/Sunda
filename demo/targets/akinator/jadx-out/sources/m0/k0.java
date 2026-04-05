package m0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f73775i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0.e f73776j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f73777k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(c0.e eVar, long j10, zu.d dVar) {
        super(2, dVar);
        this.f73776j = eVar;
        this.f73777k = j10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new k0(this.f73776j, this.f73777k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f73775i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            i1.h hVarM4174boximpl = i1.h.m4174boximpl(this.f73777k);
            c0.i1 i1Var = n0.f73799d;
            this.f73775i = 1;
            if (c0.e.animateTo$default(this.f73776j, hVarM4174boximpl, i1Var, null, null, this, 12, null) == coroutine_suspended) {
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
        return ((k0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
