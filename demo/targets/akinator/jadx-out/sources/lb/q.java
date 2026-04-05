package lb;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72949i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f72950j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f72951k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f72952l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f72953m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f72954n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f72955o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f72956p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(e eVar, String str, String str2, String str3, String str4, String str5, String str6, zu.d dVar) {
        super(2, dVar);
        this.f72950j = eVar;
        this.f72951k = str;
        this.f72952l = str2;
        this.f72953m = str3;
        this.f72954n = str4;
        this.f72955o = str5;
        this.f72956p = str6;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new q(this.f72950j, this.f72951k, this.f72952l, this.f72953m, this.f72954n, this.f72955o, this.f72956p, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72949i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f72949i = 1;
        Object objCorrectNameAsync = this.f72950j.correctNameAsync(this.f72951k, this.f72952l, this.f72953m, this.f72954n, this.f72955o, this.f72956p, this);
        return objCorrectNameAsync == coroutine_suspended ? coroutine_suspended : objCorrectNameAsync;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super Integer> dVar) {
        return ((q) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
