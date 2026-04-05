package lb;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f73039i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0 f73040j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f73041k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f73042l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f73043m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f73044n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f73045o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(s0 s0Var, String str, int i10, boolean z10, boolean z11, boolean z12, zu.d dVar) {
        super(2, dVar);
        this.f73040j = s0Var;
        this.f73041k = str;
        this.f73042l = i10;
        this.f73043m = z10;
        this.f73044n = z11;
        this.f73045o = z12;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new x0(this.f73040j, this.f73041k, this.f73042l, this.f73043m, this.f73044n, this.f73045o, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f73039i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f73039i = 1;
        Object objStartSessionAsync = this.f73040j.startSessionAsync(this.f73041k, this.f73042l, this.f73043m, this.f73044n, this.f73045o, this);
        return objStartSessionAsync == coroutine_suspended ? coroutine_suspended : objStartSessionAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super y0> dVar) {
        return ((x0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
