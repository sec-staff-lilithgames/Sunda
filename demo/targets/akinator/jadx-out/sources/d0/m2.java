package d0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f51500i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51501j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f0.q f51502k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(f0.q qVar, p0.j2 j2Var, zu.d dVar) {
        super(2, dVar);
        this.f51501j = j2Var;
        this.f51502k = qVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new m2(this.f51502k, this.f51501j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f51500i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            this.f51500i = 1;
            if (r2.access$invoke$emitExit(this.f51501j, this.f51502k, this) == coroutine_suspended) {
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
        return ((m2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
