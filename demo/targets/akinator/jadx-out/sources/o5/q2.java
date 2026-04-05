package o5;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77698i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77699j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j2 f77700k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(j2 j2Var, zu.d dVar) {
        super(2, dVar);
        this.f77700k = j2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        q2 q2Var = new q2(this.f77700k, dVar);
        q2Var.f77699j = obj;
        return q2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77698i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        f2 f2Var = (f2) this.f77699j;
        this.f77698i = 1;
        Object objAccess$checkInvalidatedTables = j2.access$checkInvalidatedTables(this.f77700k, f2Var, this);
        return objAccess$checkInvalidatedTables == coroutine_suspended ? coroutine_suspended : objAccess$checkInvalidatedTables;
    }

    @Override // kv.p
    public final Object invoke(f2 f2Var, zu.d<? super Set<Integer>> dVar) {
        return ((q2) create(f2Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
