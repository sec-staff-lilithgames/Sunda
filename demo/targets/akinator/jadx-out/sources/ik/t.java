package ik;

import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class t extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f59719i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f59720j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, zu.d dVar) {
        super(2, dVar);
        this.f59720j = zVar;
    }

    public static final /* synthetic */ Object access$invokeSuspend$set(AtomicReference atomicReference, m mVar, zu.d dVar) {
        atomicReference.set(mVar);
        return x0.f87415a;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new t(this.f59720j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f59719i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            z zVar = this.f59720j;
            Flow<Object> data = zVar.f59732c.getData();
            s sVar = new s(zVar.f59733d);
            this.f59719i = 1;
            if (data.collect(sVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((t) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
