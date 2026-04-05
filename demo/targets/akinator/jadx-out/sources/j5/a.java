package j5;

import bv.n;
import j5.h;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f69104i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h.a f69105j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l5.a f69106k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h.a aVar, l5.a aVar2, zu.d dVar) {
        super(2, dVar);
        this.f69105j = aVar;
        this.f69106k = aVar2;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new a(this.f69105j, this.f69106k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f69104i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            l5.c cVar = this.f69105j.f69126b;
            this.f69104i = 1;
            if (cVar.deleteRegistrations(this.f69106k, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
