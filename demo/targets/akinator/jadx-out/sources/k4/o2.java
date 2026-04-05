package k4;

import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o2 extends bv.n implements kv.p {
    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new o2(2, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(FlowCollector<? super tu.x0> flowCollector, zu.d<? super tu.x0> dVar) {
        return ((o2) create(flowCollector, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
