package e0;

import kotlinx.coroutines.CoroutineScope;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53204i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v5 f53205j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f53206k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(v5 v5Var, float f10, zu.d dVar) {
        super(2, dVar);
        this.f53205j = v5Var;
        this.f53206k = f10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new n3(this.f53205j, this.f53206k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53204i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            z3 z3Var = (z3) this.f53205j.getValue();
            this.f53204i = 1;
            if (z3Var.onDragStopped(this.f53206k, this) == coroutine_suspended) {
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
        return ((n3) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
