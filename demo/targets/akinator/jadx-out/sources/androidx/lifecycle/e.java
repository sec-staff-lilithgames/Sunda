package androidx.lifecycle;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f6553i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6554j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f6555k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, zu.d dVar) {
        super(2, dVar);
        this.f6555k = fVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        e eVar = new e(this.f6555k, dVar);
        eVar.f6554j = obj;
        return eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f6553i;
        f fVar = this.f6555k;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            p1 p1Var = new p1(fVar.f6564a, ((CoroutineScope) this.f6554j).getCoroutineContext());
            kv.p pVar = fVar.f6565b;
            this.f6553i = 1;
            if (pVar.invoke(p1Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        fVar.f6568e.invoke();
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
