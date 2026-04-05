package jb;

import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f69248i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, zu.d dVar) {
        super(2, dVar);
        this.f69248i = cVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new e(this.f69248i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Exception {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        if (this.f69248i.b()) {
            return x0.f87415a;
        }
        throw new Exception("Push failed");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
