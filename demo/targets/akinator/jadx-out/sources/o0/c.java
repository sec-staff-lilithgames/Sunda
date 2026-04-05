package o0;

import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77305i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f77306j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d f77307k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f0.t f77308l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q qVar, d dVar, f0.t tVar, zu.d dVar2) {
        super(2, dVar2);
        this.f77306j = qVar;
        this.f77307k = dVar;
        this.f77308l = tVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new c(this.f77306j, this.f77307k, this.f77308l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77305i;
        f0.t tVar = this.f77308l;
        d dVar = this.f77307k;
        try {
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                q qVar = this.f77306j;
                this.f77305i = 1;
                if (qVar.animate(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            dVar.f77316h.remove(tVar);
            return x0.f87415a;
        } catch (Throwable th2) {
            dVar.f77316h.remove(tVar);
            throw th2;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
