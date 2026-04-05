package d0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f51539i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f51540j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f51541k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f0.q f51542l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51543m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(CoroutineScope coroutineScope, f0.q qVar, p0.j2 j2Var, zu.d dVar) {
        super(2, dVar);
        this.f51541k = coroutineScope;
        this.f51542l = qVar;
        this.f51543m = j2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        o2 o2Var = new o2(this.f51541k, this.f51542l, this.f51543m, dVar);
        o2Var.f51540j = obj;
        return o2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f51539i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.k0 k0Var = (u1.k0) this.f51540j;
            n2 n2Var = new n2(getContext(), this.f51541k, this.f51542l, this.f51543m, null);
            this.f51539i = 1;
            if (k0Var.awaitPointerEventScope(n2Var, this) == coroutine_suspended) {
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
    public final Object invoke(u1.k0 k0Var, zu.d<? super tu.x0> dVar) {
        return ((o2) create(k0Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
