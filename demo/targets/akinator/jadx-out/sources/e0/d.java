package e0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f52999i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f53000j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i1.j f53001k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i1.j f53002l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, i1.j jVar, i1.j jVar2, zu.d dVar) {
        super(2, dVar);
        this.f53000j = eVar;
        this.f53001k = jVar;
        this.f53002l = jVar2;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new d(this.f53000j, this.f53001k, this.f53002l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f52999i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            this.f52999i = 1;
            if (this.f53000j.b(this.f53001k, this.f53002l, this) == coroutine_suspended) {
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
        return ((d) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
