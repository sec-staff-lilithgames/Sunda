package d0;

import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 extends bv.n implements kv.q {

    /* renamed from: i, reason: collision with root package name */
    public int f51580i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ e0.p2 f51581j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ long f51582k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f51583l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f0.q f51584m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51585n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v5 f51586o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(boolean z10, f0.q qVar, p0.j2 j2Var, v5 v5Var, zu.d dVar) {
        super(3, dVar);
        this.f51583l = z10;
        this.f51584m = qVar;
        this.f51585n = j2Var;
        this.f51586o = v5Var;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m3728invoked4ec7I((e0.p2) obj, ((i1.h) obj2).m4195unboximpl(), (zu.d) obj3);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m3728invoked4ec7I(e0.p2 p2Var, long j10, zu.d<? super tu.x0> dVar) {
        r0 r0Var = new r0(this.f51583l, this.f51584m, this.f51585n, this.f51586o, dVar);
        r0Var.f51581j = p2Var;
        r0Var.f51582k = j10;
        return r0Var.invokeSuspend(tu.x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f51580i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            e0.p2 p2Var = this.f51581j;
            long j10 = this.f51582k;
            if (this.f51583l) {
                this.f51580i = 1;
                if (k0.m3715handlePressInteractionEPk0efs(p2Var, j10, this.f51584m, this.f51585n, this.f51586o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return tu.x0.f87415a;
    }
}
