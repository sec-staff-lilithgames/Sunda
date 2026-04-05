package androidx.lifecycle;

import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f6744i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6745j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k0 f6746k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(k0 k0Var, zu.d dVar) {
        super(2, dVar);
        this.f6746k = k0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        y0 y0Var = new y0(this.f6746k, dVar);
        y0Var.f6745j = obj;
        return y0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f6744i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.f6745j;
            w0 w0Var = new w0(producerScope, 0);
            k0 k0Var = this.f6746k;
            k0Var.addObserver(w0Var);
            x0 x0Var = new x0(0, k0Var, w0Var);
            this.f6744i = 1;
            if (ProduceKt.awaitClose(producerScope, x0Var, this) == coroutine_suspended) {
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
    public final Object invoke(ProducerScope<? super i0> producerScope, zu.d<? super tu.x0> dVar) {
        return ((y0) create(producerScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
