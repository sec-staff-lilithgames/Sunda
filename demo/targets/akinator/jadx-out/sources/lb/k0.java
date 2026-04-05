package lb;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72906i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f72907j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f72908k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f72909l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(e eVar, String str, String str2, zu.d dVar) {
        super(2, dVar);
        this.f72907j = eVar;
        this.f72908k = str;
        this.f72909l = str2;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new k0(this.f72907j, this.f72908k, this.f72909l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72906i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72906i = 1;
        Object objNewElementWithNameAndDescriptionAsync = this.f72907j.newElementWithNameAndDescriptionAsync(this.f72908k, this.f72909l, this);
        return objNewElementWithNameAndDescriptionAsync == coroutine_suspended ? coroutine_suspended : objNewElementWithNameAndDescriptionAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((k0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
