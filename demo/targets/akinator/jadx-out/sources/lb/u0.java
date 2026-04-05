package lb;

import kotlinx.coroutines.CoroutineScope;
import lb.s0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f73002i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0 f73003j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f73004k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(s0 s0Var, String str, zu.d dVar) {
        super(2, dVar);
        this.f73003j = s0Var;
        this.f73004k = str;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new u0(this.f73003j, this.f73004k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f73002i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f73002i = 1;
        Object objCallCMDBAsync = this.f73003j.callCMDBAsync(this.f73004k, this);
        return objCallCMDBAsync == coroutine_suspended ? coroutine_suspended : objCallCMDBAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super s0.a> dVar) {
        return ((u0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
