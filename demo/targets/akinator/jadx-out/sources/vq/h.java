package vq;

import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a f89574i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f89575j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, Object obj, zu.d dVar) {
        super(2, dVar);
        this.f89574i = aVar;
        this.f89575j = obj;
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((h) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new h(this.f89574i, this.f89575j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        this.f89574i.onSuccess(this.f89575j);
        return x0.f87415a;
    }
}
