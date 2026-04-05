package i0;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;
import x1.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f59328i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f59329j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s f59330k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i1.j f59331l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d0 f59332m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i1.j f59333n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, i1.j jVar, d0 d0Var, i1.j jVar2, zu.d dVar) {
        super(2, dVar);
        this.f59330k = sVar;
        this.f59331l = jVar;
        this.f59332m = d0Var;
        this.f59333n = jVar2;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        r rVar = new r(this.f59330k, this.f59331l, this.f59332m, this.f59333n, dVar);
        rVar.f59329j = obj;
        return rVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f59328i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f59329j;
            i1.j jVar = this.f59333n;
            s sVar = this.f59330k;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new q(sVar, jVar, null), 3, null);
            e eVar = sVar.f59298c;
            if (eVar == null) {
                eVar = sVar.f59297b;
            }
            this.f59328i = 1;
            if (eVar.bringChildIntoView(this.f59331l, this.f59332m, this) == coroutine_suspended) {
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
        return ((r) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
