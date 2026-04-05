package k4;

import k4.o1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f70526i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f70527j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p f70528k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(p pVar, zu.d dVar) {
        super(2, dVar);
        this.f70528k = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        u0 u0Var = new u0(this.f70528k, dVar);
        u0Var.f70527j = obj;
        return u0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f70526i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            o1.a aVar = (o1.a) this.f70527j;
            this.f70526i = 1;
            if (p.access$handleUpdate(this.f70528k, aVar, this) == coroutine_suspended) {
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
    public final Object invoke(o1.a aVar, zu.d<? super tu.x0> dVar) {
        return ((u0) create(aVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
