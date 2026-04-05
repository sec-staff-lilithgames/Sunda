package qw;

import java.util.Iterator;
import pw.n0;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public uu.u f83569i;

    /* renamed from: j, reason: collision with root package name */
    public Iterator f83570j;

    /* renamed from: k, reason: collision with root package name */
    public int f83571k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f83572l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0 f83573m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pw.r f83574n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f83575o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n0 n0Var, pw.r rVar, boolean z10, zu.d dVar) {
        super(2, dVar);
        this.f83573m = n0Var;
        this.f83574n = rVar;
        this.f83575o = z10;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        f fVar = new f(this.f83573m, this.f83574n, this.f83575o, dVar);
        fVar.f83572l = obj;
        return fVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        rv.v vVar;
        uu.u uVar;
        Iterator<n0> it;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f83571k;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            rv.v vVar2 = (rv.v) this.f83572l;
            uu.u uVar2 = new uu.u();
            n0 n0Var = this.f83573m;
            uVar2.addLast(n0Var);
            vVar = vVar2;
            uVar = uVar2;
            it = this.f83574n.list(n0Var).iterator();
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f83570j;
            uu.u uVar3 = this.f83569i;
            vVar = (rv.v) this.f83572l;
            a0.throwOnFailure(obj);
            uVar = uVar3;
        }
        while (it.hasNext()) {
            n0 next = it.next();
            this.f83572l = vVar;
            this.f83569i = uVar;
            this.f83570j = it;
            this.f83571k = 1;
            if (g.collectRecursively(vVar, this.f83574n, uVar, next, this.f83575o, false, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(rv.v vVar, zu.d<? super x0> dVar) {
        return ((f) create(vVar, dVar)).invokeSuspend(x0.f87415a);
    }
}
