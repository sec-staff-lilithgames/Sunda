package rv;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public List f84989i;

    /* renamed from: j, reason: collision with root package name */
    public Object f84990j;

    /* renamed from: k, reason: collision with root package name */
    public Object f84991k;

    /* renamed from: l, reason: collision with root package name */
    public int f84992l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f84993m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f84994n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ov.g f84995o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(t tVar, ov.g gVar, zu.d dVar) {
        super(2, dVar);
        this.f84994n = tVar;
        this.f84995o = gVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        c0 c0Var = new c0(this.f84994n, this.f84995o, dVar);
        c0Var.f84993m = obj;
        return c0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        List mutableList;
        v vVar = (v) this.f84993m;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f84992l;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            mutableList = f0.toMutableList(this.f84994n);
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableList = this.f84989i;
            tu.a0.throwOnFailure(obj);
        }
        while (!mutableList.isEmpty()) {
            int iNextInt = this.f84995o.nextInt(mutableList.size());
            Object objRemoveLast = uu.v0.removeLast(mutableList);
            Object obj2 = iNextInt < mutableList.size() ? mutableList.set(iNextInt, objRemoveLast) : objRemoveLast;
            this.f84993m = vVar;
            this.f84989i = mutableList;
            this.f84990j = bv.m.nullOutSpilledVariable(objRemoveLast);
            this.f84991k = bv.m.nullOutSpilledVariable(obj2);
            this.f84992l = 1;
            if (vVar.yield(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(v vVar, zu.d<? super tu.x0> dVar) {
        return ((c0) create(vVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
