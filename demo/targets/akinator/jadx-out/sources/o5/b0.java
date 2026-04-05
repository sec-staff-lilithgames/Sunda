package o5;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77501i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f77502j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(y yVar, zu.d dVar) {
        super(2, dVar);
        this.f77502j = yVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new b0(this.f77502j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77501i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            y yVar = this.f77502j;
            kv.a aVar = yVar.f77801i;
            kv.a aVar2 = yVar.f77802j;
            this.f77501i = 1;
            if (yVar.f77797e.refreshInvalidation$room_runtime_release(new String[0], aVar, aVar2, this) == coroutine_suspended) {
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
        return ((b0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
