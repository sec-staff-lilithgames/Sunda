package qa;

import av.e;
import bv.n;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f82652i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f82653j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, zu.d dVar) {
        super(2, dVar);
        this.f82653j = str;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new c(this.f82653j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.f82652i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            b bVar = new b(this.f82653j, null);
            this.f82652i = 1;
            if (BuildersKt.withContext(io2, bVar, this) == coroutine_suspended) {
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
        return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
