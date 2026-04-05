package m0;

import e0.q4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f73844i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f73845j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.l f73846k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(kv.l lVar, zu.d dVar) {
        super(2, dVar);
        this.f73846k = lVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        v0 v0Var = new v0(this.f73846k, dVar);
        v0Var.f73845j = obj;
        return v0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f73844i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            u1.c cVar = (u1.c) this.f73845j;
            this.f73844i = 1;
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
        if (c0Var != null) {
            this.f73846k.invoke(i1.h.m4174boximpl(c0Var.m7295getPositionF1C5BW0()));
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(u1.c cVar, zu.d<? super tu.x0> dVar) {
        return ((v0) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
