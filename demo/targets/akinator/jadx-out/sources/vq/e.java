package vq;

import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;
import vq.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c.b f89569i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f89570j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c.b bVar, Object obj, zu.d dVar) {
        super(2, dVar);
        this.f89569i = bVar;
        this.f89570j = obj;
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new e(this.f89569i, this.f89570j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        this.f89569i.f89564a.onSuccess(this.f89570j);
        return x0.f87415a;
    }
}
