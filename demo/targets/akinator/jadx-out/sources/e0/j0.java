package e0;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53113i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53114j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u1.c0 f53115k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.a f53116l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.a f53117m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kv.p f53118n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(u1.c0 c0Var, kv.a aVar, kv.a aVar2, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f53115k = c0Var;
        this.f53116l = aVar;
        this.f53117m = aVar2;
        this.f53118n = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        j0 j0Var = new j0(this.f53115k, this.f53116l, this.f53117m, this.f53118n, dVar);
        j0Var.f53114j = obj;
        return j0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        u1.c cVar;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53113i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.c cVar2 = (u1.c) this.f53114j;
            long jM7294getIdJ3iCeTQ = this.f53115k.m7294getIdJ3iCeTQ();
            i0 i0Var = new i0(this.f53118n);
            this.f53114j = cVar2;
            this.f53113i = 1;
            Object objM3757dragjO51t88 = d1.m3757dragjO51t88(cVar2, jM7294getIdJ3iCeTQ, i0Var, this);
            if (objM3757dragjO51t88 == coroutine_suspended) {
                return coroutine_suspended;
            }
            cVar = cVar2;
            obj = objM3757dragjO51t88;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (u1.c) this.f53114j;
            tu.a0.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            List<u1.c0> changes = cVar.getCurrentEvent().getChanges();
            int size = changes.size();
            for (int i11 = 0; i11 < size; i11++) {
                u1.c0 c0Var = changes.get(i11);
                if (u1.n.changedToUp(c0Var)) {
                    c0Var.consume();
                }
            }
            this.f53116l.invoke();
        } else {
            this.f53117m.invoke();
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(u1.c cVar, zu.d<? super tu.x0> dVar) {
        return ((j0) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
