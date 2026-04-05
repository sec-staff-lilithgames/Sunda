package o5;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77511i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f77512j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(y yVar, zu.d dVar) {
        super(2, dVar);
        this.f77512j = yVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new c0(this.f77512j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77511i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            j2 j2Var = this.f77512j.f77797e;
            this.f77511i = 1;
            if (j2Var.syncTriggers$room_runtime_release(this) == coroutine_suspended) {
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
        return ((c0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
