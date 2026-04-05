package j0;

import d0.k0;
import e0.p2;
import kv.q;
import p0.j2;
import p0.v5;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends bv.n implements q {

    /* renamed from: i, reason: collision with root package name */
    public int f68787i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ p2 f68788j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ long f68789k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f68790l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f0.q f68791m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j2 f68792n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v5 f68793o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z10, f0.q qVar, j2 j2Var, v5 v5Var, zu.d dVar) {
        super(3, dVar);
        this.f68790l = z10;
        this.f68791m = qVar;
        this.f68792n = j2Var;
        this.f68793o = v5Var;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m4652invoked4ec7I((p2) obj, ((i1.h) obj2).m4195unboximpl(), (zu.d) obj3);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m4652invoked4ec7I(p2 p2Var, long j10, zu.d<? super x0> dVar) {
        j jVar = new j(this.f68790l, this.f68791m, this.f68792n, this.f68793o, dVar);
        jVar.f68788j = p2Var;
        jVar.f68789k = j10;
        return jVar.invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f68787i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            p2 p2Var = this.f68788j;
            long j10 = this.f68789k;
            if (this.f68790l) {
                this.f68787i = 1;
                if (k0.m3715handlePressInteractionEPk0efs(p2Var, j10, this.f68791m, this.f68792n, this.f68793o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }
}
