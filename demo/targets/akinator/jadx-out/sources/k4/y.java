package k4;

import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y extends bv.n implements kv.q {

    /* renamed from: i, reason: collision with root package name */
    public int f70561i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f70562j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p pVar, zu.d dVar) {
        super(3, dVar);
        this.f70562j = pVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f70561i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            this.f70561i = 1;
            if (p.access$decrementCollector(this.f70562j, this) == coroutine_suspended) {
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

    @Override // kv.q
    public final Object invoke(FlowCollector<Object> flowCollector, Throwable th2, zu.d<? super tu.x0> dVar) {
        return new y(this.f70562j, dVar).invokeSuspend(tu.x0.f87415a);
    }
}
