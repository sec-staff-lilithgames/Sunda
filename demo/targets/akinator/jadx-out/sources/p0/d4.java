package p0;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d4 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f80185i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f80186j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.q f80187k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(kv.q qVar, zu.d dVar) {
        super(2, dVar);
        this.f80187k = qVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        d4 d4Var = new d4(this.f80187k, dVar);
        d4Var.f80186j = obj;
        return d4Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        n3 n3Var;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f80185i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f80186j;
            n3Var = new n3(coroutineScope.getCoroutineContext());
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new c4(n3Var, null), 3, null);
            this.f80186j = n3Var;
            this.f80185i = 1;
            obj = this.f80187k.invoke(coroutineScope, n3Var, this);
            if (obj != coroutine_suspended) {
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = this.f80186j;
            tu.a0.throwOnFailure(obj);
            return obj2;
        }
        n3Var = (n3) this.f80186j;
        tu.a0.throwOnFailure(obj);
        n3Var.close();
        this.f80186j = obj;
        this.f80185i = 2;
        return n3Var.join(this) == coroutine_suspended ? coroutine_suspended : obj;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((d4) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
