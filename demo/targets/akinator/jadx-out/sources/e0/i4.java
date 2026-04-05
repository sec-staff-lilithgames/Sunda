package e0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i4 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53106i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kv.q f53107j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s2 f53108k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u1.c0 f53109l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(kv.q qVar, s2 s2Var, u1.c0 c0Var, zu.d dVar) {
        super(2, dVar);
        this.f53107j = qVar;
        this.f53108k = s2Var;
        this.f53109l = c0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new i4(this.f53107j, this.f53108k, this.f53109l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53106i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            i1.h hVarM4174boximpl = i1.h.m4174boximpl(this.f53109l.m7295getPositionF1C5BW0());
            this.f53106i = 1;
            if (this.f53107j.invoke(this.f53108k, hVarM4174boximpl, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((i4) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
