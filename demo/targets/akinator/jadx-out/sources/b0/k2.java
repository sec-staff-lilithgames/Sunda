package b0;

import b0.j2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f8408i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j2.a f8409j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f8410k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j2 f8411l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(j2.a aVar, long j10, j2 j2Var, zu.d dVar) {
        super(2, dVar);
        this.f8409j = aVar;
        this.f8410k = j10;
        this.f8411l = j2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new k2(this.f8409j, this.f8410k, this.f8411l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        kv.p listener;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f8408i;
        j2 j2Var = this.f8411l;
        j2.a aVar = this.f8409j;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            c0.e anim = aVar.getAnim();
            s2.v vVarM6964boximpl = s2.v.m6964boximpl(this.f8410k);
            c0.n animSpec = j2Var.getAnimSpec();
            this.f8408i = 1;
            obj = c0.e.animateTo$default(anim, vVarM6964boximpl, animSpec, null, null, this, 12, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        c0.l lVar = (c0.l) obj;
        if (lVar.getEndReason() == c0.h.f11481c && (listener = j2Var.getListener()) != null) {
            listener.invoke(s2.v.m6964boximpl(aVar.m91getStartSizeYbymL2g()), lVar.getEndState().getValue());
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((k2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
