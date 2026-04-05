package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l4 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53163i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53164j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s2 f53165k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.l f53166l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.l f53167m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f53168n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(s2 s2Var, kv.l lVar, kv.l lVar2, kotlin.jvm.internal.b1 b1Var, zu.d dVar) {
        super(2, dVar);
        this.f53165k = s2Var;
        this.f53166l = lVar;
        this.f53167m = lVar2;
        this.f53168n = b1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        l4 l4Var = new l4(this.f53165k, this.f53166l, this.f53167m, this.f53168n, dVar);
        l4Var.f53164j = obj;
        return l4Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53163i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.c cVar = (u1.c) this.f53164j;
            this.f53163i = 1;
            obj = q4.waitForUpOrCancellation(cVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        u1.c0 c0Var = (u1.c0) obj;
        tu.x0 x0Var = tu.x0.f87415a;
        s2 s2Var = this.f53165k;
        if (c0Var != null) {
            c0Var.consume();
            s2Var.release();
            this.f53166l.invoke(i1.h.m4174boximpl(c0Var.m7295getPositionF1C5BW0()));
            return x0Var;
        }
        s2Var.cancel();
        kv.l lVar = this.f53167m;
        if (lVar == null) {
            return null;
        }
        lVar.invoke(i1.h.m4174boximpl(((u1.c0) this.f53168n.f71816b).m7295getPositionF1C5BW0()));
        return x0Var;
    }

    @Override // kv.p
    public final Object invoke(u1.c cVar, zu.d<? super tu.x0> dVar) {
        return ((l4) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
