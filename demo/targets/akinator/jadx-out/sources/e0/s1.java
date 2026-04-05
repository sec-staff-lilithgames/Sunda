package e0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s1 extends bv.n implements kv.q {
    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m3786invoked4ec7I((CoroutineScope) obj, ((i1.h) obj2).m4195unboximpl(), (zu.d) obj3);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m3786invoked4ec7I(CoroutineScope coroutineScope, long j10, zu.d<? super tu.x0> dVar) {
        return new s1(3, dVar).invokeSuspend(tu.x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        return tu.x0.f87415a;
    }
}
