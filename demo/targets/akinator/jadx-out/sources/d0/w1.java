package d0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public p0.j2 f51650i;

    /* renamed from: j, reason: collision with root package name */
    public int f51651j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51652k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f0.q f51653l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(f0.q qVar, p0.j2 j2Var, zu.d dVar) {
        super(2, dVar);
        this.f51652k = j2Var;
        this.f51653l = qVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new w1(this.f51653l, this.f51652k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        p0.j2 j2Var;
        p0.j2 j2Var2;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f51651j;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            j2Var = this.f51652k;
            f0.d dVar = (f0.d) j2Var.getValue();
            if (dVar != null) {
                f0.e eVar = new f0.e(dVar);
                f0.q qVar = this.f51653l;
                if (qVar != null) {
                    this.f51650i = j2Var;
                    this.f51651j = 1;
                    if (qVar.emit(eVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j2Var2 = j2Var;
                }
                j2Var.setValue(null);
            }
            return tu.x0.f87415a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j2Var2 = this.f51650i;
        tu.a0.throwOnFailure(obj);
        j2Var = j2Var2;
        j2Var.setValue(null);
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((w1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
