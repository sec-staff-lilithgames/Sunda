package p0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f80611i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n3 f80612j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d2 f80613k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c3 f80614l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(n3 n3Var, d2 d2Var, c3 c3Var, zu.d dVar) {
        super(2, dVar);
        this.f80612j = n3Var;
        this.f80613k = d2Var;
        this.f80614l = c3Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new y3(this.f80612j, this.f80613k, this.f80614l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f80611i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            this.f80611i = 1;
            if (n3.access$runFrameLoop(this.f80612j, this.f80613k, this.f80614l, this) == coroutine_suspended) {
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
        return ((y3) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
