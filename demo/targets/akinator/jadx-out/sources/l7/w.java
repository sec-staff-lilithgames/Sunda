package l7;

import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f72663i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, zu.d dVar) {
        super(2, dVar);
        this.f72663i = xVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new w(this.f72663i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        this.f72663i.setRequest(null);
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((w) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
