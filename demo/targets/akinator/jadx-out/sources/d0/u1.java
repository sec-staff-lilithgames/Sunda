package d0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f51634i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.f f51635j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51636k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(i0.f fVar, p0.j2 j2Var, zu.d dVar) {
        super(2, dVar);
        this.f51635j = fVar;
        this.f51636k = j2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new u1(this.f51635j, this.f51636k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f51634i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            y1.m3737access$invoke$lambda2(this.f51636k);
            this.f51634i = 1;
            if (i0.f.bringIntoView$default(this.f51635j, null, this, 1, null) == coroutine_suspended) {
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
        return ((u1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
