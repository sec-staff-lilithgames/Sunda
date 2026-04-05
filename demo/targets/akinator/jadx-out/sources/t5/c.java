package t5;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f86339i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f86340j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, zu.d dVar) {
        super(2, dVar);
        this.f86340j = aVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new c(this.f86340j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f86339i;
        a aVar = this.f86340j;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            long j10 = aVar.f86333f;
            this.f86339i = 1;
            if (DelayKt.delay(j10, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        a.access$autoCloseDatabase(aVar);
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
