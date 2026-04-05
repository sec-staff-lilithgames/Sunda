package i0;

import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f59325i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f59326j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i1.j f59327k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, i1.j jVar, zu.d dVar) {
        super(2, dVar);
        this.f59326j = sVar;
        this.f59327k = jVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new q(this.f59326j, this.f59327k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f59325i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            m responder = this.f59326j.getResponder();
            this.f59325i = 1;
            if (responder.bringChildIntoView(this.f59327k, this) == coroutine_suspended) {
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
        return ((q) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
