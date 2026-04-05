package qw;

import pw.n0;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f83565i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f83566j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ pw.r f83567k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n0 f83568l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(pw.r rVar, n0 n0Var, zu.d dVar) {
        super(2, dVar);
        this.f83567k = rVar;
        this.f83568l = n0Var;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        e eVar = new e(this.f83567k, this.f83568l, dVar);
        eVar.f83566j = obj;
        return eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f83565i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            rv.v vVar = (rv.v) this.f83566j;
            uu.u uVar = new uu.u();
            this.f83565i = 1;
            if (g.collectRecursively(vVar, this.f83567k, uVar, this.f83568l, false, true, this) == coroutine_suspended) {
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
    public final Object invoke(rv.v vVar, zu.d<? super x0> dVar) {
        return ((e) create(vVar, dVar)).invokeSuspend(x0.f87415a);
    }
}
