package j0;

import e0.q4;
import f0.q;
import p0.j2;
import p0.v5;
import tu.a0;
import tu.x0;
import u1.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f68796i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f68797j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f68798k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f68799l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j2 f68800m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v5 f68801n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v5 f68802o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z10, q qVar, j2 j2Var, v5 v5Var, v5 v5Var2, zu.d dVar) {
        super(2, dVar);
        this.f68798k = z10;
        this.f68799l = qVar;
        this.f68800m = j2Var;
        this.f68801n = v5Var;
        this.f68802o = v5Var2;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        l lVar = new l(this.f68798k, this.f68799l, this.f68800m, this.f68801n, this.f68802o, dVar);
        lVar.f68797j = obj;
        return lVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f68796i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            k0 k0Var = (k0) this.f68797j;
            j jVar = new j(this.f68798k, this.f68799l, this.f68800m, this.f68801n, null);
            k kVar = new k(this.f68798k, this.f68802o);
            this.f68796i = 1;
            if (q4.detectTapAndPress(k0Var, jVar, kVar, this) == coroutine_suspended) {
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
    public final Object invoke(k0 k0Var, zu.d<? super x0> dVar) {
        return ((l) create(k0Var, dVar)).invokeSuspend(x0.f87415a);
    }
}
