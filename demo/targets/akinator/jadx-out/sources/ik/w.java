package ik;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class w extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f59724i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f59725j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, zu.d dVar) {
        super(2, dVar);
        this.f59725j = zVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new w(this.f59725j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f59724i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        Flow<Object> data = this.f59725j.f59732c.getData();
        this.f59724i = 1;
        Object objFirst = FlowKt.first(data, this);
        return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super m> dVar) {
        return ((w) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
