package lb;

import kotlinx.coroutines.CoroutineScope;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72903i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f72904j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e.i f72905k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, e.i iVar, zu.d dVar) {
        super(2, dVar);
        this.f72904j = eVar;
        this.f72905k = iVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new k(this.f72904j, this.f72905k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72903i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72903i = 1;
        Object objCancelAnswerAsync = this.f72904j.cancelAnswerAsync(this.f72905k, this);
        return objCancelAnswerAsync == coroutine_suspended ? coroutine_suspended : objCancelAnswerAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((k) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
