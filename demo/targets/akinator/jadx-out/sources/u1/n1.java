package u1;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f87642i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f87643j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1 f87644k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.p f87645l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(g1 g1Var, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f87644k = g1Var;
        this.f87645l = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        n1 n1Var = new n1(this.f87644k, this.f87645l, dVar);
        n1Var.f87643j = obj;
        return n1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f87642i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f87643j;
            g1 g1Var = this.f87644k;
            g1Var.setCoroutineScope(coroutineScope);
            this.f87642i = 1;
            if (this.f87645l.invoke(g1Var, this) == coroutine_suspended) {
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
        return ((n1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
