package d0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f51485i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0.q f51486j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51487k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(f0.q qVar, p0.j2 j2Var, zu.d dVar) {
        super(2, dVar);
        this.f51486j = qVar;
        this.f51487k = j2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new l2(this.f51486j, this.f51487k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f51485i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            this.f51485i = 1;
            if (r2.access$invoke$emitEnter(this.f51486j, this.f51487k, this) == coroutine_suspended) {
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
        return ((l2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
