package l0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72194i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u1.k0 f72195j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z0 f72196k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u1.k0 k0Var, z0 z0Var, zu.d dVar) {
        super(2, dVar);
        this.f72195j = k0Var;
        this.f72196k = z0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new x(this.f72195j, this.f72196k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72194i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            this.f72194i = 1;
            if (j0.access$detectDragGesturesWithObserver(this.f72195j, this.f72196k, this) == coroutine_suspended) {
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
        return ((x) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
