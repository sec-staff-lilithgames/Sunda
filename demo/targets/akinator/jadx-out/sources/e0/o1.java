package e0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o1 extends bv.n implements kv.q {
    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((CoroutineScope) obj, ((Number) obj2).floatValue(), (zu.d<? super tu.x0>) obj3);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        return tu.x0.f87415a;
    }

    public final Object invoke(CoroutineScope coroutineScope, float f10, zu.d<? super tu.x0> dVar) {
        return new o1(3, dVar).invokeSuspend(tu.x0.f87415a);
    }
}
